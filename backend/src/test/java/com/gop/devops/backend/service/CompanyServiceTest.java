package com.gop.devops.backend.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)

public class CompanyServiceTest {

    @Autowired
    CompanyService companyService ;

    @Test
    public void getListCompanies() {
        assertEquals(companyService.getListCompanies().size(),3);
    }

    @Test
    public void getCompanyTitle() {
        assertEquals(companyService.getListCompanies().get(0).getTitle(),"ZPM ZAHNRADPUMPENFABRIK MANNHEIM GMBH");
    }

    @Test
    public void testNonNullCompanyPicture() {
        assertNotNull(companyService.getListCompanies().get(0).getCompanyPicture());
    }


}
