package com.teus.projectrpg.spell.mapper

import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.spell.dto.SpellDto
import com.teus.projectrpg.spell.entity.Spell
import com.teus.projectrpg.spell.type.SpellType
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.springframework.stereotype.Service

@Service
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface SpellMapper : CoreMapper<SpellType, Spell, SpellDto>