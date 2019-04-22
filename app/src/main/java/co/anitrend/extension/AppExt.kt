package co.anitrend.extension

import android.content.Context
import co.anitrend.App
import io.wax911.support.core.analytic.contract.ISupportAnalytics

fun Context?.getAnalytics(): ISupportAnalytics? = this?.let {
    val application = it.applicationContext as App
    application.analyticsUtil
}