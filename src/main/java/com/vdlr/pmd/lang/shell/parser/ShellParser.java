package com.vdlr.pmd.lang.shell.parser;

import java.io.Reader;
import java.util.Map;

import net.sourceforge.pmd.lang.AbstractParser;
import net.sourceforge.pmd.lang.ParserOptions;
import net.sourceforge.pmd.lang.TokenManager;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.ast.ParseException;

public class ShellParser extends AbstractParser {

	public ShellParser(ParserOptions parserOptions) {
		super(parserOptions);		
	}

	@Override
	public boolean canParse() {
		return true;
	}

	@Override
	public Node parse(String fileName, Reader source) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getSuppressMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected TokenManager createTokenManager(Reader source) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
