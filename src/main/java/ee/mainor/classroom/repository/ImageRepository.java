package ee.mainor.classroom.repository;

import ee.mainor.classroom.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
