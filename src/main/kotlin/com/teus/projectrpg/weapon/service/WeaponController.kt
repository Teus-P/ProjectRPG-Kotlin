package com.teus.projectrpg.weapon.service

import com.teus.projectrpg.base.dto.BaseDto
import com.teus.projectrpg.base.mapper.BaseMapper
import com.teus.projectrpg.weapon.dto.WeaponDto
import com.teus.projectrpg.weapon.entity.WeaponCategory
import com.teus.projectrpg.weapon.entity.WeaponGroup
import com.teus.projectrpg.weapon.entity.WeaponQuality
import com.teus.projectrpg.weapon.entity.WeaponReach
import com.teus.projectrpg.weapon.mapper.WeaponContext
import com.teus.projectrpg.weapon.mapper.WeaponMapper
import com.teus.projectrpg.weapon.service.weapon.WeaponService
import com.teus.projectrpg.weapon.service.weaponcategory.WeaponCategoryService
import com.teus.projectrpg.weapon.service.weapongroup.WeaponGroupService
import com.teus.projectrpg.weapon.service.weaponquality.WeaponQualityService
import com.teus.projectrpg.weapon.service.weaponreach.WeaponReachService
import com.teus.projectrpg.weapon.type.WeaponCategoryType
import com.teus.projectrpg.weapon.type.WeaponGroupType
import com.teus.projectrpg.weapon.type.WeaponQualityType
import com.teus.projectrpg.weapon.type.WeaponReachType
import jakarta.validation.Valid
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("weapon")
class WeaponController(
    private val weaponService: WeaponService,
    private val weaponCategoryService: WeaponCategoryService,
    private val weaponGroupService: WeaponGroupService,
    private val weaponQualityService: WeaponQualityService,
    private val weaponReachService: WeaponReachService,
    private val weaponMapper: WeaponMapper,
    private val weaponCategoryMapper: BaseMapper<WeaponCategoryType, WeaponCategory>,
    private val weaponGroupMapper: BaseMapper<WeaponGroupType, WeaponGroup>,
    private val weaponQualityMapper: BaseMapper<WeaponQualityType, WeaponQuality>,
    private val weaponReachMapper: BaseMapper<WeaponReachType, WeaponReach>,
) {
    @GetMapping
    fun getAll(): ResponseEntity<List<WeaponDto>> {
        val dtos = weaponMapper.toDtos(weaponService.findAll())
        return if (dtos.isEmpty())
            ResponseEntity.noContent().build()
        else
            ResponseEntity.ok(dtos)
    }

    @PutMapping
    fun putWeapon(@Valid @RequestBody newWeapon: WeaponDto): ResponseEntity<WeaponDto> {
        val save = weaponService.save(weaponMapper.toEntity(newWeapon, WeaponContext))
        return ResponseEntity.ok(
            weaponMapper.toDto(save)
        )
    }

    @DeleteMapping("/{id}")
    fun deleteWeapon(@PathVariable id: Long): ResponseEntity<Void> {
        return try {
            weaponService.deleteById(id)
            ResponseEntity.noContent().build()
        } catch (ex: EmptyResultDataAccessException) {
            ResponseEntity.notFound().build()
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }

    @GetMapping("/weaponCategory")
    fun getAllWeaponCategories(): ResponseEntity<List<BaseDto<WeaponCategoryType>>> {
        val findAll = weaponCategoryMapper.toDtos(weaponCategoryService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }

    @GetMapping("/weaponGroup")
    fun getAllWeaponGroups(): ResponseEntity<List<BaseDto<WeaponGroupType>>> {
        val findAll = weaponGroupMapper.toDtos(weaponGroupService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }

    @GetMapping("/weaponQuality")
    fun getAllWeaponQualities(): ResponseEntity<List<BaseDto<WeaponQualityType>>> {
        val findAll = weaponQualityMapper.toDtos(weaponQualityService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }

    @GetMapping("/weaponReach")
    fun getAllWeaponReaches(): ResponseEntity<List<BaseDto<WeaponReachType>>> {
        val findAll = weaponReachMapper.toDtos(weaponReachService.findAll())
        if (findAll.isEmpty()) {
            return ResponseEntity.noContent().build()
        }
        return ResponseEntity.ok(findAll)
    }
}