package com.bl.bootcamp.msproductos.api.v1_0.msproductos.conversor;

import org.springframework.stereotype.Component;

import com.bl.bootcamp.msproductos.api.v1_0.msproductos.dto.Producto;
import com.bl.bootcamp.msproductos.persistencia.modelo.ProductoBean;

@Component
public class ProductoConversor {
    public ProductoBean aModelo(Producto dto) {
        return new ProductoBean(dto.getIdProducto(), dto.getNombre(), dto.getPrecio(), dto.getIdPedido(),
                dto.getIdProveedor());
    }

    public Producto aDto(ProductoBean dto) {
        Producto producto = new Producto();
        producto.setIdProducto(dto.getIdproducto());
        producto.setNombre(dto.getNombre());
        producto.setPrecio(dto.getPrecio());
        producto.setIdPedido(dto.getIdpedido());
        producto.setIdProveedor(dto.getIdproveedor());
        return producto;
    }
}
