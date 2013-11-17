public class ckx
{
  private static final String XSI_NIL = "xsi:nil";
  private static final String XSI_TYPE = "xsi:type";

  public static bjf D(K paramK)
  {
    K localK1 = paramK.e("xsi:nil");
    if ((localK1 != null) && (localK1.getBooleanValue())) {
      return kE.aOu;
    }
    K localK2 = paramK.e("xsi:type");
    if (localK2 != null) {
      clq localclq = clq.lr(localK2.getStringValue());
      if (localclq == null) {
        throw new IllegalArgumentException("La réponse contient un type invalide");
      }
      switch (cqc.hZU[localclq.ordinal()]) {
      case 1:
        return E(paramK);
      case 2:
        return F(paramK);
      case 3:
        return H(paramK);
      case 4:
        return ds.e(paramK);
      case 5:
        return dEb.L(paramK);
      case 6:
        return G(paramK);
      }
    }

    throw new IllegalArgumentException("La réponse ne contient pas de type");
  }

  public static CO E(K paramK)
  {
    String str = paramK.getStringValue();
    if (str != null) {
      return lk(str);
    }
    K localK = paramK.b("#text");
    if (localK != null) {
      return lk(localK.getStringValue());
    }
    return null;
  }

  private static CO lk(String paramString) {
    return new CO(Boolean.parseBoolean(paramString));
  }

  public static cQg F(K paramK)
  {
    String str = paramK.getStringValue();
    if (str != null) {
      return ll(str);
    }
    K localK = paramK.b("#text");
    if (localK != null) {
      return ll(localK.getStringValue());
    }
    return null;
  }

  private static cQg ll(String paramString)
  {
    try {
      return new cQg(Integer.parseInt(paramString)); } catch (NumberFormatException localNumberFormatException) {
    }
    return null;
  }

  public static aTk G(K paramK)
  {
    String str = paramK.getStringValue();
    if (str != null) {
      return lm(str);
    }
    K localK = paramK.b("#text");
    if (localK != null) {
      return lm(localK.getStringValue());
    }
    return null;
  }

  private static aTk lm(String paramString)
  {
    try {
      return new aTk(Float.parseFloat(paramString)); } catch (NumberFormatException localNumberFormatException) {
    }
    return null;
  }

  public static Pi H(K paramK)
  {
    String str = paramK.getStringValue();
    if (str != null) {
      return new Pi(str);
    }
    K localK = paramK.b("#text");
    if (localK != null) {
      return new Pi(localK.getStringValue());
    }
    return null;
  }
}