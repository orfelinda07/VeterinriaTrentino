
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

public class TestSparky {

    public static void main(String[] args) {
        List<Mascota> listaSparky = new ArrayList<>();

       listaSparky = updateSparky();
        for (int i = 0; i < listaSparky.size(); i++) {
            System.out.println("Nombre:" + listaSparky.get(i).getNombre());
        }
    }
    
    public static List<Mascota> updateSparky() { 
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where nombre ='sparky'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;

    }

}
