package com.teus.projectrpg.weapon.service.weaponcategory

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.weapon.entity.WeaponCategory
import com.teus.projectrpg.weapon.repository.WeaponCategoryRepository
import com.teus.projectrpg.weapon.type.WeaponCategoryType
import org.springframework.stereotype.Service

@Service
class WeaponCategoryServiceImpl(weaponCategoryRepository: WeaponCategoryRepository)
    : WeaponCategoryService, BaseServiceImpl<WeaponCategoryType, WeaponCategory>(weaponCategoryRepository)