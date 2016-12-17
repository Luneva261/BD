/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import Work.Name_work;
import db.DBDerby;

/**
 *
 * @author windows
 */


public class Base {

    public static void main(String[] args) {
        // TODO code application logic here
        DBDerby dbclient = new DBDerby();
        Name_work newclient=new Name_work(56,"45H","Work");
        dbclient.addNameWork(newclient);
        Name_work clientqwerty=dbclient.find(1L);
        
    }
}
