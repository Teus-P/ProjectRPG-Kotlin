package com.teus.projectrpg.spell.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.spell.type.SpellGroupType
import jakarta.persistence.*

@Entity
@Table(name = "spell_group")
data class SpellGroup(
    override var id: Long,
    override var name: SpellGroupType
) : BaseEntity<SpellGroupType>(id, name)
