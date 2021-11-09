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

    fun save(producto: Producto):Producto{
        return productoRepository.save(producto)
    }

    fun update (producto: Producto):Producto{
        return productoRepository.save(producto)
    }
    fun updateDescription (producto: Producto):Producto{
        val response = productoRepository.findById(producto.id)
            ?: throw Exception()
        response.apply {
            this.description=producto.description
        }
        return productoRepository.save(producto)
    }

    fun delete (id:Long): Boolean{
        productoRepository.deleteById(id)
        return true
    }
}