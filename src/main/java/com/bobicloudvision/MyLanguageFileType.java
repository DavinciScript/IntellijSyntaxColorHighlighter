package com.bobicloudvision;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MyLanguageFileType extends LanguageFileType {
    public static final MyLanguageFileType INSTANCE = new MyLanguageFileType();

    private MyLanguageFileType() {
        super(MyLanguageLanguage.INSTANCE); // Reference to your language
    }

    @NotNull
    @Override
    public String getName() {
        return "Davi";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Davi";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "davi"; // Your custom file extension
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MyLanguageIcons.FILE; // Custom icon for your language files
    }
}
