import org.apache.log4j.Logger;

class arN
{
  private final cSR dAU = new cSR();
  private final cSR dAV = new cSR();
  private final cSR dAW = new cSR();
  private final String dAX;
  private final String dAY;
  private float cas;

  arN(String paramString1, String paramString2)
  {
    this.dAX = paramString1;
    this.dAY = paramString2;
  }

  uz jP(int paramInt) {
    if ((!bB) && (this.dAU.isEmpty())) throw new AssertionError("appeller initialize avant");

    uz localuz = (uz)this.dAW.get(paramInt);
    if (localuz != null) {
      return localuz;
    }

    MD localMD = jR(paramInt);
    if (localMD == null) {
      aRa.ch().error("pas de texture " + paramInt);
      return null;
    }

    String str = null;
    try {
      str = ay.bd().getString(this.dAX) + paramInt + ".tga";
    } catch (bdh localbdh) {
      aRa.ch().error("", localbdh);
    }
    long l = byn.jp(str);
    localuz = tq.Bg().b(dHL.lSB.dhZ(), l, str, false);
    if (localuz == null) {
      aRa.ch().error("la texture " + str + " n'existe pas?");
      return null;
    }
    if (localuz.getFileName() != null) {
      localuz.ac(true);
    }
    localuz.gQ();
    this.dAW.put(paramInt, localuz);

    localuz.wn(0).W((short)localMD.getX(), (short)localMD.getY());

    return localuz;
  }

  MD jQ(int paramInt) {
    return (MD)this.dAV.get(paramInt);
  }

  public MD jR(int paramInt) {
    return (MD)this.dAU.get(paramInt);
  }

  float getScale() {
    return this.cas;
  }

  void aEs() {
    this.dAW.s(new caN(this));

    this.dAW.clear();
  }

  void initialize() {
    String str = ay.bd().getString(this.dAY);
    bpA localbpA = bpA.byM();
    localbpA.iy(str);
    bwZ localbwZ = localbpA.byN();
    localbpA.a(localbwZ, new cdJ[0]);
    CC localCC = localbwZ.bEx();
    for (K localK : localCC.c("offset")) {
      int i = localK.e("id").getIntValue();
      int j = localK.e("x").getIntValue();
      int k = localK.e("y").getIntValue();
      this.dAU.put(i, new MD(j, k));

      int m = localK.e("cell_x").getIntValue();
      int n = localK.e("cell_y").getIntValue();
      this.dAV.put(i, new MD(m, n));
    }
    this.dAV.compact();
    this.dAU.compact();
    this.cas = localCC.e("scale").ai();
    localbpA.close();
  }
}