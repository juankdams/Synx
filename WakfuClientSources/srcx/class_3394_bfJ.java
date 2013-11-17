import java.util.List;

public class bfJ extends bii
{
  public bfJ(int paramInt, String paramString1, float[] paramArrayOfFloat, String paramString2, boolean paramBoolean)
  {
    super(paramInt, paramString1, paramArrayOfFloat, paramString2, paramBoolean);
  }

  public void a(aEe paramaEe)
  {
    aEe localaEe = h(paramaEe);
    if (localaEe != null)
      super.a(localaEe);
  }

  public void a(aEe paramaEe, String paramString)
  {
    aEe localaEe = h(paramaEe);
    super.a(localaEe, paramString);
  }

  private aEe h(aEe paramaEe) {
    dnT localdnT = CM.LV().LY();
    if ((!this.aEZ.isEmpty()) && (localdnT != null)) {
      paramaEe = localdnT.a(paramaEe, this.bRQ);
    }
    return paramaEe;
  }
}