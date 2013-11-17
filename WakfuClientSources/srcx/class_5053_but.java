import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class but
{
  public static final but gdO = new but();

  private static final Logger K = Logger.getLogger(but.class);

  private final cSR gdP = new cSR();
  private final cSR gdQ = new cSR();

  public void a(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, bZA parambZA, int paramInt2, short paramShort)
  {
    bnn localbnn = new bnn(paramInt1, paramFloat1, paramFloat2, paramFloat3, parambZA, paramInt2, paramShort);
    this.gdP.put(paramInt1, localbnn);
  }

  public bnn qW(int paramInt) {
    return (bnn)this.gdP.get(paramInt);
  }

  public void h(int paramInt, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = paramArrayOfInt.length; i < j; i++) {
      bnn localbnn = (bnn)this.gdP.get(paramArrayOfInt[i]);
      if (localbnn != null)
        localArrayList.add(localbnn);
      else {
        K.error("Impossible de trouver le bonus correspondant, ID=" + paramArrayOfInt[i]);
      }
    }
    bNc localbNc = new bNc(paramInt, (bnn[])localArrayList.toArray(new bnn[localArrayList.size()]));
    this.gdQ.put(paramInt, localbNc);
  }

  public bNc qX(int paramInt) {
    return (bNc)this.gdQ.get(paramInt);
  }
}