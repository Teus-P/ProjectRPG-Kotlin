package com.teus.projectrpg.armor.mapper

import com.teus.projectrpg.armor.dto.ArmorDto
import com.teus.projectrpg.armor.entity.Armor
import org.mapstruct.Context
import org.mapstruct.IterableMapping
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface ArmorMapper {
    fun toDto(entity: Armor): ArmorDto

    @IterableMapping(elementTargetType = ArmorDto::class)
    fun toDtos(entityList: List<Armor>): List<ArmorDto>
    fun toEntity(dto: ArmorDto, @Context context: ArmorContext): Armor
}