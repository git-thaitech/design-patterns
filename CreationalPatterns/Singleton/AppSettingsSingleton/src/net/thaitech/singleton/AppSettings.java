package net.thaitech.singleton;

public class AppSettings {
    private static AppSettings instance;
    private String language;
    private boolean darkMode;

    private AppSettings() {
        // Giả định rằng các cài đặt mặc định là English và light mode
        this.language = "English";
        this.darkMode = false;
        System.out.println("AppSettings Initialized with default settings.");
    }

    public static synchronized AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
        System.out.println("Language set to " + language);
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
        System.out.println("Dark Mode set to " + darkMode);
    }

    public static void main(String[] args) {
        AppSettings settings1 = AppSettings.getInstance();
        settings1.setLanguage("Thai");

        AppSettings settings2 = AppSettings.getInstance();
        settings2.setDarkMode(true);

        System.out
                .println("Settings1 - Language: " + settings1.getLanguage() + ", Dark Mode: " + settings1.isDarkMode());
        System.out
                .println("Settings2 - Language: " + settings2.getLanguage() + ", Dark Mode: " + settings2.isDarkMode());
        System.out.println("Settings1 and Settings2 refer to the same instance: " + (settings1 == settings2));
    }
}
