import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import lessons.Base

internal val database by lazy {
    Base(JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY, schema = Base.Schema))
}