/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.statistics.northbound;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "flowStatistics",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "nodeFlowStatistics",
  namespace = ""
)
public class FlowStatistics implements java.io.Serializable {

  private org.opendaylight.controller.sal.core.Node _node;
  private java.util.List<org.opendaylight.controller.sal.reader.FlowOnNode> _flowStatistic;

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
  @javax.xml.bind.annotation.XmlElement (
    name = "flowStatistic",
    namespace = ""
  )
  public java.util.List<org.opendaylight.controller.sal.reader.FlowOnNode> getFlowStatistic() {
    return this._flowStatistic;
  }

  /**
   * (no documentation provided)
   */
  public void setFlowStatistic(java.util.List<org.opendaylight.controller.sal.reader.FlowOnNode> _flowStatistic) {
    this._flowStatistic = _flowStatistic;
  }

}
