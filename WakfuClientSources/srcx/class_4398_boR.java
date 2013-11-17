public abstract class boR
{
  public static Enum a(Class paramClass, Enum paramEnum)
  {
    if (!paramClass.isEnum()) {
      return paramEnum;
    }

    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    int i = paramEnum.ordinal();
    return arrayOfEnum[((i + 1) % arrayOfEnum.length)];
  }

  public static Enum b(Class paramClass, Enum paramEnum) {
    if (!paramClass.isEnum()) {
      return paramEnum;
    }

    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    int i = paramEnum.ordinal();
    return arrayOfEnum[((i - 1 + arrayOfEnum.length) % arrayOfEnum.length)];
  }
}