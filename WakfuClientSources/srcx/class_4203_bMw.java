public class bMw extends dlY
{
  private boolean gPZ = false;
  private boolean gQa = false;

  private boolean gQb = false;
  private boolean gQc = false;

  public bMw(dOc paramdOc) {
    super(paramdOc);
  }

  protected void ak(String paramString1, String paramString2) {
    dVk localdVk = cBQ.cxL().cxT();
    if (localdVk == null)
      return;
    ciW localciW = localdVk.oA(paramString1);
    String str1;
    String str2;
    int i;
    int j;
    if (this.gPZ) {
      str1 = cii.h(paramString1, paramString2, "x");
      str2 = cii.h(paramString1, paramString2, "y");

      i = ((dOc)this.gKm).getX(); j = ((dOc)this.gKm).getY();

      if (localciW.contains(str1))
        i = localciW.getInt(str1);
      if (localciW.contains(str2)) {
        j = localciW.getInt(str2);
      }
      ((dOc)this.gKm).setPosition(i, j);
    }

    if (this.gQa) {
      str1 = cii.h(paramString1, paramString2, "width");
      str2 = cii.h(paramString1, paramString2, "height");

      i = ((dOc)this.gKm).getWidth(); j = ((dOc)this.gKm).getHeight();

      if (localciW.contains(str1))
        i = localciW.getInt(str1);
      if (localciW.contains(str2)) {
        j = localciW.getInt(str2);
      }
      ((dOc)this.gKm).setSize(i, j);
    }
  }

  protected void al(String paramString1, String paramString2) {
    ciW localciW = cBQ.cxL().cxT().oA(paramString1);

    if ((((dOc)this.gKm).getWidth() == 0) && (((dOc)this.gKm).getHeight() == 0))
      return;
    String str1;
    String str2;
    if ((this.gPZ) && (this.gQb)) {
      str1 = cii.h(paramString1, paramString2, "x");
      str2 = cii.h(paramString1, paramString2, "y");

      localciW.E(str1, ((dOc)this.gKm).getX());
      localciW.E(str2, ((dOc)this.gKm).getY());
    }

    if ((this.gQa) && (this.gQc)) {
      str1 = cii.h(paramString1, paramString2, "width");
      str2 = cii.h(paramString1, paramString2, "height");

      localciW.E(str1, ((dOc)this.gKm).getWidth());
      localciW.E(str2, ((dOc)this.gKm).getHeight());
    }
  }

  public void am(String paramString1, String paramString2) {
    ciW localciW = cBQ.cxL().cxT().oA(paramString1);
    String str1 = cii.h(paramString1, paramString2, "x");
    String str2 = cii.h(paramString1, paramString2, "y");
    String str3 = cii.h(paramString1, paramString2, "width");
    String str4 = cii.h(paramString1, paramString2, "height");
    localciW.kZ(str1);
    localciW.kZ(str2);
    localciW.kZ(str3);
    localciW.kZ(str4);
  }

  public void bTR() {
    Vb.ain().b(this);
  }

  public void bTS() {
    Vb.ain().a(this);
  }

  public boolean bTT() {
    cpa localcpa = ((dOc)this.gKm).getElementMap();
    if (localcpa == null) {
      return false;
    }
    String str1 = localcpa.getId();
    String str2 = ((dOc)this.gKm).getId();

    if (str1 == null) {
      return false;
    }
    ciW localciW = cBQ.cxL().cxT().oA(str1);
    String str3 = cii.h(str1, str2, "x");
    String str4 = cii.h(str1, str2, "y");
    String str5 = cii.h(str1, str2, "width");
    String str6 = cii.h(str1, str2, "height");
    return (localciW.contains(str3)) || (localciW.contains(str4)) || (localciW.contains(str5)) || (localciW.contains(str6));
  }

  public boolean bTU() {
    return this.gPZ;
  }

  public void gm(boolean paramBoolean) {
    this.gPZ = paramBoolean;
  }

  public boolean bTV() {
    return this.gQa;
  }

  public void gn(boolean paramBoolean) {
    this.gQa = paramBoolean;
  }

  public void bTW() {
    this.gQb = true;
  }

  public void bTX() {
    this.gQc = true;
  }
}