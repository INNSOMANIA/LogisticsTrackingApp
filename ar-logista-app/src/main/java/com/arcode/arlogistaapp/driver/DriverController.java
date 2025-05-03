package com.arcode.arlogistaapp.driver;

import com.arcode.arlogistaapp.driver.dto.DriverDTO;
import com.arcode.arlogistaapp.driver.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/driver")
public class DriverController {

    private final DriverService driverService;

    @GetMapping(value = "/{driverId}")
    public DriverDTO getDriver(@PathVariable("driverId") long driverId) throws Exception {
        return driverService.getDriver(driverId);
    }

    @GetMapping(value = "")
    public List<DriverDTO> getDriverList() {
        return driverService.getDriverList();
    }

    @PostMapping(value = "/add")
    public void addDeriver(@RequestBody DriverDTO driverDTO) {
        driverService.addDriver(driverDTO);
    }

    @DeleteMapping(value = "/{driverId}/delete")
    public void deleteDriver(@PathVariable("driverId") long driverId) throws Exception {
        driverService.deleteDriver(driverId);
    }
}
