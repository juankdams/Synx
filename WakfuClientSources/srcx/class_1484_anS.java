import java.util.ArrayList;

public class anS extends cGj
  implements cfM
{
  public static final String drS = "itemList";
  public static final String drT = "baseResourcesQuantityValue";
  public static final String drU = "resourcesQuantityValue";
  public static final String drV = "resourcesQuantityText";
  public static final String drW = "validEnabled";
  public static final String[] bF = { "itemList", "resourcesQuantityValue", "resourcesQuantityText", "validEnabled" };

  private final aoL drX = new aoL();
  private int drY;
  private int drZ;

  public String[] getFields()
  {
    return bF;
  }

  public anS(int paramInt)
  {
    this.drZ = paramInt;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equals("itemList")) {
      localObject = new ArrayList();
      for (cHu localcHu = this.drX.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        ((ArrayList)localObject).add(localcHu.value());
      }
      return localObject;
    }if (paramString.equals("baseResourcesQuantityValue"))
      return Float.valueOf(this.drZ / 50000000.0F);
    if (paramString.equals("resourcesQuantityValue"))
      return Float.valueOf(aAk() / 50000000.0F);
    if (paramString.equals("resourcesQuantityText")) {
      localObject = new lZ();
      ((lZ)localObject).am(aAk() > 50000000 ? new bNa(1.0F, 0.0F, 0.0F, 1.0F).bUV() : bNa.gRx.bUV());
      ((lZ)localObject).a(bU.fH().iK(aAk()));
      ((lZ)localObject).tJ();
      ((lZ)localObject).a(" / " + bU.fH().iK(50000000L));
      return ((lZ)localObject).tP();
    }if (paramString.equals("validEnabled")) {
      return Boolean.valueOf(this.drY > 0);
    }
    return null;
  }

  private int aAk() {
    return this.drZ + this.drY;
  }

  public aoL aAl() {
    return this.drX;
  }

  public int aAm() {
    return this.drY;
  }

  public void removeItem(cGm paramcGm) {
    long l = paramcGm.oj();
    if (!this.drX.containsKey(l)) {
      return;
    }
    this.drX.remove(l);
    this.drY = ((int)(this.drY - cLR.f(paramcGm, paramcGm.nP())));
    gA localgA = byv.bFN().bFO().bGP().iS(l);
    dLE.doY().a(this, bF);
    dLE.doY().a(localgA, new String[] { "movable", "deletable" });
  }

  public void d(gA paramgA, short paramShort) {
    long l = paramgA.oj();
    if (this.drX.containsKey(l)) {
      return;
    }
    cGm localcGm = new cGm(paramgA.oi());
    localcGm.iv(l);
    localcGm.l(paramShort);
    this.drX.put(l, localcGm);
    this.drY = ((int)(this.drY + cLR.f(localcGm, paramShort)));
    dLE.doY().a(this, bF);
    dLE.doY().a(paramgA, new String[] { "movable", "deletable" });
  }

  public boolean cV(long paramLong) {
    return this.drX.containsKey(paramLong);
  }

  public void aAn() {
    this.drX.clear();
    this.drY = 0;
    dLE.doY().a(this, bF);
  }

  public void a(cuF paramcuF) {
  }

  public void a(bpu parambpu) {
  }

  public void b(cuF paramcuF) {
  }

  public void a(bnt parambnt) {
  }

  public void b(bnt parambnt) {
  }

  public void bG(int paramInt) {
    dLE.doY().a(this, new String[] { "resourcesQuantityText", "resourcesQuantityValue" });
  }

  public int size()
  {
    return this.drX.size();
  }

  public boolean isEmpty() {
    return this.drX.isEmpty();
  }
}