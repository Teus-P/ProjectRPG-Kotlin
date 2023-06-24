package com.teus.projectrpg.characteristic.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.characteristic.entity.Characteristic
import com.teus.projectrpg.characteristic.repository.CharacteristicRepository
import com.teus.projectrpg.characteristic.type.CharacteristicType
import org.springframework.stereotype.Service

@Service
class CharacteristicServiceImpl(characteristicRepository: CharacteristicRepository)
    : CharacteristicService, BaseServiceImpl<CharacteristicType, Characteristic>(characteristicRepository)