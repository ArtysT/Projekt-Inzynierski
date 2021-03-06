package olsvc.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AdDao extends CrudRepository<Ad, Long> {
}
