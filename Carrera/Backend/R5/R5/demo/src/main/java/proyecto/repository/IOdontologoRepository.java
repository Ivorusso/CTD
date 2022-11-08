package proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.model.Odontologo;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {

}