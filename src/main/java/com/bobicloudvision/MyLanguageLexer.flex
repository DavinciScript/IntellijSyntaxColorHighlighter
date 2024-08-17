/* MyLanguageLexer.flex */

%{
import com.intellij.psi.tree.IElementType;
import com.bobicloudvision.MyLanguageTokenTypes;
%}

%class MyLanguageLexer
%implements Lexer
%function advance
%type IElementType
%unicode
%{
  // Custom code can go here (like imports)
%}

%state COMMENT

%%

// Skip whitespace
<YYINITIAL,COMMENT>[" \t\n\r"]+ { /* skip */ }

// Keywords
<YYINITIAL> "if" | "else" | "for" | "while" { return MyLanguageTokenTypes.KEYWORD; }

// Identifiers (any word that isn't a keyword)
<YYINITIAL>[a-zA-Z_][a-zA-Z_0-9]* { return MyLanguageTokenTypes.IDENTIFIER; }

// String literals
<YYINITIAL>\"([^\"\\]|\\.)*\" { return MyLanguageTokenTypes.STRING; }

// Single-line comments
<YYINITIAL>//[^\n\r]* { return MyLanguageTokenTypes.COMMENT; }

// Operators
<YYINITIAL>[\+\-\*/] { return MyLanguageTokenTypes.OPERATOR; }

// Anything else
<YYINITIAL>. { return MyLanguageTokenTypes.BAD_CHARACTER; }

<YYINITIAL><<EOF>> { return null; }
