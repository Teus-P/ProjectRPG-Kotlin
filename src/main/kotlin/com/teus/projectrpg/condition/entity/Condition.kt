package com.teus.projectrpg.condition.entity

import com.teus.projectrpg.base.entity.BaseEntity
import com.teus.projectrpg.condition.type.ConditionType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "condition_entity")
data class Condition(
    override var id: Long,
    override var name: ConditionType,

    @Column(name = "has_counter")
    var hasCounter: Boolean
) : BaseEntity<ConditionType>(id, name)
