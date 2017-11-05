
package br.com.fiap.ws.client.governo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de invoice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade detail.
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
     * Define o valor da propriedade detail.
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
     * Obtém o valor da propriedade issued.
     * 
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * Define o valor da propriedade issued.
     * 
     */
    public void setIssued(boolean value) {
        this.issued = value;
    }

    /**
     * Obtém o valor da propriedade recipient.
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
     * Define o valor da propriedade recipient.
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
     * Obtém o valor da propriedade source.
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
     * Define o valor da propriedade source.
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
     * Obtém o valor da propriedade value.
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
     * Define o valor da propriedade value.
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
     * Obtém o valor da propriedade valueWithTax.
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
     * Define o valor da propriedade valueWithTax.
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
