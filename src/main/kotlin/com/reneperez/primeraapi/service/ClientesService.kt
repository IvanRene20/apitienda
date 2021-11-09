package com.reneperez.primeraapi.service

import com.reneperez.primeraapi.model.Clientes
import com.reneperez.primeraapi.repository.ClientesRepositpry
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientesService {
    @Autowired
    lateinit var clientesRepositpry: ClientesRepositpry


    fun list(): List<Clientes> {

        return clientesRepositpry.findAll()
    }

    fun save(clientes: Clientes):Clientes {

        return clientesRepositpry.save(clientes)
    }
    fun update (clientes: Clientes): Clientes{
        return clientesRepositpry.save(clientes)
    }
    fun updateDescription (clientes: Clientes):Clientes {
        val response = clientesRepositpry.findById(clientes.id)
            ?: throw Exception()
        response.apply {
            this.nombres=clientes.nombres
        }
        return clientesRepositpry.save(clientes)
    }
    fun delete (id:Long): Boolean{
        clientesRepositpry.deleteById(id)
        return true
    }


}