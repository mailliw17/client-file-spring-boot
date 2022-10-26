package com.example.client.donwload.Client.Download.File.service;
import com.example.client.donwload.Client.Download.File.dto.Attachments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

@Service
public class RestClientService {

    @Autowired
    private RestTemplate restTemplate;

    public void getRawDataAtts() {

        ResponseEntity<Attachments> response = restTemplate.getForEntity("http://localhost:8081/api/download/jts", Attachments.class);
        Attachments responseAttcs = response.getBody();

        responseAttcs
                .getAttachments()
                .stream()
                .forEach(
                    attachment -> {
                        byte[] decodedImg = Base64.getDecoder().decode(attachment.getFileBytes().getBytes(StandardCharsets.UTF_8));
                        Path destinationFile = Paths.get("C:\\WILLIAM\\00.IBO-D\\DOWNLOADYUHU\\", attachment.getFileName());
                        try {
                            Files.write(destinationFile, decodedImg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            );
        System.out.println("Download procees done");
    }
}
