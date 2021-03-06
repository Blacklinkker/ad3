
package registro;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Registro", targetNamespace = "http://registro/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Registro {


    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rendaCount", targetNamespace = "http://registro/", className = "registro.RendaCount")
    @ResponseWrapper(localName = "rendaCountResponse", targetNamespace = "http://registro/", className = "registro.RendaCountResponse")
    @Action(input = "http://registro/Registro/rendaCountRequest", output = "http://registro/Registro/rendaCountResponse")
    public String rendaCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "etniaCount", targetNamespace = "http://registro/", className = "registro.EtniaCount")
    @ResponseWrapper(localName = "etniaCountResponse", targetNamespace = "http://registro/", className = "registro.EtniaCountResponse")
    @Action(input = "http://registro/Registro/etniaCountRequest", output = "http://registro/Registro/etniaCountResponse")
    public String etniaCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sexoCount", targetNamespace = "http://registro/", className = "registro.SexoCount")
    @ResponseWrapper(localName = "sexoCountResponse", targetNamespace = "http://registro/", className = "registro.SexoCountResponse")
    @Action(input = "http://registro/Registro/sexoCountRequest", output = "http://registro/Registro/sexoCountResponse")
    public String sexoCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "idadeCount", targetNamespace = "http://registro/", className = "registro.IdadeCount")
    @ResponseWrapper(localName = "idadeCountResponse", targetNamespace = "http://registro/", className = "registro.IdadeCountResponse")
    @Action(input = "http://registro/Registro/idadeCountRequest", output = "http://registro/Registro/idadeCountResponse")
    public String idadeCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "orientacaoCount", targetNamespace = "http://registro/", className = "registro.OrientacaoCount")
    @ResponseWrapper(localName = "orientacaoCountResponse", targetNamespace = "http://registro/", className = "registro.OrientacaoCountResponse")
    @Action(input = "http://registro/Registro/orientacaoCountRequest", output = "http://registro/Registro/orientacaoCountResponse")
    public String orientacaoCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "empregoCount", targetNamespace = "http://registro/", className = "registro.EmpregoCount")
    @ResponseWrapper(localName = "empregoCountResponse", targetNamespace = "http://registro/", className = "registro.EmpregoCountResponse")
    @Action(input = "http://registro/Registro/empregoCountRequest", output = "http://registro/Registro/empregoCountResponse")
    public String empregoCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deficienciaCount", targetNamespace = "http://registro/", className = "registro.DeficienciaCount")
    @ResponseWrapper(localName = "deficienciaCountResponse", targetNamespace = "http://registro/", className = "registro.DeficienciaCountResponse")
    @Action(input = "http://registro/Registro/deficienciaCountRequest", output = "http://registro/Registro/deficienciaCountResponse")
    public String deficienciaCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

    /**
     * 
     * @param listaDados
     * @param parametroBusca
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "escolaridadeCount", targetNamespace = "http://registro/", className = "registro.EscolaridadeCount")
    @ResponseWrapper(localName = "escolaridadeCountResponse", targetNamespace = "http://registro/", className = "registro.EscolaridadeCountResponse")
    @Action(input = "http://registro/Registro/escolaridadeCountRequest", output = "http://registro/Registro/escolaridadeCountResponse")
    public String escolaridadeCount(
        @WebParam(name = "parametroBusca", targetNamespace = "")
        String parametroBusca,
        @WebParam(name = "listaDados", targetNamespace = "")
        List<Pessoa> listaDados);

}
