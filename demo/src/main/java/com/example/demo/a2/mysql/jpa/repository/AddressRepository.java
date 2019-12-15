package com.example.demo.a2.mysql.jpa.repository;

import com.example.demo.jpa.entity.Address;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("!h2")
public interface AddressRepository extends CrudRepository<Address, Long> {
}
