package com.teus.projectrpg.armor.service.armor

import com.teus.projectrpg.armor.entity.Armor
import com.teus.projectrpg.armor.repository.ArmorRepository
import com.teus.projectrpg.exception.FieldCannotBeNullException
import org.hibernate.PropertyValueException
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service

@Service
class ArmorServiceImpl(private val armorRepository: ArmorRepository) : ArmorService {

    override fun findAll(): List<Armor> {
        return this.armorRepository.findAll()
    }

    override fun findByName(name: String): Armor {
        return this.armorRepository.findByName(name)
    }

    override fun save(entity: Armor): Armor {
        entity.isBaseArmor = false
        try {
            return armorRepository.save(entity)
        } catch (ex: DataIntegrityViolationException) {
            throw FieldCannotBeNullException(ex.cause as PropertyValueException)
        }
    }

    override fun deleteById(id: Long) {
        armorRepository.deleteById(id)
    }
}