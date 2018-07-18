package io.condorlabs.lgoyes.demoretrofit

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeCryptocurrenciesActivity(): CryptocurrenciesActivity
}