package com.gop.devops.backend.service;

import com.gop.devops.backend.model.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    public List<Company> getListCompanies() {

        String description1 = "Notre usine de pompes à engrenages située à Mannheim est mondialement connue depuis 1904 pour ses produits techniquement éprouvés et durables. Lors du développement, de la construction et de la fabrication de ces derniers, nous accordons une grande importance à la qualité et à la continuité. 1911-1915 Construction d'une nouvelle usine avec ateliers et bâtiments administratifs.";
        String description2= "Silos de maturation, Installations de convoyage de matériau expansé-moulu, Pré-expanseurs discontinus et continus, Mouleuses à aggloméré verticales, Presses pour élasticisation de blocs, chariots automatiques pour le transport des blocs et du produit fini, Lignes de découpe automatiques avec fil oscillant comprenant tous les accessoires pour l'emballage et la palletisation, Profileuses, Machines à rainurer .";
        String description3= "La société ORTS GmbH conçoit et fabrique : grappins à câble mécaniques, pinces électro-hydrauliques, pinces télécommandées diesel-hydrauliques, bennes preneuses pour installations de biogaz/biomasse, grappins à bois - bennes preneuses à griffes, bennes de recupération, équipement de grue, traverses de charge, châssis plats, bennes de récupération de pétrole.";

        List<Company> companies = new ArrayList<>() ;

        companies.add(
                new Company( "ZPM ZAHNRADPUMPENFABRIK MANNHEIM GMBH", description1 , "http://www.zpm-systeme.de/company/"
                        , "https://www.europages.com/filestore/opt/logo/17/dd/20773378_5da04001.png"
                        ,"https://i.imgur.com/Q9gg8gR.jpg", "ALLEMAGNE - Mannheim" )
        );
         companies.add(
                new Company( "NUOVA IDROPRESS SPA", description2 , "http://www.nuova-idropress.com/"
                        , "https://www.europages.com/filestore/opt/logo/8b/ee/1250992494_1698b381.png"
                        ,"https://i.imgur.com/M8HDZIM.jpg", "ITALIE - Canossa" )
        );

        companies.add(
                new Company( "ORTS GMBH", description3 , "https://www.orts-grabs.de/en/"
                        , "https://www.europages.com/filestore/opt/logo/b6/d5/21195336_88eadb9c.png"
                        ,"https://i.imgur.com/AEEOqyd.jpg", "LLEMAGNE - Sereetz" )
        );



        return companies ;
    }

}
