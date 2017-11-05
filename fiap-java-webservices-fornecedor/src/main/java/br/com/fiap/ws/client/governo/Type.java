
package br.com.fiap.ws.client.governo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPF"/>
 *     &lt;enumeration value="CNPJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "type")
@XmlEnum
public enum Type {

    CPF,
    CNPJ;

    public String value() {
        return name();
    }

    public static Type fromValue(String v) {
        return valueOf(v);
    }

}
