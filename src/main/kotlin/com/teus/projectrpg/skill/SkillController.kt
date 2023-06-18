package com.teus.projectrpg.skill

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import com.teus.projectrpg.skill.entity.Skill
import com.teus.projectrpg.skill.service.SkillService
import com.teus.projectrpg.skill.type.SkillType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/skill")
class SkillController(skillService: SkillService, baseMapper: BaseMapper<SkillType, Skill>) :
    BaseController<SkillType, Skill, BaseDto<SkillType>>(skillService, baseMapper)