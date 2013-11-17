public enum duv
{
  public static duv qn(String paramString)
  {
    duv[] arrayOfduv1 = values();

    for (duv localduv : arrayOfduv1) {
      if (localduv.name().equals(paramString.toUpperCase())) {
        return localduv;
      }
    }

    return arrayOfduv1[0];
  }
}