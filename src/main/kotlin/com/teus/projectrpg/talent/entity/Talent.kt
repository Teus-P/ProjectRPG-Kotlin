package com.teus.projectrpg.talent.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.talent.type.TalentType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "talent")
data class Talent(
    override var id: Long,
    override var name: TalentType,

    @Column
    var maxLevel: String
): BaseEntity<TalentType>(id, name)
