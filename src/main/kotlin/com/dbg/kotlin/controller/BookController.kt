package com.dbg.kotlin.controller

import com.dbg.kotlin.dto.BookDTO
import com.dbg.kotlin.mapper.BookMapper
import com.dbg.kotlin.service.BookServiceImpl
import org.bson.types.ObjectId
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/book")
class BookController(private val bookService: BookServiceImpl, private val mapper: BookMapper) {

    @GetMapping
    fun getAll(pageable: Pageable): Page<BookDTO> = bookService.getAll(pageable).map(mapper::modelToDTO)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): Optional<BookDTO> =
        id.let(::ObjectId).let(bookService::getById).map(mapper::modelToDTO)

    @PostMapping
    fun save(@RequestBody obj: BookDTO): BookDTO =
        obj.let(mapper::dtoToModel).let(bookService::create).let(mapper::modelToDTO)

    @PutMapping("/{id}")
    fun update(@RequestBody obj: BookDTO, @PathVariable id: String): BookDTO =
        obj.let(mapper::dtoToModel).let(bookService::update).let(mapper::modelToDTO)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) = bookService.deleteById(ObjectId(id))

}