package com.bl.bootcamp.msproductos.servicios.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.msproductos.api.v1_0.msproductos.conversor.ProductoConversor;
import com.bl.bootcamp.msproductos.api.v1_0.msproductos.dto.Producto;
import com.bl.bootcamp.msproductos.persistencia.ProductoRepository;
import com.bl.bootcamp.msproductos.servicios.ServicioMsproductos;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioMsproductosImpl implements ServicioMsproductos {

    private final ProductoRepository repositorio;
    private final ProductoConversor conversor;

    @Autowired
    public ServicioMsproductosImpl(ProductoRepository repositorio, ProductoConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    public List<Producto> listarProductos() {
        return this.repositorio.listarProductos().stream().map(conversor::aDto).collect(Collectors.toList());
    }

    @Override
    public Producto obtenerProducto(Integer id) {
        return conversor.aDto(this.repositorio.obtenerProducto(id));
    }

    @Override
    public int crearProducto(Producto producto) {
        return this.repositorio.crearProducto(conversor.aModelo(producto));
    }

    @Override
    public int editarProducto(Producto producto) {
        return this.repositorio.editarProducto(conversor.aModelo(producto));
    }

    @Override
    public int borrarProducto(Integer id) {
        return this.repositorio.borrarProducto(id);
    }

}
