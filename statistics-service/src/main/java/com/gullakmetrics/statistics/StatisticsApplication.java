package com.gullakmetrics.statistics;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatisticsApplication {
    private static Logger log = LogManager.getLogger(StatisticsApplication.class);
    public static void main(String[] args) {
        log.info("Starting statistics services...");
        SpringApplication.run(StatisticsApplication.class, args);
    }
}
