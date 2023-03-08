package com.cospina.ingecaem.app.models.documents.register;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "ic_r_status")
public class Status {
    @Id
    private String code;
    private String description;

    public Status() {
    }
}
