package com.genertech.sahm.wf.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.genertech.sahm.wf.mvc.entity.Person;
import com.genertech.sahm.wf.mvc.repository.custom.PersonRepositoryCustom;

public interface PersonRepository extends JpaRepository<Person, String>,
        PersonRepositoryCustom {
}
