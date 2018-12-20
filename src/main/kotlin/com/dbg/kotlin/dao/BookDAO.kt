package com.dbg.kotlin.dao

import com.dbg.kotlin.model.Book
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface BookDAO : MongoRepository<Book, ObjectId>