package org.soyphea.k8s;

import lombok.extern.slf4j.Slf4j;
import org.soyphea.k8s.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class K8SApplication implements CommandLineRunner {


    @Autowired
    UserConfig userConfig;

    public static void main(String[] args) {
        int fran = 1;
        if(fran==1 && fran == 8 && fran == 9){
            fran = 2;
        }else if(fran==1){
            fran = 7;
        }else if(fran==0){
            fran=99;
        }else{
            fran=888;
        }
        SpringApplication.run(K8SApplication.class, args);
    
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(" Fetched user from k8s ConfigMap <spring-boot-k8s> is :{}", userConfig);

    }
}
