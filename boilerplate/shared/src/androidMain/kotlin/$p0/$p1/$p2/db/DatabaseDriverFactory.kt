package $packageName.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import $packageName.db.$appNameDatabase

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver =
        AndroidSqliteDriver(
            schema = $appNameDatabase.Schema,
            context = context,
            name = "$appName.Database.db"
        )
}