/*
 * generated by Xtext 2.16.0
 */
package edu.univ.nantes.iot


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class IotDslStandaloneSetup extends IotDslStandaloneSetupGenerated {

	def static void doSetup() {
		new IotDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
