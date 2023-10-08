package hibernateproject12.hibernateproject12;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config =new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(student.class);
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        student u=new student();
        u.setId(3);
        u.setName("Dharani");
        u.setDept("CSE");
        u.setSec("A");
        s.beginTransaction();
        s.persist(u);
        s.getTransaction().commit();
        System.out.println("Saved...");
    }
}
