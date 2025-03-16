package com.msgroups.ms_formation;

import com.msgroups.ms_formation.entities.Formation;
import com.msgroups.ms_formation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableFeignClients
@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Formation f1= formationRep.save(new Formation(null, "Web",50));
        Formation f2=formationRep.save(new Formation(null,
                "Intergiciel",40));
        Formation f3=formationRep.save(new Formation(null, "Network",60));
    }
}
