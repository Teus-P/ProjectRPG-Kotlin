package com.teus.projectrpg.trait.mapper

import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.trait.dto.TraitDto
import com.teus.projectrpg.trait.entity.Trait
import com.teus.projectrpg.trait.type.TraitType
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.springframework.stereotype.Service


@Service
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface TraitMapper : CoreMapper<TraitType, Trait, TraitDto>