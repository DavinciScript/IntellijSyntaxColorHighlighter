/*
 * The MIT License (MIT)
 *
 * Copyright (c) DavinciScript & Bozhidar Slaveykov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.bobicloudvision.daviSyntaxColorHighlighter.settings;

import com.bobicloudvision.daviSyntaxColorHighlighter.CodeColorAnnotator;
import com.intellij.icons.AllIcons;
import com.intellij.lang.Language;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.psi.codeStyle.DisplayPriority;
import com.intellij.util.ObjectUtils;
import com.intellij.util.PlatformUtils;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Map;

@SuppressWarnings({"DuplicateStringLiteralInspection", "ClassWithTooManyFields"})

public final class CodeColorSettings extends BaseColorSettings {
    @NonNls
    static final AttributesDescriptor[] DAVI_ATTRIBUTES;
    @NonNls
    static final Map<String, TextAttributesKey> DAVI_DESCRIPTORS = new THashMap<>();

    private static final TextAttributesKey DEFAULT_DOC_COMMENT = ObjectUtils.notNull(TextAttributesKey.find("DOC_COMMENT"),
            DefaultLanguageHighlighterColors.DOC_COMMENT);
    private static final TextAttributesKey DEFAULT_DAVI_KEYWORD = ObjectUtils.notNull(TextAttributesKey.find("DAVI_KEYWORD"),
            DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey VARIABLE = ObjectUtils.notNull(TextAttributesKey.find("DAVI_VAR"),
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    private static final TextAttributesKey CLASS = ObjectUtils.notNull(TextAttributesKey.find("DAVI_CLASS"),
            DefaultLanguageHighlighterColors.CLASS_NAME);
    private static final TextAttributesKey NUMBER = ObjectUtils.notNull(TextAttributesKey.find("DAVI_NUMBER"),
            DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey CONSTANT = ObjectUtils.notNull(TextAttributesKey.find("DAVI_CONSTANT"),
            DefaultLanguageHighlighterColors.CONSTANT);
    private static final TextAttributesKey FN = ObjectUtils.notNull(TextAttributesKey.find("DAVI_FUNCTION_CALL"),
            DefaultLanguageHighlighterColors.FUNCTION_CALL);

    private static final TextAttributesKey FUNCTION = CodeColorAnnotator.FUNCTION;
    private static final TextAttributesKey DAVI_RETURN = CodeColorAnnotator.DAVI_RETURN;
    private static final TextAttributesKey THIS_SELF = CodeColorAnnotator.THIS_SELF;
    private static final TextAttributesKey MODIFIER = CodeColorAnnotator.MODIFIER;
    private static final TextAttributesKey STATIC_FINAL = CodeColorAnnotator.STATIC_FINAL;
    private static final TextAttributesKey USE_NAMESPACE = CodeColorAnnotator.USE_NAMESPACE;

    private static final TextAttributesKey DAVI_HANDLING_FUNCTION = CodeColorAnnotator.DAVI_HANDLING_FUNCTION;
    private static final TextAttributesKey DAVI_STRING_FUNCTION = CodeColorAnnotator.DAVI_STRING_FUNCTION;
    private static final TextAttributesKey DAVI_ARRAY_FUNCTION = CodeColorAnnotator.DAVI_ARRAY_FUNCTION;
    private static final TextAttributesKey DAVI_OBJECT_FUNCTION = CodeColorAnnotator.DAVI_OBJECT_FUNCTION;
    private static final TextAttributesKey DAVI_MISC_FUNCTION = CodeColorAnnotator.DAVI_MISC_FUNCTION;
    private static final TextAttributesKey DAVI_JSON_FUNCTION = CodeColorAnnotator.DAVI_JSON_FUNCTION;
    private static final TextAttributesKey DAVI_MATH_FUNCTION = CodeColorAnnotator.DAVI_MATH_FUNCTION;
    private static final TextAttributesKey DAVI_HANDLER_FUNCTION = CodeColorAnnotator.DAVI_HANDLER_FUNCTION;
    private static final TextAttributesKey DAVI_TRUE_KEYWORD = CodeColorAnnotator.DAVI_TRUE_KEYWORD;
    private static final TextAttributesKey DAVI_FALSE_KEYWORD = CodeColorAnnotator.DAVI_FALSE_KEYWORD;
    private static final TextAttributesKey DAVI_NULL_KEYWORD = CodeColorAnnotator.DAVI_NULL_KEYWORD;
    private static final TextAttributesKey DAVI_PREG = CodeColorAnnotator.DAVI_PREG;
    private static final TextAttributesKey DAVI_DATE = CodeColorAnnotator.DAVI_DATE;
    private static final TextAttributesKey DAVI_DEBUG = CodeColorAnnotator.DAVI_DEBUG;
    private static final TextAttributesKey DAVI_SUCCESS = CodeColorAnnotator.DAVI_SUCCESS;
    private static final TextAttributesKey DAVI_ERROR = CodeColorAnnotator.DAVI_ERROR;
    private static final TextAttributesKey DAVIDOC_INTERNAL = CodeColorAnnotator.DAVIDOC_INTERNAL;

    //private static final TextAttributesKey DAVI_RETURN_TYPE = CodeColorAnnotator.DAVI_RETURN_TYPE;

    static {
        DAVI_ATTRIBUTES = new AttributesDescriptor[]{
                new AttributesDescriptor("function", FUNCTION),
                new AttributesDescriptor("return", DAVI_RETURN),
                new AttributesDescriptor("self", THIS_SELF),
                new AttributesDescriptor("private, public, protected", MODIFIER),
                new AttributesDescriptor("static, final", STATIC_FINAL),
                new AttributesDescriptor("use, namespace", USE_NAMESPACE),
                new AttributesDescriptor("isset, empty, is_numeric, is_array, is_callable, is_object, is_countable, is_string, is_int, is_bool", DAVI_HANDLING_FUNCTION),
                new AttributesDescriptor("echo, explode, ucfirst, htmlentities", DAVI_STRING_FUNCTION),
                new AttributesDescriptor("array, array_walk, array_key_exists, array_merge", DAVI_ARRAY_FUNCTION),
                new AttributesDescriptor("get_class, is_a, call_user_method, class_exists", DAVI_OBJECT_FUNCTION),
                new AttributesDescriptor("define, exit, die, sleep, eval", DAVI_MISC_FUNCTION),
                new AttributesDescriptor("json_encode, json_decode", DAVI_JSON_FUNCTION),
                new AttributesDescriptor("abs, ceil, round, max", DAVI_MATH_FUNCTION),
                new AttributesDescriptor("call_user_func_array, function_exists, func_num_args, register_tick_function", DAVI_HANDLER_FUNCTION),
                new AttributesDescriptor("true", DAVI_TRUE_KEYWORD),
                new AttributesDescriptor("false", DAVI_FALSE_KEYWORD),
                new AttributesDescriptor("null", DAVI_NULL_KEYWORD),
                new AttributesDescriptor("preg_filter, preg_grep, preg_last_error_msg, preg_match_all, preg_match, preg_quote, preg_replace_callback_array, preg_replace_callback, preg_replace, preg_split", DAVI_PREG),
                new AttributesDescriptor("date, gmdate, idate, mktime, time, getdate, getlastmod, IntlDateFormatter, DateTimeImmutable, DateTime", DAVI_DATE),
                new AttributesDescriptor("print_r, console, debug, var_dump, var_export", DAVI_DEBUG),
                new AttributesDescriptor("onSuccess, success, allow, true", DAVI_SUCCESS),
                new AttributesDescriptor("onError, error, critical, deny, false, json_last_error, json_last_error_msg", DAVI_ERROR)
                //new AttributesDescriptor(": int, : float, : bool, : string, : interfaces, : array, : object, : callable", DAVI_RETURN_TYPE),
        };

        DAVI_DESCRIPTORS.putAll(createAdditionalHlAttrs());
    }

    private static Map<String, TextAttributesKey> createAdditionalHlAttrs() {
        final Map<String, TextAttributesKey> descriptors = new THashMap<>();
        descriptors.put("keyword", DEFAULT_DAVI_KEYWORD);
        descriptors.put("function", FUNCTION);
        descriptors.put("davi_return", DAVI_RETURN);
        descriptors.put("class", CLASS);
        descriptors.put("const", CONSTANT);
        descriptors.put("num", NUMBER);
        descriptors.put("var", VARIABLE);
        descriptors.put("fn", FN);

        descriptors.put("use", USE_NAMESPACE);
        descriptors.put("static", STATIC_FINAL);
        descriptors.put("modifier", MODIFIER);
        descriptors.put("self", THIS_SELF);

        descriptors.put("davi_function", DAVI_HANDLING_FUNCTION);
        descriptors.put("string_function", DAVI_STRING_FUNCTION);
        descriptors.put("array_function", DAVI_ARRAY_FUNCTION);
        descriptors.put("object_function", DAVI_OBJECT_FUNCTION);
        descriptors.put("misc_function", DAVI_MISC_FUNCTION);
        descriptors.put("json_function", DAVI_JSON_FUNCTION);
        descriptors.put("math_function", DAVI_MATH_FUNCTION);
        descriptors.put("handler_function", DAVI_HANDLER_FUNCTION);
        descriptors.put("davi_true_keyword", DAVI_TRUE_KEYWORD);
        descriptors.put("davi_false_keyword", DAVI_FALSE_KEYWORD);
        descriptors.put("davi_null_keyword", DAVI_NULL_KEYWORD);
        descriptors.put("davi_debug", DAVI_DEBUG);
        descriptors.put("davi_preg_match", DAVI_PREG);
        descriptors.put("davi_date", DAVI_DATE);
        descriptors.put("davi_success", DAVI_SUCCESS);
        descriptors.put("davi_error", DAVI_ERROR);
        //descriptors.put("davi_return_type", DAVI_RETURN_TYPE);

        return descriptors;
    }

    @Override
    public @NotNull Icon getIcon() {
        return AllIcons.FileTypes.JavaScript;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        final Language lang = ObjectUtils.notNull(Language.findLanguageByID("DAVI"), Language.ANY);
        return getSyntaxHighlighterWithFallback(lang);
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "<use>namespace</use> Foo\\Bar\\Baz;\n" +
                "\n" +
                "<use>use</use> <class>SomeClass</class>" +
                "\n" +
                "<static>final</static> <keyword>class</keyword> <class>MyClass</class> <keyword>extends</keyword> " +
                "<class>MyOtherClass</class> {\n" +
                "    <modifier>public</modifier> <keyword>const</keyword> <var>SINGLE</var> = <num>1</num>;\n" +
                "    <modifier>private</modifier> <var>$variable</var>;\n" +
                "    <modifier>protected</modifier> <var>$arguments</var>;\n" +
                "}\n" +
                "\n" +
                "<modifier>public</modifier> <function>function</function> <fn>byeWorld</fn>() {\n" +
                "    <davi_return>return</davi_return> <self>self</self>::<var>variable</var>;\n" +
                "}\n" +
                "\n" +
                "<modifier>public</modifier> <function>function</function> <fn>helloWorld</fn>() {\n" +
                "    <keyword>if</keyword> (<davi_function>isset</davi_function>(<var>$variable</var>)) {\n" +
                "        <var>$title</var> = <string_function>ucfirst</string_function>(<var>$variable</var>);\n" +
                "        <keyword>if</keyword> (<object_function>class_exists</object_function>(<keyword>test_class</keyword>) && <handler_function>function_exists</handler_function>(<keyword>test_function</keyword>)) {\n" +
                "            <var>$numargs</var> = <handler_function>func_num_args</handler_function>();\n" +
                "            <var>$array</var> = <array_function>array_merge</array_function>(<var>$array1</var>, <var>$array2</var>);\n" +
                "            <var>$total</var> = <math_function>ceil</math_function>(<var>$numargs</var>);\n" +
                "            <var>$this</var>-><davi_success>success</davi_success>();\n" +
                "            <var>$date</var> = <davi_date>date</davi_date>('l jS \\of F Y h:i:s A', <var>$var</var>);\n" +
                "            <davi_debug>print_r</davi_debug>(<var>$date</var>);\n" +
                "            <var>$good</var> = <davi_true_keyword>true</davi_true_keyword>;\n" +
                "            <var>$bad</var> = <davi_false_keyword>false</davi_false_keyword>;\n" +
                "            <var>$empty</var> = <davi_null_keyword>null</davi_null_keyword>;\n" +
                "            <var>$match</var> = <davi_preg_match>preg_match</davi_preg_match>(\"/[0-9]+/\", \"Hello, 123 World!\", <var>$matches</var>);\n" +
                "            <misc_function>exit</misc_function>(<json_function>json_encode</json_function>(<var>$array</var>));\n" +
                "        }\n" +
                "    } else {\n" +
                "        <davi_return>return</davi_return> <var>$this</var>-><davi_error>error</davi_error>();\n" +
                "    }\n" +
                "}";
    }

    @Override
    public @NotNull Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return DAVI_DESCRIPTORS;
    }

    @NotNull
    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DAVI_ATTRIBUTES;
    }

    @NotNull
    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "DAVI Colors";
    }

    @Override
    public DisplayPriority getPriority() {
        return PlatformUtils.isWebStorm() ? DisplayPriority.KEY_LANGUAGE_SETTINGS : DisplayPriority.LANGUAGE_SETTINGS;
    }
}
