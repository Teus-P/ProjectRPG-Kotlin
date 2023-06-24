package com.teus.projectrpg.base.service

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.base.repository.BaseRepository

open class BaseServiceImpl<T, E : BaseEntity<T>>(private val baseRepository: BaseRepository<T, E>) : BaseService<T, E> {

    override fun findAll(): List<E> {
        return this.baseRepository.findAll()
    }

    override fun findByName(type: T): E {
        return this.baseRepository.findByName(type)
    }
}