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
@Table (name="Проведенные работы") 
public class Work_done implements Serializable{
    
    @Id @GeneratedValue
        private long id;
    
    @Column (name="Код мастера")
    private String kodM;
    
    @Column (name="Код клиента")
    private String kodK;
    
    @Column (name="Код детали")
    private int kodD;
    
    @Column (name="Код работы")
    private String kodW;

    public long getId() {
        return id;
    }

    public String getKodM() {
        return kodM;
    }

    public String getKodK() {
        return kodK;
    }

    public int getKodD() {
        return kodD;
    }

    public String getKodW() {
        return kodW;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKodM(String kodM) {
        this.kodM = kodM;
    }

    public void setKodK(String kodK) {
        this.kodK = kodK;
    }

    public void setKodD(int kodD) {
        this.kodD = kodD;
    }

    public void setKodW(String kodW) {
        this.kodW = kodW;
    }

    public Work_done() {
    }

    public Work_done(long id, String kodM, String kodK, int kodD, String kodW) {
        this.id = id;
        this.kodM = kodM;
        this.kodK = kodK;
        this.kodD = kodD;
        this.kodW = kodW;
    }
    
    

    
}
