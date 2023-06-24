package com.teus.projectrpg.weapon.service.weapon

import com.teus.projectrpg.exception.FieldCannotBeNullException
import com.teus.projectrpg.weapon.entity.Weapon
import com.teus.projectrpg.weapon.repository.WeaponRepository
import org.hibernate.PropertyValueException
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service

@Service
class WeaponServiceImpl(val weaponRepository: WeaponRepository) : WeaponService {
    override fun findByName(name: String): Weapon {
        return weaponRepository.findByName(name)
    }

    override fun findAll(): List<Weapon> {
        return weaponRepository.findAll()
    }

    override fun save(entity: Weapon): Weapon {
        entity.isBaseWeapon = false
        try {
            return weaponRepository.save(entity)
        } catch (ex: DataIntegrityViolationException) {
            throw FieldCannotBeNullException(ex.cause as PropertyValueException)
        }
    }

    override fun deleteById(id: Long) {
        weaponRepository.deleteById(id)
    }

}