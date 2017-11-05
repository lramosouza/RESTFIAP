
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de generate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="generate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://br.com.fiap.government/}invoiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generate", propOrder = {
    "arg0"
})
public class Generate {

    protected InvoiceRequest arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRequest }
     *     
     */
    public InvoiceRequest getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRequest }
     *     
     */
    public void setArg0(InvoiceRequest value) {
        this.arg0 = value;
    }

}
