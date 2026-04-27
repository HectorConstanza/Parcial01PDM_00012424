package com.example.agueta_pupuseria

import com.example.agueta_pupuseria.TipoProducto

data class producto(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val imagenUrl: String,
    val tipo: TipoProducto
)
