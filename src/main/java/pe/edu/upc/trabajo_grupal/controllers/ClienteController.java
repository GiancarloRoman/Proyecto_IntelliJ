package pe.edu.upc.trabajo_grupal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal.entities.Cliente;
import pe.edu.upc.trabajo_grupal.serviceinterfaces.IClienteService;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService cService;

    @PostMapping
    public void registrar(@RequestBody Cliente c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Cliente> listar() {
        return cService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Cliente cliente){
        cService.insert(cliente);
    }
    @PostMapping("/buscar")
    public List<Cliente> buscar(@RequestBody Cliente cliente){
        List<Cliente> lista;
        cliente.setNombreCliente(cliente.getNombreCliente());
        lista=cService.search(cliente.getNombreCliente());
        return lista;
    }
}

