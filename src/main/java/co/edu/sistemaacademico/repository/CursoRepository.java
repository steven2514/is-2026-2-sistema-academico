package co.edu.sistemaacademico.repository;

import co.edu.sistemaacademico.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * HU04 - Consultar cursos.
 * Acceso a datos de los cursos en MongoDB.
 */
@Repository
public interface CursoRepository extends MongoRepository<Curso, String> {
}