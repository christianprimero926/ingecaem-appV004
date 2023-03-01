package com.cospina.ingecaem.app.models.documents.management;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "ic_pm_order_consumables")
public class OrderConsumables {
    @Id
    private String id;
    private String codeProductManager;
    private String codePlant;
    private List<String> collaborators;
    private List<String> consumables;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date issueDate;

    public OrderConsumables(String codeProductManager, String codePlant, List<String> collaborators, List<String> consumables) {
        this.codeProductManager = codeProductManager;
        this.codePlant = codePlant;
        this.collaborators = collaborators;
        this.consumables = consumables;
    }

    public OrderConsumables() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeProductManager() {
        return codeProductManager;
    }

    public void setCodeProductManager(String codeProductManager) {
        this.codeProductManager = codeProductManager;
    }

    public String getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(String codePlant) {
        this.codePlant = codePlant;
    }

    public List<String> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(List<String> collaborators) {
        this.collaborators = collaborators;
    }

    public List<String> getConsumables() {
        return consumables;
    }

    public void setConsumables(List<String> consumables) {
        this.consumables = consumables;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
