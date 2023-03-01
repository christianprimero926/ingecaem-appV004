package com.cospina.ingecaem.app.models.documents.administration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "ic_md_payroll")
public class Payroll {
    @Id
    private String id;
    private String codeUser;
    private String codeRecordHours;
    private String codeCostHours;
    private String codeReportTemplate;
    private String codeCompany;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date initialBilledDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date finalBilledDate;
    private Double salary;

    public Payroll(String codeUser, String codeRecordHours, String codeCostHours, String codeReportTemplate, String codeCompany, Date initialBilledDate, Date finalBilledDate, Double salary) {
        this.codeUser = codeUser;
        this.codeRecordHours = codeRecordHours;
        this.codeCostHours = codeCostHours;
        this.codeReportTemplate = codeReportTemplate;
        this.codeCompany = codeCompany;
        this.initialBilledDate = initialBilledDate;
        this.finalBilledDate = finalBilledDate;
        this.salary = salary;
    }

    public Payroll() {
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

    public String getCodeRecordHours() {
        return codeRecordHours;
    }

    public void setCodeRecordHours(String codeRecordHours) {
        this.codeRecordHours = codeRecordHours;
    }

    public String getCodeCostHours() {
        return codeCostHours;
    }

    public void setCodeCostHours(String codeCostHours) {
        this.codeCostHours = codeCostHours;
    }

    public String getCodeReportTemplate() {
        return codeReportTemplate;
    }

    public void setCodeReportTemplate(String codeReportTemplate) {
        this.codeReportTemplate = codeReportTemplate;
    }

    public String getCodeCompany() {
        return codeCompany;
    }

    public void setCodeCompany(String codeCompany) {
        this.codeCompany = codeCompany;
    }

    public Date getInitialBilledDate() {
        return initialBilledDate;
    }

    public void setInitialBilledDate(Date initialBilledDate) {
        this.initialBilledDate = initialBilledDate;
    }

    public Date getFinalBilledDate() {
        return finalBilledDate;
    }

    public void setFinalBilledDate(Date finalBilledDate) {
        this.finalBilledDate = finalBilledDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
