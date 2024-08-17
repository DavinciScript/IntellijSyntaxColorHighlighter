package com.bobicloudvision;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class MyLanguageSyntaxHighlighter extends SyntaxHighlighterBase {
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new MyLanguageLexerAdapter();  // Your lexer adapter here
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MyLanguageTokenTypes.KEYWORD)) {
            return new TextAttributesKey[]{MyLanguageHighlightingColors.KEYWORD};
        } else if (tokenType.equals(MyLanguageTokenTypes.STRING)) {
            return new TextAttributesKey[]{MyLanguageHighlightingColors.STRING};
        } else if (tokenType.equals(MyLanguageTokenTypes.COMMENT)) {
            return new TextAttributesKey[]{MyLanguageHighlightingColors.COMMENT};
        } else {
            return TextAttributesKey.EMPTY_ARRAY;
        }
    }
}
