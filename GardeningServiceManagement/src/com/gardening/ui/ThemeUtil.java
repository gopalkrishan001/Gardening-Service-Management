package com.gardening.ui;

import javax.swing.*;
import java.awt.*;

public class ThemeUtil {
    public static void applyLightBlueTheme() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.put("Panel.background", new Color(200, 225, 255));
            UIManager.put("Button.background", new Color(180, 210, 250));
            UIManager.put("Label.foreground", Color.BLACK);
            UIManager.put("TextField.background", Color.WHITE);
            UIManager.put("PasswordField.background", Color.WHITE);
            UIManager.put("Table.background", Color.WHITE);
            UIManager.put("Table.foreground", Color.BLACK);
            UIManager.put("ScrollPane.background", new Color(200, 225, 255));
        } catch (Exception ignored) {}
    }

	public static void applyLightBlueTheme1() {
		// TODO Auto-generated method stub
		
	}
}