import org.apache.log4j.Logger;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

public abstract class dsg extends JavaFunction
{
  private static final Logger K = Logger.getLogger(dsg.class);
  private static final int lux = -1;
  protected int luy = 0;
  private final bYE[] luz;
  private final bYE[] luA;

  public dsg(LuaState paramLuaState)
  {
    super(paramLuaState);
    this.luz = ce();
    this.luA = cf();
  }

  public abstract String getName();

  public String getDescription()
  {
    return "NO Description... Please Dev, implement me!";
  }

  public abstract bYE[] ce();

  public abstract bYE[] cf();

  public final void register()
  {
    if ((!bB) && (getName() == null)) throw new AssertionError();
    super.register(getName());
  }

  public final int execute()
  {
    this.luy = 0;
    int i = cYQ();
    if (i >= 0)
      try {
        S(i);
      } catch (LuaException localLuaException) {
        throw pN(localLuaException.toString());
      }
    else {
      a(K, "Fonction " + getClass().getSimpleName() + " non éxécutée");
    }

    int j = this.luA == null ? 0 : this.luA.length;
    if (j != this.luy) {
      boolean bool = cYP();
      if ((this.luy < j) && (!bool))
        a(K, " nombre de valeur de retour incorrect (attendu " + (bool ? ">=" : "") + j + " lu: " + this.luy + " )");
    }
    return this.luy;
  }

  private boolean cYP() {
    return this.luA[(this.luA.length - 1)].bNs() == bxT.gje;
  }

  protected final String getLineNumber() {
    try {
      return cYS().ccz();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }return "-1";
  }

  private LuaException pN(String paramString)
  {
    return new LuaException(pO(paramString));
  }

  private String pO(String paramString) {
    String str = "<inconnu>";
    try {
      str = cYS().getSource();
    } catch (Exception localException) {
      K.warn("pas de script associé a cette fonction");
    }
    return "fichier=" + str + " ligne=" + getLineNumber() + " " + paramString;
  }

  protected final void a(Logger paramLogger, String paramString) {
    paramLogger.error(pO(paramString));
  }

  protected abstract void S(int paramInt);

  private int cYQ()
  {
    bYE[] arrayOfbYE = this.luz;
    if (arrayOfbYE == null) {
      return eS(0, 0);
    }
    int i = 0;
    int j = 0;
    for (int k = 0; k < arrayOfbYE.length; k++) {
      j++;
      if (!arrayOfbYE[k].cdt()) {
        i++;
      }
      if (arrayOfbYE[k].bNs() == bxT.gje) {
        j = 2147483647;
      }
    }
    if (j < i) {
      j = i;
    }
    return eS(i, j);
  }

  private int eS(int paramInt1, int paramInt2)
  {
    if ((!bB) && (paramInt1 > paramInt2)) throw new AssertionError();
    int i = this.L.getTop() - 1;
    if ((i >= paramInt1) && (i <= paramInt2)) {
      for (int j = 0; j < paramInt1; j++) {
        if (!Bq(j))
          return -j - 1;
      }
      return i;
    }
    String str;
    if (paramInt1 == paramInt2) {
      str = String.format("(attendu: %d, lu: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
    }
    else if (paramInt2 == 2147483647)
      str = String.format("(attendu au moins: %d, lu: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
    else {
      str = String.format("(attendu: %d-%d, lu: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
    }

    a(K, "nombre de paramètre incorrect " + str);
    return -1;
  }

  private boolean Bq(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    bYE[] arrayOfbYE = this.luz;
    if (arrayOfbYE == null) {
      a(K, "La fonction n'attend pas de paramètre");
      return false;
    }

    if (paramInt < arrayOfbYE.length) {
      bxT localbxT = arrayOfbYE[paramInt].bNs();
      if (this.L.isNil(paramInt + 2)) {
        a(K, " paramètre " + paramInt + " est null");
        return false;
      }
      if (!localbxT.a(this.L, paramInt + 2)) {
        String str = String.format("mauvais type d'argument #%d: (definition: %s, fonction:%s)", new Object[] { Integer.valueOf(paramInt), localbxT, this.L.typeName(this.L.type(paramInt + 2)) });
        a(K, str);
        return false;
      }
    }
    return true;
  }

  public bFB[] eT(int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    if (i <= 0)
      return null;
    bFB[] arrayOfbFB = new bFB[i];
    for (int j = 0; j < i; j++) {
      int k = paramInt1 + j + 2;
      arrayOfbFB[j] = bFB.b(this.L, k);
    }
    return arrayOfbFB;
  }

  public final int Br(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (this.L.isObject(paramInt + 2))
    {
      return (int)((Long)this.L.toJavaObject(paramInt + 2)).longValue();
    }
    return this.L.toInteger(paramInt + 2);
  }

  public final double Bs(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (this.L.isObject(paramInt + 2)) {
      return ((Double)this.L.toJavaObject(paramInt + 2)).doubleValue();
    }
    return this.L.toNumber(paramInt + 2);
  }

  public final float Bt(int paramInt) {
    return (float)Bs(paramInt);
  }

  public final long Bu(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (this.L.isObject(paramInt + 2)) {
      return ((Long)this.L.toJavaObject(paramInt + 2)).longValue();
    }
    if (this.L.isNumber(paramInt + 2)) {
      return ()this.L.toNumber(paramInt + 2);
    }

    return 0L;
  }

  public final String Bv(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    return this.L.toString(paramInt + 2);
  }

  public final bFB[] Bw(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    int i = paramInt + 2;
    bFB[] arrayOfbFB = new bFB[this.L.objLen(i)];
    for (int j = 0; j < arrayOfbFB.length; j++) {
      this.L.pushNumber(j + 1);
      this.L.getTable(i);
      arrayOfbFB[j] = bFB.b(this.L, -1);
      this.L.pop(1);
    }
    return arrayOfbFB;
  }

  public final String Bx(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (this.L.isObject(paramInt + 2))
      return this.L.toJavaObject(paramInt + 2).toString();
    return this.L.toString(paramInt + 2);
  }

  public final boolean By(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (this.L.isObject(paramInt + 2)) {
      return ((Boolean)this.L.toJavaObject(paramInt + 2)).booleanValue();
    }
    return this.L.toBoolean(paramInt + 2);
  }

  public boolean isTable(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    int i = paramInt + 2;
    return this.L.isTable(i);
  }

  public boolean isNumber(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    int i = paramInt + 2;
    return this.L.isNumber(i);
  }

  public boolean isString(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    int i = paramInt + 2;
    return this.L.isString(i);
  }

  public boolean isBoolean(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    int i = paramInt + 2;
    return this.L.isBoolean(i);
  }

  private void b(bxT parambxT) {
    if ((!bB) && (parambxT == null)) throw new AssertionError();
    if (this.luA == null)
      return;
    if ((this.luy >= this.luA.length - 1) && (cYP())) {
      return;
    }
    bxT localbxT = this.luA[this.luy].bNs();
    if (!localbxT.a(parambxT))
      throw pN("Type de valeur de retour incorrecte :" + localbxT + "attendue: " + parambxT);
  }

  protected final void kl(boolean paramBoolean)
  {
    b(bxT.gjc);
    this.L.pushBoolean(paramBoolean);
    this.luy += 1;
  }

  protected final void Bz(int paramInt) {
    b(bxT.gja);
    this.L.pushNumber(paramInt);
    this.luy += 1;
  }

  protected final void bq(Object paramObject) {
    b(bxT.giX);
    this.L.pushJavaObject(paramObject);
    this.luy += 1;
  }

  protected final void dj(float paramFloat) {
    b(bxT.gjb);
    this.L.pushNumber(paramFloat);
    this.luy += 1;
  }

  protected final void kg(long paramLong) {
    b(bxT.giY);
    this.L.pushObjectValue(Long.valueOf(paramLong));
    this.luy += 1;
  }

  protected final void W(double paramDouble) {
    b(bxT.gjb);
    this.L.pushNumber(paramDouble);
    this.luy += 1;
  }

  protected final void aG(byte[] paramArrayOfByte) {
    b(bxT.giZ);
    this.L.pushString(paramArrayOfByte);
    this.luy += 1;
  }

  protected final void pP(String paramString) {
    b(bxT.giZ);
    this.L.pushString(paramString);
    this.luy += 1;
  }

  protected final void cYR() {
    this.L.pushNil();
    this.luy += 1;
  }

  protected final bXf cYS()
  {
    if ((!bB) && (this.L == null)) throw new AssertionError();
    this.L.getGlobal("script");
    bXf localbXf = (bXf)this.L.toJavaObject(-1);
    this.L.pop(1);
    return localbXf;
  }
}