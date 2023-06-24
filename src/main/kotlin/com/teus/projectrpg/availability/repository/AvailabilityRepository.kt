package com.teus.projectrpg.availability.repository

import com.teus.projectrpg.availability.entity.Availability
import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.repository.BaseRepository

interface AvailabilityRepository : BaseRepository<AvailabilityType, Availability>