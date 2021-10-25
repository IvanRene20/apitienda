package com.reneperez.primeraapi.controller

import com.reneperez.primeraapi.model.Clientes
import com.reneperez.primeraapi.service.ClientesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ClientesContoller {
    @Autowired
    lateinit var clientesService: ClientesService

    @GetMapping
    fun list(): List<Clientes> {
        return clientesService.list()
    }
}