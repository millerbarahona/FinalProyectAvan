package Control;

import Modelo.DAO.ProductoDAO;
import Modelo.DAO.UsuarioDAO;
import Modelo.DTO.Producto;
import Modelo.DTO.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Facade {

    public boolean crearUsuario(Usuario objP) {
        boolean rta = false;
        if (objP != null) {
            UsuarioDAO dao = new UsuarioDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

    public List<Usuario> listarU() {
        List<Usuario> list = null;
        UsuarioDAO dao = new UsuarioDAO();
        list = dao.getUsuarios();
        return list;
    }

    public Usuario verUsuario(Usuario item) {
        Usuario objDTO;
        UsuarioDAO objDAO = new UsuarioDAO();
        objDTO = objDAO.read(item);
        return objDTO;
    }

    public boolean actualizarU(Usuario objP) {
        boolean rta = false;
        if (objP != null) {
            UsuarioDAO dao = new UsuarioDAO();
            rta = dao.update(objP);
        }
        return rta;
    }

    public boolean eliminarU(Usuario objP) {
        boolean rta = false;
        if (objP != null) {
            UsuarioDAO dao = new UsuarioDAO();
            rta = dao.deleteU(objP);
        }
        return rta;
    }

    public boolean crearProducto(Producto objP) {
        boolean rta = false;
        if (objP != null) {
            ProductoDAO dao = new ProductoDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

    public List<Producto> listarP() {
        List<Producto> list = null;
        ProductoDAO dao = new ProductoDAO();
        list = dao.readAll();
        return list;
    }

    public Producto verProducto(Producto item) {
        Producto objDTO;
        ProductoDAO objDAO = new ProductoDAO();
        objDTO = objDAO.read(item);
        return objDTO;
    }

    public boolean actualizarP(Producto objP) {
        boolean rta = false;
        if (objP != null) {
            ProductoDAO dao = new ProductoDAO();
            rta = dao.update(objP);
        }
        return rta;
    }

    public boolean eliminarP(Producto objP) {
        boolean rta = false;
        if (objP != null) {
            ProductoDAO dao = new ProductoDAO();
            rta = dao.dalete(objP);
        }
        return rta;
    }

    public String validacion(Usuario usu) {
        List<Usuario> lista = new ArrayList<>();
        lista = listarU();
        System.out.println(lista.size());
        for (Usuario i : lista) {
            System.out.println("hola");
            System.out.println(usu.getNombres());
            if (i.getNombres().equalsIgnoreCase(usu.getNombres()) && i.getApellidos().equalsIgnoreCase(usu.getApellidos())) {
                return "ProductoVTA";
            } else {
                return "loginfallido";
            }
        }
        return null;
    }

}
