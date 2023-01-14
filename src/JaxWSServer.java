import ws.Calculatrice;

import javax.xml.ws.Endpoint;

public class JaxWSServer {

  private static final int PORT = 8083;
  private static final String URL = "http://localhost:" + PORT + "/PartielCalculatriceWebServiceExercice2/calculatrice";

  /**La méthode (main) pour publier un service web à l'aide de la classe "Calculatrice"*/
  public static void main(String[] args) {

  /**Publier le service web en utilisant l'URL spécifiée et une nouvelle instance de la classe "Calculatrice"*/
    Endpoint.publish(URL, new Calculatrice());
    System.out.println("running... on PORT : " + PORT);
    System.out.println(URL+ "?wsdl");
  }
}
