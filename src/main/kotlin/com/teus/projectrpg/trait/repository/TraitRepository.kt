package com.teus.projectrpg.trait.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.trait.entity.Trait
import com.teus.projectrpg.trait.type.TraitType

interface TraitRepository : BaseRepository<TraitType, Trait>