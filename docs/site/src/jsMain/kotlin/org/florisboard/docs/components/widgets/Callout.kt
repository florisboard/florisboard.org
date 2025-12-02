package org.florisboard.docs.components.widgets


import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

enum class CalloutType {
    QUOTE,
    NOTE,
    TIP,
    IMPORTANT,
    WARNING,
    QUESTION,
    CAUTION;

    companion object {
        fun fromStringOrDefault(type: String): CalloutType {
            return entries.find { it.toString().equals(type, ignoreCase = true) } ?: NOTE
        }
    }

    fun getLabel(): String {
        return when(this) {
            QUOTE -> ""
            else -> toString().lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
        }
    }

    fun getIconName(): String {
        return when(this) {
            QUOTE -> "quote"
            NOTE -> "info-circle"
            TIP -> "lightbulb"
            IMPORTANT -> "exclamation-circle"
            WARNING -> "exclamation-triangle"
            QUESTION -> "question-circle"
            CAUTION -> "exclamation-octagon"
        }
    }
}

@Composable
fun Callout(type: CalloutType, header: String? = null, content: @Composable () -> Unit) {
    Div(
        attrs = {
            classes("callout", "callout-${type.toString().lowercase()}")
        }
    ) {
        H4 {
            BootstrapIcon(type.getIconName())
            Text(" " + (header ?: type.getLabel()))
        }
        P {
            content()
        }
    }
}
