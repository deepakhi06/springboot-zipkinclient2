package com.sb.zipkinclient;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZipkinApplication.class, args);

	}

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}

}
@RestController
class ZipkinController{
	
   /* @Autowired
    RestTemplate restTemplate;*/
 
  /*  @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }*/
 
   /* @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }*/
 
    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());
     
    @GetMapping(value="/zipkin2")
    public String zipkinService1()
    {
        LOG.info("Inside zipkinService 2..");
         
        /* String response = (String) restTemplate.exchange("http://localhost:8082/zipkin2",
                        HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();*/
        return "Hi...";
    }
}

