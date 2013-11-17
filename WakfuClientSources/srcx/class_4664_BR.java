import org.apache.log4j.Logger;

public class BR extends dKc
{
  private static final Logger K = Logger.getLogger(BR.class);
  private bvj bEf;

  public BR(bvj parambvj)
  {
    this.bEf = parambvj;
  }

  public short fU() {
    return 21;
  }

  public boolean fV()
  {
    dKc localdKc = this.bSY.bSe();
    return (localdKc == null) || (localdKc == this);
  }

  public void begin() {
    K.info("[STORAGE_BOX] Lancement de l'occupation");

    this.bSY.a(this);

    byv.bFN().a(dkY.liy);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("[STORAGE_BOX] On cancel l'occupation");

    if (paramBoolean2) {
      this.bEf.b(dJO.lVI, byv.bFN().bFO());
    }

    if (byv.bFN().c(Nj.Xh())) {
      byv.bFN().b(Nj.Xh());
    }

    byv.bFN().b(dkY.liy);

    return true;
  }

  public boolean fW() {
    K.info("[STORAGE_BOX] On fini l'occupation");

    if (byv.bFN().c(Nj.Xh())) {
      byv.bFN().b(Nj.Xh());
    }

    byv.bFN().b(dkY.liy);

    return true;
  }

  public cMu a(bph parambph)
  {
    cMu localcMu = this.bEf.bCQ().pT(parambph.id);
    localcMu.c(parambph);
    return localcMu;
  }

  public cMu a(cLD paramcLD)
  {
    return this.bEf.bCQ().a(new cLD(paramcLD.getId(), paramcLD.afS(), paramcLD.cEI()));
  }
}