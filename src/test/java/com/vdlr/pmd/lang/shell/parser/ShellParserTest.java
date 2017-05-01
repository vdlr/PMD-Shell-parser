package com.vdlr.pmd.lang.shell.parser;

import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

import net.sourceforge.pmd.lang.LanguageRegistry;
import net.sourceforge.pmd.lang.LanguageVersionHandler;
import net.sourceforge.pmd.lang.Parser;
import net.sourceforge.pmd.lang.ast.Node;

/**
 * Unit test for Shell parsing.
 * 
 */
public class ShellParserTest {

	private static final String Shell_SRC = "echo text";

	private static final String SRC2 = "ls -l";

	private static final String SRC3 = "ps -ef";

	@Test
	public void testParser() {
		final Node node = parse(Shell_SRC);
		Assert.assertNotNull(node);
	}

	@Test
	public void testParser2() {
		final Node node = parse(SRC2);
		Assert.assertNotNull(node);
	}

	@Test
	public void testParser3() {
		final Node node = parse(SRC3);
		Assert.assertNotNull(node);
	}

	private Node parse(final String code) {
		final LanguageVersionHandler shellLang = LanguageRegistry.getLanguage(ShellLanguageModule.NAME).getDefaultVersion()
				.getLanguageVersionHandler();
		final Parser parser = shellLang.getParser(shellLang.getDefaultParserOptions());
		final Node node = parser.parse(null, new StringReader(code));
		return node;
	}
}
