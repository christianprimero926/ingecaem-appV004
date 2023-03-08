package com.cospina.ingecaem.app.models.documents.management;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
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
}
