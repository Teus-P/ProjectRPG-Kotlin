package com.teus.projectrpg.armor.entity

import com.teus.projectrpg.armor.type.ArmorQualityType
import com.teus.projectrpg.base.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "armor_quality")
data class ArmorQuality(
    override var id: Long,
    override var name: ArmorQualityType
) : BaseEntity<ArmorQualityType>(id, name)
