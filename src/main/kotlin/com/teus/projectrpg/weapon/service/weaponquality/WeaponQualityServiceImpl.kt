package com.teus.projectrpg.weapon.service.weaponquality

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.weapon.entity.WeaponQuality
import com.teus.projectrpg.weapon.repository.WeaponQualityRepository
import com.teus.projectrpg.weapon.type.WeaponQualityType
import org.springframework.stereotype.Service

@Service
class WeaponQualityServiceImpl(weaponQualityRepository: WeaponQualityRepository)
    : WeaponQualityService, BaseServiceImpl<WeaponQualityType, WeaponQuality>(weaponQualityRepository)