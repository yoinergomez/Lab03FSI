package co.edu.udea.fsi.lab03.modelo;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Vehiculo implements Serializable {

    @Column(nullable = false)
    @Basic
    private String marca;

    @Column(nullable = false)
    @Basic
    private int precio;

    @Basic
    private String color;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    private byte[] imagen;

    @OneToMany(targetEntity = Venta.class, mappedBy = "vehiculo")
    private List<Venta> ventas;

    @Column(nullable = false)
    @Basic
    private String modelo;

    @Column(unique = true, nullable = false, length = 10)
    @Id
    private String placa;

    public Vehiculo() {

    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getImagen() {
        return this.imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public List<Venta> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", precio=" + precio + ", color=" + color + ", modelo=" + modelo + ", placa=" + placa + '}';
    }
    
    
}
