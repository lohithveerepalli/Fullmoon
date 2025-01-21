package com.example.fullmoon.di


import android.content.Context
import com.fullmoon.managers.LLMEvaluator
import com.fullmoon.managers.AppManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppManager() = AppManager()

    @Provides
    @Singleton
    fun provideLLMEvaluator(context: Context): LLMEvaluator = LLMEvaluator(context)
}
