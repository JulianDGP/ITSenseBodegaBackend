package ITSense.PruebTecnica.Bodega.Models;

import jakarta.persistence.*;

@Entity
@Table(name="elaboracion")
public class Elaboracion {

    private String tipoElaboracion;

    public Elaboracion(String tipoElaboracion) {
        this.tipoElaboracion = tipoElaboracion;
    }
    public Elaboracion() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
