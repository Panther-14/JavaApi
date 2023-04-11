/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Prenda;

/**
 *
 * @author Panther
 */
public class PrendaDAO {

    public List<Prenda> getAll() {
        List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Prenda.getAllPrendas");
            } catch (Exception ex) {
            } finally {
                conn.close();
            }
        }
        return list;
    }

    public Prenda getPrendaById(Integer idPrenda) {
        Prenda c;
        c = new Prenda();
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                c = conn.selectOne("Prenda.getPrendaById", idPrenda);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return c;
    }

    public List<Prenda> findPrenda(String descripcion) {
        List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Prenda.findPrenda", descripcion);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }

    public Mensaje registrarPrenda(Integer idCategoria,
            Integer piezas, String serie, Float porcentajePrestamo,
            Integer idSubCategoria, String descripcion, Float prestamo,
            String modelo, Float avaluo
    ) {
        Mensaje resultado;
        Prenda c = new Prenda(idCategoria, piezas, serie, porcentajePrestamo, idSubCategoria, descripcion, prestamo, modelo, avaluo);
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.insert("Prenda.registrarPrenda", c);
            conn.commit();
            resultado = new Mensaje("Prenda registrada exitosamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }

    public Mensaje actualizarPrenda(
            Integer idPrenda, Integer idCategoria,
            Integer piezas, String serie, Float porcentajePrestamo,
            Integer idSubCategoria, String descripcion, Float prestamo,
            String modelo, Float avaluo
    ) {
        Mensaje resultado;
        Prenda c = new Prenda(idPrenda, idCategoria, piezas, serie, porcentajePrestamo, idSubCategoria, descripcion, prestamo, modelo, avaluo);
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.update("Prenda.actualizarPrenda", c);
            conn.commit();
            resultado = new Mensaje("Prenda actualizado exitosamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }

    public Mensaje eliminarPrenda(Integer idPrenda) {
        Mensaje resultado;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.delete("Prenda.eliminarPrenda", idPrenda);
            conn.commit();
            resultado = new Mensaje("Prenda eliminado exitosamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
}
