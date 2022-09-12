package com.aad.mysimplecleanarchitecture.data

import com.aad.mysimplecleanarchitecture.domain.IMessageRepository
import com.aad.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}