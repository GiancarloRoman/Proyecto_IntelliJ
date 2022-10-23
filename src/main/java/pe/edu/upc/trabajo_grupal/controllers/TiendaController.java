package pe.edu.upc.trabajo_grupal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal.entities.Tienda;
import pe.edu.upc.trabajo_grupal.serviceinterfaces.ITiendaService;
import java.util.List;
@RestController
@RequestMapping("/tiendas")
public class TiendaController {
    @Autowired
    private ITiendaService tService;

    @PostMapping
    public void registrar(@RequestBody Tienda t) {
        tService.insert(t);
    }
    @GetMapping
    public List<Tienda> listar() {
        return tService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Tienda tienda){
        tService.insert(tienda);
    }
    @PostMapping("/buscar")
    public List<Tienda> buscar(@RequestBody Tienda tienda){
        List<Tienda> lista;
        tienda.setNombreTienda(tienda.getNombreTienda());
        lista=tService.search(tienda.getNombreTienda());
        return lista;
    }
}
