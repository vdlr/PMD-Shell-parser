package com.vdlr.pmd.lang.shell.parser.rule;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.RuleViolation;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.rule.AbstractRuleViolationFactory;

public class ShellRuleViolationFactory extends AbstractRuleViolationFactory {

	@Override
	protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message,
			int beginLine, int endLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
