package com.teus.projectrpg.base.service

import com.teus.projectrpg.base.entity.BaseEntity

interface BaseService<T: Enum<T>, E : BaseEntity<T>> {
    fun findAll(): List<E>
    fun findByName(type: T): E
}