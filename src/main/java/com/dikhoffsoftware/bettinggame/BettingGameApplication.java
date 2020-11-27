package com.dikhoffsoftware.bettinggame;

import com.dikhoffsoftware.bettinggame.configuration.YamlPropertySourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.yml", factory = YamlPropertySourceFactory.class)
@Slf4j
public class BettingGameApplication {

    public static void main(String[] args) {
        log.info("Starting application...");
        SpringApplication.run(BettingGameApplication.class, args);
        log.info("Finished application...");
    }

}
