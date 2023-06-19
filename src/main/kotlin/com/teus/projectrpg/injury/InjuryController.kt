package com.teus.projectrpg.injury

import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import com.teus.projectrpg.injury.entity.Injury
import com.teus.projectrpg.injury.service.InjuryService
import com.teus.projectrpg.injury.type.InjuryType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/injury")
class InjuryController(injuryService: InjuryService, baseMapper: BaseMapper<InjuryType, Injury>)
    : BaseController<InjuryType, Injury, BaseDto<InjuryType>>(injuryService, baseMapper)