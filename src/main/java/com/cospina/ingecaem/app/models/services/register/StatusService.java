package com.cospina.ingecaem.app.models.services.register;

import com.cospina.ingecaem.app.models.documents.register.Status;
import reactor.core.publisher.Flux;

public interface StatusService {
    public Flux<Status> findAll();
}
