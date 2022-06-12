package com.bl.bootcamp.msproductos.persistencia;

import java.util.List;

import com.bl.bootcamp.msproductos.persistencia.modelo.ProductoBean;

public interface ProductoRepository {
    public List<ProductoBean> listarProductos();

    ProductoBean obtenerProducto(Integer id);

    int crearProducto(ProductoBean producto);

    int editarProducto(ProductoBean producto);

    int borrarProducto(Integer id);
}
