package com.teus.projectrpg.base.mapper

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.entity.BaseEntity

interface CoreMapper<T, E : BaseEntity<T>, D : BaseDto<T>> {
    fun toDto(entity: E): D
    fun toDtos(entityList: List<E>): List<D>
}