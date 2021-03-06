/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.containermanager;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "containerFlowConfig",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "flow-spec-config",
  namespace = ""
)
public class ContainerFlowConfig extends org.opendaylight.controller.configuration.ConfigurationObject {

  private java.lang.String _protocol;
  private java.lang.String _tpDst;
  private java.lang.String _tpSrc;
  private java.lang.String _dlVlan;
  private java.lang.String _name;
  private java.lang.String _nwDst;
  private java.lang.String _nwSrc;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "protocol",
    namespace = ""
  )
  public java.lang.String getProtocol() {
    return this._protocol;
  }

  /**
   * (no documentation provided)
   */
  public void setProtocol(java.lang.String _protocol) {
    this._protocol = _protocol;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tpDst",
    namespace = ""
  )
  public java.lang.String getTpDst() {
    return this._tpDst;
  }

  /**
   * (no documentation provided)
   */
  public void setTpDst(java.lang.String _tpDst) {
    this._tpDst = _tpDst;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tpSrc",
    namespace = ""
  )
  public java.lang.String getTpSrc() {
    return this._tpSrc;
  }

  /**
   * (no documentation provided)
   */
  public void setTpSrc(java.lang.String _tpSrc) {
    this._tpSrc = _tpSrc;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "dlVlan",
    namespace = ""
  )
  public java.lang.String getDlVlan() {
    return this._dlVlan;
  }

  /**
   * (no documentation provided)
   */
  public void setDlVlan(java.lang.String _dlVlan) {
    this._dlVlan = _dlVlan;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "name",
    namespace = ""
  )
  public java.lang.String getName() {
    return this._name;
  }

  /**
   * (no documentation provided)
   */
  public void setName(java.lang.String _name) {
    this._name = _name;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "nwDst",
    namespace = ""
  )
  public java.lang.String getNwDst() {
    return this._nwDst;
  }

  /**
   * (no documentation provided)
   */
  public void setNwDst(java.lang.String _nwDst) {
    this._nwDst = _nwDst;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "nwSrc",
    namespace = ""
  )
  public java.lang.String getNwSrc() {
    return this._nwSrc;
  }

  /**
   * (no documentation provided)
   */
  public void setNwSrc(java.lang.String _nwSrc) {
    this._nwSrc = _nwSrc;
  }

}
