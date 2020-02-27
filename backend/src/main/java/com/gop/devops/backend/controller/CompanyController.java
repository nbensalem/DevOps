package com.gop.devops.backend.controller;

import com.gop.devops.backend.model.Company;
import com.gop.devops.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService ;

    @RequestMapping("/api/companies")

    public @ResponseBody
    List<Company> getListCompanies() {

            return  companyService.getListCompanies() ;
    }

}
