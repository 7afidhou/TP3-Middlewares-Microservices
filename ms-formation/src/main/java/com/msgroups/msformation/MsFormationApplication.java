package com.msgroups.msformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.msgroups.msformation.Entities.Formation;
import com.msgroups.msformation.Repositories.FormationRep;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    FormationRep formationRep;
    public static void main(String[] args) { SpringApplication.run(MsFormationApplication.class, args); }
    @Override public void run(String... args) throws Exception {
        Formation f1= formationRep.save(new Formation(null, "Web",50));
        Formation f2=formationRep.save(new Formation(null, "Intergiciel",40));
        Formation f3=formationRep.save(new Formation(null, "Network",60)); }

}
