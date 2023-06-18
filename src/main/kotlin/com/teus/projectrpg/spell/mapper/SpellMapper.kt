package com.teus.projectrpg.spell.mapper

import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.spell.dto.SpellDto
import com.teus.projectrpg.spell.entity.Spell
import com.teus.projectrpg.spell.type.SpellType
import org.mapstruct.IterableMapping
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Service
interface SpellMapper : CoreMapper<SpellType, Spell, SpellDto>