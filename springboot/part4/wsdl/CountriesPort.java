
package springboot.part4.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CountriesPort", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountriesPort {


    /**
     * 
     * @param getCountryRequest
     * @return
     *     returns springboot.part4.wsdl.GetCountryResponse
     */
    @WebMethod
    @WebResult(name = "getCountryResponse", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
        @WebParam(name = "getCountryRequest", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryRequest")
        GetCountryRequest getCountryRequest);

}
