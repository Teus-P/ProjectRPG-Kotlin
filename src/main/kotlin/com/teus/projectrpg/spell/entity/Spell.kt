package com.teus.projectrpg.spell.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.spell.type.SpellType
import jakarta.persistence.*

@Entity
@Table(name = "spell")
data class Spell(
    override var id: Long,
    override var name: SpellType,

    @ManyToOne
    @JoinColumn(name = "spell_group_id", nullable = false)
    var spellGroup: SpellGroup
) : BaseEntity<SpellType>(id, name)