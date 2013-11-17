import org.apache.log4j.Logger;

public class boy
  implements adL
{
  protected static Logger K = Logger.getLogger(boy.class);

  public static final boy fHY = new boy();

  public ld c(Qv paramQv) {
    ld localld = new ld();
    if (localld.b(paramQv)) {
      return localld;
    }
    K.error("Erreur à la désérialisation d'un rawItem d'inventaire de protecteur (itemRefId=" + paramQv.cpq.aDe + ")");
    return null;
  }
}