package pe.edu.upc.trabajo_grupal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal.entities.Prenda;

import java.util.List;

@Repository
public interface IPrendaRepository extends JpaRepository<Prenda,Integer> {
    @Query("from Prenda p where p.nombrePrenda like %:nombrePrenda")
    List<Prenda> search(@Param("nombrePrenda") String nombrePrenda);
}
