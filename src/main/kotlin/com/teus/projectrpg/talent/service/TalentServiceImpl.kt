package com.teus.projectrpg.talent.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.talent.entity.Talent
import com.teus.projectrpg.talent.repository.TalentRepository
import com.teus.projectrpg.talent.type.TalentType
import org.springframework.stereotype.Service

@Service
class TalentServiceImpl(talentRepository: TalentRepository)
    : TalentService, BaseServiceImpl<TalentType, Talent>(talentRepository)