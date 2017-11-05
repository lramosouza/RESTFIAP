
package br.com.fiap.ws.client.governo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.ws.client.governo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Password_QNAME = new QName("http://br.com.fiap.government/", "password");
    private final static QName _Exception_QNAME = new QName("http://br.com.fiap.government/", "Exception");
    private final static QName _ListResponse_QNAME = new QName("http://br.com.fiap.government/", "listResponse");
    private final static QName _Username_QNAME = new QName("http://br.com.fiap.government/", "username");
    private final static QName _List_QNAME = new QName("http://br.com.fiap.government/", "list");
    private final static QName _Generate_QNAME = new QName("http://br.com.fiap.government/", "generate");
    private final static QName _GenerateResponse_QNAME = new QName("http://br.com.fiap.government/", "generateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.ws.client.governo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Generate }
     * 
     */
    public Generate createGenerate() {
        return new Generate();
    }

    /**
     * Create an instance of {@link GenerateResponse }
     * 
     */
    public GenerateResponse createGenerateResponse() {
        return new GenerateResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link InvoiceResponse }
     * 
     */
    public InvoiceResponse createInvoiceResponse() {
        return new InvoiceResponse();
    }

    /**
     * Create an instance of {@link InvoiceRequest }
     * 
     */
    public InvoiceRequest createInvoiceRequest() {
        return new InvoiceRequest();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link InvoicesResponse }
     * 
     */
    public InvoicesResponse createInvoicesResponse() {
        return new InvoicesResponse();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link Invoice_Type }
     * 
     */
    public Invoice_Type createInvoice_Type() {
        return new Invoice_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "generate")
    public JAXBElement<Generate> createGenerate(Generate value) {
        return new JAXBElement<Generate>(_Generate_QNAME, Generate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.fiap.government/", name = "generateResponse")
    public JAXBElement<GenerateResponse> createGenerateResponse(GenerateResponse value) {
        return new JAXBElement<GenerateResponse>(_GenerateResponse_QNAME, GenerateResponse.class, null, value);
    }

}
