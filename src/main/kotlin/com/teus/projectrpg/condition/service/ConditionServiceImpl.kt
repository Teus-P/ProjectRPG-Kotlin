package com.teus.projectrpg.condition.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.condition.entity.Condition
import com.teus.projectrpg.condition.repository.ConditionRepository
import com.teus.projectrpg.condition.type.ConditionType
import org.springframework.stereotype.Service

@Service
class ConditionServiceImpl(conditionRepository: ConditionRepository) : ConditionService,
    BaseServiceImpl<ConditionType, Condition>(conditionRepository)