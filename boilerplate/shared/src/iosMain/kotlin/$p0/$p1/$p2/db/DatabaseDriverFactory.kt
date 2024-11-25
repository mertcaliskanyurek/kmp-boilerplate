package $packageName.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import $packageName.db.$appNameDatabase

actual class DatabaseDriverFactory() {

    actual fun createDriver(): SqlDriver =
        NativeSqliteDriver(
            schema = $appNameDatabase.Schema,
            name = "$appNameDatabase.db"
        )
}