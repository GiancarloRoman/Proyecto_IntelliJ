package pe.edu.upc.trabajo_grupal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal.entities.Cliente;
import pe.edu.upc.trabajo_grupal.entities.Marca;
import pe.edu.upc.trabajo_grupal.serviceinterfaces.IMarcaService;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @Autowired
    private IMarcaService mService;

    @PostMapping
    public void registrar(@RequestBody Marca m) {
        mService.insert(m);
    }
    @GetMapping
    public List<Marca> listar() {
        return mService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Marca marca){
        mService.insert(marca);
    }
    @PostMapping("/buscar")
    public List<Marca> buscar(@RequestBody Marca marca){
        List<Marca> lista;
        marca.setNombreMarca(marca.getNombreMarca());
        lista=mService.search(marca.getNombreMarca());
        return lista;
    }
}
