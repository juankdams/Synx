import org.apache.log4j.Logger;

class bmp
  implements Runnable
{
  bmp(bAF parambAF, int paramInt)
  {
  }

  public void run()
  {
    if (bAF.c(this.fDS) == this.fDR) {
      if (bAF.bIZ()) {
        bAF.Re().info("==> Envoi du chemin stop tokenisé " + this.fDR + " au serveur: " + bAF.d(this.fDS));
      }
      this.fDS.bIV();
    }
    else if (bAF.bJa()) {
      bAF.Re().info("Chemin tokenisé " + this.fDR + " annulé");
    }
  }
}