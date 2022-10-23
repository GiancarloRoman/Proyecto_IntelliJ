package pe.edu.upc.trabajo_grupal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal.entities.Marca;

import java.util.List;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca,Integer> {
    @Query("from Marca m where m.nombreMarca like %:nombreMarca")
    List<Marca> search(@Param("nombreMarca") String nombreMarca);
}
