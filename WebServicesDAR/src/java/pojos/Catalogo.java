/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

/**
 *
 * @author Panther
 */
public class Catalogo {
    private Integer idcatalogo; 
    private String nombre; 
    private Integer idtipo; 
    private Integer orden;

    public Catalogo (){
    }

    public Catalogo(Integer idcatalogo, String nombre, Integer idtipo, Integer orden) {
        this.idcatalogo = idcatalogo;
        this.nombre = nombre;
        this.idtipo = idtipo;
        this.orden = orden;
    }

    public Integer getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

}
