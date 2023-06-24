package com.teus.projectrpg.trait.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.trait.type.TraitType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "creature_trait")
data class Trait(
    override var id: Long,
    override var name: TraitType,

    @Column
    var hasValue: Boolean
) : BaseEntity<TraitType>(id, name)
