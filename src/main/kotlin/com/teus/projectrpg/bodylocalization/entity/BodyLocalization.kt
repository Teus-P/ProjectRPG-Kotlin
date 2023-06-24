package com.teus.projectrpg.bodylocalization.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.bodylocalization.type.BodyLocalizationType
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "body_localization")
data class BodyLocalization(
    override var id: Long,
    override var name: BodyLocalizationType
) : BaseEntity<BodyLocalizationType>(id, name)
