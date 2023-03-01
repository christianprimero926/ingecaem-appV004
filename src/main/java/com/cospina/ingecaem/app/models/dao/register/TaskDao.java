package com.cospina.ingecaem.app.models.dao.register;

import com.cospina.ingecaem.app.models.documents.register.Task;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TaskDao extends ReactiveMongoRepository<Task, String> {
}
