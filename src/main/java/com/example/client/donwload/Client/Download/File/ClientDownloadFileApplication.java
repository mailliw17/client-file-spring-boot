package com.example.client.donwload.Client.Download.File;

import com.example.client.donwload.Client.Download.File.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ClientDownloadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientDownloadFileApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}

@Configuration
@EnableScheduling
@ConditionalOnProperty(name="scheduling.enabled", matchIfMissing = true)
class SchedulingConfiguration{

}
