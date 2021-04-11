package nl.wykorijnsburger.androidApp

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import nl.wykorijnsburger.androidApp.theme.AppTheme

@Composable
internal fun ThemedPreview(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    AppTheme(darkTheme = darkTheme) {
        Surface {
            content()
        }
    }
}
