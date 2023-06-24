package com.teus.projectrpg.condition.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.condition.type.ConditionType

data class ConditionDto(
    override var id: Long,
    override var name: ConditionType,
    var hasCounter: Boolean
) : BaseDto<ConditionType>(id, name)
