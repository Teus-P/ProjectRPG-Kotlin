package com.teus.projectrpg.condition.mapper

import com.teus.projectrpg.base.mapper.CoreMapper
import com.teus.projectrpg.condition.dto.ConditionDto
import com.teus.projectrpg.condition.entity.Condition
import com.teus.projectrpg.condition.type.ConditionType
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.springframework.stereotype.Service

@Service
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface ConditionMapper : CoreMapper<ConditionType, Condition, ConditionDto>