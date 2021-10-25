package com.reneperez.primeraapi.model

import javax.persistence.*

@Entity
@Table(name = "clientes")
class Clientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var description: String? = null
}