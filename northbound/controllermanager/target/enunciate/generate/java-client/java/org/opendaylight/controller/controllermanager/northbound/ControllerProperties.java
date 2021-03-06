/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.controllermanager.northbound;

/**
 *  The class describes set of properties attached to a controller
 */
@javax.xml.bind.annotation.XmlType (
  name = "controllerProperties",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "controllerProperties",
  namespace = ""
)
public class ControllerProperties implements java.io.Serializable {

  private java.util.Collection<org.opendaylight.controller.sal.core.Property> _properties;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElementRefs ( {
    @javax.xml.bind.annotation.XmlElementRef (
      name = "property",
      namespace = "",
      type = org.opendaylight.controller.sal.core.Property.class
    )
  } )
  @javax.xml.bind.annotation.XmlElementWrapper (
    name = "properties",
    namespace = ""
  )
  public java.util.Collection<org.opendaylight.controller.sal.core.Property> getProperties() {
    return this._properties;
  }

  /**
   * (no documentation provided)
   */
  public void setProperties(java.util.Collection<org.opendaylight.controller.sal.core.Property> _properties) {
    this._properties = _properties;
  }

}
