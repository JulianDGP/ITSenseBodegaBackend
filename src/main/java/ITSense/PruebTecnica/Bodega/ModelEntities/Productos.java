package ITSense.PruebTecnica.Bodega.ModelEntities;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.Date;


@CrossOrigin(origins = {"htpps://localhost:4200"})
@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    private static final Integer serialVersionUID=1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Boolean defectos;
    private Boolean elaborado_A_mano;
    private int cantidad;
    private Boolean stock;
    private Date FechaIngreso;
    private Date FechaRetiro;

    public Productos(String nombre, Boolean defectos, Boolean elaborado_A_mano, int cantidad, Boolean stock, Date fechaIngreso, Date fechaRetiro) {
        this.nombre = nombre;
        this.defectos = defectos;
        this.elaborado_A_mano = elaborado_A_mano;
        this.cantidad = cantidad;
        this.stock = stock;
        FechaIngreso = fechaIngreso;
        FechaRetiro = fechaRetiro;
    }

    public Productos() {

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getDefectos() {
        return defectos;
    }

    public void setDefectos(Boolean defectos) {
        this.defectos = defectos;
    }

    public Boolean getElaborado_A_mano() {
        return elaborado_A_mano;
    }

    public void setElaborado_A_mano(Boolean elaborado_A_mano) {
        this.elaborado_A_mano = elaborado_A_mano;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return FechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        FechaRetiro = fechaRetiro;
    }
}
