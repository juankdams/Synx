import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public abstract class atq
  implements Iterable
{
  private static final Logger K = Logger.getLogger(atq.class);

  private final ArrayList dEA = new ArrayList();

  protected int dEB = 2147483647;
  private int dEC = 0;
  protected Pattern dED;
  protected boolean dEE;
  protected boolean dEF;
  private int dEG = -1;
  private int dEH = 0;
  private int dEI = -1;
  private int dEJ = 0;

  private boolean dEK = false;
  private P dEL;
  private boolean dEM;

  public void aFi()
  {
    ckA localckA = new ckA(this, null, false);
    localckA.setText("");
    a(localckA);
  }

  protected void a(ddB paramddB)
  {
    this.dEA.add(paramddB);
    this.dEC += paramddB.cms();
  }

  protected void a(int paramInt, ddB paramddB)
  {
    this.dEA.add(paramInt, paramddB);
  }

  public void b(ddB paramddB)
  {
    this.dEA.remove(paramddB);
    this.dEC -= paramddB.cms();
  }

  public ddB kg(int paramInt)
  {
    try
    {
      return (ddB)this.dEA.get(paramInt); } catch (Exception localException) {
    }
    return null;
  }

  protected void aFj()
  {
    this.dEA.clear();
    this.dEC = 0;
  }

  public int aFk()
  {
    return this.dEC;
  }

  public int getMaxCharacters()
  {
    return this.dEB;
  }

  public void setMaxCharacters(int paramInt)
  {
    this.dEB = paramInt;
  }

  public Pattern aFl() {
    return this.dED;
  }

  public String getRestrict()
  {
    if (this.dED != null) {
      return this.dED.pattern();
    }
    return null;
  }

  public void setRestrict(String paramString)
  {
    if (paramString == null) {
      this.dED = null;
      return;
    }
    if (this.dEE)
      this.dED = Pattern.compile(paramString, 64);
    else
      this.dED = Pattern.compile(paramString);
  }

  public void setUnicodeRestrict(boolean paramBoolean)
  {
    if (paramBoolean == this.dEE) {
      return;
    }
    this.dEE = paramBoolean;
    if (this.dED != null)
      setRestrict(this.dED.pattern());
  }

  public boolean aFm()
  {
    return this.dEF;
  }

  public void setPassword(boolean paramBoolean)
  {
    this.dEF = paramBoolean;
  }

  public boolean isEnableAWTFont() {
    return this.dEK;
  }

  public void setEnableAWTFont(boolean paramBoolean) {
    this.dEK = paramBoolean;
  }

  public boolean aFn() {
    return this.dEE;
  }

  public boolean isEmpty()
  {
    return this.dEA.isEmpty();
  }

  public ddB aFo()
  {
    if (!this.dEA.isEmpty()) {
      return (ddB)this.dEA.get(0);
    }
    return null;
  }

  public ddB aFp()
  {
    if (!this.dEA.isEmpty()) {
      return (ddB)this.dEA.get(this.dEA.size() - 1);
    }
    return null;
  }

  public ddB aFq()
  {
    int i = aFr();
    if (i != -1) {
      return kg(i);
    }
    return null;
  }

  public int aFr()
  {
    if (aFC()) {
      return this.dEI;
    }
    return this.dEG;
  }

  public int aFs()
  {
    if (aFC()) {
      return this.dEJ;
    }
    return this.dEH;
  }

  public boolean a(ddB paramddB, int paramInt)
  {
    int i = this.dEA.indexOf(paramddB);

    int j = bCO.J(paramInt, -1, this.dEC);
    if (j != paramInt) {
      K.warn("setSelectionStart avec une valeur d'index invalide : ", new Exception());
      paramInt = j;
    }

    boolean bool = false;
    if ((i != this.dEG) || (this.dEH != paramInt)) {
      bool = true;
    }
    this.dEG = i;
    this.dEH = paramInt;

    return bool;
  }

  public boolean aFt()
  {
    boolean bool = (this.dEI != this.dEG) || (this.dEH != this.dEJ);

    this.dEG = this.dEI;
    this.dEH = this.dEJ;

    return bool;
  }

  public ddB aFu()
  {
    int i = aFv();
    if (i != -1) {
      return kg(i);
    }
    return null;
  }

  public int aFv()
  {
    if (aFC()) {
      return this.dEG;
    }
    return this.dEI;
  }

  public int aFw()
  {
    if (aFC()) {
      return this.dEH;
    }
    return this.dEJ;
  }

  public boolean kh(int paramInt)
  {
    if (this.dEJ != paramInt) {
      this.dEJ = paramInt;
      return true;
    }
    return false;
  }

  public boolean ki(int paramInt)
  {
    if (this.dEH != paramInt) {
      this.dEH = paramInt;
      return true;
    }
    return false;
  }

  public boolean b(ddB paramddB, int paramInt)
  {
    int i = this.dEA.indexOf(paramddB);
    int j = bCO.J(paramInt, -1, this.dEC);
    if (j != paramInt) {
      K.warn("setSelectionEnd avec une valeur d'index invalide : ", new Exception());
      paramInt = j;
    }
    boolean bool = (i != this.dEI) || (this.dEJ != paramInt);
    this.dEI = i;
    this.dEJ = paramInt;
    return bool;
  }

  public boolean aFx()
  {
    boolean bool = (this.dEI != this.dEG) || (this.dEJ != this.dEH);
    this.dEI = this.dEG;
    this.dEJ = this.dEH;
    return bool;
  }

  public boolean aFy()
  {
    return (this.dEG != -1) && (this.dEI != -1);
  }

  public boolean isSelectionEmpty()
  {
    return (this.dEG == this.dEI) && (this.dEH == this.dEJ);
  }

  public String getSelectedText()
  {
    if ((!aFy()) || (isSelectionEmpty())) {
      return null;
    }
    String str1 = aFr();
    String str2 = aFv();
    int i = aFs();
    int j = aFw();
    Object localObject;
    String str3;
    if (str1 == str2) {
      localObject = aFq();
      if ((localObject != null) && (((ddB)localObject).cOJ() == bY.QP)) {
        str3 = ((ckA)localObject).cmr();
        return str3.substring(i, j);
      }
    } else {
      localObject = new StringBuilder();
      for (str3 = str1; str3 <= str2; str3++)
      {
        ddB localddB = kg(str3);
        if (localddB.cOJ() == bY.QP)
        {
          String str4 = ((ckA)localddB).cmr();

          if (str3 == str1) {
            ((StringBuilder)localObject).append(str4.substring(i));
          }
          else if (str3 == str2) {
            ((StringBuilder)localObject).append(str4.substring(0, j));
          }
          else
          {
            ((StringBuilder)localObject).append(str4);
          }
        }
      }

      return ((StringBuilder)localObject).toString();
    }
    return null;
  }

  public void a(P paramP)
  {
    this.dEL = paramP;
  }

  public P aFz() {
    return this.dEL;
  }

  public boolean aFA()
  {
    return this.dEM;
  }

  public void setUseHighContrast(boolean paramBoolean)
  {
    this.dEM = paramBoolean;
  }

  public abstract String Vt();

  public boolean cA(String paramString)
  {
    return paramString.equals(Vt());
  }

  public abstract void cB(String paramString);

  public abstract void cC(String paramString);

  public Iterator iterator()
  {
    return this.dEA.iterator();
  }

  public boolean aFB()
  {
    boolean bool = (this.dEI != -1) || (this.dEG != -1) || (this.dEJ != 0) || (this.dEH != 0);
    this.dEG = -1;
    this.dEH = 0;
    this.dEI = -1;
    this.dEJ = 0;
    return bool;
  }

  private boolean aFC()
  {
    if (!aFy()) {
      return false;
    }
    if (this.dEI < this.dEG) {
      return true;
    }
    return (this.dEG == this.dEI) && (this.dEJ < this.dEH);
  }

  public void fJ(String paramString)
  {
    if (!aFy()) {
      return;
    }

    ddB localddB1 = aFq();

    ddB localddB2 = aFr();
    ddB localddB3 = aFv();
    int i = aFs();
    int j = aFw();

    int k = 0;
    int m = 0;
    Object localObject;
    if (localddB2 == localddB3) {
      localObject = aFq();
      if (localObject != null) {
        k = j - i;
        if (((ddB)localObject).dA(i, j)) {
          b((ddB)localObject);
          m = 1;
        }
      }
    } else {
      for (localObject = localddB3; localObject >= localddB2; localObject--)
      {
        ddB localddB4 = kg(localObject);

        if (localObject == localddB2) {
          k += localddB4.cms() - 1 - i;
          if (localddB4.vE(i)) {
            b(localddB4);
            m = 1;
          }

        }
        else if (localObject == localddB3) {
          k += j + 1;
          if (localddB4.vF(j)) {
            b(localddB4);
          }

        }
        else
        {
          k += localddB4.cms();
          b(localddB4);
        }
      }
    }

    this.dEC -= k;

    if (localddB1.cOJ() == bY.QP) {
      localObject = (ckA)localddB1;
    } else {
      localObject = new ckA(this, null, false);
      m = 1;
    }
    int n = ((ckA)localObject).F(paramString, i);

    if (m != 0) {
      a(localddB2, (ddB)localObject);
    }

    this.dEC += n;
    if (this.dEC > this.dEB) {
      int i1 = this.dEC - this.dEB;
      ((ckA)localObject).dA(i, i + i1);
      n -= i1;
      this.dEC -= i1;
    }

    a((ddB)localObject, i);
    aFx();
    kj(n);
    aFt();
  }

  public void aFD()
  {
    if (isSelectionEmpty()) {
      aFG();
    }
    fJ("");
  }

  public void aFE()
  {
    if (isSelectionEmpty()) {
      aFF();
    }
    fJ("");
  }

  public boolean kj(int paramInt)
  {
    boolean bool = false;
    for (int i = 0; i < paramInt; i++) {
      bool |= aFF();
    }
    return bool;
  }

  public boolean aFF()
  {
    ddB localddB = kg(this.dEI);
    if ((localddB != null) && ((localddB.cms() > this.dEJ + 1) || ((localddB == aFp()) && (localddB.cms() >= this.dEJ + 1))))
    {
      this.dEJ += 1;
      return true;
    }
    if (this.dEI + 1 <= this.dEA.size() - 1) {
      this.dEI += 1;
      this.dEJ = 0;
      return true;
    }
    return false;
  }

  public boolean kk(int paramInt)
  {
    boolean bool = false;
    for (int i = 0; i < paramInt; i++) {
      bool |= aFG();
    }
    return bool;
  }

  public boolean aFG()
  {
    ddB localddB = kg(this.dEI);
    if ((localddB != null) && (this.dEJ - 1 >= 0)) {
      this.dEJ -= 1;
      return true;
    }
    if (this.dEI - 1 >= 0) {
      this.dEI -= 1;
      this.dEJ = (kg(this.dEI).cms() - 1);
      return true;
    }
    return false;
  }

  public int aFH() {
    return this.dEA.size();
  }
}