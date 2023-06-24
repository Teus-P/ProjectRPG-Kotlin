package com.teus.projectrpg.armor.service.armorcategory

import com.teus.projectrpg.armor.entity.ArmorCategory
import com.teus.projectrpg.armor.repository.ArmorCategoryRepository
import com.teus.projectrpg.armor.type.ArmorCategoryType
import com.teus.projectrpg.base.service.BaseServiceImpl
import org.springframework.stereotype.Service

@Service
class ArmorCategoryServiceImpl(armorCategoryRepository: ArmorCategoryRepository) : ArmorCategoryService,
    BaseServiceImpl<ArmorCategoryType, ArmorCategory>(armorCategoryRepository)