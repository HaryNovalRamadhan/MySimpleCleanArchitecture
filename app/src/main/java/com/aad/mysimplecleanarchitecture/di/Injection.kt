package com.aad.mysimplecleanarchitecture.di

import com.aad.mysimplecleanarchitecture.data.IMessageDataSource
import com.aad.mysimplecleanarchitecture.data.MessageDataSource
import com.aad.mysimplecleanarchitecture.data.MessageRepository
import com.aad.mysimplecleanarchitecture.domain.IMessageRepository
import com.aad.mysimplecleanarchitecture.domain.MessageInteractor
import com.aad.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}