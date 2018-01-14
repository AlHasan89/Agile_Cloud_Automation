/*
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2.parser.antlr;

import co7217.miniproject2.parser.antlr.internal.InternalGraphQLParser;
import co7217.miniproject2.services.GraphQLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GraphQLParser extends AbstractAntlrParser {

	@Inject
	private GraphQLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGraphQLParser createParser(XtextTokenStream stream) {
		return new InternalGraphQLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GraphQL";
	}

	public GraphQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GraphQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}