package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by msi on 2016-04-04.
 * Encja Unit
 */

@Entity
public class Unit {

    @Id
    @GeneratedValue
    private Long idUnit;
    private String name;
    private String namePL;

    public Unit() {
    }

    public Unit(String name, String namePL) {
        this.name = name;
        this.namePL = namePL;
    }

    public Long getIdUnit() {
        return idUnit;
    }

    public void setIdUnit(Long idUnit) {
        this.idUnit = idUnit;
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

    @Override
    public String toString() {
        return "Unit{" +
                "idUnit=" + idUnit +
                ", name='" + name + '\'' +
                ", namePL='" + namePL + '\'' +
                '}';
    }
}
