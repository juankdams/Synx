import org.apache.log4j.Logger;

public class cfZ extends dKc
{
  private static final Logger K = Logger.getLogger(cfZ.class);
  private final bRR hCV;

  public cfZ(bRR parambRR)
  {
    this.hCV = parambRR;
  }

  public short fU() {
    return 23;
  }

  public boolean fV()
  {
    dKc localdKc = this.bSY.bSe();
    return (localdKc == null) || (localdKc == this);
  }

  public void begin() {
    K.info("[STORAGE_BOX] Lancement de l'occupation");

    this.bSY.a(this);

    byv.bFN().a(aYJ.feD);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("[STORAGE_BOX] On cancel l'occupation");

    if (paramBoolean2) {
      this.hCV.b(dJO.lVI, byv.bFN().bFO());
    }

    if (byv.bFN().c(Nj.Xh())) {
      byv.bFN().b(Nj.Xh());
    }

    byv.bFN().b(aYJ.feD);
    byv.bFN().b(dkY.liy);

    return true;
  }

  public boolean fW() {
    K.info("[STORAGE_BOX] On fini l'occupation");

    if (byv.bFN().c(Nj.Xh())) {
      byv.bFN().b(Nj.Xh());
    }

    byv.bFN().b(aYJ.feD);
    byv.bFN().b(dkY.liy);

    return true;
  }

  public static cZl a(dya paramdya)
  {
    dBY localdBY = dBY.Cr(paramdya.id);
    if (localdBY == null) {
      return null;
    }
    cZl localcZl = new cZl(localdBY);
    localcZl.c(paramdya);
    return localcZl;
  }
}