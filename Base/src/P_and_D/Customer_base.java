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
@Table(name="BaseClient")
public class Customer_base implements Serializable {
     private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
        private long id;

    @Column (name="Kod")
    private String kod;
    
    @Column (name="Family")
    private String last_name;
    
    @Column (name="Name")
    private String name;
    
    @Column (name="Sex")
    private String sex;
    
    @Column (name="Number")
    private int number;
    
    @Column (name="Problem")
    private String breakage;
    
    public Customer_base () {};

    public String getKod() {
        return kod;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getNumber() {
        return number;
    }

    public String getBreakage() {
        return breakage;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBreakage(String breakage) {
        this.breakage = breakage;
    }

    public Customer_base(long id, String kod, String last_name, String name, String sex, int number, String breakage) {
        this.id = id;
        this.kod = kod;
        this.last_name = last_name;
        this.name = name;
        this.sex = sex;
        this.number = number;
        this.breakage = breakage;
    }
    
}
