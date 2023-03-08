package com.cospina.ingecaem.app.models.documents.register;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document(collection = "ic_r_task")
public class Task {
    @Id
    private String id;
    private String codePlant;
    private String codeTypeWork;
    private String codeProjectManager;
    private String codeStatus;
    private List<String> operatorsAssigned;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;
    private Double assignedHours;

    public Task(String codePlant, String codeTypeWork, String codeProjectManager, String codeStatus, List<String> operatorsAssigned, String description) {
        this.codePlant = codePlant;
        this.codeTypeWork = codeTypeWork;
        this.codeProjectManager = codeProjectManager;
        this.codeStatus = codeStatus;
        this.operatorsAssigned = operatorsAssigned;
        this.description = description;
    }

    public Task() {
    }

}
