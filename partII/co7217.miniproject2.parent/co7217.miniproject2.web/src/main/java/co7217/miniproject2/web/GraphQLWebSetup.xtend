/*
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2.web

import co7217.miniproject2.GraphQLRuntimeModule
import co7217.miniproject2.GraphQLStandaloneSetup
import co7217.miniproject2.ide.GraphQLIdeModule
import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class GraphQLWebSetup extends GraphQLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GraphQLRuntimeModule, new GraphQLIdeModule, new GraphQLWebModule))
	}
	
}
