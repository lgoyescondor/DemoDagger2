package io.condorlabs.lgoyes.demoretrofit

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, BuildersModule::class, AppModule::class))
interface AppComponent {
    fun inject(app: Application)
}