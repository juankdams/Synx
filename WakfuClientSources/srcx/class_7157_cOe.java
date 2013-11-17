import java.util.ArrayList;

class cOe
  implements cvW
{
  private final aAO kwo;

  cOe(aAO paramaAO)
  {
    this.kwo = paramaAO;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 20090:
      b((aFg)paramcWG);
      return false;
    case 20094:
      a((bXr)paramcWG);
      return false;
    }
    return true;
  }

  private void a(bXr parambXr)
  {
    bSm localbSm = bSm.bZg();
    brW localbrW = ars.dzL.jG(this.kwo.aMF().tU());
    bcD localbcD = dJD.lVl.CL(this.kwo.aMF().tU());
    bpp localbpp = new bpp(parambXr.CD(), parambXr.uo(), parambXr.bbm(), localbrW.getId(), parambXr.ccG(), localbcD);
    localbSm.a(localbpp);
    byv.bFN().a(localbSm);

    byv.bFN().b(this);
  }

  private void b(aFg paramaFg) {
    dAj localdAj = dAj.ddA();
    brW localbrW = ars.dzL.jG(this.kwo.aMF().tU());

    ArrayList localArrayList = paramaFg.aRC();

    dfX.laF.ag(localArrayList);
    cYG localcYG = new cYG(localbrW.arI(), paramaFg.uo(), localArrayList, paramaFg.aRD(), paramaFg.aRE());
    localdAj.a(localcYG);
    byv.bFN().a(localdAj);

    byv.bFN().b(this);
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    return "Frame{m_board=" + this.kwo + '}';
  }
}