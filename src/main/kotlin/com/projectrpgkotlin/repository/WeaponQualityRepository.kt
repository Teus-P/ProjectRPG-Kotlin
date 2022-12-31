package com.projectrpgkotlin.repository

import com.projectrpgkotlin.entity.WeaponQualityEntity
import com.projectrpgkotlin.type.WeaponQualityType
import org.springframework.data.mongodb.repository.MongoRepository

interface WeaponQualityRepository: MongoRepository<WeaponQualityEntity, Long> {
    fun findWeaponQualityEntityByName(weaponQualityType: WeaponQualityType)
}