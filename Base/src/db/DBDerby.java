/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Work.Name_work;
/**
 *
 * @author pries
 */
public class DBDerby extends DBBase {

    /**
     * Интерфейс, используемый для взаимодействия с сущностью управляющей
     * фабрики для сохранения персистентного блока: отвечает за отображение
     * объектов в базу, поддержку соединений, кеш состояний и т.д. Его создание
     * это достаточно длительная и дорогая операция, поэтому создаем его один
     * раз на все приложение
     */
    private static final EntityManagerFactory emf;

    /**
     * Представляет собой интерфейс используемый для взаимодействия с контекстом
     * персистентности. Используется для поиска сущностей, их создания и
     * удаления, запроса к объектам-сущностям.
     */
    private EntityManager em;

    static {
        //Создаем сущность фабрики с использованием единицы персистентности
        emf = Persistence.createEntityManagerFactory("BasePU2");
    }

    public DBDerby() {
        //создаем менеджера для работы с БД
        em = emf.createEntityManager();
    }

    public void addNameWork(Name_work p) {
        //начинам транзакцию
        em.getTransaction().begin();

        //маппим объект в БД
        em.persist(p);

        //оканчиваем транзакцию
        em.getTransaction().commit();
    }

    public Name_work find(long index) {
        Name_work p = em.find(Name_work.class, index);
        return p;
    }
    public void close() {
        em.close();
        emf.close();
    }
}
