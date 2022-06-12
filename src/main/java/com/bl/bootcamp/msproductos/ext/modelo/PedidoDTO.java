package com.bl.bootcamp.msproductos.ext.modelo;

import java.util.Date;

import lombok.Data;

@Data
public class PedidoDTO {
    private Integer idPedido;

    private Date fecha = new Date();

    private Integer precioTotal;

    private Integer idCliente;

}