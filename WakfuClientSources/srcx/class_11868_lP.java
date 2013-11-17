import org.apache.log4j.Logger;

public class lP extends cGF
  implements bWU
{
  private static final Logger K = Logger.getLogger(lP.class);
  cLq aPA;
  private boolean aHd;
  private static final aee aER = new bOO(new aGA());

  public final cCH aPB = new aGy(this);

  private lP()
  {
  }

  public static lP a(cLq paramcLq)
  {
    lP locallP;
    try
    {
      locallP = (lP)aER.Mm();
      locallP.E(true);
      locallP.b(paramcLq);
    } catch (Exception localException) {
      locallP = new lP();
      K.error("Erreur lors d'un checkOut sur un message de type WakfuEventsCalendarSerializable : " + localException.getMessage());
    }
    return locallP;
  }

  public void release() {
    if (this.aHd)
      try {
        aER.y(this);
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    else
      bc();
  }

  public void aJ()
  {
    this.aPA = null;
  }

  public void bc() {
    this.aPA = null;
  }

  private void E(boolean paramBoolean) {
    this.aHd = paramBoolean;
  }

  public lP(cLq paramcLq) {
    this.aPA = paramcLq;
  }

  public cCH[] tn()
  {
    return new cCH[] { this.aPB };
  }

  public cLq to() {
    return this.aPA;
  }

  public void b(cLq paramcLq) {
    this.aPA = paramcLq;
  }

  public byte[] tp() {
    return a(tn());
  }

  public int cc() {
    return this.aPB.cc();
  }
}