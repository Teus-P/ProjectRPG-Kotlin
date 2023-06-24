package com.teus.projectrpg.armor.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.bodylocalization.type.BodyLocalizationType

data class ArmorBodyLocalizationDto(
    var id: Long,
    var bodyLocalization: BaseDto<BodyLocalizationType>,
    var armorPoints: Int
)
