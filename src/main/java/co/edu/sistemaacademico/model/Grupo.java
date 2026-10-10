package co.edu.sistemaacademico.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "grupos")
public class Grupo {

    @Id
    private String id;
    private String codigo;
    private String asignaturaId;
    private String profesorTutorId;
    private int capacidadMaxima;
    private String horario;
    private String aula;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getAsignaturaId() { return asignaturaId; }
    public void setAsignaturaId(String asignaturaId) { this.asignaturaId = asignaturaId; }

    public String getProfesorTutorId() { return profesorTutorId; }
    public void setProfesorTutorId(String profesorTutorId) { this.profesorTutorId = profesorTutorId; }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getAula() { return aula; }
    public void setAula(String aula) { this.aula = aula; }
}