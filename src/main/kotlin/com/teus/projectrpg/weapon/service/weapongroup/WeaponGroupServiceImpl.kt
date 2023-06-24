package com.teus.projectrpg.weapon.service.weapongroup

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.weapon.entity.WeaponGroup
import com.teus.projectrpg.weapon.repository.WeaponGroupRepository
import com.teus.projectrpg.weapon.type.WeaponGroupType
import org.springframework.stereotype.Service

@Service
class WeaponGroupServiceImpl(weaponGroupRepository: WeaponGroupRepository)
    : WeaponGroupService, BaseServiceImpl<WeaponGroupType, WeaponGroup>(weaponGroupRepository)