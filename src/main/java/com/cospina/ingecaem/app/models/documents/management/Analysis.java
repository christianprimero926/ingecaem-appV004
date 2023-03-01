package com.cospina.ingecaem.app.models.documents.management;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ic_pm_analysis")
public class Analysis {
    @Id
    private String id;
    private String codeProductManager;
    private String description;
    private String file;

    public Analysis(String codeProductManager, String description, String file) {
        this.codeProductManager = codeProductManager;
        this.description = description;
        this.file = file;
    }

    public Analysis() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
