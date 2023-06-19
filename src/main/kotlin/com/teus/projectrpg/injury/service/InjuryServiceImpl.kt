package com.teus.projectrpg.injury.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.injury.entity.Injury
import com.teus.projectrpg.injury.repository.InjuryRepository
import com.teus.projectrpg.injury.type.InjuryType
import org.springframework.stereotype.Service

@Service
class InjuryServiceImpl(injuryRepository: InjuryRepository)
    : InjuryService, BaseServiceImpl<InjuryType, Injury>(injuryRepository)