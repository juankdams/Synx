import com.ankamagames.wakfu.client.core.script.fightLibrary.cast.CastFunctionsLibrary;

public abstract class cJs extends aIN
{
  private static final int iHq = 999;
  private static final float iHr = 1.4F;
  protected static final ddt ehE = new ddt();
  private bSl iHs;
  private double iHt;
  private final boolean iHu;
  private final boolean iHv;
  private int hY;
  private int hZ;
  private short aOl;

  public cJs(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, long paramLong, int paramInt5, int paramInt6, short paramShort)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);

    c(new hQ[] { new CastFunctionsLibrary(this) });

    fE(paramLong);

    this.iHu = paramBoolean1;
    this.iHv = paramBoolean2;
    this.hY = paramInt5;
    this.hZ = paramInt6;
    this.aOl = paramShort;
  }

  public long mC()
  {
    if (this.iHv) {
      ko(999);
    }
    return super.mC();
  }

  public boolean Iy() {
    return this.iHu;
  }

  public boolean Iz() {
    return this.iHv;
  }

  public int getX() {
    return this.hY;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public int getY() {
    return this.hZ;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public short IB() {
    return this.aOl;
  }

  public void dG(short paramShort) {
    this.aOl = paramShort;
  }

  public abstract short nU();
}