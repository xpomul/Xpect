/*
 * generated by Xtext
 */
package org.eclipse.xpect.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xpect.ui.highlighting.XpectTokenDefProvider;
import org.eclipse.xpect.ui.highlighting.XpectTokenToAttributeMapper;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.ui.LexerUIBindings;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class XpectUiModule extends org.eclipse.xpect.ui.AbstractXpectUiModule {
	public XpectUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configureHighlightingTokenDefProvider(Binder binder) {
		binder.bind(ITokenDefProvider.class).annotatedWith(Names.named(LexerUIBindings.HIGHLIGHTING)).to(XpectTokenDefProvider.class);
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return XpectTokenToAttributeMapper.class;
	}

}
