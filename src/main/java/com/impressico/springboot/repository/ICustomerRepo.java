package com.impressico.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impressico.springboot.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}