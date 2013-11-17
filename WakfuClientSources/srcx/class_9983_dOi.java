import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public abstract class dOi
  implements bUk
{
  public static final int mfU = 500;
  protected String mfV;
  protected String mfW;
  protected dOi mfX;
  protected final ArrayList mfY = new ArrayList();
  protected final ArrayList bFw = new ArrayList();

  protected final HashMap Rn = new HashMap();
  protected final HashSet mfZ = new HashSet();

  protected int kYj = 0;
  private int mga;

  public dOi(String paramString1, String paramString2, dOi paramdOi, boolean paramBoolean)
  {
    this.mfV = paramString1;
    this.mfW = paramString2;
    this.mfX = paramdOi;
  }

  void a(dpf paramdpf)
  {
    this.mfY.add(paramdpf);
  }

  void b(dOi paramdOi)
  {
    this.bFw.add(paramdOi);
  }

  String bc(Object paramObject)
  {
    String str1 = "var";

    if (paramObject != null) {
      str1 = str1 + paramObject.getClass().getSimpleName();
    }

    String str2 = str1;
    do
    {
      str1 = str2 + this.kYj;
      this.kYj += 1;
    }while (this.Rn.containsKey(str1));

    this.Rn.put(str1, paramObject);

    return str1;
  }

  public String dqj()
  {
    return this.mfV;
  }

  public dOi dqk()
  {
    return this.mfX;
  }

  public Object oW(String paramString)
  {
    return this.Rn.get(paramString);
  }

  public String can()
  {
    String str = null;
    do {
      str = "var" + this.kYj;
      this.kYj += 1;
    }while (this.Rn.containsKey(str));

    this.Rn.put(str, null);

    return str;
  }

  public boolean isFull()
  {
    return this.mfY.size() >= 500;
  }

  public void u(String paramString, Object paramObject)
  {
    this.Rn.put(paramString, paramObject);
  }

  public boolean ks(String paramString)
  {
    return this.mfZ.contains(paramString);
  }

  public void kt(String paramString)
  {
    this.mfZ.add(paramString);
  }

  public ArrayList dql()
  {
    return this.mfY;
  }

  public ArrayList getChildren()
  {
    return this.bFw;
  }

  public String getMethodName() {
    return this.mfW;
  }

  public void mark()
  {
    this.mga = this.mfY.size();
  }

  public void resetMark() {
    this.mga = -1;
  }

  public void cOX()
  {
    if (this.mga == -1) {
      return;
    }

    for (int i = this.mfY.size() - 1; i >= this.mga; i--)
      this.mfY.remove(i);
  }

  public abstract void a(PrintWriter paramPrintWriter);
}