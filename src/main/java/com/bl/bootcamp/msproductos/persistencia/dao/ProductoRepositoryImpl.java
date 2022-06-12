package com.bl.bootcamp.msproductos.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.msproductos.persistencia.ProductoRepository;
import com.bl.bootcamp.msproductos.persistencia.mapper.ProductoBeanMapper;
import com.bl.bootcamp.msproductos.persistencia.modelo.ProductoBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
    private final ProductoBeanMapper mapper;

    @Autowired
    public ProductoRepositoryImpl(ProductoBeanMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public ProductoBean obtenerProducto(Integer id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProductoBean> listarProductos() {
        return this.mapper.listarProductos();
    }

    @Override
    public int crearProducto(ProductoBean producto) {
        return this.mapper.insert(producto);
    }

    @Override
    public int editarProducto(ProductoBean producto) {
        return this.mapper.updateByPrimaryKeySelective(producto);
    }

    @Override
    public int borrarProducto(Integer id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
}
