package com.teus.projectrpg.skill.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.skill.type.SkillType
import jakarta.persistence.*

@Entity
@Table(name = "skill")
data class Skill(
    override var id: Long,
    override var name: SkillType
) : BaseEntity<SkillType>(id, name)
