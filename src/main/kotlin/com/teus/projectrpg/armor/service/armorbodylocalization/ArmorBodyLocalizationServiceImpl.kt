package com.teus.projectrpg.armor.service.armorbodylocalization

import com.teus.projectrpg.armor.entity.ArmorBodyLocalization
import com.teus.projectrpg.armor.repository.ArmorBodyLocalizationRepository
import org.springframework.stereotype.Service

@Service
class ArmorBodyLocalizationServiceImpl(val armorBodyLocalizationRepository: ArmorBodyLocalizationRepository) :
    ArmorBodyLocalizationService {

    override fun save(armorBodyLocalization: ArmorBodyLocalization): ArmorBodyLocalization {
        return armorBodyLocalizationRepository.save(armorBodyLocalization)
    }
}