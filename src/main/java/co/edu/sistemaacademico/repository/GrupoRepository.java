package co.edu.sistemaacademico.repository;

import co.edu.sistemaacademico.model.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * HU07 - Crear grupos.
 * Acceso a datos de los grupos en MongoDB.
 */
@Repository
public interface GrupoRepository extends MongoRepository<Grupo, String> {
}