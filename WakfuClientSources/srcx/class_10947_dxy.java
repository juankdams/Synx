import org.apache.log4j.Logger;

public class dxy extends bci
{
  protected static final Logger K = Logger.getLogger(dxy.class);
  private final short bdV;
  private final Xg lDN;
  private final int bdW;
  private final boolean bdP;

  public dxy(int paramInt1, short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, boolean paramBoolean1, short paramShort6, cSR paramcSR, int paramInt2, boolean paramBoolean2)
  {
    super(paramInt1, paramShort1, paramShort2, paramShort3, paramShort4, paramShort5, paramBoolean1);
    this.bdO = paramBoolean1;
    this.bdV = paramShort6;
    this.lDN = new Xg(paramcSR.size());
    this.bdW = paramInt2;
    this.bdP = paramBoolean2;
    h(paramcSR);
  }

  private void h(cSR paramcSR) {
    try {
      String str = ay.bd().getString("ANMResourcePath");

      paramcSR.a(new aCM(this, str));
    }
    catch (bdh localbdh)
    {
      K.error("Erreur à la récupération du chemin des anms de ressources", localbdh);
    }
  }

  public String af(int paramInt1, int paramInt2, int paramInt3) {
    if (this.lDN.isEmpty()) {
      K.error("La resource " + getId() + " n'a pas de gfxId");
      return null;
    }

    String[] arrayOfString = (String[])this.lDN.get(paramInt3);
    if (arrayOfString == null) {
      arrayOfString = (String[])this.lDN.get(-1);
      if (arrayOfString == null) {
        K.error("Pas de gfxIds par défaut pour la resource " + getId());
        return null;
      }
    }
    int i = (int)(Math.abs(bCO.cM(paramInt1, paramInt2)) % arrayOfString.length);
    return arrayOfString[i];
  }

  public String dcv() {
    return bU.fH().b(12, getId(), new Object[0]);
  }

  public boolean Bw() {
    return this.bdP;
  }

  public boolean isBlocking() {
    return this.bdO;
  }

  public short BC() {
    return this.bdV;
  }

  public boolean fD(byte paramByte) {
    return a((cRm)cE(paramByte));
  }

  public boolean a(cRm paramcRm) {
    byz localbyz = byv.bFN().bFO();
    int i = 0; for (int j = paramcRm.coe(); i < j; i++) {
      bKi localbKi = (bKi)paramcRm.vW(i);
      if (localbKi.axX() == 0) {
        return true;
      }
      if (localbyz.aTn().contains(localbKi.axX())) {
        return true;
      }
    }
    return false;
  }

  public int BD() {
    return this.bdW;
  }
}