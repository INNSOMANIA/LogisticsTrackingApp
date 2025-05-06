package com.arcode.arlogistaapp.driver.service;

import com.arcode.arlogistaapp.driver.dto.DriverDTO;
import com.arcode.arlogistaapp.driver.persistence.db.DriverRepository;
import com.arcode.arlogistaapp.driver.persistence.entity.Driver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DriverServiceBean implements DriverService {

    private final DriverRepository<Driver> driverRepository;

    @Override
    public DriverDTO getDriver(long driverId) throws Exception {
        Optional<Driver> driverOptional = driverRepository.findById(driverId);
        if (driverOptional.isPresent()) {
            Driver driver = driverOptional.get();
            return new DriverDTO(
                    driver.getId(),
                    driver.getName(),
                    driver.getSurname(),
                    driver.getEmail(),
                    driver.getAddress(),
                    driver.getLicence(),
                    driver.getPhone()
            );
        } else {
            throw new Exception("Driver with id " + driverId + " does not exist.");
        }
    }

    @Override
    public List<DriverDTO> getDriverList() {
        return driverRepository.findAll().stream()
                .map(
                        driver ->
                                new DriverDTO(
                                        driver.getId(),
                                        driver.getName(),
                                        driver.getSurname(),
                                        driver.getAddress(),
                                        driver.getEmail(),
                                        driver.getLicence(),
                                        driver.getPhone()))
                .collect(Collectors.toList());
    }

    @Override
    public void addDriver(DriverDTO driverDTO) {
        final Driver driver =
                Driver.builder()
                        .id(driverDTO.getId())
                        .name(driverDTO.getName())
                        .surname(driverDTO.getSurname())
                        .email(driverDTO.getEmail())
                        .address(driverDTO.getAddress())
                        .licence(driverDTO.getLicence())
                        .phone(driverDTO.getPhone())
                        .build();

        driverRepository.save(driver);
    }

    @Override
    public void deleteDriver(long driverId) throws Exception {
        final Optional<Driver> possibleDriver = driverRepository.findById(driverId);
        if (possibleDriver.isPresent()) {
            final Driver driver = possibleDriver.get();
            driverRepository.delete(driver);
        } else {
            throw new Exception("Driver with id " + driverId + " does not exist.");
        }
    }
}
