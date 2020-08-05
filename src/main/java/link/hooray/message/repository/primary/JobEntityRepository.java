package link.hooray.message.repository.primary;

import link.hooray.message.domain.primary.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobEntityRepository extends JpaRepository<JobEntity, Long> {

    JobEntity getById(Integer id);

}
