package com.teus.projectrpg.armor.service.armor

import com.teus.projectrpg.armor.entity.Armor

interface ArmorService {
    fun findAll(): List<Armor>
    fun findByName(name: String): Armor
    fun save(entity: Armor): Armor
    fun deleteById(id: Long)
}