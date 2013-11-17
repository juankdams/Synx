import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class bQL extends aLA
{
  protected static Logger K = Logger.getLogger(bQL.class);
  private static final String gZk = "#optimized";
  private String[] gZl;
  private byte[] gZm;

  public final boolean a(bjC parambjC)
  {
    if (this.gZl == null) {
      return false;
    }
    int i = bCO.sf(101);
    for (int j = 0; j < this.gZl.length; j++) {
      i -= this.gZm[j];
      if (i <= 0)
      {
        if (this.gZl[j] != null)
        {
          if (this.gZl[j].length() == 0) break;
          return parambjC.eq(this.gZl[j]);
        }
      }
    }

    return false;
  }

  public final void a(byte paramByte, aYQ paramaYQ)
  {
    if (paramByte == 0)
      return;
    String str = paramaYQ.readString();
    if (str.equals("#optimized")) {
      int i = (paramByte - 1) / 2;
      this.gZl = new String[i];
      for (b = 0; b < i; b++) {
        this.gZl[b] = paramaYQ.readString();
      }
      this.gZm = paramaYQ.ot(i);
      return;
    }

    String[] arrayOfString = new String[paramByte];
    arrayOfString[0] = str;
    for (byte b = 1; b < paramByte; b++) {
      arrayOfString[b] = paramaYQ.readString();
    }

    if (!v(arrayOfString)) {
      this.gZl = null;
      this.gZm = null;
    }
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);

    if (this.gZl == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    paramdSw.writeByte((byte)(2 * this.gZl.length + 1));
    paramdSw.writeString("#optimized");
    if ((!bB) && (this.gZl.length != this.gZm.length)) throw new AssertionError();
    for (int i = 0; i < this.gZl.length; i++) {
      paramdSw.writeString(this.gZl[i]);
    }
    for (i = 0; i < this.gZm.length; i++)
      paramdSw.writeByte(this.gZm[i]);
  }

  private boolean v(String[] paramArrayOfString)
  {
    int i = 0;

    ArrayList localArrayList = new ArrayList();
    bvv localbvv = new bvv(paramArrayOfString.length);
    int j = -1;

    for (int k = 0; k < paramArrayOfString.length; k++) {
      String str = paramArrayOfString[k];
      try {
        byte b = Byte.parseByte(str.trim());
        if (i == 0) {
          K.warn("deux pourcentage se suivent ");
        }
        else {
          if (localbvv.size() > j) {
            localbvv.s(j, (byte)(localbvv.get(j) + b));
          } else {
            for (i2 = localbvv.size(); i2 < localArrayList.size() - 1; i2++) {
              localbvv.add((byte)0);
            }
            localbvv.add(b);
          }
          if ((!bB) && (localArrayList.size() != localbvv.size())) throw new AssertionError();
          i = 0;
        }
      } catch (NumberFormatException localNumberFormatException) { i = 1;
        j = localArrayList.indexOf(str);
        if (j == -1) {
          j = localArrayList.size();
          localArrayList.add(str);
        }
      }
    }

    k = 100;
    for (int m = 0; m < localbvv.size(); m++) {
      k -= localbvv.get(m);
    }
    m = localArrayList.size() - localbvv.size();

    if (k >= m)
    {
      int n;
      int i3;
      if (m == 0) {
        n = (byte)(k / localbvv.size());
        i2 = k - n * localbvv.size();
        for (i3 = 0; i3 < i2; i3++) {
          localbvv.s(i3, (byte)(localbvv.get(i3) + n + 1));
        }
        for (i3 = i2; i3 < localbvv.size(); i3++)
          localbvv.s(i3, (byte)(localbvv.get(i3) + n));
      }
      else {
        n = (byte)(k / m);
        i2 = k - n * m;
        for (i3 = 0; i3 < i2; i3++) {
          localbvv.add((byte)(n + 1));
        }
        for (i3 = i2; i3 < m; i3++)
          localbvv.add(n);
      }
    }
    else {
      throw new cJ("problème de pourcentage (le total est > 100)");
    }
    for (int i1 = localbvv.size() - 1; i1 >= 0; i1--) {
      if (localbvv.get(i1) == 0) {
        localbvv.pV(i1);
        localArrayList.remove(i1);
      }
    }

    i1 = 0;
    for (int i2 = 0; i2 < localbvv.size(); i2++) {
      i1 += localbvv.get(i2);
    }
    if ((!bB) && (i1 != 100)) throw new AssertionError();
    if ((!bB) && (localArrayList.size() != localbvv.size())) throw new AssertionError();
    this.gZl = new String[localArrayList.size()];
    localArrayList.toArray(this.gZl);

    this.gZm = new byte[localbvv.size()];
    for (i2 = 0; i2 < this.gZm.length; i2++) {
      this.gZm[i2] = localbvv.get(i2);
    }
    return true;
  }

  public final cuh en()
  {
    return cuh.ier;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bQL)) {
      return false;
    }
    bQL localbQL = (bQL)paramObject;

    if (!Arrays.equals(this.gZl, localbQL.gZl))
      return false;
    if (!Arrays.equals(this.gZm, localbQL.gZm)) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = en().bJ();
    i = 31 * i + (this.gZl != null ? Arrays.hashCode(this.gZl) : 0);
    i = 31 * i + (this.gZm != null ? Arrays.hashCode(this.gZm) : 0);
    return i;
  }
}