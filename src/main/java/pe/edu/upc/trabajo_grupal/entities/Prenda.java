package pe.edu.upc.trabajo_grupal.entities;

import javax.persistence.*;

@Entity
@Table(name = "Prenda")
public class Prenda {
    public Prenda() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrenda;

    @Column(name = "nombrePrenda", length = 50, nullable = false)
    private String nombrePrenda;

    @Column(name = "colorPrenda", length = 50, nullable = false)
    private String colorPrenda;

    @Column(name = "diseñoPrenda", length = 50, nullable = false)
    private String disenioPrenda;

    public Prenda(int idPrenda, String nombrePrenda, String colorPrenda, String disenioPrenda) {
        this.idPrenda = idPrenda;
        this.nombrePrenda = nombrePrenda;
        this.colorPrenda = colorPrenda;
        this.disenioPrenda = disenioPrenda;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getColorPrenda() {
        return colorPrenda;
    }

    public void setColorPrenda(String colorPrenda) {
        this.colorPrenda = colorPrenda;
    }

    public String getDisenioPrenda() {
        return disenioPrenda;
    }

    public void setDisenioPrenda(String disenioPrenda) {
        this.disenioPrenda = disenioPrenda;
    }
}

