package com.teus.projectrpg.weapon.mapper

import com.teus.projectrpg.weapon.dto.WeaponDto
import com.teus.projectrpg.weapon.entity.Weapon
import org.mapstruct.Context
import org.mapstruct.IterableMapping
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface WeaponMapper {
    fun toDto(entity: Weapon): WeaponDto
    @IterableMapping(elementTargetType = WeaponDto::class)
    fun toDtos(entityList: List<Weapon>): List<WeaponDto>
    fun toEntity(dto: WeaponDto, @Context context: WeaponContext): Weapon
}