package com.cospina.ingecaem.app.models.documents.register;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Document(collection = "ic_r_records_hours_worked")
public class RecordsHours {
    @Id
    private String id;
    private String codeUser;
    private String codePlant;
    private String codeTask;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;
    @DateTimeFormat(pattern = "h:mm:ss a")
    private Date entryHour;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outDate;
    @DateTimeFormat(pattern = "h:mm:ss a")
    private Date outHour;
    private boolean irregularities;
    private Double assignedHours;
    private Double hoursDay;
    private Double totalHours;

    public RecordsHours(String codeUser, String codePlant, String codeTask, String description, boolean irregularities, Double assignedHours, Double hoursDay, Double totalHours) {
        this.codeUser = codeUser;
        this.codePlant = codePlant;
        this.codeTask = codeTask;
        this.description = description;
        this.irregularities = irregularities;
        this.assignedHours = assignedHours;
        this.hoursDay = hoursDay;
        this.totalHours = totalHours;
    }
    public RecordsHours() {
    }
}
