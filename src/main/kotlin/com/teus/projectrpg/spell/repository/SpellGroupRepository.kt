package com.teus.projectrpg.spell.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.spell.entity.SpellGroup
import com.teus.projectrpg.spell.type.SpellGroupType

interface SpellGroupRepository : BaseRepository<SpellGroupType, SpellGroup>