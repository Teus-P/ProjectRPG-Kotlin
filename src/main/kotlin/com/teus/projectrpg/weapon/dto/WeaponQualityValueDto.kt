package com.teus.projectrpg.weapon.dto

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.weapon.type.WeaponQualityType

data class WeaponQualityValueDto(
    var id: Long,
    var weaponQuality: BaseDto<WeaponQualityType>,
    var value: String
)
