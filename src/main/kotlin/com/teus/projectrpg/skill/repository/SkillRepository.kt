package com.teus.projectrpg.skill.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.skill.entity.Skill
import com.teus.projectrpg.skill.type.SkillType

interface SkillRepository : BaseRepository<SkillType, Skill>