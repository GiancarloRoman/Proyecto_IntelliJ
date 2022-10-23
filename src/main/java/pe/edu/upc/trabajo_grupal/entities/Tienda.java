package pe.edu.upc.trabajo_grupal.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tienda")
public class Tienda {
    public Tienda() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTienda;

    @Column(name = "nombreTienda", length = 50, nullable = false)
    private String nombreTienda;

    public Tienda(int idTienda, String nombreTienda) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
}
