package com.teus.projectrpg.weapon.service.weapon

import com.teus.projectrpg.weapon.entity.Weapon

interface WeaponService {
    fun findByName(name: String): Weapon
    fun findAll(): List<Weapon>
    fun save(entity: Weapon): Weapon
    fun deleteById(id: Long)
}