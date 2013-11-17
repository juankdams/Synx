import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class Jo
  implements Serializable
{
  private static final long serialVersionUID = -2587890625525655916L;
  public static final Jo bTb = new cPN();

  public static final Jo bTc = new bgf();

  public static final Jo bTd = new clZ();

  public static final Jo bTe = new dT();

  public static final Jo bTf = new wa();

  private static final ThreadLocal bTg = new ThreadLocal();

  private boolean bTh = true;

  private boolean bTi = true;

  private boolean bTj = false;

  private boolean bTk = true;

  private String bTl = "[";

  private String bTm = "]";

  private String bTn = "=";

  private boolean bTo = false;

  private boolean bTp = false;

  private String bTq = ",";

  private String bTr = "{";

  private String bTs = ",";

  private boolean bTt = true;

  private String bTu = "}";

  private boolean bTv = true;

  private String bTw = "<null>";

  private String bTx = "<size=";

  private String bTy = ">";

  private String bTz = "<";

  private String bTA = ">";

  static Map Te()
  {
    return (Map)bTg.get();
  }

  static boolean I(Object paramObject)
  {
    Map localMap = Te();
    return (localMap != null) && (localMap.containsKey(paramObject));
  }

  static void J(Object paramObject)
  {
    if (paramObject != null) {
      Map localMap = Te();
      if (localMap == null) {
        bTg.set(new WeakHashMap());
      }
      Te().put(paramObject, null);
    }
  }

  static void K(Object paramObject)
  {
    if (paramObject != null) {
      Map localMap = Te();
      if (localMap != null) {
        localMap.remove(paramObject);
        if (localMap.isEmpty())
          bTg.remove();
      }
    }
  }

  public void a(StringBuffer paramStringBuffer, String paramString)
  {
    b(paramStringBuffer, paramString);
  }

  public void b(StringBuffer paramStringBuffer, String paramString)
  {
    if (paramString != null) {
      int i = paramString.indexOf(this.bTl) + this.bTl.length();
      int j = paramString.lastIndexOf(this.bTm);
      if ((i != j) && (i >= 0) && (j >= 0)) {
        String str = paramString.substring(i, j);
        if (this.bTo) {
          a(paramStringBuffer);
        }
        paramStringBuffer.append(str);
        d(paramStringBuffer);
      }
    }
  }

  public void a(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject != null) {
      c(paramStringBuffer, paramObject);
      d(paramStringBuffer, paramObject);
      b(paramStringBuffer);
      if (this.bTo)
        d(paramStringBuffer);
    }
  }

  public void b(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (!this.bTp) {
      a(paramStringBuffer);
    }
    c(paramStringBuffer);
    K(paramObject);
  }

  protected void a(StringBuffer paramStringBuffer)
  {
    int i = paramStringBuffer.length();
    int j = this.bTq.length();
    if ((i > 0) && (j > 0) && (i >= j)) {
      int k = 1;
      for (int m = 0; m < j; m++) {
        if (paramStringBuffer.charAt(i - 1 - m) != this.bTq.charAt(j - 1 - m)) {
          k = 0;
          break;
        }
      }
      if (k != 0)
        paramStringBuffer.setLength(i - j);
    }
  }

  public void a(StringBuffer paramStringBuffer, String paramString, Object paramObject, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramObject == null) {
      c(paramStringBuffer, paramString);
    }
    else {
      a(paramStringBuffer, paramString, paramObject, a(paramBoolean));
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, Object paramObject, boolean paramBoolean)
  {
    if ((I(paramObject)) && (!(paramObject instanceof Number)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Character)))
    {
      a(paramStringBuffer, paramString, paramObject);
      return;
    }

    J(paramObject);
    try
    {
      if ((paramObject instanceof Collection)) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (Collection)paramObject);
        else {
          c(paramStringBuffer, paramString, ((Collection)paramObject).size());
        }
      }
      else if ((paramObject instanceof Map)) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (Map)paramObject);
        else {
          c(paramStringBuffer, paramString, ((Map)paramObject).size());
        }
      }
      else if ((paramObject instanceof long[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (long[])paramObject);
        else {
          b(paramStringBuffer, paramString, (long[])paramObject);
        }
      }
      else if ((paramObject instanceof int[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (int[])paramObject);
        else {
          b(paramStringBuffer, paramString, (int[])paramObject);
        }
      }
      else if ((paramObject instanceof short[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (short[])paramObject);
        else {
          b(paramStringBuffer, paramString, (short[])paramObject);
        }
      }
      else if ((paramObject instanceof byte[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (byte[])paramObject);
        else {
          b(paramStringBuffer, paramString, (byte[])paramObject);
        }
      }
      else if ((paramObject instanceof char[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (char[])paramObject);
        else {
          b(paramStringBuffer, paramString, (char[])paramObject);
        }
      }
      else if ((paramObject instanceof double[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (double[])paramObject);
        else {
          b(paramStringBuffer, paramString, (double[])paramObject);
        }
      }
      else if ((paramObject instanceof float[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (float[])paramObject);
        else {
          b(paramStringBuffer, paramString, (float[])paramObject);
        }
      }
      else if ((paramObject instanceof boolean[])) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (boolean[])paramObject);
        else {
          b(paramStringBuffer, paramString, (boolean[])paramObject);
        }
      }
      else if (paramObject.getClass().isArray()) {
        if (paramBoolean)
          a(paramStringBuffer, paramString, (Object[])paramObject);
        else {
          b(paramStringBuffer, paramString, (Object[])paramObject);
        }

      }
      else if (paramBoolean)
        b(paramStringBuffer, paramString, paramObject);
      else
        c(paramStringBuffer, paramString, paramObject);
    }
    finally
    {
      K(paramObject);
    }
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    aqV.e(paramStringBuffer, paramObject);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    paramStringBuffer.append(paramObject);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, Collection paramCollection)
  {
    paramStringBuffer.append(paramCollection);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, Map paramMap)
  {
    paramStringBuffer.append(paramMap);
  }

  protected void c(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    paramStringBuffer.append(this.bTz);
    paramStringBuffer.append(j(paramObject.getClass()));
    paramStringBuffer.append(this.bTA);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, long paramLong)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramLong);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, long paramLong)
  {
    paramStringBuffer.append(paramLong);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramInt);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    paramStringBuffer.append(paramInt);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, short paramShort)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramShort);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, short paramShort)
  {
    paramStringBuffer.append(paramShort);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, byte paramByte)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramByte);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, byte paramByte)
  {
    paramStringBuffer.append(paramByte);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, char paramChar)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramChar);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, char paramChar)
  {
    paramStringBuffer.append(paramChar);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, double paramDouble)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramDouble);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, double paramDouble)
  {
    paramStringBuffer.append(paramDouble);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, float paramFloat)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramFloat);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, float paramFloat)
  {
    paramStringBuffer.append(paramFloat);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);
    b(paramStringBuffer, paramString, paramBoolean);
    e(paramStringBuffer, paramString);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, boolean paramBoolean)
  {
    paramStringBuffer.append(paramBoolean);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfObject == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfObject);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfObject);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      Object localObject = paramArrayOfObject[i];
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      if (localObject == null) {
        c(paramStringBuffer, paramString);
      }
      else {
        a(paramStringBuffer, paramString, localObject, this.bTt);
      }
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void d(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    paramStringBuffer.append(this.bTr);
    int i = Array.getLength(paramObject);
    for (int j = 0; j < i; j++) {
      Object localObject = Array.get(paramObject, j);
      if (j > 0) {
        paramStringBuffer.append(this.bTs);
      }
      if (localObject == null) {
        c(paramStringBuffer, paramString);
      }
      else {
        a(paramStringBuffer, paramString, localObject, this.bTt);
      }
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject)
  {
    c(paramStringBuffer, paramString, paramArrayOfObject.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfLong == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfLong);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfLong);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfLong[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong)
  {
    c(paramStringBuffer, paramString, paramArrayOfLong.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfInt == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfInt);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfInt);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfInt[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt)
  {
    c(paramStringBuffer, paramString, paramArrayOfInt.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfShort == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfShort);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfShort);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfShort[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort)
  {
    c(paramStringBuffer, paramString, paramArrayOfShort.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfByte == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfByte);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfByte);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfByte[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte)
  {
    c(paramStringBuffer, paramString, paramArrayOfByte.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfChar == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfChar);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfChar);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfChar[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar)
  {
    c(paramStringBuffer, paramString, paramArrayOfChar.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfDouble == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfDouble);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfDouble);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfDouble[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble)
  {
    c(paramStringBuffer, paramString, paramArrayOfDouble.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfFloat == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfFloat);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfFloat);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfFloat[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat)
  {
    c(paramStringBuffer, paramString, paramArrayOfFloat.length);
  }

  public void a(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean, Boolean paramBoolean)
  {
    d(paramStringBuffer, paramString);

    if (paramArrayOfBoolean == null) {
      c(paramStringBuffer, paramString);
    }
    else if (a(paramBoolean)) {
      a(paramStringBuffer, paramString, paramArrayOfBoolean);
    }
    else {
      b(paramStringBuffer, paramString, paramArrayOfBoolean);
    }

    e(paramStringBuffer, paramString);
  }

  protected void a(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean)
  {
    paramStringBuffer.append(this.bTr);
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      if (i > 0) {
        paramStringBuffer.append(this.bTs);
      }
      b(paramStringBuffer, paramString, paramArrayOfBoolean[i]);
    }
    paramStringBuffer.append(this.bTu);
  }

  protected void b(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean)
  {
    c(paramStringBuffer, paramString, paramArrayOfBoolean.length);
  }

  protected void c(StringBuffer paramStringBuffer, Object paramObject)
  {
    if ((this.bTi) && (paramObject != null)) {
      J(paramObject);
      if (this.bTj)
        paramStringBuffer.append(j(paramObject.getClass()));
      else
        paramStringBuffer.append(paramObject.getClass().getName());
    }
  }

  protected void d(StringBuffer paramStringBuffer, Object paramObject)
  {
    if ((Th()) && (paramObject != null)) {
      J(paramObject);
      paramStringBuffer.append('@');
      paramStringBuffer.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }

  protected void b(StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(this.bTl);
  }

  protected void c(StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(this.bTm);
  }

  protected void c(StringBuffer paramStringBuffer, String paramString)
  {
    paramStringBuffer.append(this.bTw);
  }

  protected void d(StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(this.bTq);
  }

  protected void d(StringBuffer paramStringBuffer, String paramString)
  {
    if ((this.bTh) && (paramString != null)) {
      paramStringBuffer.append(paramString);
      paramStringBuffer.append(this.bTn);
    }
  }

  protected void e(StringBuffer paramStringBuffer, String paramString)
  {
    d(paramStringBuffer);
  }

  protected void c(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    paramStringBuffer.append(this.bTx);
    paramStringBuffer.append(paramInt);
    paramStringBuffer.append(this.bTy);
  }

  protected boolean a(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return this.bTv;
    }
    return paramBoolean.booleanValue();
  }

  protected String j(Class paramClass)
  {
    return ctC.j(paramClass);
  }

  protected boolean Tf()
  {
    return this.bTi;
  }

  protected void aK(boolean paramBoolean)
  {
    this.bTi = paramBoolean;
  }

  protected boolean Tg()
  {
    return this.bTj;
  }

  protected void aL(boolean paramBoolean)
  {
    this.bTj = paramBoolean;
  }

  protected boolean Th()
  {
    return this.bTk;
  }

  protected void aM(boolean paramBoolean)
  {
    this.bTk = paramBoolean;
  }

  protected boolean Ti()
  {
    return this.bTh;
  }

  protected void aN(boolean paramBoolean)
  {
    this.bTh = paramBoolean;
  }

  protected boolean Tj()
  {
    return this.bTv;
  }

  protected void aO(boolean paramBoolean)
  {
    this.bTv = paramBoolean;
  }

  protected boolean Tk()
  {
    return this.bTt;
  }

  protected void aP(boolean paramBoolean)
  {
    this.bTt = paramBoolean;
  }

  protected String Tl()
  {
    return this.bTr;
  }

  protected void ci(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTr = paramString;
  }

  protected String Tm()
  {
    return this.bTu;
  }

  protected void cj(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTu = paramString;
  }

  protected String Tn()
  {
    return this.bTs;
  }

  protected void ck(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTs = paramString;
  }

  protected String To()
  {
    return this.bTl;
  }

  protected void cl(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTl = paramString;
  }

  protected String Tp()
  {
    return this.bTm;
  }

  protected void cm(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTm = paramString;
  }

  protected String Tq()
  {
    return this.bTn;
  }

  protected void cn(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTn = paramString;
  }

  protected String Tr()
  {
    return this.bTq;
  }

  protected void co(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTq = paramString;
  }

  protected boolean Ts()
  {
    return this.bTo;
  }

  protected void aQ(boolean paramBoolean)
  {
    this.bTo = paramBoolean;
  }

  protected boolean Tt()
  {
    return this.bTp;
  }

  protected void aR(boolean paramBoolean)
  {
    this.bTp = paramBoolean;
  }

  protected String Tu()
  {
    return this.bTw;
  }

  protected void cp(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTw = paramString;
  }

  protected String Tv()
  {
    return this.bTx;
  }

  protected void cq(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTx = paramString;
  }

  protected String Tw()
  {
    return this.bTy;
  }

  protected void cr(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTy = paramString;
  }

  protected String Tx()
  {
    return this.bTz;
  }

  protected void cs(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTz = paramString;
  }

  protected String Ty()
  {
    return this.bTA;
  }

  protected void ct(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.bTA = paramString;
  }
}