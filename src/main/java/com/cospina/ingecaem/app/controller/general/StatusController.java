package com.cospina.ingecaem.app.controller.general;

import com.cospina.ingecaem.app.models.documents.general.Status;
import com.cospina.ingecaem.app.models.services.general.StatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(name = "Status", path = "/api/status")
public class StatusController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatusController.class);
    @Autowired
    private StatusService statusService;
    @GetMapping("/find")
    @ResponseStatus(OK)
    public Flux<Status> showAll() {
        return statusService.findAll();
    }
}
