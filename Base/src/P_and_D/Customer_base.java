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
@Table(name="База клиентов")
public class Customer_base implements Serializable {
    
    @Id @GeneratedValue
        private long id;

    @Column (name="Код клиента")
    private String kod;
    
    @Column (name="Фамилия Клиента")
    private String last_name;
    
    @Column (name="Имя")
    private String name;
    
    @Column (name="Пол")
    private String sex;
    
    @Column (name="Телефон")
    private int number;
    
    @Column (name="Поломка")
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
    
}
