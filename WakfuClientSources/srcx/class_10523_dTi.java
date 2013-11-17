import org.apache.log4j.Logger;

class dTi
  implements bOi
{
  dTi(dPS paramdPS)
  {
  }

  public void dc(int paramInt1, int paramInt2)
  {
    synchronized (dPS.a(this.mpm)) {
      this.mpm.fo(paramInt1, paramInt2);
      dPS.b(this.mpm, 3);
      dPS.c(this.mpm);
    }
  }

  public void bw() {
    dPS.aiN().warn("Erreur à la récupération du wallet.");
    synchronized (dPS.a(this.mpm)) {
      dPS.b(this.mpm, 1);
    }
  }
}