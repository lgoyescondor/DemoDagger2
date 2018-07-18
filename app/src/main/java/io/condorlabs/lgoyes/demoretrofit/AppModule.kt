package io.condorlabs.lgoyes.demoretrofit

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: Application) {
    @Provides
    @Singleton
    fun provideApplication(): Application = app
}