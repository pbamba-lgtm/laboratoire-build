package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Début du programme...");

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, String> data = Map.of("status", "success", "lab", "Build Systems");
            String json = mapper.writeValueAsString(data);

            logger.info("Données JSON générées : {}", json);
        } catch (Exception e) {
            logger.error("Erreur lors de la génération du JSON", e);
        }

        System.out.println("Le programme s'est terminé avec succès !");
    }
}