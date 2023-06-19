package com.teus.projectrpg.injury.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.injury.entity.Injury
import com.teus.projectrpg.injury.type.InjuryType

interface InjuryRepository : BaseRepository<InjuryType, Injury>