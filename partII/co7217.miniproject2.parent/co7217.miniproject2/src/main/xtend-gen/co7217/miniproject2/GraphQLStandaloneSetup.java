/**
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2;

import co7217.miniproject2.GraphQLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GraphQLStandaloneSetup extends GraphQLStandaloneSetupGenerated {
  public static void doSetup() {
    new GraphQLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}