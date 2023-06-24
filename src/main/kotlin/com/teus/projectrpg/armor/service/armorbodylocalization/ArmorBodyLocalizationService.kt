package com.teus.projectrpg.armor.service.armorbodylocalization

import com.teus.projectrpg.armor.entity.ArmorBodyLocalization

interface ArmorBodyLocalizationService {
    fun save(armorBodyLocalization: ArmorBodyLocalization): ArmorBodyLocalization
}