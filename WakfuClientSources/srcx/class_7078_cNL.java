import java.util.ArrayList;
import java.util.HashMap;

public class cNL
{
  private final HashMap ktj;
  private String ktk;
  private boolean cXr;
  public jo ktl;

  public cNL()
  {
    this.ktj = new HashMap();

    this.ktk = null;
    this.cXr = true;

    this.ktl = null;
  }

  public void a(jo paramjo)
  {
    this.ktl = paramjo;
  }

  public void a(String paramString, bnU parambnU) {
    this.ktj.put(paramString, parambnU);

    if (this.ktk == null)
      this.ktk = paramString;
  }

  public void clear()
  {
    this.ktj.clear();
    this.ktk = null;
    this.cXr = true;
  }

  public int[] ac(ArrayList paramArrayList)
  {
    if (this.ktk == null) {
      return null;
    }

    bnU localbnU = (bnU)this.ktj.get(this.ktk);
    if (localbnU != null) {
      return localbnU.a(paramArrayList, this.cXr);
    }
    return null;
  }

  public int[] a(ArrayList paramArrayList, String paramString)
  {
    if ((!bB) && (paramString == null)) throw new AssertionError("columnId == null !");

    if (paramString.equals(this.ktk))
      this.cXr = (!this.cXr);
    else {
      this.cXr = true;
    }

    this.ktk = paramString;

    if (this.ktl != null) {
      this.ktl.c(this.ktk, this.cXr);
    }

    bnU localbnU = (bnU)this.ktj.get(this.ktk);
    if (localbnU == null) {
      return null;
    }

    return localbnU.a(paramArrayList, this.cXr);
  }

  public boolean isDirect() {
    return this.cXr;
  }

  public static int[] yE(int paramInt) {
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfInt[i] = i;
    }
    return arrayOfInt;
  }
}