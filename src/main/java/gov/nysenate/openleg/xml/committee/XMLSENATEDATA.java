//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.15 at 10:35:54 PM EST 
//


package gov.nysenate.openleg.xml.committee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}senagenda"/>
 *           &lt;element ref="{}senagendavote"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "senagendaOrSenagendavote"
})
@XmlRootElement(name = "SENATEDATA")
public class XMLSENATEDATA {

    @XmlElements({
        @XmlElement(name = "senagenda", type = XMLSenagenda.class),
        @XmlElement(name = "senagendavote", type = XMLSenagendavote.class)
    })
    protected List<Object> senagendaOrSenagendavote;
    @XmlAttribute(name = "TIME", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String time;

    /**
     * Gets the value of the senagendaOrSenagendavote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senagendaOrSenagendavote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenagendaOrSenagendavote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLSenagenda }
     * {@link XMLSenagendavote }
     * 
     * 
     */
    public List<Object> getSenagendaOrSenagendavote() {
        if (senagendaOrSenagendavote == null) {
            senagendaOrSenagendavote = new ArrayList<Object>();
        }
        return this.senagendaOrSenagendavote;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIME() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIME(String value) {
        this.time = value;
    }

}
