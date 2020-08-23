
import Modelo.DAO.UsuarioDAO;
import Modelo.DTO.Usuario;


public class main {
    
    public static void main(String[] args) {
        UsuarioDAO pp = new UsuarioDAO();
        Usuario nuevo = new Usuario("miller", "barahona", "cedula", "100134", "Bogota", "tv73...", "Admin :3"); 
        System.out.println("Holi");
        pp.create(nuevo);
    }
    
}
