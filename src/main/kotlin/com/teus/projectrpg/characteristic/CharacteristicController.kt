package com.teus.projectrpg.characteristic

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import com.teus.projectrpg.characteristic.entity.Characteristic
import com.teus.projectrpg.characteristic.service.CharacteristicService
import com.teus.projectrpg.characteristic.type.CharacteristicType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/characteristic")
class CharacteristicController(characteristicService: CharacteristicService, baseMapper: BaseMapper<CharacteristicType, Characteristic>) :
    BaseController<CharacteristicType, Characteristic, BaseDto<CharacteristicType>>(characteristicService, baseMapper)