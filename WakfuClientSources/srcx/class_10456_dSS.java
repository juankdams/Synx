import java.util.ArrayList;

class dSS
  implements Ew
{
  dSS(dPS paramdPS)
  {
  }

  public void a(ArrayList paramArrayList, int paramInt)
  {
    dPS.e(this.mpm).clear();
    dPS.e(this.mpm).addAll(paramArrayList);
    dPS.c(this.mpm, (int)Math.ceil(paramInt / 10.0F));
    dPS.d(this.mpm);

    dLE.doY().a(this.mpm, new String[] { "articles", "currentPage", "totalPages", "pagesDescription" });
  }

  public void bw()
  {
    dPS.e(this.mpm).clear();
    dPS.d(this.mpm, 0);
    dPS.c(this.mpm, 0);
    dPS.d(this.mpm);

    dLE.doY().a(this.mpm, new String[] { "articles", "currentPage", "totalPages", "pagesDescription" });
  }
}