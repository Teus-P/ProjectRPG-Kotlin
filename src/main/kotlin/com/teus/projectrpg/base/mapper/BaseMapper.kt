package com.teus.projectrpg.base.mapper

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.entity.BaseEntity

interface BaseMapper<T: Enum<T>, E: BaseEntity<T>> : CoreMapper<T, E, BaseDto<T>> {
    override fun toDto(entity: E): BaseDto<T>
    override fun toDtos(entityList: List<E>): List<BaseDto<T>>
}