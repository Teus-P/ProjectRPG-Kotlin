package com.teus.projectrpg.trait.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.trait.type.TraitType

data class TraitDto(
    override var id: Long,
    override var name: TraitType,
    var hasValue: Boolean
) : BaseDto<TraitType>(id, name)
