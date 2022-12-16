
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://WS/", className = "proxy.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://WS/", className = "proxy.ConvertResponse")
    @Action(input = "http://WS/BanqueService/convertRequest", output = "http://WS/BanqueService/convertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "liscomptes", targetNamespace = "http://WS/", className = "proxy.Liscomptes")
    @ResponseWrapper(localName = "liscomptesResponse", targetNamespace = "http://WS/", className = "proxy.LiscomptesResponse")
    @Action(input = "http://WS/BanqueService/liscomptesRequest", output = "http://WS/BanqueService/liscomptesResponse")
    public List<Compte> liscomptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://WS/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://WS/", className = "proxy.GetCompteResponse")
    @Action(input = "http://WS/BanqueService/getCompteRequest", output = "http://WS/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
