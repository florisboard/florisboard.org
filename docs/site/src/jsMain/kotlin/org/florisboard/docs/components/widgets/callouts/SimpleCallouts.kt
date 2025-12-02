package org.florisboard.docs.components.widgets.callouts

import androidx.compose.runtime.Composable
import org.florisboard.docs.components.widgets.Callout
import org.florisboard.docs.components.widgets.CalloutType
import org.jetbrains.compose.web.dom.Text

@Composable
fun Quote(text: String) = Callout(CalloutType.QUOTE) { Text(text) }

@Composable
fun Note(text: String) = Callout(CalloutType.NOTE) { Text(text) }

@Composable
fun Tip(text: String) = Callout(CalloutType.TIP) { Text(text) }

@Composable
fun Important(text: String) = Callout(CalloutType.IMPORTANT) { Text(text) }

@Composable
fun Warning(text: String) = Callout(CalloutType.WARNING) { Text(text) }

@Composable
fun Question(text: String) = Callout(CalloutType.QUESTION) { Text(text) }

@Composable
fun Caution(text: String) = Callout(CalloutType.CAUTION) { Text(text) }
