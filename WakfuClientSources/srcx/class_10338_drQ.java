import org.apache.log4j.Logger;

public class drQ extends djm
{
  private final adz lui = new adz();

  public void update() {
    super.update();

    if (this.aTk == null) {
      return;
    }
    czr localczr = (czr)this.aTk;
    dwN localdwN = localczr.cwk();
    if (localdwN == null) {
      return;
    }
    cfG localcfG = localdwN.dbZ();
    if (localcfG == null) {
      return;
    }
    int i = localcfG.fQ();
    if (this.lui.contains(i)) {
      i = 408;
    }
    if (vH() == i) {
      return;
    }
    localczr.d(this);
    bVl.caZ().c(this);

    abc localabc = acs.aoN().va(i);
    if (!(localabc instanceof drQ)) {
      K.error("la vue " + i + " n'est pas du type DimensionalBagView");
      localabc = acs.aoN().va(408);
      if (localabc == null) {
        K.error("aucun effort: la vue 408 n'est pas du type DimensionalBagView");
      }
      this.lui.hL(i);
    }
    drQ localdrQ = (drQ)localabc;
    localczr.c(localdrQ);
    bVl.caZ().b(localdrQ);
    localdrQ.atf();
    bdB.b(localdrQ);
  }

  public void bc()
  {
    super.bc();
  }

  public void aJ()
  {
    super.aJ();
    ce(bZ());
  }

  public boolean bZ()
  {
    return false;
  }
}