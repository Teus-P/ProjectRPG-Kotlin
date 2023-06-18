package com.teus.projectrpg.base.mapper

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.entity.BaseEntity
import org.springframework.stereotype.Service

@Service
class BaseMapperImpl<T: Enum<T>, E: BaseEntity<T>> : BaseMapper<T, E> {
    override fun toDto(entity: E): BaseDto<T> {
        return BaseDto(entity.id, entity.name)
    }

    override fun toDtos(entityList: List<E>): List<BaseDto<T>> {
        val dtosList: MutableList<BaseDto<T>> = ArrayList()

        for (entity in entityList) {
            dtosList.add(toDto(entity))
        }

        return dtosList
    }
}