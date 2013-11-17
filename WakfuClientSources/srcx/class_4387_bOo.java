public enum bOo
{
  private final boolean gTy;

  private bOo(boolean arg3)
  {
    boolean bool;
    this.gTy = bool;
  }

  public boolean bVu() {
    return this.gTy;
  }

  public static bOo ke(String paramString) {
    bOo[] arrayOfbOo1 = values();

    for (bOo localbOo : arrayOfbOo1) {
      if (localbOo.name().equals(paramString.toUpperCase())) {
        return localbOo;
      }
    }

    return arrayOfbOo1[0];
  }

  public static boolean a(bOo parambOo1, bOo parambOo2) {
    return parambOo1.ordinal() % 2 != parambOo2.ordinal() % 2;
  }
}