/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.networkconfig.neutron.northbound;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "neutronSubnetRequest",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "neutronSubnetRequest",
  namespace = ""
)
public class NeutronSubnetRequest implements java.io.Serializable {

  private org.opendaylight.controller.networkconfig.neutron.NeutronSubnet _singletonSubnet;
  private java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet> _bulkRequest;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "subnet",
    namespace = ""
  )
  public org.opendaylight.controller.networkconfig.neutron.NeutronSubnet getSingletonSubnet() {
    return this._singletonSubnet;
  }

  /**
   * (no documentation provided)
   */
  public void setSingletonSubnet(org.opendaylight.controller.networkconfig.neutron.NeutronSubnet _singletonSubnet) {
    this._singletonSubnet = _singletonSubnet;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "subnets",
    namespace = ""
  )
  public java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet> getBulkRequest() {
    return this._bulkRequest;
  }

  /**
   * (no documentation provided)
   */
  public void setBulkRequest(java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet> _bulkRequest) {
    this._bulkRequest = _bulkRequest;
  }

}
