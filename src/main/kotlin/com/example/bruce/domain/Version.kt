package com.example.bruce.domain

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "versions")
class Version {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id")
    val id: Int = 0

    @Column(name = "version_number")
    val versionNumber: String = ""

}