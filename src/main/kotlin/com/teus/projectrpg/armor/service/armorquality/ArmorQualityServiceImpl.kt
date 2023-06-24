package com.teus.projectrpg.armor.service.armorquality

import com.teus.projectrpg.armor.entity.ArmorQuality
import com.teus.projectrpg.armor.repository.ArmorQualityRepository
import com.teus.projectrpg.armor.type.ArmorQualityType
import com.teus.projectrpg.base.service.BaseServiceImpl
import org.springframework.stereotype.Service

@Service
class ArmorQualityServiceImpl(armorQualityRepository: ArmorQualityRepository)
    : ArmorQualityService, BaseServiceImpl<ArmorQualityType, ArmorQuality>(armorQualityRepository)