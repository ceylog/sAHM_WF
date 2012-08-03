package com.genertech.sahm.wf.mvc.service;

import org.springframework.data.domain.Page;

import com.genertech.sahm.wf.mvc.entity.Person;

public interface PersonService {
    Page<Person> findAll(int page, int size);

    Page<Person> findByNameLike(String name, int page, int size);

    Person findById(String id);

    Person insert(Person person);

    Person update(Person person);

    void deleteById(String id);

}
