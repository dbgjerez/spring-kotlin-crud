package com.dbg.kotlin.mapper

import com.dbg.kotlin.dto.BookDTO
import com.dbg.kotlin.model.Book
import org.bson.types.ObjectId
import org.springframework.stereotype.Component
import java.util.*

@Component
class BookMapper : Mapper<Book, BookDTO> {

    override fun modelToDTO(obj: Book): BookDTO = BookDTO(obj.id.toHexString(), obj.title)

    override fun dtoToModel(dto: BookDTO): Book =
        dto.let(BookDTO::id)?.let(::ObjectId)?.let { Book(it, dto.title) } ?: Book(dto.title)

}