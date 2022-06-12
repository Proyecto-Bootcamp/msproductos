package com.bl.bootcamp.msproductos.ext.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bl.bootcamp.msproductos.ext.modelo.ProveedorDTO;

@FeignClient(value = "${com.bl.bootcamp.ext.clientes.proveedor.name}", url = "${com.bl.bootcamp.ext.clientes.proveedor.url}")
public interface ClienteProveedor {

    @GetMapping(path = "/v1_0/msproveedores/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ProveedorDTO obtenerProveedor(@PathVariable Integer id);

}
