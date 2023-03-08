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
@Document(collection = "ic_s_report_templates")
public class ReportTemplates {
    @Id
    private String code;
    private String version;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;
    private String name;
    private String file;
    private String extension;

    public ReportTemplates() {
    }
}
