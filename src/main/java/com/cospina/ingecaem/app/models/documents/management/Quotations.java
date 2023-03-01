package com.cospina.ingecaem.app.models.documents.management;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ic_pm_quotations")
public class Quotations {
    @Id
    private String id;
    private String codeProductManager;
    private String name;
    private String file;

    public Quotations(String codeProductManager, String name, String file) {
        this.codeProductManager = codeProductManager;
        this.name = name;
        this.file = file;
    }

    public Quotations() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
