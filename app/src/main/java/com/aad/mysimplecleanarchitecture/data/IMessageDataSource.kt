package com.aad.mysimplecleanarchitecture.data

import com.aad.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}