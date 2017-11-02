
package br.com.fiap.services.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.fiap.domain.Pedido;

@XmlRootElement(name = "efetuarPedido", namespace = "http://services.fiap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "efetuarPedido", namespace = "http://services.fiap.com.br/", propOrder = {
    "cpfCnpj",
    "pedido"
})
public class EfetuarPedido {

    @XmlElement(name = "cpfCnpj", namespace = "")
    private String cpfCnpj;
    @XmlElement(name = "pedido", namespace = "")
    private List<Pedido> pedido;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

    /**
     * 
     * @param cpfCnpj
     *     the value for the cpfCnpj property
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    /**
     * 
     * @return
     *     returns List<Pedido>
     */
    public List<Pedido> getPedido() {
        return this.pedido;
    }

    /**
     * 
     * @param pedido
     *     the value for the pedido property
     */
    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

}
