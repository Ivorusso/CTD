package proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.model.Domicilio;

@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
