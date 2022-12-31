package com.projectrpgkotlin.controller

import com.projectrpgkotlin.entity.WeaponGroupEntity
import com.projectrpgkotlin.entity.WeaponQualityEntity
import com.projectrpgkotlin.repository.WeaponGroupRepository
import com.projectrpgkotlin.repository.WeaponQualityRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/weapon")
class WeaponController(
    private val weaponGroupRepository: WeaponGroupRepository,
    private val weaponQualityRepository: WeaponQualityRepository
) {

    @GetMapping("/weaponGroup")
    fun getAllWeaponGroups(): ResponseEntity<List<WeaponGroupEntity>> {
        return ResponseEntity.ok(weaponGroupRepository.findAll())
    }

    fun getAllWeaponQualities(): ResponseEntity<List<WeaponQualityEntity>> {
        return ResponseEntity.ok(weaponQualityRepository.findAll())
    }
}