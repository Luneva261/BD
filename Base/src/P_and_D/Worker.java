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
@Table (name="Сотрудники")
public class Worker  implements Serializable{
    
    @Id @GeneratedValue
        private long id;

    @Column (name="Код мастера")
    private String kod;
    
    @Column (name="Фамилия Мастера")
    private String last_name;
    
    @Column (name="Имя")
    private String name;
    
    @Column (name="Стаж работы")
    private String experience;
    
    @Column (name="Должность")
    private String post;

    public long getId() {
        return id;
    }

    public String getKod() {
        return kod;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public String getExperience() {
        return experience;
    }

    public String getPost() {
        return post;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Worker() {
    }

    public Worker(long id, String kod, String last_name, String name, String experience, String post) {
        this.id = id;
        this.kod = kod;
        this.last_name = last_name;
        this.name = name;
        this.experience = experience;
        this.post = post;
    }
    
    
}
