package com.teus.projectrpg.weapon.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.weapon.type.WeaponGroupType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "weapon_group")
data class WeaponGroup(
    override var id: Long,
    override var name: WeaponGroupType
) : BaseEntity<WeaponGroupType>(id, name)
