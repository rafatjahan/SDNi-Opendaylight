// <auto-generated>
// 
//
// Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
// </auto-generated>
using System;

namespace Org.Opendaylight.Controller.Connectionmanager.Northbound {

  /// <remarks>
  ///  
  /// </remarks>
  /// <summary>
  ///  
  /// </summary>
  [System.SerializableAttribute()]
  [System.Xml.Serialization.XmlTypeAttribute(Namespace="",TypeName="nodes")]
  [System.Xml.Serialization.SoapTypeAttribute(TypeName="nodes")]
  [System.Xml.Serialization.XmlRootAttribute(Namespace="",ElementName="list")]
  public partial class Nodes {

    private System.Collections.Generic.List<Org.Opendaylight.Controller.Sal.Core.Node> _node;
    /// <summary>
    ///  (no documentation provided)
    /// </summary>
    [System.Xml.Serialization.XmlElementAttribute(ElementName="node",Namespace="")]
    [System.Xml.Serialization.SoapElementAttribute(ElementName="node")]
    public System.Collections.Generic.List<Org.Opendaylight.Controller.Sal.Core.Node> Node {
      get {
        return this._node;
      }
      set {
        this._node = value;
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

    private string _nodeIDString;
    private string _type;
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
  }
}  
