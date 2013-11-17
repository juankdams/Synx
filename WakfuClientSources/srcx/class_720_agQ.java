import java.nio.ByteBuffer;

public abstract class agQ
{
  protected static final cAl[] daL = new cAl[0];
  private final int aWH;
  protected final cAl[] daM;
  protected final cAl[] daN;

  public agQ(int paramInt, cAl[] paramArrayOfcAl1, cAl[] paramArrayOfcAl2)
  {
    this.aWH = paramInt;
    this.daM = paramArrayOfcAl1;
    this.daN = paramArrayOfcAl2;
  }

  public agQ(int paramInt) {
    this(paramInt, daL, daL);
  }

  public final int xj()
  {
    return this.aWH;
  }

  public abstract sF adi();

  public abstract cdR pv();

  public final int asp()
  {
    return ass().length;
  }

  public final zO[] asq()
  {
    return a(this.daN);
  }
  public final zO[] asr() {
    return a(this.daM);
  }
  private static zO[] a(cAl[] paramArrayOfcAl) {
    if (paramArrayOfcAl == daL)
      return zO.buJ;
    int i = paramArrayOfcAl.length;
    zO[] arrayOfzO = new zO[i];
    for (int j = 0; j < i; j++)
      arrayOfzO[j] = paramArrayOfcAl[j].aHX();
    return arrayOfzO;
  }

  public final void a(zO[] paramArrayOfzO, ByteBuffer paramByteBuffer)
  {
    for (int i = 0; i < this.daN.length; i++)
      this.daN[i].a(paramArrayOfzO[i], paramByteBuffer);
  }

  public final void a(dSw paramdSw, akR paramakR)
  {
    for (int i = 0; i < this.daN.length; i++)
      this.daN[i].a(paramdSw, (String)paramakR.get(this.daN[i].getName()));
  }

  public final cAl[] ass()
  {
    return this.daM;
  }

  public final int el(String paramString) {
    cAl[] arrayOfcAl = ass();
    for (int i = 0; i < arrayOfcAl.length; i++) {
      if (arrayOfcAl[i].getName().equals(paramString))
        return i;
    }
    return -1;
  }

  public void a(zO[] paramArrayOfzO) {
    for (int i = 0; i < paramArrayOfzO.length; i++)
      paramArrayOfzO[i].reset();
  }
}