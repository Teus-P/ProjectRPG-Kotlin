package com.projectrpgkotlin.controller

import com.projectrpgkotlin.dto.WeaponGroupDto
import com.projectrpgkotlin.entity.WeaponGroupEntity
import com.projectrpgkotlin.repository.WeaponGroupRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/weaponGroup")
class WeaponGroupController (private val weaponGroupRepository: WeaponGroupRepository){

    @GetMapping
    fun getAllWeaponGroups(): ResponseEntity<List<WeaponGroupEntity>> {
        return ResponseEntity.ok(weaponGroupRepository.findAll())
    }

    @PostMapping
    fun createWeaponGroup(@RequestBody request: WeaponGroupDto): ResponseEntity<WeaponGroupEntity> {
        val weaponGroup = weaponGroupRepository.save(WeaponGroupEntity(
            id = request.id,
            name = request.name
        ))
        return ResponseEntity(weaponGroup, HttpStatus.CREATED)
    }
}