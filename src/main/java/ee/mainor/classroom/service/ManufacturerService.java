package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.ManufacturerDto;
import ee.mainor.classroom.mapper.ManufacturerMapper;
import ee.mainor.classroom.model.Manufacturer;
import ee.mainor.classroom.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerMapper manufacturerMapper;

    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    public ManufacturerDto createManufacturer(ManufacturerDto manufacturerDto) {
        Manufacturer manufacturer = manufacturerRepository.save(manufacturerMapper.toManufacturerEntity(manufacturerDto));
        return manufacturerMapper.toManufacturerDto(manufacturer);
    }

}
