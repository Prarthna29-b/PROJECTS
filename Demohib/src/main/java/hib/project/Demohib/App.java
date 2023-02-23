package hib.project.Demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an=new AlienName();
    	an.setFirstName("Prarthna");
    	an.setLastName("Shishodia");
    	an.setMiddleName("Singh");
        Aline a= new Aline();
      a.setAid(2);
       a.setAname(an);
     a.setColor("red");
        Configuration con = new Configuration().configure().addAnnotatedClass(Aline.class);
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf= con.buildSessionFactory(reg);
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
         s.save(a);
        a=(Aline)s.get(Aline.class, 2);
       t.commit();
      System.out.println(a);
    }
}
