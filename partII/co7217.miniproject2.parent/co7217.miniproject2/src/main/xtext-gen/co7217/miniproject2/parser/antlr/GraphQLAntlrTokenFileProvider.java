/*
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphQLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co7217/miniproject2/parser/antlr/internal/InternalGraphQL.tokens");
	}
}
