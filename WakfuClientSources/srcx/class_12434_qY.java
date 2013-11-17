import org.apache.log4j.Logger;

public class qY
{
  private static final Logger K = Logger.getLogger(qY.class);

  public static final qY aYI = new qY();

  private final cSR aYJ = new cSR();

  public void a(cig paramcig)
  {
    if (this.aYJ.contains(paramcig.getId())) {
      throw new IllegalArgumentException("bonus déjà inséré avec l'id " + paramcig.getId());
    }
    this.aYJ.put(paramcig.getId(), paramcig);
  }

  public cig cw(int paramInt) {
    return (cig)this.aYJ.get(paramInt);
  }
}