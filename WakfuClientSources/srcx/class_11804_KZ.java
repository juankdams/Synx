import java.util.ArrayList;

class KZ extends cGj
{
  public static final String NAME = "name";
  public static final String bXD = "containers";
  private final ckd bXE;
  private Xg bXF = new Xg();

  private KZ(bxU parambxU, ckd paramckd) {
    this.bXE = paramckd;
    Vu();
  }

  public void clear() {
    if (this.bXF != null) {
      int i = 0; for (int j = this.bXF.size(); i < j; i++)
        ((aNx)this.bXF.hc(i)).clear();
    }
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.bXE.getName();
    if (paramString.equals("containers")) {
      return this.bXF;
    }
    return null;
  }

  public void Vu() {
    Xg localXg = new Xg();

    int i = 0; for (int j = this.bXF.size(); i < j; i++) {
      localXg.put(this.bXF.uM(i), this.bXF.hc(i));
    }

    ArrayList localArrayList = this.bXE.cmk();
    j = 0;
    Object localObject;
    for (int k = localArrayList.size(); j < k; j++) {
      localObject = (arK)localArrayList.get(j);
      int m = ((arK)localObject).getId();
      if (this.bXF.contains(m))
        localXg.remove(m);
      else {
        this.bXF.put(m, new aNx(this.bXG, (arK)localObject, null));
      }
    }

    j = 0; for (k = localXg.size(); j < k; j++) {
      localObject = (aNx)this.bXF.remove(localXg.uM(j));
      ((aNx)localObject).clear();
    }

    dLE.doY().a(this, new String[] { "containers" });
  }
}