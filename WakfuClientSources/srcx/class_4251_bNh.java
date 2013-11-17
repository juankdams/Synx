import java.util.ArrayList;
import java.util.Collections;

abstract class bNh
{
  private final ArrayList gRV = new ArrayList();
  private final eq gRW;
  protected final Xg gRX = new Xg();

  protected bNh(eq parameq) {
    this.gRW = parameq;
  }

  public final Object tB(int paramInt) {
    return this.gRX.get(paramInt);
  }

  public final void put(int paramInt, Object paramObject) {
    this.gRX.put(paramInt, paramObject);
  }

  public void clear() {
    this.gRX.clear();
  }

  public final void a(float paramFloat1, float paramFloat2, int paramInt, ArrayList paramArrayList) {
    int i = this.gRX.size() - paramInt;
    if (i <= 0) {
      return;
    }
    this.gRW.a(paramFloat1, paramFloat2);

    this.gRV.clear();
    int k;
    Object localObject;
    for (int j = this.gRX.size() - 1; j >= 0; j--) {
      k = this.gRX.uM(j);
      localObject = this.gRX.hc(j);
      this.gRV.add(new alT(k, localObject));
    }

    Collections.sort(this.gRV, this.gRW);

    for (j = 0; j < i; j++) {
      k = ((alT)this.gRV.get(j)).cUu;
      localObject = ((alT)this.gRV.get(j)).dnH;
      if ((!bB) && (localObject != this.gRX.get(k))) throw new AssertionError();
      if (!paramArrayList.contains(localObject)) {
        this.gRX.remove(k);
        r(localObject);
      }
    }
  }

  protected abstract void r(Object paramObject);
}