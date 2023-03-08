package com.cospina.ingecaem.app.models.documents.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "ic_s_industrial_plants")
public class IndustrialPlants {
    @Id
    private String nit;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    public IndustrialPlants() {
    }
}
