package com.teus.projectrpg.injury.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.injury.type.InjuryType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "injury")
data class Injury (
    override var id: Long,
    override var name: InjuryType
) : BaseEntity<InjuryType>(id, name)