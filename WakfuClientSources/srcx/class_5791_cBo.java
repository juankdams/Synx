public enum cBo
{
  public static cBo mD(String paramString)
  {
    cBo[] arrayOfcBo1 = values();

    for (cBo localcBo : arrayOfcBo1) {
      if (localcBo.name().equals(paramString.toUpperCase())) {
        return localcBo;
      }
    }

    return arrayOfcBo1[0];
  }
}