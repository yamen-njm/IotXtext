/**
 * generated by Xtext 2.16.0
 */
package edu.univ.nantes.iot.formatting2;

import com.google.inject.Inject;
import edu.univ.nantes.iot.services.IotDslGrammarAccess;
import iotModel.BrokerConf;
import iotModel.Device;
import iotModel.Instrument;
import iotModel.Interest;
import iotModel.Measurand;
import iotModel.Measure;
import iotModel.Network;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class IotDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private IotDslGrammarAccess _iotDslGrammarAccess;
  
  protected void _format(final Network network, @Extension final IFormattableDocument document) {
    document.<BrokerConf>format(network.getBrokerconf());
    EList<Measure> _measure = network.getMeasure();
    for (final Measure measure : _measure) {
      document.<Measure>format(measure);
    }
    EList<Instrument> _instrument = network.getInstrument();
    for (final Instrument instrument : _instrument) {
      document.<Instrument>format(instrument);
    }
    EList<Measurand> _measurand = network.getMeasurand();
    for (final Measurand measurand : _measurand) {
      document.<Measurand>format(measurand);
    }
    EList<Device> _device = network.getDevice();
    for (final Device device : _device) {
      document.<Device>format(device);
    }
  }
  
  protected void _format(final Instrument instrument, @Extension final IFormattableDocument document) {
    EList<Interest> _interet = instrument.getInteret();
    for (final Interest interest : _interet) {
      document.<Interest>format(interest);
    }
  }
  
  public void format(final Object instrument, final IFormattableDocument document) {
    if (instrument instanceof XtextResource) {
      _format((XtextResource)instrument, document);
      return;
    } else if (instrument instanceof Instrument) {
      _format((Instrument)instrument, document);
      return;
    } else if (instrument instanceof Network) {
      _format((Network)instrument, document);
      return;
    } else if (instrument instanceof EObject) {
      _format((EObject)instrument, document);
      return;
    } else if (instrument == null) {
      _format((Void)null, document);
      return;
    } else if (instrument != null) {
      _format(instrument, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(instrument, document).toString());
    }
  }
}