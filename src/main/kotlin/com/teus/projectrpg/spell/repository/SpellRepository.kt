package com.teus.projectrpg.spell.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.spell.entity.Spell
import com.teus.projectrpg.spell.type.SpellType
import org.springframework.data.jpa.repository.JpaRepository

interface SpellRepository : BaseRepository<SpellType, Spell>