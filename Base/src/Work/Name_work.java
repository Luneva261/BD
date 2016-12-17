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
@Table (name="NameWork")
public class Name_work implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
        private long id;
    
    @Column (name="KodWork")
    private String kod;
    
    @Column (name="NameW")
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
    @Override
        public String toString() {
            return String.format("(%d, %s, %s)", this.id, this.kod, this.nameW);
        }

    public Name_work() {
    }

    public Name_work(long id, String kod, String nameW) {
        this.id = id;
        this.kod = kod;
        this.nameW = nameW;
    }
        

}
