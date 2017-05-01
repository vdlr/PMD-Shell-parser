
package com.vdlr.pmd.lang.shell.parser;

import com.vdlr.pmd.lang.shell.parser.rule.ShellHandler;
import com.vdlr.pmd.lang.shell.parser.rule.ShellRuleChainVisitor;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Created by victor.delarosa 
 */
public class ShellLanguageModule extends BaseLanguageModule {

    public static final String NAME = "Shell";
    public static final String TERSE_NAME = "shell";

    public ShellLanguageModule() {
        super(NAME, null, TERSE_NAME, ShellRuleChainVisitor.class, "vm");
        addVersion("Shell", new ShellHandler(), true);
    }

}
