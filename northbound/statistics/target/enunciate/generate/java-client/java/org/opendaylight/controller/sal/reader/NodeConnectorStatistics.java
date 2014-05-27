/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.sal.reader;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "nodeConnectorStatistics",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "nodeConnectorStatistics",
  namespace = ""
)
public class NodeConnectorStatistics implements java.io.Serializable {

  private long _receiveOverRunError;
  private long _transmitErrors;
  private long _receiveCrcError;
  private long _transmitBytes;
  private long _receiveDrops;
  private long _receiveFrameError;
  private long _receiveBytes;
  private long _collisionCount;
  private long _transmitPackets;
  private long _receiveErrors;
  private org.opendaylight.controller.sal.core.NodeConnector _nodeConnector;
  private long _receivePackets;
  private long _transmitDrops;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveOverRunError",
    namespace = ""
  )
  public long getReceiveOverRunError() {
    return this._receiveOverRunError;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveOverRunError(long _receiveOverRunError) {
    this._receiveOverRunError = _receiveOverRunError;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "transmitErrors",
    namespace = ""
  )
  public long getTransmitErrors() {
    return this._transmitErrors;
  }

  /**
   * (no documentation provided)
   */
  public void setTransmitErrors(long _transmitErrors) {
    this._transmitErrors = _transmitErrors;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveCrcError",
    namespace = ""
  )
  public long getReceiveCrcError() {
    return this._receiveCrcError;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveCrcError(long _receiveCrcError) {
    this._receiveCrcError = _receiveCrcError;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "transmitBytes",
    namespace = ""
  )
  public long getTransmitBytes() {
    return this._transmitBytes;
  }

  /**
   * (no documentation provided)
   */
  public void setTransmitBytes(long _transmitBytes) {
    this._transmitBytes = _transmitBytes;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveDrops",
    namespace = ""
  )
  public long getReceiveDrops() {
    return this._receiveDrops;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveDrops(long _receiveDrops) {
    this._receiveDrops = _receiveDrops;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveFrameError",
    namespace = ""
  )
  public long getReceiveFrameError() {
    return this._receiveFrameError;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveFrameError(long _receiveFrameError) {
    this._receiveFrameError = _receiveFrameError;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveBytes",
    namespace = ""
  )
  public long getReceiveBytes() {
    return this._receiveBytes;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveBytes(long _receiveBytes) {
    this._receiveBytes = _receiveBytes;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "collisionCount",
    namespace = ""
  )
  public long getCollisionCount() {
    return this._collisionCount;
  }

  /**
   * (no documentation provided)
   */
  public void setCollisionCount(long _collisionCount) {
    this._collisionCount = _collisionCount;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "transmitPackets",
    namespace = ""
  )
  public long getTransmitPackets() {
    return this._transmitPackets;
  }

  /**
   * (no documentation provided)
   */
  public void setTransmitPackets(long _transmitPackets) {
    this._transmitPackets = _transmitPackets;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receiveErrors",
    namespace = ""
  )
  public long getReceiveErrors() {
    return this._receiveErrors;
  }

  /**
   * (no documentation provided)
   */
  public void setReceiveErrors(long _receiveErrors) {
    this._receiveErrors = _receiveErrors;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "nodeConnector",
    namespace = ""
  )
  public org.opendaylight.controller.sal.core.NodeConnector getNodeConnector() {
    return this._nodeConnector;
  }

  /**
   * (no documentation provided)
   */
  public void setNodeConnector(org.opendaylight.controller.sal.core.NodeConnector _nodeConnector) {
    this._nodeConnector = _nodeConnector;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "receivePackets",
    namespace = ""
  )
  public long getReceivePackets() {
    return this._receivePackets;
  }

  /**
   * (no documentation provided)
   */
  public void setReceivePackets(long _receivePackets) {
    this._receivePackets = _receivePackets;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "transmitDrops",
    namespace = ""
  )
  public long getTransmitDrops() {
    return this._transmitDrops;
  }

  /**
   * (no documentation provided)
   */
  public void setTransmitDrops(long _transmitDrops) {
    this._transmitDrops = _transmitDrops;
  }

}
