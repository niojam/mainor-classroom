package ee.mainor.classroom.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity {

    @CreatedBy
    protected String createdBy;

    @CreatedDate
    @Temporal(TIMESTAMP)
    protected Date createdAt;

    @LastModifiedBy
    protected String updatedBy;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    protected Date updatedAt;

}
