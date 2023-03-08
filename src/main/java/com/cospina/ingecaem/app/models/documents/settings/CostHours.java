package com.cospina.ingecaem.app.models.documents.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "ic_s_cost_hours")
public class CostHours {
    @Id
    private String id;
    private String name;
    private Double percent;

    public CostHours() {
    }
}
