package com.teus.projectrpg.weapon.mapper

import com.teus.projectrpg.weapon.entity.Weapon
import org.mapstruct.AfterMapping
import org.mapstruct.MappingTarget

object WeaponContext {
    @AfterMapping
    fun setWeaponQualities(@MappingTarget weapon: Weapon) {
        weapon.weaponQualities.map { weaponQualityValue ->
            weaponQualityValue.weapon = weapon
        }
    }
}