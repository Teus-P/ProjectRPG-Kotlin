package com.teus.projectrpg.talent.mapper

import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.talent.dto.TalentDto
import com.teus.projectrpg.talent.entity.Talent
import com.teus.projectrpg.talent.type.TalentType
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.springframework.stereotype.Service

@Service
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface TalentMapper : CoreMapper<TalentType, Talent, TalentDto>