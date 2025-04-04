package com.gardening.ui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ThemeUtil.applyLightBlueTheme();
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
