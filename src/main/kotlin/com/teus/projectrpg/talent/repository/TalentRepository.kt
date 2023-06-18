package com.teus.projectrpg.talent.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.talent.entity.Talent
import com.teus.projectrpg.talent.type.TalentType

interface TalentRepository : BaseRepository<TalentType, Talent>