package com.cospina.ingecaem.app.controller.register;

import com.cospina.ingecaem.app.models.documents.register.Task;
import com.cospina.ingecaem.app.models.services.register.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.NoSuchElementException;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(name = "Task", path = "/api/tasks")
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
    @Autowired
    private TaskService taskService;

    @GetMapping
    @ResponseStatus(OK)
    public Flux<Task> showAll() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detail(@PathVariable(name = "id") String id){
        Mono<Task> task = null;
        try {
            task = taskService.findById(id);
        }catch (NoSuchElementException e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }


    /*@GetMapping("/task/show/all")
    public Mono<String> showAll(Model model) {
        Flux<Task> taskFlux = taskService.findAll();

        model.addAttribute("task", taskFlux);
        model.addAttribute("title", "Listado de tareas");

        return Mono.just("task/show/all");
    }*/
}
