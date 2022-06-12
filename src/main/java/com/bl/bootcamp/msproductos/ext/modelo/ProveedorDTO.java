package com.bl.bootcamp.msproductos.ext.modelo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProveedorDTO {
    private Integer idProveedor;

    @NotNull(message = "El nombre no debe estar vacío")
    @Size(min = 3, max = 100, message = "El nombre debe estar entre 3 y 100 caractéres")
    private String nombre;

    @NotNull(message = "La direccion no debe estar vacía")
    @Size(min = 3, max = 200, message = "La dirección debe estar entre 3 y 200 caractéres")
    private String direccion;
}
