/*
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GraphQLStandaloneSetup extends GraphQLStandaloneSetupGenerated {

	def static void doSetup() {
		new GraphQLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}