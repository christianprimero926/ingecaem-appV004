package com.cospina.ingecaem.app.models.services.register;

import com.cospina.ingecaem.app.models.documents.register.Status;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class StatusServiceImpl implements StatusService {
    /**
     * @return
     */
    @Override
    public Flux<Status> findAll() {
        return null;
    }
}
