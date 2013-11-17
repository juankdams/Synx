import org.apache.log4j.Logger;

public final class L extends cAK
{
  private static final Logger K = Logger.getLogger(L.class);
  private atD aS;
  private long aT;
  private cCH aU;

  public L()
  {
    this.aU = new Yy(this);
  }

  protected cCH ak()
  {
    return this.aU;
  }

  public int d(long paramLong) {
    if (paramLong == this.aT) {
      return this.aS.aFP();
    }
    return this.aS.aFQ();
  }

  public void al()
  {
    if (this.dln == dFN.lQi) {
      this.aS = new atD(0, 957, aPb.ewn, 0, 50, 100);
      this.aS.kl(aiI.dgu.eo());
    }
  }

  public csx[] am()
  {
    cSi localcSi = this.aS.sf();
    csx[] arrayOfcsx = new csx[localcSi.size()];
    int i = 0; for (int j = localcSi.size(); i < j; i++) {
      int k = localcSi.get(i);
      aiI localaiI = aiI.iI(k);
      if (localaiI != null)
        arrayOfcsx[i] = localaiI.avt();
      else
        K.error("Action d'id inconnu " + k);
    }
    return arrayOfcsx;
  }
}