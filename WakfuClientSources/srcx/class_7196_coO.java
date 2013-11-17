import org.apache.log4j.Logger;

public class coO
  implements asq
{
  private static final Logger K = Logger.getLogger(coO.class);

  public void a(dnq paramdnq) {
    for (dax localdax : dax.values()) {
      cig localcig = localdax.cMJ();
      if (clr.c(localcig))
        qY.aYI.a(localcig);
      else {
        K.warn("Bonus de guilde mal saisi. id=" + localcig.getId(), new Exception());
      }
    }
    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.guildBonus");
  }
}