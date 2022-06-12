package com.bl.bootcamp.msproductos.servicios;

import java.util.List;

import com.bl.bootcamp.msproductos.api.v1_0.msproductos.dto.Producto;

public interface ServicioMsproductos {
    List<Producto> listarProductos();

    Producto obtenerProducto(Integer id);

    int crearProducto(Producto producto);

    int editarProducto(Producto producto);

    int borrarProducto(Integer id);
}
