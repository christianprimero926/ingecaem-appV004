package com.cospina.ingecaem.app.models.documents.general;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "ic_g_task")
public class Task {
    @Id
    private String id;
    private String codePlant;
    private String codeTypeWork;
    private String codeProjectManager;
    private String codeStatus;
    private List<String> operatorsAssigned;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date endDate;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(String codePlant) {
        this.codePlant = codePlant;
    }

    public String getCodeTypeWork() {
        return codeTypeWork;
    }

    public void setCodeTypeWork(String codeTypeWork) {
        this.codeTypeWork = codeTypeWork;
    }

    public String getCodeProjectManager() {
        return codeProjectManager;
    }

    public void setCodeProjectManager(String codeProjectManager) {
        this.codeProjectManager = codeProjectManager;
    }

    public String getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(String codeStatus) {
        this.codeStatus = codeStatus;
    }

    public List<String> getOperatorsAssigned() {
        return operatorsAssigned;
    }

    public void setOperatorsAssigned(List<String> operatorsAssigned) {
        this.operatorsAssigned = operatorsAssigned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
