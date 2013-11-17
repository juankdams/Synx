import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

public class aoF
{
  private final Map map;
  public static final Object dtY = new dmu(null);

  public aoF()
  {
    this.map = new HashMap();
  }

  public aoF(aoF paramaoF, String[] paramArrayOfString)
  {
    this();
    for (int i = 0; i < paramArrayOfString.length; i++)
      try {
        p(paramArrayOfString[i], paramaoF.eX(paramArrayOfString[i]));
      }
      catch (Exception localException)
      {
      }
  }

  public aoF(us paramus)
  {
    this();

    if (paramus.Dn() != '{')
      throw paramus.aL("A JSONObject text must begin with '{'");
    while (true)
    {
      int i = paramus.Dn();
      switch (i) {
      case 0:
        throw paramus.aL("A JSONObject text must end with '}'");
      case 125:
        return;
      }
      paramus.back();
      String str = paramus.Do().toString();

      i = paramus.Dn();
      if (i == 61) {
        if (paramus.next() != '>')
          paramus.back();
      }
      else if (i != 58) {
        throw paramus.aL("Expected a ':' after a key");
      }
      p(str, paramus.Do());

      switch (paramus.Dn()) {
      case ',':
      case ';':
        if (paramus.Dn() == '}') {
          return;
        }
        paramus.back();
      case '}':
      }
    }
    return;

    throw paramus.aL("Expected a ',' or '}'");
  }

  public aoF(Map paramMap)
  {
    this.map = new HashMap();
    if (paramMap != null) {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext()) {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object localObject = localEntry.getValue();
        if (localObject != null)
          this.map.put(localEntry.getKey(), Z(localObject));
      }
    }
  }

  public aoF(Object paramObject)
  {
    this();
    X(paramObject);
  }

  public aoF(Object paramObject, String[] paramArrayOfString)
  {
    this();
    Class localClass = paramObject.getClass();
    for (int i = 0; i < paramArrayOfString.length; i++) {
      String str = paramArrayOfString[i];
      try {
        q(str, localClass.getField(str).get(paramObject));
      }
      catch (Exception localException)
      {
      }
    }
  }

  public aoF(String paramString)
  {
    this(new us(paramString));
  }

  public aoF(String paramString, Locale paramLocale)
  {
    this();
    ResourceBundle localResourceBundle = ResourceBundle.getBundle(paramString, paramLocale, Thread.currentThread().getContextClassLoader());

    Enumeration localEnumeration = localResourceBundle.getKeys();
    while (localEnumeration.hasMoreElements()) {
      Object localObject1 = localEnumeration.nextElement();
      if ((localObject1 instanceof String))
      {
        String[] arrayOfString = ((String)localObject1).split("\\.");
        int i = arrayOfString.length - 1;
        Object localObject2 = this;
        for (int j = 0; j < i; j++) {
          String str = arrayOfString[j];
          aoF localaoF = ((aoF)localObject2).fc(str);
          if (localaoF == null) {
            localaoF = new aoF();
            ((aoF)localObject2).o(str, localaoF);
          }
          localObject2 = localaoF;
        }
        ((aoF)localObject2).o(arrayOfString[i], localResourceBundle.getString((String)localObject1));
      }
    }
  }

  public aoF m(String paramString, Object paramObject)
  {
    Y(paramObject);
    Object localObject = eX(paramString);
    if (localObject == null) {
      o(paramString, (paramObject instanceof dQs) ? new dQs().bB(paramObject) : paramObject);
    }
    else if ((localObject instanceof dQs))
      ((dQs)localObject).bB(paramObject);
    else {
      o(paramString, new dQs().bB(localObject).bB(paramObject));
    }
    return this;
  }

  public aoF n(String paramString, Object paramObject)
  {
    Y(paramObject);
    Object localObject = eX(paramString);
    if (localObject == null)
      o(paramString, new dQs().bB(paramObject));
    else if ((localObject instanceof dQs))
      o(paramString, ((dQs)localObject).bB(paramObject));
    else {
      throw new dbt("JSONObject[" + paramString + "] is not a JSONArray.");
    }

    return this;
  }

  public static String g(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      return "null";
    }

    String str = Double.toString(paramDouble);
    if ((str.indexOf('.') > 0) && (str.indexOf('e') < 0) && (str.indexOf('E') < 0))
    {
      while (str.endsWith("0")) {
        str = str.substring(0, str.length() - 1);
      }
      if (str.endsWith(".")) {
        str = str.substring(0, str.length() - 1);
      }
    }
    return str;
  }

  public Object get(String paramString)
  {
    if (paramString == null) {
      throw new dbt("Null key.");
    }
    Object localObject = eX(paramString);
    if (localObject == null) {
      throw new dbt("JSONObject[" + quote(paramString) + "] not found.");
    }

    return localObject;
  }

  public boolean getBoolean(String paramString)
  {
    Object localObject = get(paramString);
    if ((localObject.equals(Boolean.FALSE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("false"))))
    {
      return false;
    }if ((localObject.equals(Boolean.TRUE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("true"))))
    {
      return true;
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not a Boolean.");
  }

  public double getDouble(String paramString)
  {
    Object localObject = get(paramString);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).doubleValue() : Double.parseDouble((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not a number.");
  }

  public int getInt(String paramString)
  {
    Object localObject = get(paramString);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).intValue() : Integer.parseInt((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not an int.");
  }

  public dQs eT(String paramString)
  {
    Object localObject = get(paramString);
    if ((localObject instanceof dQs)) {
      return (dQs)localObject;
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not a JSONArray.");
  }

  public aoF eU(String paramString)
  {
    Object localObject = get(paramString);
    if ((localObject instanceof aoF)) {
      return (aoF)localObject;
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not a JSONObject.");
  }

  public long getLong(String paramString)
  {
    Object localObject = get(paramString);
    try {
      return (localObject instanceof Number) ? ((Number)localObject).longValue() : Long.parseLong((String)localObject);
    }
    catch (Exception localException) {
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] is not a long.");
  }

  public static String[] a(aoF paramaoF)
  {
    int i = paramaoF.length();
    if (i == 0) {
      return null;
    }
    Iterator localIterator = paramaoF.keys();
    String[] arrayOfString = new String[i];
    int j = 0;
    while (localIterator.hasNext()) {
      arrayOfString[j] = ((String)localIterator.next());
      j++;
    }
    return arrayOfString;
  }

  public static String[] W(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Class localClass = paramObject.getClass();
    Field[] arrayOfField = localClass.getFields();
    int i = arrayOfField.length;
    if (i == 0) {
      return null;
    }
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++) {
      arrayOfString[j] = arrayOfField[j].getName();
    }
    return arrayOfString;
  }

  public String getString(String paramString)
  {
    Object localObject = get(paramString);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    throw new dbt("JSONObject[" + quote(paramString) + "] not a string.");
  }

  public boolean has(String paramString)
  {
    return this.map.containsKey(paramString);
  }

  public aoF eV(String paramString)
  {
    Object localObject = eX(paramString);
    if (localObject == null)
      o(paramString, 1);
    else if ((localObject instanceof Integer))
      o(paramString, ((Integer)localObject).intValue() + 1);
    else if ((localObject instanceof Long))
      c(paramString, ((Long)localObject).longValue() + 1L);
    else if ((localObject instanceof Double))
      c(paramString, ((Double)localObject).doubleValue() + 1.0D);
    else if ((localObject instanceof Float))
      c(paramString, ((Float)localObject).floatValue() + 1.0F);
    else {
      throw new dbt("Unable to increment [" + quote(paramString) + "].");
    }
    return this;
  }

  public boolean eW(String paramString)
  {
    return dtY.equals(eX(paramString));
  }

  public Iterator keys()
  {
    return this.map.keySet().iterator();
  }

  public int length()
  {
    return this.map.size();
  }

  public dQs aAW()
  {
    dQs localdQs = new dQs();
    Iterator localIterator = keys();
    while (localIterator.hasNext()) {
      localdQs.bB(localIterator.next());
    }
    return localdQs.length() == 0 ? null : localdQs;
  }

  public static String b(Number paramNumber)
  {
    if (paramNumber == null) {
      throw new dbt("Null pointer");
    }
    Y(paramNumber);

    String str = paramNumber.toString();
    if ((str.indexOf('.') > 0) && (str.indexOf('e') < 0) && (str.indexOf('E') < 0))
    {
      while (str.endsWith("0")) {
        str = str.substring(0, str.length() - 1);
      }
      if (str.endsWith(".")) {
        str = str.substring(0, str.length() - 1);
      }
    }
    return str;
  }

  public Object eX(String paramString)
  {
    return paramString == null ? null : this.map.get(paramString);
  }

  public boolean eY(String paramString)
  {
    return s(paramString, false);
  }

  public boolean s(String paramString, boolean paramBoolean)
  {
    try
    {
      return getBoolean(paramString); } catch (Exception localException) {
    }
    return paramBoolean;
  }

  public double eZ(String paramString)
  {
    return b(paramString, (0.0D / 0.0D));
  }

  public double b(String paramString, double paramDouble)
  {
    try
    {
      return getDouble(paramString); } catch (Exception localException) {
    }
    return paramDouble;
  }

  public int fa(String paramString)
  {
    return n(paramString, 0);
  }

  public int n(String paramString, int paramInt)
  {
    try
    {
      return getInt(paramString); } catch (Exception localException) {
    }
    return paramInt;
  }

  public dQs fb(String paramString)
  {
    Object localObject = eX(paramString);
    return (localObject instanceof dQs) ? (dQs)localObject : null;
  }

  public aoF fc(String paramString)
  {
    Object localObject = eX(paramString);
    return (localObject instanceof aoF) ? (aoF)localObject : null;
  }

  public long fd(String paramString)
  {
    return b(paramString, 0L);
  }

  public long b(String paramString, long paramLong)
  {
    try
    {
      return getLong(paramString); } catch (Exception localException) {
    }
    return paramLong;
  }

  public String fe(String paramString)
  {
    return H(paramString, "");
  }

  public String H(String paramString1, String paramString2)
  {
    Object localObject = eX(paramString1);
    return dtY.equals(localObject) ? paramString2 : localObject.toString();
  }

  private void X(Object paramObject)
  {
    Class localClass = paramObject.getClass();

    int i = localClass.getClassLoader() != null ? 1 : 0;

    Method[] arrayOfMethod = i != 0 ? localClass.getMethods() : localClass.getDeclaredMethods();

    for (int j = 0; j < arrayOfMethod.length; j++)
      try {
        Method localMethod = arrayOfMethod[j];
        if (Modifier.isPublic(localMethod.getModifiers())) {
          String str1 = localMethod.getName();
          String str2 = "";
          if (str1.startsWith("get")) {
            if (("getClass".equals(str1)) || ("getDeclaringClass".equals(str1)))
            {
              str2 = "";
            }
            else str2 = str1.substring(3);
          }
          else if (str1.startsWith("is")) {
            str2 = str1.substring(2);
          }
          if ((str2.length() > 0) && (Character.isUpperCase(str2.charAt(0))) && (localMethod.getParameterTypes().length == 0))
          {
            if (str2.length() == 1)
              str2 = str2.toLowerCase();
            else if (!Character.isUpperCase(str2.charAt(1))) {
              str2 = str2.substring(0, 1).toLowerCase() + str2.substring(1);
            }

            Object localObject = localMethod.invoke(paramObject, (Object[])null);
            if (localObject != null)
              this.map.put(str2, Z(localObject));
          }
        }
      }
      catch (Exception localException)
      {
      }
  }

  public aoF t(String paramString, boolean paramBoolean)
  {
    o(paramString, paramBoolean ? Boolean.TRUE : Boolean.FALSE);
    return this;
  }

  public aoF a(String paramString, Collection paramCollection)
  {
    o(paramString, new dQs(paramCollection));
    return this;
  }

  public aoF c(String paramString, double paramDouble)
  {
    o(paramString, new Double(paramDouble));
    return this;
  }

  public aoF o(String paramString, int paramInt)
  {
    o(paramString, new Integer(paramInt));
    return this;
  }

  public aoF c(String paramString, long paramLong)
  {
    o(paramString, new Long(paramLong));
    return this;
  }

  public aoF a(String paramString, Map paramMap)
  {
    o(paramString, new aoF(paramMap));
    return this;
  }

  public aoF o(String paramString, Object paramObject)
  {
    if (paramString == null) {
      throw new dbt("Null key.");
    }
    if (paramObject != null) {
      Y(paramObject);
      this.map.put(paramString, paramObject);
    } else {
      ff(paramString);
    }
    return this;
  }

  public aoF p(String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null)) {
      if (eX(paramString) != null) {
        throw new dbt("Duplicate key \"" + paramString + "\"");
      }
      o(paramString, paramObject);
    }
    return this;
  }

  public aoF q(String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null)) {
      o(paramString, paramObject);
    }
    return this;
  }

  public static String quote(String paramString)
  {
    StringWriter localStringWriter = new StringWriter();
    synchronized (localStringWriter.getBuffer()) {
      try {
        return a(paramString, localStringWriter).toString();
      }
      catch (IOException localIOException) {
        return "";
      }
    }
  }

  public static Writer a(String paramString, Writer paramWriter) {
    if ((paramString == null) || (paramString.length() == 0)) {
      paramWriter.write("\"\"");
      return paramWriter;
    }

    int j = 0;

    int m = paramString.length();

    paramWriter.write(34);
    for (int k = 0; k < m; k++) {
      int i = j;
      j = paramString.charAt(k);
      switch (j) {
      case 34:
      case 92:
        paramWriter.write(92);
        paramWriter.write(j);
        break;
      case 47:
        if (i == 60) {
          paramWriter.write(92);
        }
        paramWriter.write(j);
        break;
      case 8:
        paramWriter.write("\\b");
        break;
      case 9:
        paramWriter.write("\\t");
        break;
      case 10:
        paramWriter.write("\\n");
        break;
      case 12:
        paramWriter.write("\\f");
        break;
      case 13:
        paramWriter.write("\\r");
        break;
      default:
        if ((j < 32) || ((j >= 128) && (j < 160)) || ((j >= 8192) && (j < 8448)))
        {
          String str = "000" + Integer.toHexString(j);
          paramWriter.write("\\u" + str.substring(str.length() - 4));
        } else {
          paramWriter.write(j);
        }break;
      }
    }
    paramWriter.write(34);
    return paramWriter;
  }

  public Object ff(String paramString)
  {
    return this.map.remove(paramString);
  }

  public static Object stringToValue(String paramString)
  {
    if (paramString.equals("")) {
      return paramString;
    }
    if (paramString.equalsIgnoreCase("true")) {
      return Boolean.TRUE;
    }
    if (paramString.equalsIgnoreCase("false")) {
      return Boolean.FALSE;
    }
    if (paramString.equalsIgnoreCase("null")) {
      return dtY;
    }

    int i = paramString.charAt(0);
    if (((i >= 48) && (i <= 57)) || (i == 46) || (i == 45) || (i == 43))
      try {
        if ((paramString.indexOf('.') > -1) || (paramString.indexOf('e') > -1) || (paramString.indexOf('E') > -1))
        {
          Double localDouble = Double.valueOf(paramString);
          if ((!localDouble.isInfinite()) && (!localDouble.isNaN()))
            return localDouble;
        }
        else {
          Long localLong = new Long(paramString);
          if (localLong.longValue() == localLong.intValue()) {
            return new Integer(localLong.intValue());
          }
          return localLong;
        }
      }
      catch (Exception localException)
      {
      }
    return paramString;
  }

  public static void Y(Object paramObject)
  {
    if (paramObject != null)
      if ((paramObject instanceof Double)) {
        if ((((Double)paramObject).isInfinite()) || (((Double)paramObject).isNaN())) {
          throw new dbt("JSON does not allow non-finite numbers.");
        }
      }
      else if (((paramObject instanceof Float)) && (
        (((Float)paramObject).isInfinite()) || (((Float)paramObject).isNaN())))
        throw new dbt("JSON does not allow non-finite numbers.");
  }

  public dQs c(dQs paramdQs)
  {
    if ((paramdQs == null) || (paramdQs.length() == 0)) {
      return null;
    }
    dQs localdQs = new dQs();
    for (int i = 0; i < paramdQs.length(); i++) {
      localdQs.bB(eX(paramdQs.getString(i)));
    }
    return localdQs;
  }

  public String toString()
  {
    try
    {
      return toString(0); } catch (Exception localException) {
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

  public static String valueToString(Object paramObject)
  {
    if ((paramObject == null) || (paramObject.equals(null))) {
      return "null";
    }
    if ((paramObject instanceof dLZ)) {
      String str;
      try {
        str = ((dLZ)paramObject).dpd();
      } catch (Exception localException) {
        throw new dbt(localException);
      }
      if ((str instanceof String)) {
        return (String)str;
      }
      throw new dbt("Bad value from toJSONString: " + str);
    }
    if ((paramObject instanceof Number)) {
      return b((Number)paramObject);
    }
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof aoF)) || ((paramObject instanceof dQs)))
    {
      return paramObject.toString();
    }
    if ((paramObject instanceof Map)) {
      return new aoF((Map)paramObject).toString();
    }
    if ((paramObject instanceof Collection)) {
      return new dQs((Collection)paramObject).toString();
    }
    if (paramObject.getClass().isArray()) {
      return new dQs(paramObject).toString();
    }
    return quote(paramObject.toString());
  }

  public static Object Z(Object paramObject)
  {
    try
    {
      if (paramObject == null) {
        return dtY;
      }
      if (((paramObject instanceof aoF)) || ((paramObject instanceof dQs)) || (dtY.equals(paramObject)) || ((paramObject instanceof dLZ)) || ((paramObject instanceof Byte)) || ((paramObject instanceof Character)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Float)) || ((paramObject instanceof Double)) || ((paramObject instanceof String)))
      {
        return paramObject;
      }

      if ((paramObject instanceof Collection)) {
        return new dQs((Collection)paramObject);
      }
      if (paramObject.getClass().isArray()) {
        return new dQs(paramObject);
      }
      if ((paramObject instanceof Map)) {
        return new aoF((Map)paramObject);
      }
      Package localPackage = paramObject.getClass().getPackage();
      String str = localPackage != null ? localPackage.getName() : "";

      if ((str.startsWith("java.")) || (str.startsWith("javax.")) || (paramObject.getClass().getClassLoader() == null))
      {
        return paramObject.toString();
      }
      return new aoF(paramObject); } catch (Exception localException) {
    }
    return null;
  }

  public Writer b(Writer paramWriter)
  {
    return a(paramWriter, 0, 0);
  }

  static final Writer a(Writer paramWriter, Object paramObject, int paramInt1, int paramInt2)
  {
    if ((paramObject == null) || (paramObject.equals(null))) {
      paramWriter.write("null");
    } else if ((paramObject instanceof aoF)) {
      ((aoF)paramObject).a(paramWriter, paramInt1, paramInt2);
    } else if ((paramObject instanceof dQs)) {
      ((dQs)paramObject).a(paramWriter, paramInt1, paramInt2);
    } else if ((paramObject instanceof Map)) {
      new aoF((Map)paramObject).a(paramWriter, paramInt1, paramInt2);
    } else if ((paramObject instanceof Collection)) {
      new dQs((Collection)paramObject).a(paramWriter, paramInt1, paramInt2);
    }
    else if (paramObject.getClass().isArray()) {
      new dQs(paramObject).a(paramWriter, paramInt1, paramInt2);
    } else if ((paramObject instanceof Number)) {
      paramWriter.write(b((Number)paramObject));
    } else if ((paramObject instanceof Boolean)) {
      paramWriter.write(paramObject.toString());
    } else if ((paramObject instanceof dLZ)) {
      String str;
      try {
        str = ((dLZ)paramObject).dpd();
      } catch (Exception localException) {
        throw new dbt(localException);
      }
      paramWriter.write(str != null ? str.toString() : quote(paramObject.toString()));
    } else {
      a(paramObject.toString(), paramWriter);
    }
    return paramWriter;
  }

  static final void a(Writer paramWriter, int paramInt) {
    for (int i = 0; i < paramInt; i++)
      paramWriter.write(32);
  }

  Writer a(Writer paramWriter, int paramInt1, int paramInt2)
  {
    try
    {
      int i = 0;
      int j = length();
      Iterator localIterator = keys();
      paramWriter.write(123);

      if (j == 1) {
        Object localObject1 = localIterator.next();
        paramWriter.write(quote(localObject1.toString()));
        paramWriter.write(58);
        if (paramInt1 > 0) {
          paramWriter.write(32);
        }
        a(paramWriter, this.map.get(localObject1), paramInt1, paramInt2);
      } else if (j != 0) {
        int k = paramInt2 + paramInt1;
        while (localIterator.hasNext()) {
          Object localObject2 = localIterator.next();
          if (i != 0) {
            paramWriter.write(44);
          }
          if (paramInt1 > 0) {
            paramWriter.write(10);
          }
          a(paramWriter, k);
          paramWriter.write(quote(localObject2.toString()));
          paramWriter.write(58);
          if (paramInt1 > 0) {
            paramWriter.write(32);
          }
          a(paramWriter, this.map.get(localObject2), paramInt1, k);

          i = 1;
        }
        if (paramInt1 > 0) {
          paramWriter.write(10);
        }
        a(paramWriter, paramInt2);
      }
      paramWriter.write(125);
      return paramWriter;
    } catch (IOException localIOException) {
      throw new dbt(localIOException);
    }
  }
}