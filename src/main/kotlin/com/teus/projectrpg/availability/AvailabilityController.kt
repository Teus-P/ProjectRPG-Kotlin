package com.teus.projectrpg.availability

import com.teus.projectrpg.availability.entity.Availability
import com.teus.projectrpg.availability.service.AvailabilityService
import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.BaseController
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/availability")
class AvailabilityController(availabilityService: AvailabilityService, baseMapper: BaseMapper<AvailabilityType, Availability>)
    : BaseController<AvailabilityType, Availability, BaseDto<AvailabilityType>>(availabilityService, baseMapper)