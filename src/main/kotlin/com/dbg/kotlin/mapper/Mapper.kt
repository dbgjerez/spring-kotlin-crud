package com.dbg.kotlin.mapper

interface Mapper<T, D> {
    fun modelToDTO(obj: T): D
    fun dtoToModel(dto: D): T
}