package net.flaviusb;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.ModelHelper;
import org.bimserver.plugins.Reporter;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterfaceException;

public class blankfilter implements nz.ac.auckland.cs.QueryInterface {
  @Override public IfcModelInterface query(IfcModelInterface model, Reporter reporter, ModelHelper modelHelper) {
    try {
      for (IdEObject idEObject : model.getValues()) {
        modelHelper.copy(idEObject, false);
      }
      return modelHelper.getTargetModel();
    } catch (IfcModelInterfaceException e) {
      reporter.error(e);
    }
    return null;
  }
}
