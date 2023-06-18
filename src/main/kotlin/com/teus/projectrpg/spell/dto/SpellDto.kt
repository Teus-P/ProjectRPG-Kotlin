package com.teus.projectrpg.spell.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.spell.type.SpellGroupType
import com.teus.projectrpg.spell.type.SpellType

data class SpellDto(
    override var id: Long,
    override var name: SpellType,
    var spellGroup: BaseDto<SpellGroupType>
) : BaseDto<SpellType>(id, name)