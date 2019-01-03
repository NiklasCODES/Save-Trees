package rotterenterprises.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import rotterenterprises.models.Tree;

@Transactional
public interface TreeRepository extends CrudRepository<Tree,Long> {




}
