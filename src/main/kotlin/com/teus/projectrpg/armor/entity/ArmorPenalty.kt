package com.teus.projectrpg.armor.entity

import com.teus.projectrpg.armor.type.ArmorPenaltyType
import com.teus.projectrpg.base.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "armor_penalty")
data class ArmorPenalty(
    override var id: Long,
    override var name: ArmorPenaltyType
) : BaseEntity<ArmorPenaltyType>(id, name)
