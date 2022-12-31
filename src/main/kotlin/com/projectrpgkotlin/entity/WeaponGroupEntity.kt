package com.projectrpg.projectrpgkotlin.entity

import com.projectrpg.projectrpgkotlin.type.WeaponGroupType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "weapongroups")
class WeaponGroupEntity(@Id var id: Long, @Field var name: WeaponGroupType)