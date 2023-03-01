package com.cospina.ingecaem.app.models.documents.register;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    public String getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(String codePlant) {
        this.codePlant = codePlant;
    }

    public String getCodeTask() {
        return codeTask;
    }

    public void setCodeTask(String codeTask) {
        this.codeTask = codeTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public boolean isIrregularities() {
        return irregularities;
    }

    public void setIrregularities(boolean irregularities) {
        this.irregularities = irregularities;
    }

    public Double getAssignedHours() {
        return assignedHours;
    }

    public void setAssignedHours(Double assignedHours) {
        this.assignedHours = assignedHours;
    }

    public Double getHoursDay() {
        return hoursDay;
    }

    public void setHoursDay(Double hoursDay) {
        this.hoursDay = hoursDay;
    }

    public Double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }

    public Date getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(Date entryHour) {
        this.entryHour = entryHour;
    }

    public Date getOutHour() {
        return outHour;
    }

    public void setOutHour(Date outHour) {
        this.outHour = outHour;
    }
}
