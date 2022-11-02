package com.example.client.donwload.Client.Download.File.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class RestClientService {

    @Autowired
    private RestTemplate restTemplate;

//    public void getDataJts() {
//
//        ResponseEntity<Attachments> response = restTemplate.getForEntity("http://localhost:8081/api/download/jts", Attachments.class);
//        Attachments responseAttcs = response.getBody();
//
//        responseAttcs
//                .getAttachments()
//                .stream()
//                .forEach(
//                        attachment -> {
//                            byte[] decodedImg = Base64.getDecoder().decode(attachment.getFileBytes().getBytes(StandardCharsets.UTF_8));
//                            Path destinationFile = Paths.get("C:\\WILLIAM\\00.IBO-D\\Test_Download_File\\JTS\\", attachment.getFileName());
//                            try {
//                                Files.write(destinationFile, decodedImg);
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                );
//        System.out.println("Download JTS File Done");
//    }

    public void getItsFile() {
        String src = "\\\\10.20.201.111\\c\\apiprintertest\\ITS\\";
        String dest = "C:\\WILLIAM\\00.IBO-D\\Test_Download_File\\ITS\\";

        try (Stream<Path> paths = Files.walk(Paths.get(src))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            Files.copy(path, Path.of(dest + path.getFileName()));
//                            System.out.println("path : " + path);
//                            System.out.println("dest: " + dest + path.getFileName());
                            Files.delete(Path.of(src + path.getFileName()));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getJtsFile() {
        String src = "\\\\10.20.201.111\\c\\apiprintertest\\JTS\\";
        String dest = "C:\\WILLIAM\\00.IBO-D\\Test_Download_File\\JTS\\";

        try (Stream<Path> paths = Files.walk(Paths.get(src))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            Files.copy(path, Path.of(dest + path.getFileName()));
//                            System.out.println("path : " + path);
//                            System.out.println("dest: " + dest + path.getFileName());
                            Files.delete(Path.of(src + path.getFileName()));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public void getDataIts() throws InterruptedException {
//
//        ResponseEntity<Attachments> response = restTemplate.getForEntity("http://localhost:8081/api/download/its", Attachments.class);
//        Attachments responseAttcs = response.getBody();
//
//        responseAttcs
//                .getAttachments()
//                .stream()
//                .forEach(
//                        attachment -> {
//                            byte[] decodedImg = Base64.getDecoder().decode(attachment.getFileBytes().getBytes(StandardCharsets.UTF_8));
////                            Path destinationFile = Paths.get("C:\\WILLIAM\\00.IBO-D\\Test_Download_File\\ITS\\", attachment.getFileName());
//                            try {
//                                //INI BISA
////                                FileOutputStream files = new FileOutputStream("C:/WILLIAM/00.IBO-D/Test_Download_File/ITS/" + attachment.getFileName());
//
//                                //INI JUGA BISA
//                                    Files.write(Path.of("C:/WILLIAM/00.IBO-D/Test_Download_File/ITS/" + attachment.getFileName()), decodedImg);
//
//                            } catch (FileNotFoundException e) {
//                                throw new RuntimeException(e);
//                            } catch (IOException e) {
//                                throw new RuntimeException(e);
//                            }
//                        }
//                );
//
//        System.out.println("Download ITS File Done");
//    }
//
//    public ResponseEntity<Boolean> stopFunction() {
//        ResponseEntity<Boolean> response = restTemplate.getForEntity("http://localhost:8081/api/stop", Boolean.class);
//        System.out.println("Stopping from client...");
//        return response;
//    }
}
