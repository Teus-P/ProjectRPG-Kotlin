package com.teus.projectrpg.weapon.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.weapon.entity.WeaponCategory
import com.teus.projectrpg.weapon.type.WeaponCategoryType

interface WeaponCategoryRepository : BaseRepository<WeaponCategoryType, WeaponCategory>