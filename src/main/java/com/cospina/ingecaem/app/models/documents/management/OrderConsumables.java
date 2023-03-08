package com.cospina.ingecaem.app.models.documents.management;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
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
}
