package com.cospina.ingecaem.app;

import com.cospina.ingecaem.app.models.dao.general.TaskDao;
import com.cospina.ingecaem.app.models.documents.general.Status;
import com.cospina.ingecaem.app.models.documents.general.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class IngecaemAppV004Application implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(IngecaemAppV004Application.class);
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private ReactiveMongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(IngecaemAppV004Application.class, args);
    }

    /**
     * @param args incoming main method arguments
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        List<String> operators = new ArrayList<>();
        Status estado = new Status();
        estado.setId("200");
        operators.add("Carlos");
        operators.add("Juan");
        operators.add("pepito");

        Flux.just(
                        new Task("Nestle01", "elctrico", "jorge", estado.getId(), operators, "algo")
                )
                .flatMap(task -> {
                    task.setStart_date(new Date());
                    return taskDao.save(task);
                })
                .subscribe(task -> LOGGER.info("Insert: " + task.getId() + " " + task.getDescription()));

    }

}
