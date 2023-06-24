package com.teus.projectrpg.availability.entity

import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table
data class Availability(
    override var id: Long,
    override var name: AvailabilityType
) : BaseEntity<AvailabilityType>(id, name)