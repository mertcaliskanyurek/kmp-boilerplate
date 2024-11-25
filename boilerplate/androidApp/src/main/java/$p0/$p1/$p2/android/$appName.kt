package $packageName.android

import android.app.Application
import $packageName.android.di.databaseModule
import $packageName.android.di.viewModelsModule
import $packageName.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class $appName : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule + databaseModule

        startKoin {
            androidContext(this@$appName)
            modules(modules)
        }
    }
}