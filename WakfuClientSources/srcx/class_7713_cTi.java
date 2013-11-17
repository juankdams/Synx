import org.apache.log4j.Logger;

public class cTi extends azX
  implements bmx
{
  private static aee kFQ = new bOO(new dbC());

  public static azX a(int paramInt1, int paramInt2, short paramShort, int paramInt3, byte paramByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    cTi localcTi;
    try
    {
      localcTi = (cTi)kFQ.Mm();
    } catch (Exception localException) {
      K.error("Erreur lors de l'extraction d'une monsterResource du pool", localException);
      localcTi = new cTi();
    }
    if (!localcTi.b(paramInt1, paramInt2, paramShort, paramInt3, paramByte, paramBoolean1, paramBoolean2)) {
      return null;
    }
    return localcTi;
  }

  public void release() {
    if (kFQ != null)
      try {
        kFQ.y(this);
      } catch (Exception localException) {
        K.error("Erreur lors du retour d'une resource au pool", localException);
      }
    else
      bc();
  }

  public adz bxj()
  {
    adz localadz = new adz();
    localadz.n(((ceV)this.dSk).BA());
    return localadz;
  }
}