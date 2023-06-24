package com.teus.projectrpg.base.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepository<T, E> : JpaRepository<E, Long> {
    fun findByName(type: T): E
}