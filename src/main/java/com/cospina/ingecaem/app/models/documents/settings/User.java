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
@Document(collection = "ic_s_user")
public class User {
    @Id
    private String codeUser;
    private String codeArea;
    private String nitPlants;
    private String codeTypeContract;
    private String codeMunicipality;
    private String name;
    private String lastName;
    private String idType;
    private String idUser;
    private String phone;
    private String address;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBirth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateAdmission;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDeparture;
    private String username;
    private String password;
    private String arl;
    private String compensationOffice;

    public User() {
    }
}
