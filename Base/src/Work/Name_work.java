/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

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
@Table (name="Название работы")
public class Name_work implements Serializable{
    
    @Id @GeneratedValue
        private long id;
    
    @Column (name="Код работы")
    private String kod;
    
    @Column (name="Название работы")
    private String nameW;

    public long getId() {
        return id;
    }

    public String getKod() {
        return kod;
    }

    public String getNameW() {
        return nameW;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setNameW(String nameW) {
        this.nameW = nameW;
    }
   

}
