package com.infra.dev.infradevaccess.postgres.repository;

import java.util.List;

import com.infra.dev.infradevaccess.entity.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findAll();

    List<Employee> findById(int id);

}