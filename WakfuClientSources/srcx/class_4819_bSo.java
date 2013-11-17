import java.util.ArrayList;

public class bSo extends cGj
{
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  public static final String erw = "isAvailable";
  public static final String hcU = "isUnknown";
  public static final String hcV = "dimension";
  public static final String hcW = "stack";
  private final ArrayList hcX = new ArrayList();
  private boolean hcY;
  private int hcZ = 0;

  private Or hda = new Or(32, 32);

  public bSo(boolean paramBoolean) {
    this(null, paramBoolean);
  }

  public bSo(dpI paramdpI) {
    this(paramdpI, false);
  }

  public bSo(dpI paramdpI, boolean paramBoolean) {
    this.hcX.clear();
    if (paramdpI != null) {
      this.hcX.add(paramdpI);
    }
    this.hcY = paramBoolean;
  }

  public dpI agC()
  {
    if (this.hcX.isEmpty()) {
      return null;
    }
    return (dpI)this.hcX.get(0);
  }

  public void f(dpI paramdpI) {
    this.hcX.clear();
    if (paramdpI != null) {
      this.hcX.add(paramdpI);
    }
    dLE.doY().a(this, new String[] { "iconUrl", "description" });
  }

  public void bZh()
  {
    this.hcZ += 1;
  }

  public void dg(int paramInt1, int paramInt2) {
    this.hda.setSize(paramInt1, paramInt2);
    dLE.doY().a(this, new String[] { "dimension" });
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equals("iconUrl")) {
      localObject = agC();
      if (localObject != null)
        return ay.bd().a("timePointBonusIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(cMB.krT.yC(((dpI)localObject).yR())) });
    } else {
      if (paramString.equals("description")) {
        if (this.hcY) {
          return bU.fH().getString("fight.timePointBar.unknownBonus");
        }
        if (this.hcX.isEmpty()) {
          return bU.fH().getString("fight.timePointBar.noBonus");
        }
        localObject = new StringBuffer();
        ArrayList localArrayList = cxo.a(new cJH(this.hcX, 0, (short)1, true, cMx.krQ, 0));
        int i = 1;
        for (String str : localArrayList) {
          if (i == 0)
            ((StringBuffer)localObject).append("\n");
          else {
            i = 0;
          }
          ((StringBuffer)localObject).append(str);
        }
        return ((StringBuffer)localObject).toString();
      }if (paramString.equals("isUnknown"))
        return Boolean.valueOf(this.hcY);
      if (paramString.equals("isAvailable"))
        return Boolean.valueOf(this.hcZ != 0);
      if (paramString.equals("stack"))
        return Integer.valueOf(this.hcZ);
      if (paramString.equals("dimension")) {
        return this.hda;
      }
    }
    return null;
  }
}