package hc.ventapp.app;

import hc.ventapp.models.Person;
import hc.ventapp.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

@Component
public class AppInit implements CommandLineRunner {
    @Autowired
    PersonRepo personRepo;


    @Override
//    @Transactional
    public void run(String... args) throws Exception {
        Person huy = new Person(1, "huy", "camhuy@email.com");

        personRepo.saveAndFlush(huy);
    }
}
