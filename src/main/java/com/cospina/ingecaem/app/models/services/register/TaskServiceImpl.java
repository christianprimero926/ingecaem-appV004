package com.cospina.ingecaem.app.models.services.register;

import com.cospina.ingecaem.app.models.dao.register.TaskDao;
import com.cospina.ingecaem.app.models.documents.register.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskDao taskDao;

    /**
     * @return
     */
    @Override
    public Flux<Task> findAll() {
        return taskDao.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Mono<Task> findById(String id) {
        return taskDao.findById(id);
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
