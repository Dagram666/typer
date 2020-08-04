package pl.typer.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.typer.hibernate.entity.Typer;

public class SaveEntityApp {
    public static void main(String[] args) {
        //stworzenie Configuracji opiekt clasy conf
        Configuration conf = new Configuration();
        //wczytanie pliku dla hibernata(nazwa)  conf.configure(hibernate.cfg.xml)
        conf.configure("hibernate.cfg.xml");
        //dodanie  Adnotacja do klasy  w nawiasie nazwa klasy z class conf.addAnnotationClass(Typer.class)
        conf.addAnnotatedClass(Typer.class);
        //Tworzenie Fabryki sessji SessionFactory = wywołanie  conf.buildSessionFactory()

        SessionFactory factory = conf.buildSessionFactory();
        //pobranie sesji - fabryka  Session session = factory.getCurrentSession();
        Session session = factory.getCurrentSession();
        // storzenie obiektu klasy Typer
        Typer typer = new Typer();
        //ustawainie pół
        typer.setId(3);
        typer.setNick("Mietek");
        typer.setPassword("Jebać pis");
        typer.setPoints(10000);
        // Rozpoczenicie tranzakcji wysłanie danych do fabryki
        session.beginTransaction();
        //zapisanie w bazie danych
        session.save(typer);
        // zakończenie sesji tranzakcji
        session.getTransaction().commit();
        // zamykanie Fabryki
        factory.close();





    }
}
