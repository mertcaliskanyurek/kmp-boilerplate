package $packageName.android.di

import $packageName.db.DatabaseDriverFactory
import app.cash.sqldelight.db.SqlDriver
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import $packageName.db.$appNameDatabase

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory(androidContext()).createDriver() }

    single<$appNameDatabase> { $appNameDatabase(get()) }
}