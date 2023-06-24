package com.teus.projectrpg.weapon.dto

import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.weapon.type.WeaponCategoryType
import com.teus.projectrpg.weapon.type.WeaponGroupType
import com.teus.projectrpg.weapon.type.WeaponReachType

data class WeaponDto(
    override var id: Long,
    override var name: String,
    var nameTranslation: String,
    //TODO change weaponType to WeaponCategory
    var weaponType: BaseDto<WeaponCategoryType>,
    var weaponGroup: BaseDto<WeaponGroupType>,
    var weaponReach: BaseDto<WeaponReachType>,
    var weaponRange: Float,
    var isUsingStrength: Boolean,
    var isUsingStrengthInRange: Boolean,
    var damage: Int,
    var weaponQualities: List<WeaponQualityValueDto>,
    var price: String,
    val encumbrance: String,
    val availability: BaseDto<AvailabilityType>,
    val isBaseWeapon: Boolean
) : BaseDto<String>(id, name)
