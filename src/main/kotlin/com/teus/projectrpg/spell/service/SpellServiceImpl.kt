package com.teus.projectrpg.spell.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.spell.entity.Spell
import com.teus.projectrpg.spell.repository.SpellRepository
import com.teus.projectrpg.spell.type.SpellType
import org.springframework.stereotype.Service

@Service
class SpellServiceImpl(spellRepository: SpellRepository)
    : SpellService, BaseServiceImpl<SpellType, Spell>(spellRepository)