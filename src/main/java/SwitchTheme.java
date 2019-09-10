import com.intellij.ide.ui.laf.IntelliJLaf;
import com.intellij.ide.ui.laf.darcula.DarculaLaf;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.JBColor;

import javax.swing.*;

public class SwitchTheme {

    private final ColorSchemeManager colorSchemeManager = new ColorSchemeManagerImpl();

    private static final String DARCULA_THEME = "_@user_Darcula";
    private static final String DEFAULT_THEME = "_@user_Default";

    void setTheme() {
        String currentScheme = colorSchemeManager.getGlobalColorScheme().getName();

        try {
            if (currentScheme.equals(DEFAULT_THEME)) {
                UIManager.setLookAndFeel(new DarculaLaf());
            } else {
                UIManager.setLookAndFeel(new IntelliJLaf());
            }
            JBColor.setDark(this.useDarkTheme(currentScheme));
            IconLoader.setUseDarkIcons(this.useDarkTheme(currentScheme));
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        String makeActiveScheme = DEFAULT_THEME;

        if (currentScheme.equals(DEFAULT_THEME))
            makeActiveScheme = DARCULA_THEME;

        final EditorColorsScheme scheme = colorSchemeManager.getScheme(makeActiveScheme);

        if (scheme != null) {
            colorSchemeManager.setGlobalScheme(scheme);
        }
    }

    private boolean useDarkTheme(String theme) {
        return theme.equals(DEFAULT_THEME);
    }
}
