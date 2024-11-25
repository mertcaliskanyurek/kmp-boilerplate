package $packageName.di

import app.cash.sqldelight.db.SqlDriver
import $packageName.db.DatabaseDriverFactory
import org.koin.dsl.module
import $packageName.db.$appNameDatabase

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory().createDriver() }

    single<$appNameDatabase> { $appNameDatabase(get()) }
}