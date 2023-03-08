package com.cospina.ingecaem.app.models.documents.management;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
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
}
