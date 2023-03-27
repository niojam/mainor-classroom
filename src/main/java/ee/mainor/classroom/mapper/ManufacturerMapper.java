package ee.mainor.classroom.mapper;

import ee.mainor.classroom.dto.ManufacturerDto;
import ee.mainor.classroom.model.Manufacturer;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerMapper {

    public ManufacturerDto toManufacturerDto(Manufacturer manufacturer) {
        return new ManufacturerDto().setId(manufacturer.getId()).setName(manufacturer.getName());
    }

}
