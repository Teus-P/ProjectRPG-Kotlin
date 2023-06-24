package com.teus.projectrpg.weapon.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.weapon.type.WeaponReachType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "weapon_reach")
data class WeaponReach(
    override var id: Long,
    override var name: WeaponReachType
) : BaseEntity<WeaponReachType>(id, name)
