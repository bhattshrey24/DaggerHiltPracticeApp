package com.example.daggerhiltpracticeapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)// Application component has been changed to singleton component
object AppModule {
    @Singleton
    @Provides
    @Named("Test String 1")
    fun provideTestString1()="This is app level String"

    @Singleton
    @Provides
    @Named("Test String 2")
    fun provideTestString2()="This is app level String as well"
}