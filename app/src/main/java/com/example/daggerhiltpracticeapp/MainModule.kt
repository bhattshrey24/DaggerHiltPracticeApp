package com.example.daggerhiltpracticeapp

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)// lives as long as activity i.e. we are limiting the scope of this module to a single activity only
object MainModule {

    @Singleton
    @Provides
    @Named("Test String 3")
    fun provideTestString3( // special case when u need context in activity scoped module
        @ApplicationContext context: Context,// dagger automatically passes the context here as parameter
      @Named("Test String 1") myTestString1:String
    ) = "${context.getString(R.string.MyTestResourceString)} - $myTestString1"
}