package com.teus.projectrpg.weapon.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.weapon.type.WeaponQualityType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "weapon_quality")
data class WeaponQuality(
    override var id: Long,
    override var name: WeaponQualityType
) : BaseEntity<WeaponQualityType>(id, name)
