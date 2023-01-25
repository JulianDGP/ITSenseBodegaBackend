package ITSense.PruebTecnica.Bodega.RestControllers;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import ITSense.PruebTecnica.Bodega.Services.IProdcutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto/api")
public class ProductoRestController {


    @Autowired
    private IProdcutoService iProdcutoService;


    @GetMapping("/listar")
    public List<Producto> index(){
        return iProdcutoService.findAll();
    }
}
