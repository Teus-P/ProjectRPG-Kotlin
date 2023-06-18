package com.teus.projectrpg.spell.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.spell.entity.SpellGroup
import com.teus.projectrpg.spell.repository.SpellGroupRepository
import com.teus.projectrpg.spell.type.SpellGroupType
import org.springframework.stereotype.Service

@Service
class SpellGroupServiceImpl(spellGroupRepository: SpellGroupRepository) : SpellGroupService,
    BaseServiceImpl<SpellGroupType, SpellGroup>(spellGroupRepository)