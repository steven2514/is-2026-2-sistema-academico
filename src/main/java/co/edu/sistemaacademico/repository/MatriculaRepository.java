package co.edu.sistemaacademico.repository;

import co.edu.sistemaacademico.model.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * HU02 - Matricular asignatura.
 * Acceso a datos de las matrículas en MongoDB.
 */
@Repository
public interface MatriculaRepository extends MongoRepository<Matricula, String> {
}