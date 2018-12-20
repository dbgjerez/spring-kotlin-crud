package com.dbg.kotlin.service

import com.dbg.kotlin.dao.BookDAO
import com.dbg.kotlin.model.Book
import org.bson.types.ObjectId
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookServiceImpl(val bookDAO: BookDAO) : BookService<Book, ObjectId> {

    override fun getAll(pageable: Pageable): Page<Book> = bookDAO.findAll(pageable)

    override fun getById(id: ObjectId): Optional<Book> = bookDAO.findById(id)

    override fun create(obj: Book): Book = bookDAO.save(obj)

    override fun update(obj: Book): Book = bookDAO.save(obj)

    override fun deleteById(id: ObjectId) = bookDAO.deleteById(id)

}