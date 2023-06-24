package com.teus.projectrpg.armor.mapper

import com.teus.projectrpg.armor.entity.Armor
import com.teus.projectrpg.armor.entity.ArmorBodyLocalization
import org.mapstruct.AfterMapping
import org.mapstruct.MappingTarget

object ArmorContext {

    @AfterMapping
    fun setArmorParameters(@MappingTarget armor: Armor) {
        armor.armorBodyLocalizations = setArmorBodyLocalizations(armor)
    }

    private fun setArmorBodyLocalizations(armor: Armor): List<ArmorBodyLocalization> {
        return armor.armorBodyLocalizations.map { armorBodyLocalization ->
            armorBodyLocalization.armor = armor
            armorBodyLocalization
        }
    }
}