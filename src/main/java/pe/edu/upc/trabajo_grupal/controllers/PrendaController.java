package pe.edu.upc.trabajo_grupal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal.entities.Marca;
import pe.edu.upc.trabajo_grupal.entities.Prenda;
import pe.edu.upc.trabajo_grupal.serviceinterfaces.IPrendaService;

import java.util.List;
@RestController
@RequestMapping("/prendas")
public class PrendaController {
    @Autowired
    private IPrendaService pService;

    @PostMapping
    public void registrar(@RequestBody Prenda p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Prenda> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Prenda prenda){
        pService.insert(prenda);
    }
    @PostMapping("/buscar")
    public List<Prenda> buscar(@RequestBody Prenda prenda){
        List<Prenda> lista;
        prenda.setNombrePrenda(prenda.getNombrePrenda());
        lista=pService.search(prenda.getNombrePrenda());
        return lista;
    }
}
