package uv.mx.ejercicioss;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reservadores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String noPersonas;
    private String fecha;
    private String hora;


    public Reservadores(){

    }
    

    public Reservadores(int id, String nombre, String noPersonas, String fecha, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.noPersonas = noPersonas;
        this.fecha = fecha;
        this.hora = hora;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNoPersonas() {
        return noPersonas;
    }

    public void setNoPersonas(String noPersonas) {
        this.noPersonas = noPersonas;
    }


    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    


    

    
}
