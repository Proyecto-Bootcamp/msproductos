package com.bl.bootcamp.msproductos.persistencia.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductoBean {
    private Integer idproducto;

    private String nombre;

    private Integer precio;

    private Integer idpedido;

    private Integer idproveedor;

}