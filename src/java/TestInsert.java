
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TestInsert {
    public static void main(String[] args) {

        Mascota mimascota = new Mascota();
        mimascota.setIdMascota(5);
        mimascota.setNombre("peluza");
        mimascota.setEdad(7);
        mimascota.setNombreDueno("orfelinda");
        mimascota.setRaza("chusca");
        String mensaje = insertMascota(mimascota);
        System.out.println(mensaje);

    }

    public static String insertMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mascota);
        transaction.commit();
        session.close();
        return "Se registro una nueva mascota";

    }
}
