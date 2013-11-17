public class crp
  implements Vj
{
  public static final Class caa = Object.class;

  public Object cJ(String paramString) {
    return null;
  }

  public Object b(Class paramClass, String paramString) {
    if ((Boolean.TYPE.equals(paramClass)) || (Boolean.class.equals(paramClass)))
      return Boolean.valueOf(bUD.getBoolean(paramString));
    if ((Integer.TYPE.equals(paramClass)) || (Integer.class.equals(paramClass)))
      return Integer.valueOf(bUD.aR(paramString));
    if ((Long.TYPE.equals(paramClass)) || (Long.class.equals(paramClass)))
      return Long.valueOf(bUD.getLong(paramString));
    if ((Float.TYPE.equals(paramClass)) || (Float.class.equals(paramClass)))
      return Float.valueOf(bUD.getFloat(paramString));
    if ((Double.TYPE.equals(paramClass)) || (Double.class.equals(paramClass)))
      return Double.valueOf(bUD.getDouble(paramString));
    if ((Byte.TYPE.equals(paramClass)) || (Byte.class.equals(paramClass)))
      return Byte.valueOf(bUD.getByte(paramString));
    if ((Short.TYPE.equals(paramClass)) || (Short.class.equals(paramClass))) {
      return Short.valueOf(bUD.getShort(paramString));
    }
    return null;
  }

  public Class WY() {
    return caa;
  }

  public static Class Y(Class paramClass)
  {
    if (paramClass.equals(Boolean.TYPE))
      return Boolean.class;
    if (paramClass.equals(Double.TYPE))
      return Double.class;
    if (paramClass.equals(Float.TYPE))
      return Float.class;
    if (paramClass.equals(Short.TYPE))
      return Short.class;
    if (paramClass.equals(Integer.TYPE))
      return Integer.class;
    if (paramClass.equals(Long.TYPE))
      return Long.class;
    if (paramClass.equals(Character.TYPE))
      return Character.class;
    if (paramClass.equals(Byte.TYPE))
      return Byte.class;
    if (paramClass.equals(Void.TYPE)) {
      return Void.class;
    }
    return null;
  }

  public static Class Z(Class paramClass)
  {
    if (paramClass.equals(Boolean.class))
      return Boolean.TYPE;
    if (paramClass.equals(Double.class))
      return Double.TYPE;
    if (paramClass.equals(Float.class))
      return Float.TYPE;
    if (paramClass.equals(Short.class))
      return Short.TYPE;
    if (paramClass.equals(Integer.class))
      return Integer.TYPE;
    if (paramClass.equals(Long.class))
      return Long.TYPE;
    if (paramClass.equals(Character.class))
      return Character.TYPE;
    if (paramClass.equals(Byte.class))
      return Byte.TYPE;
    if (paramClass.equals(Void.class)) {
      return Void.TYPE;
    }
    return null;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    Object localObject = b(paramClass, paramString);

    if ((localObject instanceof Number)) {
      paramString = "(" + paramClass.getName() + ")" + String.valueOf(localObject);
      if ((paramClass.equals(Float.class)) || (paramClass.equals(Float.TYPE)))
        paramString = paramString + "f";
    }
    else if (paramClass.equals(Character.class)) {
      paramString = "'" + paramString + "'";
    } else if (localObject == null) {
      paramString = "null";
    } else {
      paramString = localObject.toString();
    }

    paramdeg.al(paramClass);

    return paramString;
  }
}