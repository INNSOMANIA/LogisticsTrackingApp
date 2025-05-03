package com.arcode.arlogistaapp.driver.service;

import com.arcode.arlogistaapp.driver.dto.DriverDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DriverService {

    DriverDTO getDriver(long driverId) throws Exception;

    List<DriverDTO> getDriverList();

    void addDriver(DriverDTO driverDTO);

    void deleteDriver(long driverId) throws Exception;
}
