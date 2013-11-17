public class djx
  implements Vj
{
  private Class caa = Enum.class;

  public Enum pl(String paramString) {
    return null;
  }

  public Enum k(Class paramClass, String paramString)
  {
    Enum localEnum = null;
    try {
      localEnum = Enum.valueOf(paramClass, paramString.toUpperCase());
    } catch (IllegalArgumentException localIllegalArgumentException) {
    }
    if (localEnum != null)
      return (Enum)localEnum;
    if (((Enum[])paramClass.getEnumConstants()).length > 0) {
      return ((Enum[])paramClass.getEnumConstants())[0];
    }

    return null;
  }

  public Class WY() {
    return this.caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    paramdeg.al(paramClass);

    Enum localEnum1 = null;
    try {
      localEnum1 = Enum.valueOf(paramClass, paramString.toUpperCase());
    } catch (IllegalArgumentException localIllegalArgumentException) {
    }
    if ((localEnum1 == null) && (((Enum[])paramClass.getEnumConstants()).length > 0)) {
      localEnum1 = ((Enum[])paramClass.getEnumConstants())[0];
    }

    Enum localEnum2 = (Enum)localEnum1;

    return paramClass.getSimpleName() + "." + localEnum2.toString();
  }
}