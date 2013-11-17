import org.apache.log4j.Logger;

public abstract class dqq
{
  protected static final Logger K = Logger.getLogger(dqq.class);
  private static dqq lrU;

  protected dqq()
  {
    lrU = this;
  }

  public static boolean aF(byte[] paramArrayOfByte) {
    if (lrU != null) {
      return lrU.M(paramArrayOfByte);
    }
    K.error("Le vérificateur de version n'a pas été définit");
    return false;
  }

  public static byte[] cKi()
  {
    if (lrU != null) {
      return lrU.bju();
    }
    K.error("Le vérificateur de version n'a pas été définit");
    return new byte[0];
  }

  protected abstract boolean M(byte[] paramArrayOfByte);

  protected abstract byte[] bju();
}