package com.bl.bootcamp.msproductos.api.v1_0.msproductos.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.bl.bootcamp.msproductos.ext.modelo.PedidoDTO;
import com.bl.bootcamp.msproductos.ext.modelo.ProveedorDTO;

import lombok.Data;

@Data
public class Producto {
    private Integer idProducto;

    @NotNull(message = "El nombre no debe estar vacío")
    @Size(min = 3, max = 100, message = "El nombre debe estar entre 3 y 100 caractéres")
    private String nombre;

    @NotNull(message = "El precio no debe estar vacío")
    private Integer precio;

    private Integer idPedido;

    private Integer idProveedor;

    private PedidoDTO pedido;

    private ProveedorDTO proveedor;

}
