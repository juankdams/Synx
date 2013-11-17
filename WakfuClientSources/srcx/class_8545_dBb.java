import java.util.LinkedList;

class dBb
  implements ddy
{
  dBb(buI parambuI, boolean paramBoolean, String paramString)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (bAh.iS[parambyN.ordinal()]) {
    case 1:
      paramcKq.b(this);
      if (this.iaR) {
        dka.cSF().a(new bRK(this), 2500 + this.hdN.length() * 25, 1);
      }
      else if (!buI.a(this.eOq).isEmpty()) {
        dka.cSF().a(new bRH(this), 2000L, 1);
      }
      else
      {
        if (buI.b(this.eOq) != null) {
          buI.c(this.eOq).getAppearance().c(buI.b(this.eOq));
          buI.a(this.eOq, null);
        }
        buI.a(this.eOq, null);
        buI.a(this.eOq, null);
        dLE.doY().t("splashText", null);
      }
      break;
    }
  }
}