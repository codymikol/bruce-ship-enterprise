package com.example.bruce.domain

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "clients")
class Client {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id")
    val id: Int = 0

    @Column(name = "name")
    val name: String = ""

    @Column(name = "current_version")
    val currentVersion: String = ""

    @Column(name = "authentication")
    val authentication: String = ""

    public enum class ClientStatus {
        UPDATING,
        FAILED,
        IDLE,
        SCHEDULED
    }
    @Column(name = "status")
    val status: String = ""

}