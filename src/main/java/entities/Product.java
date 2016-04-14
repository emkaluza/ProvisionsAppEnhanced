package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by msi on 2016-04-04.
 * Encja Product
 */

@Entity
public class Product implements Serializable{

    @Id
    @GeneratedValue
    private Long idProduct;
    private String name;
    private String namePL;
    private Long idUnit;
    private String commentary;

    public Product() {
    }

    public Product(String name, String namePL, Long idUnit, String commentary) {
        this.name = name;
        this.namePL = namePL;
        this.idUnit = idUnit;
        this.commentary = commentary;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePL() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    public Long getIdUnit() {
        return idUnit;
    }

    public void setIdUnit(Long idUnit) {
        this.idUnit = idUnit;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", namePL='" + namePL + '\'' +
                ", idUnit=" + idUnit +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
