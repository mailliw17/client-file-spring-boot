package com.example.client.donwload.Client.Download.File.controller;
import com.example.client.donwload.Client.Download.File.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class RestClientController {
    @Autowired
    private RestClientService restClientService;

    //EVERY 1 MINUTES ON WEEKDAYS
    @Scheduled(cron = "0 */1 * * * MON-FRI")
    public void downloadFileIts() throws IOException {
        restClientService.getItsFile();
    }
    @Scheduled(cron = "0 */1 * * * MON-FRI")
    public void downloadFileJts() throws IOException {
        restClientService.getJtsFile();
    }
}
