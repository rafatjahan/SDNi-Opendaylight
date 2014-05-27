// <auto-generated>
// 
//
// Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
// </auto-generated>
using System;

namespace Org.Opendaylight.Controller.Configuration {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="configurationObject")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="configurationObject")]
  public abstract partial class ConfigurationObject {

  }
}  
namespace Org.Opendaylight.Controller.Sal.Core {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="edge")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="edge")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="edge")]
  public partial class Edge {

    private Org.Opendaylight.Controller.Sal.Core.NodeConnector _tailNodeConnector;
    private Org.Opendaylight.Controller.Sal.Core.NodeConnector _headNodeConnector;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="tailNodeConnector",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="tailNodeConnector")]
    public Org.Opendaylight.Controller.Sal.Core.NodeConnector TailNodeConnector {
      get {
        return this._tailNodeConnector;
      }
      set {
        this._tailNodeConnector = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="headNodeConnector",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="headNodeConnector")]
    public Org.Opendaylight.Controller.Sal.Core.NodeConnector HeadNodeConnector {
      get {
        return this._headNodeConnector;
      }
      set {
        this._headNodeConnector = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Sal.Core {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="node")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="node")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="node")]
  public partial class Node {

    private string _type;
    private string _nodeIDString;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="type",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="type")]
    public string Type {
      get {
        return this._type;
      }
      set {
        this._type = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="id",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="id")]
    public string NodeIDString {
      get {
        return this._nodeIDString;
      }
      set {
        this._nodeIDString = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Sal.Core {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="nodeConnector")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="nodeConnector")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="nodeConnector")]
  public partial class NodeConnector {

    private string _type;
    private string _nodeConnectorIDString;
    private Org.Opendaylight.Controller.Sal.Core.Node _nodeConnectorNode;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="type",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="type")]
    public string Type {
      get {
        return this._type;
      }
      set {
        this._type = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="id",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="id")]
    public string NodeConnectorIDString {
      get {
        return this._nodeConnectorIDString;
      }
      set {
        this._nodeConnectorIDString = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="node",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="node")]
    public Org.Opendaylight.Controller.Sal.Core.Node NodeConnectorNode {
      get {
        return this._nodeConnectorNode;
      }
      set {
        this._nodeConnectorNode = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Sal.Core {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="property")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="property")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="property")]
  public abstract partial class Property {

  }
}  
namespace Org.Opendaylight.Controller.Topology.Northbound {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="edgeProperties")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="edgeProperties")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="edgeProperties")]
  public partial class EdgeProperties {

    private Org.Opendaylight.Controller.Sal.Core.Edge _edge;
    private System.Collections.Generic.List<Org.Opendaylight.Controller.Sal.Core.Property> _properties;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="edge",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="edge")]
    public Org.Opendaylight.Controller.Sal.Core.Edge Edge {
      get {
        return this._edge;
      }
      set {
        this._edge = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlArrayAttribute(ElementName="properties",Namespace="")]
    [System.Xml.Serialization.XmlArrayItemAttribute(typeof(System.Collections.Generic.List<Org.Opendaylight.Controller.Sal.Core.Property>),ElementName="property",Namespace="")]
    public System.Collections.Generic.List<Org.Opendaylight.Controller.Sal.Core.Property> Properties {
      get {
        return this._properties;
      }
      set {
        this._properties = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Topology.Northbound {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="topology")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="topology")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="topology")]
  public partial class Topology {

    private System.Collections.Generic.List<Org.Opendaylight.Controller.Topology.Northbound.EdgeProperties> _edgeProperties;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="edgeProperties",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="edgeProperties")]
    public System.Collections.Generic.List<Org.Opendaylight.Controller.Topology.Northbound.EdgeProperties> EdgeProperties {
      get {
        return this._edgeProperties;
      }
      set {
        this._edgeProperties = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Topology.Northbound {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="topologyUserLinks")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="topologyUserLinks")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="list")]
  public partial class TopologyUserLinks {

    private System.Collections.Generic.List<Org.Opendaylight.Controller.Topologymanager.TopologyUserLinkConfig> _userLinks;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="userLinks",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="userLinks")]
    public System.Collections.Generic.List<Org.Opendaylight.Controller.Topologymanager.TopologyUserLinkConfig> UserLinks {
      get {
        return this._userLinks;
      }
      set {
        this._userLinks = value;
      }
    }
  }
}  
namespace Org.Opendaylight.Controller.Topologymanager {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="topologyUserLinkConfig")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="topologyUserLinkConfig")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="topologyUserLinkConfig")]
  public partial class TopologyUserLinkConfig : Org.Opendaylight.Controller.Configuration.ConfigurationObject {

    private string _dstNodeConnector;
    private string _name;
    private string _status;
    private string _srcNodeConnector;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="dstNodeConnector",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="dstNodeConnector")]
    public string DstNodeConnector {
      get {
        return this._dstNodeConnector;
      }
      set {
        this._dstNodeConnector = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
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
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="status",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="status")]
    public string Status {
      get {
        return this._status;
      }
      set {
        this._status = value;
      }
    }
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="srcNodeConnector",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="srcNodeConnector")]
    public string SrcNodeConnector {
      get {
        return this._srcNodeConnector;
      }
      set {
        this._srcNodeConnector = value;
      }
    }
  }
}  