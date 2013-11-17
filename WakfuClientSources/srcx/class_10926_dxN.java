import java.util.ArrayList;

public class dxN
{
  protected cCf[] bSb;
  protected final ArrayList bSc = new ArrayList(300);
  int hY;
  int hZ;

  public final void eZ(int paramInt1, int paramInt2)
  {
    this.hY = (paramInt1 * 18);
    this.hZ = (paramInt2 * 18);
  }

  protected final int dcC() {
    return this.hY;
  }

  protected final int dcD() {
    return this.hZ;
  }

  final cCf M(int paramInt1, int paramInt2, int paramInt3) {
    try {
      return this.bSb[L(paramInt1, paramInt2, paramInt3)]; } catch (Exception localException) {
    }
    return null;
  }

  public final int L(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 - this.hY + (paramInt2 - this.hZ + paramInt3 * 18) * 18;
  }

  final void d(aYQ paramaYQ)
  {
    this.hY = (paramaYQ.readShort() * 18);
    this.hZ = (paramaYQ.readShort() * 18);

    this.bSb = a(this.bSc, 324, paramaYQ);
  }

  final void bS(float paramFloat)
  {
    int i = 0; for (int j = this.bSc.size(); i < j; i++)
      ((cCf)this.bSc.get(i)).bS(paramFloat);
  }

  final void bT(float paramFloat) {
    int i = 0; for (int j = this.bSc.size(); i < j; i++)
      ((cCf)this.bSc.get(i)).bT(paramFloat);
  }

  public static cCf[] a(ArrayList paramArrayList, int paramInt, aYQ paramaYQ) {
    paramArrayList.clear();
    a(paramArrayList, paramaYQ);
    return b(paramArrayList, paramInt, paramaYQ);
  }

  private static void a(ArrayList paramArrayList, aYQ paramaYQ) {
    int i = paramaYQ.readShort() & 0xFFFF;
    for (int j = 0; j < i; j++) {
      boolean bool = paramaYQ.bnT();
      int k = paramaYQ.readInt();
      int m = paramaYQ.readInt();
      int n = paramaYQ.readInt();
      cCf localcCf = new cCf(k, m, n, bool);
      paramArrayList.add(localcCf);
    }
  }

  private static cCf[] b(ArrayList paramArrayList, int paramInt, aYQ paramaYQ) {
    int i = paramaYQ.bnS();
    int j = paramaYQ.readUnsignedShort();

    cCf[] arrayOfcCf = new cCf[paramInt * i];
    for (int k = 0; k < j; k++) {
      int m = paramaYQ.readUnsignedShort();
      int n = paramaYQ.readUnsignedShort();

      arrayOfcCf[m] = ((cCf)paramArrayList.get(n));
    }
    return arrayOfcCf;
  }
}