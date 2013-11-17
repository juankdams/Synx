import java.io.IOException;
import org.apache.log4j.Logger;

public class Xv
{
  protected static final Logger K = Logger.getLogger(Xv.class);
  public cSR cHO;

  public void init()
  {
    this.cHO = new cSR();
  }

  public void reset() {
    if (this.cHO != null)
      this.cHO.clear();
  }

  public void p(int paramInt1, int paramInt2, int paramInt3)
  {
    adz localadz = (adz)this.cHO.get(paramInt1);
    if (localadz == null) {
      localadz = new adz();
      this.cHO.put(paramInt1, localadz);
    }

    int i = aK(paramInt2, paramInt3);
    if (!localadz.contains(i))
      localadz.hL(i);
  }

  public adz hd(int paramInt)
  {
    if (this.cHO != null) {
      return (adz)this.cHO.get(paramInt);
    }
    return null;
  }

  public static int aK(int paramInt1, int paramInt2) {
    return bCO.cN(paramInt1, paramInt2);
  }

  public static short he(int paramInt) {
    return bCO.sg(paramInt);
  }

  public static short hf(int paramInt) {
    return bCO.sh(paramInt);
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.cHO = new cSR(i);
    for (int j = 0; j < i; j++) {
      int k = paramaYQ.readInt();
      int m = paramaYQ.readInt();
      if (m != 0)
      {
        adz localadz = new adz(m);
        this.cHO.put(k, localadz);
        for (int n = 0; n < m; n++)
          localadz.hL(paramaYQ.readInt());
      }
    }
  }

  public void b(dSw paramdSw) {
    try {
      paramdSw.writeInt(this.cHO.size());
      if (!this.cHO.isEmpty()) {
        this.cHO.a(new Bp(this, paramdSw));
      }

    }
    catch (IOException localIOException)
    {
      K.error("Exception", localIOException);
    }
  }
}