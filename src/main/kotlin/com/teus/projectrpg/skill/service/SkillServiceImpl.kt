package com.teus.projectrpg.skill.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.skill.entity.Skill
import com.teus.projectrpg.skill.repository.SkillRepository
import com.teus.projectrpg.skill.type.SkillType
import org.springframework.stereotype.Service

@Service
class SkillServiceImpl(skillRepository: SkillRepository)
    : SkillService, BaseServiceImpl<SkillType, Skill>(skillRepository)