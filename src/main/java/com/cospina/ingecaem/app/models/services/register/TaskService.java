package com.cospina.ingecaem.app.models.services.register;

import com.cospina.ingecaem.app.models.documents.register.Task;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TaskService {
    public Flux<Task> findAll();
    public Mono<Task> findById(String id);
    public Mono<Task> save(Task task);
    public Mono<Void> delete(Task task);
}
