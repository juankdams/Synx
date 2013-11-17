import org.apache.log4j.Logger;

public abstract class aZm extends cQa
{
  private static final Logger K = Logger.getLogger(aZm.class);

  protected void a(dwZ paramdwZ)
  {
    switch (bjt.fzM[paramdwZ.ordinal()]) {
    case 1:
      avW.aIb().a(3, 3, new Object[0]);
      break;
    default:
      K.error("Erreur " + paramdwZ + " non gérée sur un transporteur " + cHc());
    }
  }

  public abstract String a(cAK paramcAK);

  public abstract String b(cAK paramcAK);

  public abstract boolean a(byz parambyz, cAK paramcAK);
}