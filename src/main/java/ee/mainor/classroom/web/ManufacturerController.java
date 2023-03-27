package ee.mainor.classroom.web;

import ee.mainor.classroom.model.Manufacturer;
import ee.mainor.classroom.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("manufacturer")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping("all")
    public List<Manufacturer> findAllManufacturers() {
        return manufacturerService.findAll();
    }

}
