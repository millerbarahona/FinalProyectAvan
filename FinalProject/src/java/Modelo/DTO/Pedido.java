
package Modelo.DTO;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Pedido implements Serializable{
    int id_pedido, id_usu, valor_total;
    String observaciones, estado;
    
    
    
}
