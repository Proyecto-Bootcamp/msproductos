package com.bl.bootcamp.msproductos.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.msproductos.persistencia.modelo.ProductoBean;

public interface ProductoBeanMapper {
    int deleteByPrimaryKey(Integer idproducto);

    int insert(ProductoBean record);

    int insertSelective(ProductoBean record);

    ProductoBean selectByPrimaryKey(Integer idproducto);

    int updateByPrimaryKeySelective(ProductoBean record);

    int updateByPrimaryKey(ProductoBean record);

    List<ProductoBean> listarProductos();
}