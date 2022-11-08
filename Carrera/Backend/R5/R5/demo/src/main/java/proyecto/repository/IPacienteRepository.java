package proyecto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.model.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
}