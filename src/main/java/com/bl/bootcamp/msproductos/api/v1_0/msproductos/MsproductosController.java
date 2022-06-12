package com.bl.bootcamp.msproductos.api.v1_0.msproductos;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.bootcamp.msproductos.api.v1_0.msproductos.dto.Producto;
import com.bl.bootcamp.msproductos.ext.clientes.ClientePedido;
import com.bl.bootcamp.msproductos.ext.clientes.ClienteProveedor;

import org.springframework.http.MediaType;
import com.bl.bootcamp.msproductos.servicios.ServicioMsproductos;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequestMapping(path = "/v1_0/msproductos", produces = MediaType.APPLICATION_JSON_VALUE)
public class MsproductosController {

    private ServicioMsproductos servicio;

    @Autowired
    private ClientePedido clientePedido;

    @Autowired
    private ClienteProveedor clienteProveedor;

    @Autowired
    public MsproductosController(ServicioMsproductos servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public @ResponseBody List<Producto> listarPedidos() {
        return servicio.listarProductos();
    }

    @GetMapping("/{id}")
    public @ResponseBody Producto obtenerProducto(@PathVariable Integer id) {
        Producto producto = servicio.obtenerProducto(id);
        producto.setPedido(clientePedido.obtenerPedido(producto.getIdPedido()));
        producto.setProveedor(clienteProveedor.obtenerProveedor(producto.getIdProveedor()));
        return producto;
    }

    @PostMapping
    public @ResponseBody int crearProducto(@Valid @RequestBody Producto producto) {
        return servicio.crearProducto(producto);
    }

    @PutMapping
    public @ResponseBody int editarProducto(@Valid @RequestBody Producto producto) {

        return servicio.editarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarProducto(@PathVariable Integer id) {
        return servicio.borrarProducto(id);
    }
}
