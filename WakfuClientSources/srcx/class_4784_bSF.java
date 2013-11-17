public class bSF
  implements cTb
{
  private static final Ez hdI = new Ez();

  public void a(FF paramFF, String[] paramArrayOfString)
  {
    Object localObject = null;
    for (int i = 0; i < paramArrayOfString.length; i++) {
      try {
        paramFF.bN(paramArrayOfString[i]);
      } catch (cJ localcJ) {
        if (paramFF.PF())
          localObject = localcJ;
        else {
          throw localcJ;
        }
      }
    }
    if (localObject != null)
      throw localObject;
  }

  public cTb Ny()
  {
    return hdI;
  }
}