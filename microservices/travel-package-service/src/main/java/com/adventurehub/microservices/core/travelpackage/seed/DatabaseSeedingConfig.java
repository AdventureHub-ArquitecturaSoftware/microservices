package com.adventurehub.microservices.core.travelpackage.seed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;

@Component
public class DatabaseSeedingConfig implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseSeedingConfig.class);

    @Autowired
    private SeasonSeed seasonService;

    @Autowired
    private CategorySeed categoryService;

    @Autowired
    private DestinationSeed destinationService;

    @Override
    public void run(String... args) throws Exception {
        seasonService.seed();
        categoryService.seed();
        destinationService.seed();
    }

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        String name = event.getApplicationContext().getId();
        logger.info("Starting Database Seeding Process for {} at {}",
                name,
                new Timestamp(System.currentTimeMillis()));
        seasonService.seed();
        categoryService.seed();
        destinationService.seed();
        logger.info("Finished Database Seeding Process for {} at {}",
                name,
                new Timestamp(System.currentTimeMillis()));

    }
}
