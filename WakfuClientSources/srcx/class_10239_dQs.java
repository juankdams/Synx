import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class dQs
{
  private final ArrayList mkN;

  public dQs()
  {
    this.mkN = new ArrayList();
  }

  public dQs(us paramus)
  {
    this();
    if (paramus.Dn() != '[') {
      throw paramus.aL("A JSONArray text must start with '['");
    }
    if (paramus.Dn() != ']') {
      paramus.back();
      while (true) {
        if (paramus.Dn() == ',') {
          paramus.back();
          this.mkN.add(aoF.dtY);
        } else {
          paramus.back();
          this.mkN.add(paramus.Do());
        }
        switch (paramus.Dn()) {
        case ',':
        case ';':
          if (paramus.Dn() == ']') {
            return;
          }
          paramus.back();
        case ']':
        }
      }
      return;

      throw paramus.aL("Expected a ',' or ']'");
    }
  }

  public dQs(String paramString)
  {
    this(new us(paramString));
  }

  public dQs(Collection paramCollection)
  {
    this.mkN = new ArrayList();
    if (paramCollection != null) {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
        this.mkN.add(aoF.Z(localIterator.next()));
    }
  }

  public dQs(Object paramObject)
  {
    this();
    if (paramObject.getClass().isArray()) {
      int i = Array.getLength(paramObject);
      for (int j = 0; j < i; j++)
        bB(aoF.Z(Array.get(paramObject, j)));
    }
    else {
      throw new dbt("JSONArray initial value should be a string or collection or array.");
    }
  }

  public Object get(int paramInt)
  {
    Object localObject = Dt(paramInt);
    if (localObject == null) {
      throw new dbt("JSONArray[" + paramInt + "] not found.");
    }
    return localObject;
  }

  public boolean getBoolean(int paramInt)
  {
    Object localObject = get(paramInt);
    if ((localObject.equals(Boolean.FALSE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("false"))))
    {
      return false;
    }if ((localObject.equals(Boolean.TRUE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("true"))))
    {
      return true;
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a boolean.");
  }

  public double getDouble(int paramInt)
  {
    Object localObject = get(paramInt);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).doubleValue() : Double.parseDouble((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a number.");
  }

  public int getInt(int paramInt)
  {
    Object localObject = get(paramInt);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).intValue() : Integer.parseInt((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a number.");
  }

  public dQs Dr(int paramInt)
  {
    Object localObject = get(paramInt);
    if ((localObject instanceof dQs)) {
      return (dQs)localObject;
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a JSONArray.");
  }

  public aoF Ds(int paramInt)
  {
    Object localObject = get(paramInt);
    if ((localObject instanceof aoF)) {
      return (aoF)localObject;
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a JSONObject.");
  }

  public long getLong(int paramInt)
  {
    Object localObject = get(paramInt);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).longValue() : Long.parseLong((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONArray[" + paramInt + "] is not a number.");
  }

  public String getString(int paramInt)
  {
    Object localObject = get(paramInt);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    throw new dbt("JSONArray[" + paramInt + "] not a string.");
  }

  public boolean isNull(int paramInt)
  {
    return aoF.dtY.equals(Dt(paramInt));
  }

  public String rM(String paramString)
  {
    int i = length();
    StringBuffer localStringBuffer = new StringBuffer();

    for (int j = 0; j < i; j++) {
      if (j > 0) {
        localStringBuffer.append(paramString);
      }
      localStringBuffer.append(aoF.valueToString(this.mkN.get(j)));
    }
    return localStringBuffer.toString();
  }

  public int length()
  {
    return this.mkN.size();
  }

  public Object Dt(int paramInt)
  {
    return (paramInt < 0) || (paramInt >= length()) ? null : this.mkN.get(paramInt);
  }

  public boolean Du(int paramInt)
  {
    return L(paramInt, false);
  }

  public boolean L(int paramInt, boolean paramBoolean)
  {
    try
    {
      return getBoolean(paramInt); } catch (Exception localException) {
    }
    return paramBoolean;
  }

  public double Dv(int paramInt)
  {
    return d(paramInt, (0.0D / 0.0D));
  }

  public double d(int paramInt, double paramDouble)
  {
    try
    {
      return getDouble(paramInt); } catch (Exception localException) {
    }
    return paramDouble;
  }

  public int Dw(int paramInt)
  {
    return fp(paramInt, 0);
  }

  public int fp(int paramInt1, int paramInt2)
  {
    try
    {
      return getInt(paramInt1); } catch (Exception localException) {
    }
    return paramInt2;
  }

  public dQs Dx(int paramInt)
  {
    Object localObject = Dt(paramInt);
    return (localObject instanceof dQs) ? (dQs)localObject : null;
  }

  public aoF Dy(int paramInt)
  {
    Object localObject = Dt(paramInt);
    return (localObject instanceof aoF) ? (aoF)localObject : null;
  }

  public long Dz(int paramInt)
  {
    return F(paramInt, 0L);
  }

  public long F(int paramInt, long paramLong)
  {
    try
    {
      return getLong(paramInt); } catch (Exception localException) {
    }
    return paramLong;
  }

  public String DA(int paramInt)
  {
    return i(paramInt, "");
  }

  public String i(int paramInt, String paramString)
  {
    Object localObject = Dt(paramInt);
    return aoF.dtY.equals(localObject) ? paramString : localObject.toString();
  }

  public dQs ll(boolean paramBoolean)
  {
    bB(paramBoolean ? Boolean.TRUE : Boolean.FALSE);
    return this;
  }

  public dQs z(Collection paramCollection)
  {
    bB(new dQs(paramCollection));
    return this;
  }

  public dQs X(double paramDouble)
  {
    Double localDouble = new Double(paramDouble);
    aoF.Y(localDouble);
    bB(localDouble);
    return this;
  }

  public dQs DB(int paramInt)
  {
    bB(new Integer(paramInt));
    return this;
  }

  public dQs kS(long paramLong)
  {
    bB(new Long(paramLong));
    return this;
  }

  public dQs w(Map paramMap)
  {
    bB(new aoF(paramMap));
    return this;
  }

  public dQs bB(Object paramObject)
  {
    this.mkN.add(paramObject);
    return this;
  }

  public dQs M(int paramInt, boolean paramBoolean)
  {
    j(paramInt, paramBoolean ? Boolean.TRUE : Boolean.FALSE);
    return this;
  }

  public dQs d(int paramInt, Collection paramCollection)
  {
    j(paramInt, new dQs(paramCollection));
    return this;
  }

  public dQs e(int paramInt, double paramDouble)
  {
    j(paramInt, new Double(paramDouble));
    return this;
  }

  public dQs fq(int paramInt1, int paramInt2)
  {
    j(paramInt1, new Integer(paramInt2));
    return this;
  }

  public dQs G(int paramInt, long paramLong)
  {
    j(paramInt, new Long(paramLong));
    return this;
  }

  public dQs a(int paramInt, Map paramMap)
  {
    j(paramInt, new aoF(paramMap));
    return this;
  }

  public dQs j(int paramInt, Object paramObject)
  {
    aoF.Y(paramObject);
    if (paramInt < 0) {
      throw new dbt("JSONArray[" + paramInt + "] not found.");
    }
    if (paramInt < length()) {
      this.mkN.set(paramInt, paramObject);
    } else {
      while (paramInt != length()) {
        bB(aoF.dtY);
      }
      bB(paramObject);
    }
    return this;
  }

  public Object remove(int paramInt)
  {
    Object localObject = Dt(paramInt);
    this.mkN.remove(paramInt);
    return localObject;
  }

  public aoF d(dQs paramdQs)
  {
    if ((paramdQs == null) || (paramdQs.length() == 0) || (length() == 0)) {
      return null;
    }
    aoF localaoF = new aoF();
    for (int i = 0; i < paramdQs.length(); i++) {
      localaoF.o(paramdQs.getString(i), Dt(i));
    }
    return localaoF;
  }

  public String toString()
  {
    try
    {
      return '[' + rM(",") + ']'; } catch (Exception localException) {
    }
    return null;
  }

  public String toString(int paramInt)
  {
    StringWriter localStringWriter = new StringWriter();
    synchronized (localStringWriter.getBuffer()) {
      return a(localStringWriter, paramInt, 0).toString();
    }
  }

  public Writer b(Writer paramWriter)
  {
    return a(paramWriter, 0, 0);
  }

  Writer a(Writer paramWriter, int paramInt1, int paramInt2)
  {
    try
    {
      int i = 0;
      int j = length();
      paramWriter.write(91);

      if (j == 1) {
        aoF.a(paramWriter, this.mkN.get(0), paramInt1, paramInt2);
      }
      else if (j != 0) {
        int k = paramInt2 + paramInt1;

        for (int m = 0; m < j; m++) {
          if (i != 0) {
            paramWriter.write(44);
          }
          if (paramInt1 > 0) {
            paramWriter.write(10);
          }
          aoF.a(paramWriter, k);
          aoF.a(paramWriter, this.mkN.get(m), paramInt1, k);

          i = 1;
        }
        if (paramInt1 > 0) {
          paramWriter.write(10);
        }
        aoF.a(paramWriter, paramInt2);
      }
      paramWriter.write(93);
      return paramWriter;
    } catch (IOException localIOException) {
      throw new dbt(localIOException);
    }
  }
}