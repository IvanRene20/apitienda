package com.reneperez.primeraapi.controller

import com.reneperez.primeraapi.model.Producto
import com.reneperez.primeraapi.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ProductoController {
    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto> {
        return productoService.list()
    }
}
//crear tabla cliente d