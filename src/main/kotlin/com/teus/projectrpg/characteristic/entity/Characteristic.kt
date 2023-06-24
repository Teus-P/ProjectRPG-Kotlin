package com.teus.projectrpg.characteristic.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.characteristic.type.CharacteristicType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table
data class Characteristic(
    override var id: Long,
    override var name: CharacteristicType
) : BaseEntity<CharacteristicType>(id, name)
