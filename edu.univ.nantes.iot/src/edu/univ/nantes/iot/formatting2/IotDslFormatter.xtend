/*
 * generated by Xtext 2.16.0
 */
package edu.univ.nantes.iot.formatting2

import com.google.inject.Inject
import edu.univ.nantes.iot.services.IotDslGrammarAccess
import iotModel.Instrument
import iotModel.Network
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class IotDslFormatter extends AbstractFormatter2 {
	
	@Inject extension IotDslGrammarAccess

	def dispatch void format(Network network, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		network.brokerconf.format
		for (measure : network.measure) {
			measure.format
		}
		for (instrument : network.instrument) {
			instrument.format
		}
		for (measurand : network.measurand) {
			measurand.format
		}
		for (device : network.device) {
			device.format
		}
	}

	def dispatch void format(Instrument instrument, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (interest : instrument.interet) {
			interest.format
		}
	}
	
	// TODO: implement for Device, Interest
}