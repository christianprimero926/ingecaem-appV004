package com.cospina.ingecaem.app.models.services.general;

import com.cospina.ingecaem.app.models.documents.general.Status;
import com.cospina.ingecaem.app.models.documents.general.Task;
import reactor.core.publisher.Flux;

public interface StatusService {
    public Flux<Status> findAll();
}
