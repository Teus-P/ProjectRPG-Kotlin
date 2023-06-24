package com.teus.projectrpg.condition

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.condition.dto.ConditionDto
import com.teus.projectrpg.condition.entity.Condition
import com.teus.projectrpg.condition.mapper.ConditionMapper
import com.teus.projectrpg.condition.service.ConditionService
import com.teus.projectrpg.condition.type.ConditionType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/condition")
class ConditionController(conditionService: ConditionService, conditionMapper: ConditionMapper)
    : BaseController<ConditionType, Condition, ConditionDto>(conditionService, conditionMapper)