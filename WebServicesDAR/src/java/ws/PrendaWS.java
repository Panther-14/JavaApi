/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package ws;

import controlador.PrendaDAO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import pojos.Mensaje;
import pojos.Prenda;

/**
 * REST Web Service
 *
 * @author Panther
 */
@Path("prenda")
public class PrendaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PrendaWS
     */
    public PrendaWS() {
    }

    //GETALL
    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda> getAll() {
        PrendaDAO prendaDAO = new PrendaDAO();
        List<Prenda> list = prendaDAO.getAll();
        return list;
    }

    //GETPRENDABYID
    @Path("byId/{idprenda}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Prenda getPrendaById(@PathParam("idprenda") Integer idPrenda) {
        Prenda c;
        PrendaDAO prendaDAO = new PrendaDAO();
        c = prendaDAO.getPrendaById(idPrenda);
        return c;
    }

    //BUSCARPRENDAS
    @Path("byDesc/{prendaDesc}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda> findPrenda(@PathParam("prendaDesc") String descripcion) {
        List<Prenda> c;
        PrendaDAO prendaDAO = new PrendaDAO();
        c = prendaDAO.findPrenda(descripcion);
        return c;
    }

    //REGISTRARPRENDAS
    @POST
    @Path("registro")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarPrenda(
            @FormParam("idPrenda") Integer idPrenda,
            @FormParam("idCategoria") Integer idCategoria,
            @FormParam("piezas") Integer piezas,
            @FormParam("serie") String serie,
            @FormParam("porcentagePrestamo") Float porcentajePrestamo,
            @FormParam("idSubactegoria") Integer idSubCategoria,
            @FormParam("descripcion") String descripcion,
            @FormParam("prestammo") Float prestamo,
            @FormParam("modelo") String modelo,
            @FormParam("avaluo") Float avaluo
    ) {
        PrendaDAO prendaDAO = new PrendaDAO();
        Mensaje resultado = prendaDAO.registrarPrenda(idPrenda, idCategoria, piezas, serie, porcentajePrestamo, idSubCategoria, descripcion, prestamo, modelo, avaluo);
        return resultado;
    }

    //ACTUALIZARPRENDA
    @PUT
    @Path("actualizar")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje actualizarPrenda(
            @FormParam("idPrenda") Integer idPrenda,
            @FormParam("idCategoria") Integer idCategoria,
            @FormParam("piezas") Integer piezas,
            @FormParam("serie") String serie,
            @FormParam("porcentagePrestamo") Float porcentajePrestamo,
            @FormParam("idSubactegoria") Integer idSubCategoria,
            @FormParam("descripcion") String descripcion,
            @FormParam("prestammo") Float prestamo,
            @FormParam("modelo") String modelo,
            @FormParam("avaluo") Float avaluo) {
        PrendaDAO prendaDAO = new PrendaDAO();
        Mensaje resultado = prendaDAO.actualizarPrenda(idPrenda, idCategoria, piezas, serie, porcentajePrestamo, idSubCategoria, descripcion, prestamo, modelo, avaluo);
        return resultado;
    }

    //ELIMINARPRENDA
    @DELETE
    @Path("eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje eliminarPrenda(
            @FormParam("idPrenda") Integer idPrenda) {
        PrendaDAO prendaDAO = new PrendaDAO();
        Mensaje resultado = prendaDAO.eliminarPrenda(idPrenda);
        return resultado;
    }
}
