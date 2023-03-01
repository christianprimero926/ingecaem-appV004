package com.cospina.ingecaem.app;

import com.cospina.ingecaem.app.models.dao.register.TaskDao;
import com.cospina.ingecaem.app.models.documents.register.Status;
import com.cospina.ingecaem.app.models.documents.register.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

        mongoTemplate.dropCollection("ic_r_task").subscribe();

        Flux.just(
                        new Task("Nestle01", "elctrico", "jorge", estado.getId(), operators, "algo")
                )
                .flatMap(task -> {
                    DateFormat sourceFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.getDefault());
                    DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
                    task.setCreateAt(new Date());
                    return taskDao.save(task);
                })
                .subscribe(task -> LOGGER.info("Insert: " + task.getId() + " " + task.getDescription()));

    }

}
