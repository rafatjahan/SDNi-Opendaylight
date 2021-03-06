/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
#import <libxml/xmlwriter.h>
#import <libxml/xmlreader.h>
#import <Foundation/Foundation.h>

#ifndef DEBUG_ENUNCIATE
//turn off enunciate debugging.
#define DEBUG_ENUNCIATE 0
#endif

/*******************xml utilities************************************/

int xmlTextReaderAdvanceToNextStartOrEndElement(xmlTextReaderPtr reader);
int xmlTextReaderSkipElement(xmlTextReaderPtr reader);
xmlChar *xmlTextReaderReadEntireNodeValue(xmlTextReaderPtr reader);


/**
 * Enunciate-specific interfaces and protocols.
 */
#ifndef ENUNCIATE_OBJC_TYPES
#define ENUNCIATE_OBJC_TYPES

/**
 * Protocol defining an Enunciate XML I/O methods.
 */
@protocol EnunciateXML

/**
 * Read an instance from XML.
 *
 * @param xml The XML to read.
 */
+ (id<EnunciateXML>) readFromXML: (NSData *) xml;

/**
 * Write this instance as XML.
 *
 * @return The XML.
 */
- (NSData *) writeToXML;

@end /*protocol EnunciateXML*/


/**
 * A basic XML node. Can be an element or an attribute. Used
 * instead of NSXMLElement because it's not supported on all
 * platforms yet.
 */
@interface JAXBBasicXMLNode : NSObject
{
  @private
    NSString *_name;
    NSString *_ns;
    NSString *_prefix;
    NSString *_value;
    NSArray  *_childElements;
    NSArray  *_attributes;
}

/**
 * Accessor for the (local) name of the XML node.
 *
 * @return The (local) name of the XML node.
 */
- (NSString *) name;

/**
 * Accessor for the (local) name of the XML node.
 *
 * @param newName The (local) name of the XML node.
 */
- (void) setName: (NSString *) newName;

/**
 * Accessor for the namespace of the XML node.
 *
 * @return The namespace of the XML node.
 */
- (NSString *) ns;

/**
 * Accessor for the namespace of the XML node.
 *
 * @param newNs The namespace of the XML node.
 */
- (void) setNs: (NSString *) newNs;

/**
 * Accessor for the namespace prefix of the XML node.
 *
 * @return The namespace prefix of the XML node.
 */
- (NSString *) prefix;

/**
 * Accessor for the namespace prefix of the XML node.
 *
 * @param newPrefix The namespace prefix of the XML node.
 */
- (void) setPrefix: (NSString *) newPrefix;

/**
 * Accessor for the value of the XML node.
 *
 * @return The value of the XML node.
 */
- (NSString *) value;

/**
 * Accessor for the value of the XML node.
 *
 * @param newValue The value of the XML node.
 */
- (void) setValue: (NSString *) newValue;

/**
 * Accessor for the child elements of the XML node.
 *
 * @return The child elements of the XML node.
 */
- (NSArray *) childElements;

/**
 * Accessor for the child elements of the XML node.
 *
 * @param newValue The child elements of the XML node.
 */
- (void) setChildElements: (NSArray *) newChildElements;

/**
 * Accessor for the attributes of the XML node.
 *
 * @return The attributes of the XML node.
 */
- (NSArray *) attributes;

/**
 * Accessor for the attributes of the XML node.
 *
 * @param newAttributes The attributes of the XML node.
 */
- (void) setAttributes: (NSArray *) newAttributes;
@end /*interface JAXBBasicXMLNode*/

/**
 * A basic XML node. Can be an element or an attribute. Used
 * instead of NSXMLElement because it's not supported on all
 * platforms yet.
 */
@interface QName : NSObject
{
  @private
    NSString *_localPart;
    NSString *_namespaceURI;
    NSString *_prefix;
}

/**
 * Accessor for the local part of the QName.
 *
 * @return The local part of the QName.
 */
- (NSString *) localPart;

/**
 * Accessor for the local part of the QName.
 *
 * @param newLocalPart The new local part of the QName.
 */
- (void) setLocalPart: (NSString *) newLocalPart;

/**
 * Accessor for the namespace URI of the QName.
 *
 * @return The namespace URI of the QName.
 */
- (NSString *) namespaceURI;

/**
 * Accessor for the namespace URI of the QName.
 *
 * @param newNamespaceURI The new namespace URI of the QName.
 */
- (void) setNamespaceURI: (NSString *) newNamespaceURI;

/**
 * Accessor for the namespace prefix of the QName.
 *
 * @return The namespace prefix of the QName.
 */
- (NSString *) prefix;

/**
 * Accessor for the namespace prefix of the QName.
 *
 * @param newPrefix The namespace prefix of the QName.
 */
- (void) setPrefix: (NSString *) newPrefix;
@end /*interface QName*/

#endif /* ENUNCIATE_OBJC_TYPES */

/**
 * Protocol defining a JAXB (see https://jaxb.dev.java.net/) type.
 */
@protocol JAXBType

/**
 * Read an XML type from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of the object defining the JAXB type.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader;

/**
 * Initialize the object with an XML reader.
 *
 * @param reader The XML reader from which to initialize the values of this type.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader;

/**
 * Write this instance of a JAXB type to a writer.
 *
 * @param writer The writer.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer;

@end /*protocol JAXBType*/


/**
 * Protocol defining a JAXB (see https://jaxb.dev.java.net/) element.
 */
@protocol JAXBElement

/**
 * Read the XML element from an XML reader. It is assumed
 * that the reader is pointing at the start element (be careful
 * that it's not still pointing to the XML document).
 *
 * @param reader The reader.
 * @return An instance of the object defining the JAXB element.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader;

/**
 * Write this instance of a JAXB element to a writer.
 *
 * @param writer The writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer;

/**
 * Write this instance of a JAXB element to a writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs;

@end /*protocol JAXBElement*/


/**
 * Protocol defining methods for events that occur
 * when reading/parsing XML. Intended for internal
 * use only.
 */
@protocol JAXBReading

/**
 * Method for reading an attribute.
 *
 * @param reader The reader pointing to the attribute.
 * @return Whether the attribute was read.
 */
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader;

/**
 * Method for reading the value of an element.
 *
 * @param reader The reader pointing to the element containing a value.
 * @return Whether the value was read.
 */
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader;

/**
 * Method for reading a child element. If (and only if) the child
 * element was handled, the element in the reader should be
 * "consumed" and the reader will be pointing to the end element.
 *
 * @param reader The reader pointing to the child element.
 * @return Whether the child element was read.
 */
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader;

/**
 * Method for reading an unknown attribute.
 *
 * @param reader The reader pointing to the unknown attribute.
 * @return Whether the attribute was read.
 */
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader;

/**
 * Method for reading an unknown child element. Implementations
 * must be responsible for "consuming" the child element.
 *
 * @param reader The reader pointing to the unknown child element.
 * @return The status of the reader after having consumed the unknown child element.
 */
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader;

@end /*protocol JAXBReading*/

/**
 * Protocol defining methods for events that occur
 * when writing XML. Intended for internal
 * use only.
 */
@protocol JAXBWriting

/**
 * Method for writing the attributes.
 *
 * @param writer The writer.
 */
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer;

/**
 * Method for writing the element value.
 *
 * @param writer The writer.
 */
- (void) writeJAXBValue: (xmlTextWriterPtr) writer;

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer;

@end /*protocol JAXBWriting*/

/**
 * Declaration of the JAXB type, element, events for a base object.
 */
@interface NSObject (JAXB) <JAXBType, JAXBElement, JAXBReading, JAXBWriting>

@end

/*******************boolean************************************/

/**
 * Read a boolean value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return YES if "true" was read. NO otherwise.
 */
BOOL *xmlTextReaderReadBooleanType(xmlTextReaderPtr reader);

/**
 * Write a boolean value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteBooleanType(xmlTextWriterPtr writer, BOOL *value);

/*******************byte************************************/

/**
 * Read a byte value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the byte.
 */
unsigned char *xmlTextReaderReadByteType(xmlTextReaderPtr reader);

/**
 * Write a byte value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteByteType(xmlTextWriterPtr writer, unsigned char *value);

/*******************double************************************/

/**
 * Read a double value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the double.
 */
double *xmlTextReaderReadDoubleType(xmlTextReaderPtr reader);

/**
 * Write a double value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteDoubleType(xmlTextWriterPtr writer, double *value);

/*******************float************************************/

/**
 * Read a float value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the float.
 */
float *xmlTextReaderReadFloatType(xmlTextReaderPtr reader);

/**
 * Write a float value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteFloatType(xmlTextWriterPtr writer, float *value);

/*******************int************************************/

/**
 * Read a int value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @param value The value to be written.
 * @return the int.
 */
int *xmlTextReaderReadIntType(xmlTextReaderPtr reader);

/**
 * Write a int value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteIntType(xmlTextWriterPtr writer, int *value);

/*******************long************************************/

/**
 * Read a long value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the long.
 */
long *xmlTextReaderReadLongType(xmlTextReaderPtr reader);

/**
 * Write a long value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteLongType(xmlTextWriterPtr writer, long *value);

/*******************short************************************/

/**
 * Read a short value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the short.
 */
short *xmlTextReaderReadShortType(xmlTextReaderPtr reader);

/**
 * Write a short value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteShortType(xmlTextWriterPtr writer, short *value);

/*******************unsigned short***************************/

/**
 * Read an unsigned short value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the unsigned short.
 */
unsigned short *xmlTextReaderReadUnsignedShortType(xmlTextReaderPtr reader);

/**
 * Write an unsigned short value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteUnsignedShortType(xmlTextWriterPtr writer, unsigned short *value);

/*******************char************************************/

/**
 * Read a character value from the reader.
 *
 * @param reader The reader (pointing at a node with a value).
 * @return the character.
 */
xmlChar *xmlTextReaderReadCharacterType(xmlTextReaderPtr reader);

/**
 * Write a character value to the writer.
 *
 * @param writer The writer.
 * @param value The value to be written.
 * @return the bytes written (may be 0 because of buffering) or -1 in case of error.
 */
int xmlTextWriterWriteCharacterType(xmlTextWriterPtr writer, xmlChar *value);

