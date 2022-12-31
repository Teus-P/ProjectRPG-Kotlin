package com.projectrpgkotlin.entity

import com.projectrpgkotlin.type.WeaponQualityType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "WeaponQualities")
class WeaponQualityEntity(@Id var id: Long, @Field var name: WeaponQualityType)