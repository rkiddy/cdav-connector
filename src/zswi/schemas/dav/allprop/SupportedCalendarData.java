//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.14 at 08:38:50 PM EDT 
//


package zswi.schemas.dav.allprop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calendarData"
})
@XmlRootElement(name = "supported-calendar-data", namespace = "urn:ietf:params:xml:ns:caldav")
public class SupportedCalendarData {

    @XmlElement(name = "calendar-data", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarData calendarData;

    /**
     * Gets the value of the calendarData property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarData }
     *     
     */
    public CalendarData getCalendarData() {
        return calendarData;
    }

    /**
     * Sets the value of the calendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarData }
     *     
     */
    public void setCalendarData(CalendarData value) {
        this.calendarData = value;
    }

}
