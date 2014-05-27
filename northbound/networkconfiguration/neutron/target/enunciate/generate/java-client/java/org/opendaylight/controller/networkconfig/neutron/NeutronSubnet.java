/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.networkconfig.neutron;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "neutronSubnet",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "neutronSubnet",
  namespace = ""
)
public class NeutronSubnet extends org.opendaylight.controller.configuration.ConfigurationObject {

  private java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_IPAllocationPool> _allocationPools;
  private java.lang.String _name;
  private java.lang.String _cidr;
  private java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_HostRoute> _hostRoutes;
  private java.lang.String _networkUUID;
  private java.lang.Integer _ipVersion;
  private java.lang.String _ipV6AddressMode;
  private java.lang.String _subnetUUID;
  private java.lang.String _gatewayIP;
  private java.lang.Boolean _enableDHCP;
  private java.lang.String _tenantID;
  private java.lang.String _ipV6RaMode;
  private java.util.List<java.lang.String> _dnsNameservers;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "allocation_pools",
    namespace = ""
  )
  public java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_IPAllocationPool> getAllocationPools() {
    return this._allocationPools;
  }

  /**
   * (no documentation provided)
   */
  public void setAllocationPools(java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_IPAllocationPool> _allocationPools) {
    this._allocationPools = _allocationPools;
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
    name = "cidr",
    namespace = ""
  )
  public java.lang.String getCidr() {
    return this._cidr;
  }

  /**
   * (no documentation provided)
   */
  public void setCidr(java.lang.String _cidr) {
    this._cidr = _cidr;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "host_routes",
    namespace = ""
  )
  public java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_HostRoute> getHostRoutes() {
    return this._hostRoutes;
  }

  /**
   * (no documentation provided)
   */
  public void setHostRoutes(java.util.List<org.opendaylight.controller.networkconfig.neutron.NeutronSubnet_HostRoute> _hostRoutes) {
    this._hostRoutes = _hostRoutes;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "network_id",
    namespace = ""
  )
  public java.lang.String getNetworkUUID() {
    return this._networkUUID;
  }

  /**
   * (no documentation provided)
   */
  public void setNetworkUUID(java.lang.String _networkUUID) {
    this._networkUUID = _networkUUID;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "ip_version",
    namespace = ""
  )
  public java.lang.Integer getIpVersion() {
    return this._ipVersion;
  }

  /**
   * (no documentation provided)
   */
  public void setIpVersion(java.lang.Integer _ipVersion) {
    this._ipVersion = _ipVersion;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "ipv6_address_mode",
    namespace = "",
    nillable = true
  )
  public java.lang.String getIpV6AddressMode() {
    return this._ipV6AddressMode;
  }

  /**
   * (no documentation provided)
   */
  public void setIpV6AddressMode(java.lang.String _ipV6AddressMode) {
    this._ipV6AddressMode = _ipV6AddressMode;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "id",
    namespace = ""
  )
  public java.lang.String getSubnetUUID() {
    return this._subnetUUID;
  }

  /**
   * (no documentation provided)
   */
  public void setSubnetUUID(java.lang.String _subnetUUID) {
    this._subnetUUID = _subnetUUID;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "gateway_ip",
    namespace = ""
  )
  public java.lang.String getGatewayIP() {
    return this._gatewayIP;
  }

  /**
   * (no documentation provided)
   */
  public void setGatewayIP(java.lang.String _gatewayIP) {
    this._gatewayIP = _gatewayIP;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "enable_dhcp",
    namespace = ""
  )
  public java.lang.Boolean getEnableDHCP() {
    return this._enableDHCP;
  }

  /**
   * (no documentation provided)
   */
  public void setEnableDHCP(java.lang.Boolean _enableDHCP) {
    this._enableDHCP = _enableDHCP;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tenant_id",
    namespace = ""
  )
  public java.lang.String getTenantID() {
    return this._tenantID;
  }

  /**
   * (no documentation provided)
   */
  public void setTenantID(java.lang.String _tenantID) {
    this._tenantID = _tenantID;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "ipv6_ra_mode",
    namespace = "",
    nillable = true
  )
  public java.lang.String getIpV6RaMode() {
    return this._ipV6RaMode;
  }

  /**
   * (no documentation provided)
   */
  public void setIpV6RaMode(java.lang.String _ipV6RaMode) {
    this._ipV6RaMode = _ipV6RaMode;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "dns_nameservers",
    namespace = ""
  )
  public java.util.List<java.lang.String> getDnsNameservers() {
    return this._dnsNameservers;
  }

  /**
   * (no documentation provided)
   */
  public void setDnsNameservers(java.util.List<java.lang.String> _dnsNameservers) {
    this._dnsNameservers = _dnsNameservers;
  }

}
