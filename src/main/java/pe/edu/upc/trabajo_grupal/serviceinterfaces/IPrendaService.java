package pe.edu.upc.trabajo_grupal.serviceinterfaces;

import pe.edu.upc.trabajo_grupal.entities.Marca;
import pe.edu.upc.trabajo_grupal.entities.Prenda;

import java.util.List;
import java.util.Optional;

public interface IPrendaService {
    public void insert(Prenda prenda);
    List<Prenda>list();
    public void delete(int idPrenda);
    public Optional<Prenda> listarId(int idPrenda);
    List<Prenda>search(String nombrePrenda);
}
