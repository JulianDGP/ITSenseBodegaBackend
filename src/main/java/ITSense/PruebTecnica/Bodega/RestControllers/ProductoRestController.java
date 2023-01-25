package ITSense.PruebTecnica.Bodega.RestControllers;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import ITSense.PruebTecnica.Bodega.Services.IProdcutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/producto/api")
public class ProductoRestController {


    @Autowired
    private IProdcutoService iProdcutoService;


    @GetMapping("/listar")
    public List<Producto> index(){
        return iProdcutoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto show(@PathVariable Long id){
        return iProdcutoService.findById(id);
    }
}
