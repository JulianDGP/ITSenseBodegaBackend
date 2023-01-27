package ITSense.PruebTecnica.Bodega.ModelEntities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;


    //Id de la tabla
    @Id
    //Id Auto Increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;


    private Date fechaIngreso;
//    @PrePersist
//    public void prePersist(){
//        fechaIngreso=new Date();
//    }
    @Column(nullable = true)
    private Date fechaRetiro;
    private Integer cantidad;
    private Boolean defectos;
    private String elaboracion;
    private Boolean disponibilidadStock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getDefectos() {
        return defectos;
    }

    public void setDefectos(Boolean defectos) {
        this.defectos = defectos;
    }

    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    public Boolean getDisponibilidadStock() {
        return disponibilidadStock;
    }

    public void setDisponibilidadStock(Boolean disponibilidadStock) {
        this.disponibilidadStock = disponibilidadStock;
    }


}
