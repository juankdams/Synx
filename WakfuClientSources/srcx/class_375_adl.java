import org.apache.log4j.Logger;

public class adl extends dvk
{
  private static final Logger K = Logger.getLogger(adl.class);
  private static final bep[] cTs = bep.brZ();
  private int ia;
  private int ib;

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.ia = (paramaYQ.readByte() & 0xFF);
    this.ib = (paramaYQ.readByte() & 0xFF);
  }

  public int app()
  {
    return this.ia;
  }

  public int apq()
  {
    return this.ib;
  }

  public boolean aS(int paramInt1, int paramInt2) {
    int i = a(paramInt1, paramInt2, cTs, 0);
    if (i == 0)
      return true;
    if (i == 1) {
      return cTs[0].aOl == 0;
    }
    return false;
  }
}