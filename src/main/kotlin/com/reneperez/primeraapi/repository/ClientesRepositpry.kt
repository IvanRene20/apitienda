package com.reneperez.primeraapi.repository

import com.reneperez.primeraapi.model.Clientes
import org.springframework.data.jpa.repository.JpaRepository

interface ClientesRepositpry:JpaRepository<Clientes,Long> {
}