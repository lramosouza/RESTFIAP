
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice" type="{http://br.com.fiap.government/}invoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoiceResponse", propOrder = {
    "invoice"
})
public class InvoiceResponse {

    protected Invoice_Type invoice;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice_Type }
     *     
     */
    public Invoice_Type getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice_Type }
     *     
     */
    public void setInvoice(Invoice_Type value) {
        this.invoice = value;
    }

}
