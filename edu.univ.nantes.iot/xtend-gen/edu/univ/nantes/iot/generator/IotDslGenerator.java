/**
 * generated by Xtext 2.16.0
 */
package edu.univ.nantes.iot.generator;

import com.google.common.collect.Iterables;
import fr.univnantes.alma.iot.codegen.XtextIotCodeGen;
import iotModel.Device;
import iotModel.Instrument;
import iotModel.Interest;
import iotModel.Network;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class IotDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Network> _filter = Iterables.<Network>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Network.class);
    for (final Network r : _filter) {
      {
        System.out.print("generqtor");
        String _firstUpper = StringExtensions.toFirstUpper(r.getName());
        String _plus = (_firstUpper + ".js");
        fsa.generateFile(_plus, XtextIotCodeGen.generateCode(r));
        EList<Device> _device = r.getDevice();
        for (final Device device : _device) {
          EList<Instrument> _instrument = device.getInstrument();
          for (final Instrument instument : _instrument) {
            EList<Interest> _interet = instument.getInteret();
            for (final Interest interest : _interet) {
              String _firstUpper_1 = StringExtensions.toFirstUpper(interest.getName());
              String _plus_1 = (_firstUpper_1 + ".js");
              fsa.generateFile(_plus_1, XtextIotCodeGen.generateModels(interest));
            }
          }
        }
      }
    }
  }
}
