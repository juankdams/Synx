import org.apache.log4j.Logger;

public abstract class ccf
  implements cvb
{
  protected static final boolean aRN = false;
  public static final int hty = -1;
  public static final int htz = 0;
  public static final int htA = 1;
  protected static final Logger K = Logger.getLogger(ccf.class);

  protected boolean a(gA paramgA, bZH parambZH, short paramShort)
  {
    boolean bool;
    try
    {
      bool = parambZH.b(paramgA, paramShort);
      if (paramgA.oi().bKn().nj() != null)
        for (azO localazO : paramgA.oi().bKn().nj()) {
          localObject = paramgA.nG();
          bool &= parambZH.b((dsj)localObject, (short)localazO.bJ());
        }
    }
    catch (bQT localbQT)
    {
      Object localObject;
      parambZH.d(paramgA);
      for (localObject : paramgA.oi().bKn().nj()) {
        gA localgA = (gA)parambZH.dz((short)((azO)localObject).bJ());
        if (localgA != null)
          localgA.release();
      }
      return false;
    }
    return bool;
  }

  protected boolean a(gA paramgA, bZH parambZH)
  {
    boolean bool = parambZH.d(paramgA);
    if (paramgA.oi().bKn().nj() != null) {
      for (azO localazO : paramgA.oi().bKn().nj()) {
        gA localgA = (gA)parambZH.dz((short)localazO.bJ());
        if (localgA != null)
          localgA.release();
      }
    }
    return bool;
  }
}