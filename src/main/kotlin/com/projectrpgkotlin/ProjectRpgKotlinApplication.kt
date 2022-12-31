package com.projectrpgkotlin

import com.projectrpgkotlin.entity.WeaponGroupEntity
import com.projectrpgkotlin.repository.WeaponGroupRepository
import com.projectrpgkotlin.type.WeaponGroupType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
class ProjectRpgKotlinApplication

fun main(args: Array<String>) {
    runApplication<ProjectRpgKotlinApplication>(*args)
}