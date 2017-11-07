
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generate" type="{http://br.com.fiap.government/}invoiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateResponse", propOrder = {
    "generate"
})
public class GenerateResponse {

    protected InvoiceResponse generate;

    /**
     * Gets the value of the generate property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResponse }
     *     
     */
    public InvoiceResponse getGenerate() {
        return generate;
    }

    /**
     * Sets the value of the generate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResponse }
     *     
     */
    public void setGenerate(InvoiceResponse value) {
        this.generate = value;
    }

}
