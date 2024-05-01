package deo;
import org.springframework.data.repository.CrudRepository;

import jakarta.persistence.Id;

public interface dao  extends CrudRepository<Id,Integer>{
    
}
