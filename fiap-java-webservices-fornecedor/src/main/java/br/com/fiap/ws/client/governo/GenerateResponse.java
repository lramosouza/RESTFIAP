
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de generateResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade generate.
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
     * Define o valor da propriedade generate.
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
