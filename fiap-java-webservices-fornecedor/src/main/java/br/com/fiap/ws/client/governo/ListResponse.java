
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://br.com.fiap.government/}invoicesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listResponse", propOrder = {
    "list"
})
public class ListResponse {

    protected InvoicesResponse list;

    /**
     * Obt�m o valor da propriedade list.
     * 
     * @return
     *     possible object is
     *     {@link InvoicesResponse }
     *     
     */
    public InvoicesResponse getList() {
        return list;
    }

    /**
     * Define o valor da propriedade list.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicesResponse }
     *     
     */
    public void setList(InvoicesResponse value) {
        this.list = value;
    }

}
