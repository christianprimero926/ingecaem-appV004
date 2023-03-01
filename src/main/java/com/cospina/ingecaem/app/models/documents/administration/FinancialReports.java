package com.cospina.ingecaem.app.models.documents.administration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Document(collection = "ic_md_financial_reports")
public class FinancialReports {
    @Id
    private String id;
    private String codeReportTemplate;
    private String codeCompany;
    private String codePlant;
    private String codeTask;
    private String codeProductManager;
    private String codeOrderConsumables;
    private String codePayroll;
    private List<String> collaboratorsCost;
    private Double totalCostSocialSecurity;
    private Double totalCostConsumables;
    private Integer totalTask;
    private String overviewSocialSecurity;
    private String overviewConsumables;
    private String overviewTotalCost;
    private String reportPM;
    private String reportM;
    @DateTimeFormat(pattern = "M")
    private Date billedMonth;
    private List<String> consumablesCost;

    public FinancialReports(String codeReportTemplate, String codeCompany, String codePlant, String codeTask, String codeProductManager, String codeOrderConsumables, String codePayroll, List<String> collaboratorsCost, Double totalCostSocialSecurity, Double totalCostConsumables, Integer totalTask, String overviewSocialSecurity, String overviewConsumables, String overviewTotalCost, String reportPM, String reportM, Date billedMonth, List<String> consumablesCost) {
        this.codeReportTemplate = codeReportTemplate;
        this.codeCompany = codeCompany;
        this.codePlant = codePlant;
        this.codeTask = codeTask;
        this.codeProductManager = codeProductManager;
        this.codeOrderConsumables = codeOrderConsumables;
        this.codePayroll = codePayroll;
        this.collaboratorsCost = collaboratorsCost;
        this.totalCostSocialSecurity = totalCostSocialSecurity;
        this.totalCostConsumables = totalCostConsumables;
        this.totalTask = totalTask;
        this.overviewSocialSecurity = overviewSocialSecurity;
        this.overviewConsumables = overviewConsumables;
        this.overviewTotalCost = overviewTotalCost;
        this.reportPM = reportPM;
        this.reportM = reportM;
        this.billedMonth = billedMonth;
        this.consumablesCost = consumablesCost;
    }

    public FinancialReports() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCodeProductManager() {
        return codeProductManager;
    }

    public void setCodeProductManager(String codeProductManager) {
        this.codeProductManager = codeProductManager;
    }

    public String getCodeOrderConsumables() {
        return codeOrderConsumables;
    }

    public void setCodeOrderConsumables(String codeOrderConsumables) {
        this.codeOrderConsumables = codeOrderConsumables;
    }

    public String getCodePayroll() {
        return codePayroll;
    }

    public void setCodePayroll(String codePayroll) {
        this.codePayroll = codePayroll;
    }

    public List<String> getCollaboratorsCost() {
        return collaboratorsCost;
    }

    public void setCollaboratorsCost(List<String> collaboratorsCost) {
        this.collaboratorsCost = collaboratorsCost;
    }

    public Double getTotalCostSocialSecurity() {
        return totalCostSocialSecurity;
    }

    public void setTotalCostSocialSecurity(Double totalCostSocialSecurity) {
        this.totalCostSocialSecurity = totalCostSocialSecurity;
    }

    public Double getTotalCostConsumables() {
        return totalCostConsumables;
    }

    public void setTotalCostConsumables(Double totalCostConsumables) {
        this.totalCostConsumables = totalCostConsumables;
    }

    public Integer getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(Integer totalTask) {
        this.totalTask = totalTask;
    }

    public String getOverviewSocialSecurity() {
        return overviewSocialSecurity;
    }

    public void setOverviewSocialSecurity(String overviewSocialSecurity) {
        this.overviewSocialSecurity = overviewSocialSecurity;
    }

    public String getOverviewConsumables() {
        return overviewConsumables;
    }

    public void setOverviewConsumables(String overviewConsumables) {
        this.overviewConsumables = overviewConsumables;
    }

    public String getOverviewTotalCost() {
        return overviewTotalCost;
    }

    public void setOverviewTotalCost(String overviewTotalCost) {
        this.overviewTotalCost = overviewTotalCost;
    }

    public String getReportPM() {
        return reportPM;
    }

    public void setReportPM(String reportPM) {
        this.reportPM = reportPM;
    }

    public String getReportM() {
        return reportM;
    }

    public void setReportM(String reportM) {
        this.reportM = reportM;
    }

    public Date getBilledMonth() {
        return billedMonth;
    }

    public void setBilledMonth(Date billedMonth) {
        this.billedMonth = billedMonth;
    }

    public List<String> getConsumablesCost() {
        return consumablesCost;
    }

    public void setConsumablesCost(List<String> consumablesCost) {
        this.consumablesCost = consumablesCost;
    }
}
