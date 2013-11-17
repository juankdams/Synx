import java.util.HashMap;

class Cy
  implements sQ
{
  Cy(dnZ paramdnZ, HashMap paramHashMap)
  {
  }

  public boolean a(Pr paramPr, float paramFloat)
  {
    if (paramPr == Pr.chH) {
      paramPr = paramFloat == 1.0F ? Pr.chJ : Pr.chH;

      localrh = (rh)this.bFh.get(paramFloat != 1.0F ? Pr.chJ : Pr.chH);
      if (localrh != null) {
        localrh.A(0.0F);
      }
    }
    rh localrh = (rh)this.bFh.get(paramPr);
    if (localrh != null) {
      localrh.A(paramFloat);
    }
    return true;
  }
}