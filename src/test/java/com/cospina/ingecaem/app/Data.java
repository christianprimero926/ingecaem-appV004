package com.cospina.ingecaem.app;

import com.cospina.ingecaem.app.models.documents.register.Status;
import com.cospina.ingecaem.app.models.documents.register.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Data {
    public static Optional<Task> createTask001(){
        List<String> operators = new ArrayList<>();
        Status estado = new Status();
        estado.setId("200");
        operators.add("Carlos");
        operators.add("Juan");
        operators.add("pepito");

        return Optional.of(new Task("Nestle01", "elctrico", "jorge", estado.getId(), operators, "algo"));
    }
}
