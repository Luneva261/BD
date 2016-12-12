/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P_and_D;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author windows
 */
@Entity
@Table (name="Комплектующие и ПО")
public class Detail implements Serializable{
    
    @Id @GeneratedValue
        private long id;

    @Column (name="Код детали")
    private int kod;
    
    @Column (name="Название")
    private String name;
    
    @Column (name="Стоимость")
    private double cost;

    public long getId() {
        return id;
    }

    public int getKod() {
        return kod;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    
}
