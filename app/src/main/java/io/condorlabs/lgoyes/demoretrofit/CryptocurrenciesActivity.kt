package io.condorlabs.lgoyes.demoretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection

/**
 * Documentation:
 *
 * Part1 → Setting up Dagger2
 * https://medium.com/@cdmunoz/offline-first-android-app-with-mvvm-dagger2-rxjava-livedata-and-room-25de4e1ada14
 *
 * Part2 → Setting up Room
 * https://proandroiddev.com/offline-first-android-app-with-mvvm-dagger2-rxjava-livedata-and-room-part-2-72716e3520
 *
 * Part3 → Setting up Retrofit
 * https://medium.com/@cdmunoz/offline-first-android-app-with-mvvm-dagger2-rxjava-livedata-and-room-part-3-af6eeafeb29b
 *
 * Part4 → Setting up Repository and ViewModel
 * https://medium.com/@cdmunoz/offline-first-android-app-with-mvvm-dagger2-rxjava-livedata-and-room-part-4-2b476142e769
 */
class CryptocurrenciesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)
    }
}
