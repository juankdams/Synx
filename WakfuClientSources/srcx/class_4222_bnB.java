import java.util.ArrayList;

class bnB
  implements doN
{
  bnB(aXE paramaXE, biy parambiy, String paramString1, bSJ parambSJ, String paramString2)
  {
  }

  public boolean a(cSx paramcSx)
  {
    int i = 0; for (int j = aXE.e(this.egN).size(); i < j; i++) {
      biy localbiy = (biy)aXE.e(this.egN).get(i);
      if (this.fGv != localbiy) {
        localbiy.setPixmap(null);
        localbiy.setStyle(this.fGw, false);
      }
    }
    if (aXE.u(this.egN) != null) {
      aXE.a(this.egN, aXE.u(this.egN).a(aXE.a(this.egN), this.fGx.getColumnId()));
      StringBuilder localStringBuilder = new StringBuilder("table");
      if (this.fGy != null) {
        localStringBuilder.append(this.fGy);
      }
      localStringBuilder.append("$");
      if (aXE.u(this.egN).isDirect())
        localStringBuilder.append("directSortButton");
      else {
        localStringBuilder.append("indirectSortButton");
      }
      this.fGv.setStyle(localStringBuilder.toString(), true);

      aXE.t(this.egN);
    }
    return false;
  }
}