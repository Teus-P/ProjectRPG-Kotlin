package com.teus.projectrpg.talent

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.talent.dto.TalentDto
import com.teus.projectrpg.talent.entity.Talent
import com.teus.projectrpg.talent.mapper.TalentMapper
import com.teus.projectrpg.talent.service.TalentService
import com.teus.projectrpg.talent.type.TalentType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/talent")
class TalentController(talentService: TalentService, talentMapper: TalentMapper) :
        BaseController<TalentType, Talent, TalentDto>(talentService, talentMapper)