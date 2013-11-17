import org.apache.log4j.Logger;

public class aUu extends dqt
  implements bBz
{
  private long ag;
  private byte[] eVj;
  private static final bOO aCJ = new bOO(new aCm());

  public static aUu a(int paramInt1, int paramInt2, int paramInt3, long paramLong, byte[] paramArrayOfByte)
  {
    try
    {
      aUu localaUu = (aUu)aCJ.Mm();
      localaUu.tX(paramInt1);
      localaUu.tY(paramInt2);
      localaUu.tZ(paramInt3);
      localaUu.eVj = paramArrayOfByte;
      localaUu.ag = paramLong;
      return localaUu;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut sur un InteractiveElementUpdateAction : ", localException);
    }
  }

  public void release()
  {
    try {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ() {
  }

  public void bc() {
    this.ag = 0L;
    this.eVj = null;
  }

  private aUu() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    if (this.eVj != null) {
      cMb localcMb = (cMb)ayg.aJQ().dw(this.ag);
      if (localcMb != null) {
        localcMb.q(this.eVj);
        localcMb.sM();
      } else {
        K.error("L'élément interactif à mettre à jour n'est pas/plus dans les partitions gérées par le client.");
      }
    } else { K.warn("Message de mise à jour d'élément interactif reçu sans aucune donnée à mettre à jour."); }


    return 0L;
  }

  protected void kO()
  {
    release();
  }
}