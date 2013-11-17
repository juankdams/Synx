import org.apache.log4j.Logger;

public abstract class dkO
  implements duA
{
  private static final Logger K = Logger.getLogger(dkO.class);
  public static final short dFK = -1;
  public static final short lil = 0;
  public static final dkO lim = new cYZ(null);
  private boolean lin;
  protected final AQ lio;

  protected dkO(AQ paramAQ)
  {
    this.lin = false;
    this.lio = paramAQ;
  }

  public abstract int bPl();

  public abstract byte[] bPm();

  public abstract void al(byte[] paramArrayOfByte);

  public boolean b(dJO paramdJO, bhL parambhL) {
    boolean bool = a(paramdJO, parambhL);
    if (!bool)
      K.warn("L'action " + paramdJO.toString() + " n'a pas été traitée. (user = " + parambhL.toString() + ")");
    return bool;
  }

  public aPb cMe() {
    return this.lio.tj().ckb();
  }

  public void cC(short paramShort) {
    if (this.lio != null) {
      this.lio.x(paramShort);
      this.lio.JZ();
    }
    this.lin = (paramShort == -1);
  }

  public boolean isDestroyed() {
    return this.lin;
  }
}