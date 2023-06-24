package com.teus.projectrpg.spell

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.spell.dto.SpellDto
import com.teus.projectrpg.spell.entity.Spell
import com.teus.projectrpg.spell.mapper.SpellMapper
import com.teus.projectrpg.spell.service.SpellService
import com.teus.projectrpg.spell.type.SpellType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/spell")
class SpellController(spellService: SpellService, spellMapper: SpellMapper)
    : BaseController<SpellType, Spell, SpellDto>(spellService, spellMapper)