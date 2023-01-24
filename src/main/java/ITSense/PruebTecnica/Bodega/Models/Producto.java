package ITSense.PruebTecnica.Bodega.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="producto")
public class Producto {

    private String nombre;

    private Date fechaIngreso;
    private Date fechaRetiro;

    @ManyToOne
    @JoinColumn(name = "id_elaboracion")
    private Elaboracion tipoElaboracion;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


   public Producto(String nombre, Date fechaIngreso, Date fechaRetiro, Elaboracion tipoElaboracion) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.tipoElaboracion = tipoElaboracion;
    }

    public Producto() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Elaboracion getTipoElaboracion() {
        return tipoElaboracion;
    }

    public void setTipoElaboracion(Elaboracion tipoElaboracion) {
        this.tipoElaboracion = tipoElaboracion;
    }
}
