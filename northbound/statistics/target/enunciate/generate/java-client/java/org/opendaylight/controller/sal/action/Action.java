/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.sal.action;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "action",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "action",
  namespace = ""
)
public abstract class Action implements java.io.Serializable {

  private org.opendaylight.controller.sal.action.ActionType _type;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "type",
    namespace = ""
  )
  public org.opendaylight.controller.sal.action.ActionType getType() {
    return this._type;
  }

  /**
   * (no documentation provided)
   */
  public void setType(org.opendaylight.controller.sal.action.ActionType _type) {
    this._type = _type;
  }

}