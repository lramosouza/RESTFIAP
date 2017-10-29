
package br.com.fiap.services.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.fiap.domain.Produto;

@XmlRootElement(name = "listarProdutosResponse", namespace = "http://services.fiap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarProdutosResponse", namespace = "http://services.fiap.com.br/")
public class ListarProdutosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Produto> _return;

    /**
     * 
     * @return
     *     returns List<Produto>
     */
    public List<Produto> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Produto> _return) {
        this._return = _return;
    }

}
