public enum bpg
{
  public abstract GX byH();

  public static bpg iw(String paramString)
  {
    bpg[] arrayOfbpg1 = values();

    for (bpg localbpg : arrayOfbpg1) {
      if (localbpg.name().equals(paramString.toUpperCase())) {
        return localbpg;
      }
    }

    return arrayOfbpg1[0];
  }
}