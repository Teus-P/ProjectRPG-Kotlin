package com.teus.projectrpg.bodylocalization

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import com.teus.projectrpg.bodylocalization.entity.BodyLocalization
import com.teus.projectrpg.bodylocalization.service.BodyLocalizationService
import com.teus.projectrpg.bodylocalization.type.BodyLocalizationType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bodyLocalization")
class BodyLocalizationController(bodyLocalizationService: BodyLocalizationService, baseMapper: BaseMapper<BodyLocalizationType, BodyLocalization>)
    : BaseController<BodyLocalizationType, BodyLocalization, BaseDto<BodyLocalizationType>>(bodyLocalizationService, baseMapper)