package com.projectrpgkotlin.entity

import com.projectrpgkotlin.type.WeaponGroupType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "WeaponGroups")
class WeaponGroupEntity(@Id var id: Long, @Field var name: WeaponGroupType)