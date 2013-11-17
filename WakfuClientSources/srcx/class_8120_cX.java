import org.apache.log4j.Logger;

class cX
  implements dkT
{
  cX(c paramc, nd paramnd)
  {
  }

  public void a(int paramInt, String paramString)
  {
    if (paramInt == 8) {
      ckW localckW = this.Sg.uE().bwo();
      try {
        bEs.bMK().a(localckW, "binding", c.h());
      } catch (Exception localException) {
        c.i().error("Exception", localException);
      }
      bqJ.bzC().bzD();
      bln localbln = bqJ.bzC().fW(bCO.cM(localckW.getKeyCode(), localckW.cmO()));
      if (localbln != null)
        dtV.bindKey(localbln, 17731);
    }
  }
}