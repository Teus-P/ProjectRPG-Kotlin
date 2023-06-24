package com.teus.projectrpg.condition.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.condition.entity.Condition
import com.teus.projectrpg.condition.type.ConditionType

interface ConditionRepository : BaseRepository<ConditionType, Condition>