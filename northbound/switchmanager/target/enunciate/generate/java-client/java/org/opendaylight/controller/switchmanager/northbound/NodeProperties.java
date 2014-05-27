/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.switchmanager.northbound;

/**
 *  The class describes set of properties attached to a node
 */
@javax.xml.bind.annotation.XmlType (
  name = "nodeProperties",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "nodeProperties",
  namespace = ""
)
public class NodeProperties implements java.io.Serializable {

  private org.opendaylight.controller.sal.core.Node _node;
  private java.util.Collection<org.opendaylight.controller.sal.core.Property> _properties;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "node",
    namespace = ""
  )
  public org.opendaylight.controller.sal.core.Node getNode() {
    return this._node;
  }

  /**
   * (no documentation provided)
   */
  public void setNode(org.opendaylight.controller.sal.core.Node _node) {
    this._node = _node;
  }

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
