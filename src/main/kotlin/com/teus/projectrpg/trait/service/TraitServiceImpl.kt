package com.teus.projectrpg.trait.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.trait.entity.Trait
import com.teus.projectrpg.trait.repository.TraitRepository
import com.teus.projectrpg.trait.type.TraitType
import org.springframework.stereotype.Service

@Service
class TraitServiceImpl(traitRepository: TraitRepository)
    : TraitService, BaseServiceImpl<TraitType, Trait>(traitRepository)