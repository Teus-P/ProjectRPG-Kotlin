package com.teus.projectrpg.talent.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.talent.type.TalentType

data class TalentDto(
    override var id: Long,
    override var name: TalentType,
    var maxLevel: String
) : BaseDto<TalentType>(id, name)
