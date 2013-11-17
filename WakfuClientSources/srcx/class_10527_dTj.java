import java.util.ArrayList;
import org.apache.log4j.Logger;

class dTj
  implements aA
{
  dTj(dPS paramdPS)
  {
  }

  public void b(ArrayList paramArrayList)
  {
    synchronized (dPS.a(this.mpm)) {
      bvU localbvU = new bvU(this);

      int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
        acM localacM = (acM)paramArrayList.get(i);
        localacM.n(localbvU);
      }

      dPS.a(this.mpm, 3);
      dti();
      dLE.doY().a(this.mpm, new String[] { "categories", "currentCategory" });

      dPS.c(this.mpm);
    }
  }

  private void dti() {
    dPS.a(this.mpm, dPS.b(this.mpm).isEmpty() ? null : (acM)dPS.b(this.mpm).get(0));
  }

  public void bw() {
    dPS.aiN().warn("Problème à la récupération des catégories du shop.");
    synchronized (dPS.a(this.mpm)) {
      dPS.a(this.mpm, 1);
    }
  }
}