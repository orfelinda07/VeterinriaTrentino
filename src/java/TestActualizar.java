
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TestActualizar {

    public static void main(String[] args) {

        Mascota mimascota = new Mascota();

        mimascota.setIdMascota(6);
        mimascota.setNombre("firu");
        mimascota.setEdad(5);
        mimascota.setNombreDueno("erica");
        mimascota.setRaza("chusco");
        String mensaje = UpdateMascota(mimascota);
        System.out.println(mensaje);

    }

    public static String UpdateMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(mascota);
        transaction.commit();
        session.close();
        return "Actualizado correctamente";

    }

}
