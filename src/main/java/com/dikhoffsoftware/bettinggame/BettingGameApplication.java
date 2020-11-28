package com.dikhoffsoftware.bettinggame;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BettingGameApplication {

    public static void main(String[] args) {
        log.info("Starting application...");
        SpringApplication.run(BettingGameApplication.class, args);
        log.info("Finished application...");
    }

}
