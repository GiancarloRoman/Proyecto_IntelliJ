package pe.edu.upc.trabajo_grupal.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal.entities.Cliente;
import pe.edu.upc.trabajo_grupal.repositories.IClienteRepository;
import pe.edu.upc.trabajo_grupal.serviceinterfaces.IClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteRepository cR;
    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCliente) {
        cR.deleteById(idCliente);
    }

    @Override
    public Optional<Cliente> listarId(int idCliente) {
        return Optional.of(cR.findById(idCliente).orElse(new Cliente()));
    }

    @Override
    public List<Cliente> search(String nombreCliente) {
        return cR.search(nombreCliente);
    }
}
