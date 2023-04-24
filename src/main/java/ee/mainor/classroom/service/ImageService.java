package ee.mainor.classroom.service;

import ee.mainor.classroom.model.Image;
import ee.mainor.classroom.repository.ImageRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    public Image findById(Long id) {
        return imageRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Image is not found"));
    }

    public Long saveImage(String name, String contentType, byte[] content) {
        Image image = new Image();
        image.setName(name);
        image.setContentType(contentType);
        image.setContent(content);
        return imageRepository.save(image).getId();
    }


}
