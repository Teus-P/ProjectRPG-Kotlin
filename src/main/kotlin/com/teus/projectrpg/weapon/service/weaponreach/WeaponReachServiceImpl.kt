package com.teus.projectrpg.weapon.service.weaponreach

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.weapon.entity.WeaponReach
import com.teus.projectrpg.weapon.repository.WeaponReachRepository
import com.teus.projectrpg.weapon.type.WeaponReachType
import org.springframework.stereotype.Service

@Service
class WeaponReachServiceImpl(weaponReachRepository: WeaponReachRepository)
    : WeaponReachService, BaseServiceImpl<WeaponReachType, WeaponReach>(weaponReachRepository)