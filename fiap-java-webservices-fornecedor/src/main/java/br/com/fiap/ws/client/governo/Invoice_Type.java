
package br.com.fiap.ws.client.governo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recipient" type="{http://br.com.fiap.government/}document" minOccurs="0"/>
 *         &lt;element name="source" type="{http://br.com.fiap.government/}document" minOccurs="0"/>
 *         &lt;element name="taxes" type="{http://br.com.fiap.government/}tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valueWithTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice", propOrder = {
    "detail",
    "issued",
    "recipient",
    "source",
    "taxes",
    "value",
    "valueWithTax"
})
public class Invoice_Type {

    protected String detail;
    protected boolean issued;
    protected Document recipient;
    protected Document source;
    @XmlElement(nillable = true)
    protected List<Tax> taxes;
    protected Double value;
    protected Double valueWithTax;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     */
    public void setIssued(boolean value) {
        this.issued = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setRecipient(Document value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setSource(Document value) {
        this.source = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<Tax>();
        }
        return this.taxes;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueWithTax() {
        return valueWithTax;
    }

    /**
     * Sets the value of the valueWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueWithTax(Double value) {
        this.valueWithTax = value;
    }

}
