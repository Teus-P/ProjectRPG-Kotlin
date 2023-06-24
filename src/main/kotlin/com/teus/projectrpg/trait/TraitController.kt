package com.teus.projectrpg.trait

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.trait.dto.TraitDto
import com.teus.projectrpg.trait.entity.Trait
import com.teus.projectrpg.trait.mapper.TraitMapper
import com.teus.projectrpg.trait.service.TraitService
import com.teus.projectrpg.trait.type.TraitType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/creatureTrait")
class TraitController(traitService: TraitService, traitMapper: TraitMapper)
    : BaseController<TraitType, Trait, TraitDto>(traitService, traitMapper)