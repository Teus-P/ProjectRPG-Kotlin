package com.teus.projectrpg.base.entity

import jakarta.persistence.*

@MappedSuperclass
abstract class BaseEntity<T>(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long,

    @Column
    @Enumerated(EnumType.STRING)
    open var name: T
)