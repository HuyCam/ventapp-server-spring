package hc.ventapp.repositories;

import hc.ventapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepo extends JpaRepository<Person, Long> {
}
