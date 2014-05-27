// <auto-generated>
// 
//
// Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
// </auto-generated>
using System;

namespace Org.Opendaylight.Controller.Forwarding.Staticrouting.Northbound {

  /// <remarks>
  ///  StaticRoute represents the static route data that is returned as a response to
  ///  the NorthBound GET request.
  /// </remarks>
  /// <summary>
  ///  StaticRoute represents the static route data that is returned as a response to
  ///  the NorthBound GET request.
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="staticRoute")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="staticRoute")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="staticRoute")]
  public partial class StaticRoute {

    private string _name;
    private string _prefix;
    private string _nextHop;
    /// <summary>
    ///  The name of the static route.
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="name",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="name")]
    public string Name {
      get {
        return this._name;
      }
      set {
        this._name = value;
      }
    }
    /// <summary>
    ///  The prefix for the route.
    ///  Format: A.B.C.D/MM  Where A.B.C.D is the Default Gateway IP (L3) or ARP Querier IP (L2)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="prefix",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="prefix")]
    public string Prefix {
      get {
        return this._prefix;
      }
      set {
        this._prefix = value;
      }
    }
    /// <summary>
    ///  NextHop IP-Address (or) datapath ID/port list: xx:xx:xx:xx:xx:xx:xx:xx/a,b,c-m,r-t,y
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="nextHop",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="nextHop")]
    public string NextHop {
      get {
        return this._nextHop;
      }
      set {
        this._nextHop = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Forwarding.Staticrouting.Northbound {

  /// <remarks>
  ///  This class represents a list of static routes.
  /// </remarks>
  /// <summary>
  ///  This class represents a list of static routes.
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="staticRoutes")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="staticRoutes")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="list")]
  public partial class StaticRoutes {

    private System.Collections.Generic.List<Org.Opendaylight.Controller.Forwarding.Staticrouting.Northbound.StaticRoute> _staticRoute;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="staticRoute",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="staticRoute")]
    public System.Collections.Generic.List<Org.Opendaylight.Controller.Forwarding.Staticrouting.Northbound.StaticRoute> StaticRoute {
      get {
        return this._staticRoute;
      }
      set {
        this._staticRoute = value;
      }
    }
  }
}  
