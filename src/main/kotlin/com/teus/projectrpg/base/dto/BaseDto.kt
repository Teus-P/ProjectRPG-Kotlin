package com.teus.projectrpg.base.dto

open class BaseDto<T> (
    open var id: Long,
    open var name: T,
)
