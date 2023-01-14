package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Arrays;

/**Création d'un webservice CalculatriceWS*/

@WebService(serviceName = "CalculatriceWS")
public class Calculatrice {


  /**Méthode pour additionner avec deux paramètres*/
  @WebMethod(operationName = "additionnerRequete")
  @WebResult(name = "additionnerResultat")
  public float additionner(
      @WebParam(name = "operande1") float firstNumber,
      @WebParam(name = "operande2") float secondNumber) {
    return firstNumber + secondNumber;
  }

  /**Méthode pour soustraire avec deux paramètres*/

  @WebMethod(operationName = "soustraireRequete")
  @WebResult(name = "soustraireResultat")
  public float soustraire(
      @WebParam(name = "operande1") float firstNumber,
      @WebParam(name = "operande2") float secondNumber) {
    return additionner(firstNumber, -secondNumber);
  }

  /**Méthode pour multiplier avec deux paramètres*/
  @WebMethod(operationName = "multiplierRequete")
  @WebResult(name = "multiplierResultat")
  public float multiplier(
      @WebParam(name = "operande1") float firstNumber,
      @WebParam(name = "operande2") float secondNumber) {
    return firstNumber * secondNumber;
  }

  /**Méthode pour diviser avec deux paramètres*/

  @WebMethod(operationName = "diviserRequete")
  @WebResult(name = "diviserResultat")
  public float diviser(
      @WebParam(name = "operande1") float firstNumber,
      @WebParam(name = "operande2") float secondNumber) {
    return multiplier(firstNumber, (float) 1 / secondNumber);
  }
}
