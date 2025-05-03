package com.arcode.arlogistaapp.driver.persistence.db;

import com.arcode.arlogistaapp.driver.persistence.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository<T extends Driver> extends JpaRepository<Driver, Long> {

    Optional<Driver> findById(Long driverId);

    List<Driver> findAll();
}
