package com.cospina.ingecaem.app.models.services.general;

import com.cospina.ingecaem.app.models.documents.general.Task;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService{
    /**
     * @return
     */
    @Override
    public Flux<Task> findAll() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Mono<Task> findById(String id) {
        return null;
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Mono<Task> save(Task task) {
        return null;
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Mono<Void> delete(Task task) {
        return null;
    }
}
