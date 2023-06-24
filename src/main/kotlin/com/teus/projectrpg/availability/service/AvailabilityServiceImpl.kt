package com.teus.projectrpg.availability.service

import com.teus.projectrpg.availability.entity.Availability
import com.teus.projectrpg.availability.repository.AvailabilityRepository
import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.service.BaseServiceImpl
import org.springframework.stereotype.Service

@Service
class AvailabilityServiceImpl(availabilityRepository: AvailabilityRepository)
    : AvailabilityService, BaseServiceImpl<AvailabilityType, Availability>(availabilityRepository)