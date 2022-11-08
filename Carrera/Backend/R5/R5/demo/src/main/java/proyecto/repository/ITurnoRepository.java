package proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.model.Turno;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Integer> {
}
