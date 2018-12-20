package com.dbg.kotlin.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Book(@Id val id: ObjectId, val title: String) {
    constructor(title: String) : this(ObjectId(), title)
}
