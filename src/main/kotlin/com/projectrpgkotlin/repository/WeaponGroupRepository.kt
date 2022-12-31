package com.projectrpgkotlin.repository

import com.projectrpgkotlin.entity.WeaponGroupEntity
import com.projectrpgkotlin.type.WeaponGroupType
import org.springframework.data.mongodb.repository.MongoRepository

interface WeaponGroupRepository: MongoRepository<WeaponGroupEntity, Long> {
    fun findWeaponGroupEntityByName(weaponGroupType: WeaponGroupType)
}