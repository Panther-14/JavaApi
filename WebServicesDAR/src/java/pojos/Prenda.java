/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

/**
 *
 * @author Panther
 */
public class Prenda {
    private Integer idPrenda;
    private Integer idCategoria;
    private Integer piezas;
    private String serie;
    private Float porcentagePrestamo;
    private Integer idSubcategoria;
    private String descripcion;
    private Float prestamo;
    private String modelo;
    private Float avaluo;

    public Prenda() {
    }

    public Prenda(Integer idPrenda, Integer idCategoria, Integer piezas, String serie, Float porcentagePrestamo, Integer idSubcategoria, String descripcion, Float prestamo, String modelo, Float avaluo) {
        this.idPrenda = idPrenda;
        this.idCategoria = idCategoria;
        this.piezas = piezas;
        this.serie = serie;
        this.porcentagePrestamo = porcentagePrestamo;
        this.idSubcategoria = idSubcategoria;
        this.descripcion = descripcion;
        this.prestamo = prestamo;
        this.modelo = modelo;
        this.avaluo = avaluo;
    }

    public Integer getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Integer idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getPiezas() {
        return piezas;
    }

    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Float getPorcentagePrestamo() {
        return porcentagePrestamo;
    }

    public void setPorcentagePrestamo(Float porcentagePrestamo) {
        this.porcentagePrestamo = porcentagePrestamo;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Float prestamo) {
        this.prestamo = prestamo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Float avaluo) {
        this.avaluo = avaluo;
    }
        
}
