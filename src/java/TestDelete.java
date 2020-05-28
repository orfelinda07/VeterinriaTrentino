
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TestDelete {

    public static void main(String[] args) {

        Mascota dmascota = new Mascota();
        dmascota.setIdMascota(5);
        String mensaje = deleteMascota(dmascota);
        System.out.println(mensaje);

    }

    public static String deleteMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(mascota);
        transaction.commit();
        session.close();

        return "Se elimino una mascota";

    }
}
