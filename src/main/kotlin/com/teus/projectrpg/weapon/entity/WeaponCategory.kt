package com.teus.projectrpg.weapon.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.weapon.type.WeaponCategoryType
import jakarta.persistence.Entity
import jakarta.persistence.Table


//TODO change name of weapon_type table to weapon_category

@Entity
@Table(name = "weapon_type")
data class WeaponCategory(
    override var id: Long,
    override var name: WeaponCategoryType
) : BaseEntity<WeaponCategoryType>(id, name)
