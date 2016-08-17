package net.flaviusb;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.ModelHelper;
import org.bimserver.plugins.Reporter;

public class blankfilter implements nz.ac.auckland.cs.QueryInterface {
  @Override public IfcModelInterface query(IfcModelInterface model, Reporter reporter, ModelHelper modelHelper) {
    return model;
  }
}
