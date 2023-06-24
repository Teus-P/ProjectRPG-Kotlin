package com.teus.projectrpg.armor

import com.teus.projectrpg.armor.dto.ArmorDto
import com.teus.projectrpg.armor.entity.ArmorCategory
import com.teus.projectrpg.armor.entity.ArmorPenalty
import com.teus.projectrpg.armor.entity.ArmorQuality
import com.teus.projectrpg.armor.mapper.ArmorContext
import com.teus.projectrpg.armor.mapper.ArmorMapper
import com.teus.projectrpg.armor.service.armor.ArmorService
import com.teus.projectrpg.armor.service.armorcategory.ArmorCategoryService
import com.teus.projectrpg.armor.service.armorpenalty.ArmorPenaltyService
import com.teus.projectrpg.armor.service.armorquality.ArmorQualityService
import com.teus.projectrpg.armor.type.ArmorCategoryType
import com.teus.projectrpg.armor.type.ArmorPenaltyType
import com.teus.projectrpg.armor.type.ArmorQualityType
import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import jakarta.validation.Valid
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


//TODO change endpoints on frontend side
@RestController
@RequestMapping("/armor")
class ArmorController(
    private val armorService: ArmorService,
    private val armorCategoryService: ArmorCategoryService,
    private val armorPenaltyService: ArmorPenaltyService,
    private val armorQualityService: ArmorQualityService,
    private val armorMapper: ArmorMapper,
    private val armorCategoryMapper: BaseMapper<ArmorCategoryType, ArmorCategory>,
    private val armorPenaltyMapper: BaseMapper<ArmorPenaltyType, ArmorPenalty>,
    private val armorQualityMapper: BaseMapper<ArmorQualityType, ArmorQuality>,
) {

    @GetMapping
    fun getAll(): ResponseEntity<List<ArmorDto>> {
        val dtos = armorMapper.toDtos(armorService.findAll())
        return if (dtos.isEmpty())
            ResponseEntity.noContent().build()
        else
            ResponseEntity.ok(dtos)
    }

    @PutMapping
    fun putArmor(@Valid @RequestBody newArmor: ArmorDto): ResponseEntity<ArmorDto> {
        val savedArmor = armorService.save(armorMapper.toEntity(newArmor, ArmorContext))
        return ResponseEntity.ok(
            armorMapper.toDto(savedArmor)
        )
    }

    @DeleteMapping("/{id}")
    fun deleteArmor(@PathVariable id: Long): ResponseEntity<Void> {
        return try {
            armorService.deleteById(id)
            ResponseEntity.noContent().build()
        } catch (ex: EmptyResultDataAccessException) {
            ResponseEntity.notFound().build()
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }

    @GetMapping("/armorCategory")
    fun getAllArmorCategories(): ResponseEntity<List<BaseDto<ArmorCategoryType>>> {
        val findAll = armorCategoryMapper.toDtos(armorCategoryService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }

    @GetMapping("/armorPenalty")
    fun getAllArmorPenalties(): ResponseEntity<List<BaseDto<ArmorPenaltyType>>> {
        val findAll = armorPenaltyMapper.toDtos(armorPenaltyService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }

    @GetMapping("/armorQuality")
    fun getAllArmorQualities(): ResponseEntity<List<BaseDto<ArmorQualityType>>> {
        val findAll = armorQualityMapper.toDtos(armorQualityService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }
}