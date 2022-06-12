package com.bl.bootcamp.msproductos.ext.clientes;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bl.bootcamp.msproductos.ext.modelo.PedidoDTO;

@FeignClient(value = "${com.bl.bootcamp.ext.clientes.pedido.name}", url = "${com.bl.bootcamp.ext.clientes.pedido.url}")
public interface ClientePedido {

	@GetMapping(path = "/v1_0/mspedidos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PedidoDTO obtenerPedido(@PathVariable Integer id);

}
