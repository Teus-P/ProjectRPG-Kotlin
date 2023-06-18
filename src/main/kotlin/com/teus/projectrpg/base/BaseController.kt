package com.teus.projectrpg.base

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.base.service.BaseService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

abstract class BaseController<T : Enum<T>, E : BaseEntity<T>, D : BaseDto<T>>(
    private val service: BaseService<T, E>,
    private val mapper: CoreMapper<T, E, D>
) {

    @GetMapping
    fun getAll(): ResponseEntity<List<D>> {
        val dtos = mapper.toDtos(service.findAll())
        return if (dtos.isEmpty())
            ResponseEntity.noContent().build()
        else
            ResponseEntity.ok(dtos)
    }
}