package com.reneperez.primeraapi.repository

import com.reneperez.primeraapi.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository:JpaRepository<Producto,Long> {
    fun findById(Id: Long?): Producto?
}