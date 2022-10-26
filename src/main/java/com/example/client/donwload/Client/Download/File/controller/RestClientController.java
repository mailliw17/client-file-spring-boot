package com.example.client.donwload.Client.Download.File.controller;
import com.example.client.donwload.Client.Download.File.service.RestClientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class RestClientController {
    @Autowired
    private RestClientService restClientService;

    //EVERY 1 MINUTES ON WEEKDAYS
    @Scheduled(cron = "0 */1 * * * MON-FRI")
     public void getDataAll() throws JsonProcessingException {
         restClientService.getRawDataAtts();
    }
}
