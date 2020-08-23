
package Modelo.DTO;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Detalle_Pedido implements Serializable{
        
    private int id_pedido,cant_und;
    private List<Producto> productos;

    public Detalle_Pedido(int id_pedido, int cant_und, List<Producto> productos) {
        this.id_pedido = id_pedido;
        this.cant_und = cant_und;
        this.productos = productos;
    }

    public Detalle_Pedido() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCant_und() {
        return cant_und;
    }

    public void setCant_und(int cant_und) {
        this.cant_und = cant_und;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
