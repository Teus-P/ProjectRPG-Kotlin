package com.teus.projectrpg.armor.service.armorpenalty

import com.teus.projectrpg.armor.entity.ArmorPenalty
import com.teus.projectrpg.armor.repository.ArmorPenaltyRepository
import com.teus.projectrpg.armor.type.ArmorPenaltyType
import com.teus.projectrpg.base.service.BaseServiceImpl
import org.springframework.stereotype.Service

@Service
class ArmorPenaltyServiceImpl(armorPenaltyRepository: ArmorPenaltyRepository) : ArmorPenaltyService,
    BaseServiceImpl<ArmorPenaltyType, ArmorPenalty>(armorPenaltyRepository)