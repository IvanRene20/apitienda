package com.reneperez.primeraapi.service

import com.reneperez.primeraapi.model.Producto
import com.reneperez.primeraapi.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service


class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {

        return productoRepository.findAll()
    }
}