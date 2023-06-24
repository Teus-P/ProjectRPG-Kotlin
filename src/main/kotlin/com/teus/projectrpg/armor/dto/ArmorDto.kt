package com.teus.projectrpg.armor.dto

import com.teus.projectrpg.armor.type.ArmorCategoryType
import com.teus.projectrpg.armor.type.ArmorPenaltyType
import com.teus.projectrpg.armor.type.ArmorQualityType
import com.teus.projectrpg.availability.type.AvailabilityType
import com.teus.projectrpg.base.dto.BaseDto

data class ArmorDto(
    override var id: Long,
    override var name: String,
    var nameTranslation: String,
    var armorCategory: BaseDto<ArmorCategoryType>,
    var armorBodyLocalizations: List<ArmorBodyLocalizationDto>,
    var armorPenalties: List<BaseDto<ArmorPenaltyType>>,
    var armorQualities: List<BaseDto<ArmorQualityType>>,
    var price: String,
    var encumbrance: String,
    var availability: BaseDto<AvailabilityType>,
    var isBaseArmor: Boolean,
) : BaseDto<String>(id, name)
