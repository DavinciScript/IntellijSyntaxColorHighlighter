package com.bobicloudvision;


import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

public class MyLanguageHighlightingColors {
    public static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("MYLANGUAGE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("MYLANGUAGE_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey("MYLANGUAGE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    // Add more TextAttributesKey as needed for other language elements
}

