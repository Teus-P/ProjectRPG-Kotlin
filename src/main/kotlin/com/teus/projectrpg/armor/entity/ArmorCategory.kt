package com.teus.projectrpg.armor.entity

import com.teus.projectrpg.armor.type.ArmorCategoryType
import com.teus.projectrpg.base.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "armor_category")
data class ArmorCategory(
    override var id: Long,
    override var name: ArmorCategoryType
) : BaseEntity<ArmorCategoryType>(id, name)
