
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de invoiceResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade invoice.
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
     * Define o valor da propriedade invoice.
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
