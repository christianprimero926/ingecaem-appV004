package com.cospina.ingecaem.app.models.documents.administration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@AllArgsConstructor
@Document(collection = "ic_md_financial_reports")

public class FinancialReports {
    @Id
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

    public FinancialReports() {
    }
}
