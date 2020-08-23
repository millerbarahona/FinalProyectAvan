
package administradorUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class LoginUsuario {

    private String nombre;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LoginUsuario() {
    }
    
    public String validacion (){
        if (nombre.equals("carlosav") && clave.equals("123456")) {
            return "loginexitoso";
        }else{
        return "loginfallido";
    }
    }
    
}
