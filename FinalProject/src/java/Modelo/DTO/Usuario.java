
package Modelo.DTO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Usuario {
    int id_usu;
    String nombres, apellidos, tipo_docto,numero_docto,ciudad_residencia,direccion,rol;
    public Usuario() {
    }
    
}
