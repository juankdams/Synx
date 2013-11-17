import org.apache.log4j.Logger;

class aFh
  implements bye
{
  aFh(dAo paramdAo, Su paramSu)
  {
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    CG localCG = this.cGv.E();
    if (localCG.LP()) {
      paramdMM.c(localCG);
    } else {
      dAo.ch().error("LE MOBILE SE TROUVE DANS UNE DIRECTION 8 A LA FIN D'UN MOUVEMENT");
      paramdMM.c(localCG.ew(0));
    }
    dAo.a(this.eaZ, this.cGv);
    byz localbyz = byv.bFN().bFO();
    if (dAo.a(this.eaZ).N(localbyz.getId()))
      localbyz.fD(true);
    paramdMM.c(this);
  }
}