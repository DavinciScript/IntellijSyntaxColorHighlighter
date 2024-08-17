package com.bobicloudvision;

import com.intellij.lexer.FlexAdapter;

public class MyLanguageLexerAdapter extends FlexAdapter {
    public MyLanguageLexerAdapter() {
        super(new MyLanguageLexer(null));  // Pass an instance of your generated lexer here
    }
}
