package com.gop.devops.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Company {
    private String title ;
    private String description ;
    private String website ;
    private String companyPicture ;
    private String productPicture ;
    private String adresse ;


}
