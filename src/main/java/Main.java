import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import freemarker.template.Configuration;
import freemarker.template.Version;
import spark.ModelAndView;
import src.main.java.client.*;

import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.get;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import spark.QueryParamsMap;
import spark.Session;
import spark.utils.IOUtils;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.text.*;

import javax.imageio.ImageIO;
import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Cookie;
import javax.servlet.http.Part;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

public class Main{


        public static void main(String[] args) {


            staticFileLocation("/public");
            final Configuration configuration = new Configuration(new Version(2, 3, 26));
            Spark.port(1234);
            configuration.setClassForTemplateLoading(Main.class, "/templates");
            FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

            File uploadDir = new File("upload");
            uploadDir.mkdir(); //


            AcademicWebServicesService academicoWebService = new AcademicWebServicesService();
            AcademicWebServices port = academicoWebService.getAcademicWebServicesPort();

            get("/", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                return new ModelAndView(attributes, "index.ftl");
            }, freeMarkerEngine);

            post("/listado", (request,response) -> {


                Map<String, Object> attributes = new HashMap<>();
                String username = request.queryParams("username");
                response.redirect("/listado/"+username);

                return new ModelAndView(attributes, "index.ftl");


            }, freeMarkerEngine);

            get("/listado/:username", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                List<PostSOAP> entradas = new ArrayList<>();
                entradas= port.getPublicaciones(request.params("username"));

                attributes.put("muroentradas",entradas);


                return new ModelAndView(attributes, "profile.ftl");
            }, freeMarkerEngine);

            post("/addPost", "multipart/form-data", (request, response) -> {
                request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/temp"));
                Path tempFile = Files.createTempFile(uploadDir.toPath(), "", "");
                long maxFileSize = 100000000;
                long maxRequestSize = 100000000;
                int fileSizeThreshold = 1024;

                MultipartConfigElement multipartConfigElement = new MultipartConfigElement(
                        uploadDir.getAbsolutePath(), maxFileSize, maxRequestSize, fileSizeThreshold);
                request.raw().setAttribute("org.eclipse.jetty.multipartConfig",
                        multipartConfigElement);

                Part uploadedFile = request.raw().getPart("uf");
                if(!uploadedFile.getSubmittedFileName().isEmpty()) {

                    String fName = request.raw().getPart("uf").getSubmittedFileName();

                    Path out = Paths.get(uploadDir.getCanonicalPath() + "/" + fName);
                    InputStream in = uploadedFile.getInputStream();
                    Files.copy(in, out, StandardCopyOption.REPLACE_EXISTING);
                    uploadedFile.delete();

                    multipartConfigElement = null;
                    uploadedFile = null;

                    BufferedImage imagen = null;
                    File here = new File(".");

                    String path = uploadDir.getCanonicalPath() + "/" + fName;
                    System.out.println(path);

                    try {
                        imagen = ImageIO.read(new File((path)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ByteArrayOutputStream imagenb = new ByteArrayOutputStream();
                    try {
                        ImageIO.write(imagen, "jpg", imagenb);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    boolean autenticado = false;
                    String target = request.queryParams("target");
                    String tag = request.queryParams("tag");
                    String texto = request.queryParams("muro");
                    port.crearPublicacion(imagenb.toByteArray(), target, tag, texto);

                    response.redirect("/");
                }
                else{

                    String target = request.queryParams("target");
                    String tag = request.queryParams("tag");
                    String texto = request.queryParams("muro");
                    port.crearPublicacion(null, target, tag, texto);

                    response.redirect("/");

                }
                return "OK";
            });



        }


    }

