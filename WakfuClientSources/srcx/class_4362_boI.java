public class boI extends apX
{
  public static final String fId = "canAddLevel";
  public static final String fIe = "canRemoveLevel";
  public static final String fIf = "xpToAddLevel";
  public static final String fIg = "xpFromRemovingLevel";
  public static final String fIh = "activated";
  static final String[] bwe = { "canAddLevel", "canRemoveLevel", "xpToAddLevel", "xpFromRemovingLevel", "activated" };

  static final String[] bwd = new String[bwe.length + apX.bF.length];

  public String[] getFields()
  {
    return bwd;
  }

  public boI(dSR paramdSR)
  {
    super(paramdSR, (short)0, -1L);
  }

  public Object getFieldValue(String paramString) {
    cjE localcjE = acp.cRI.aoI();
    bTI localbTI = bTI.dx(((dSR)bsL()).bHU());

    if (paramString.equals("canAddLevel")) {
      return Boolean.valueOf(localcjE.g(localbTI, ((dSR)bsL()).getId()));
    }
    if (paramString.equals("canRemoveLevel"))
      return Boolean.valueOf(localcjE.f(localbTI, ((dSR)bsL()).getId()));
    long l;
    lZ locallZ;
    if (paramString.equals("xpToAddLevel")) {
      l = localcjE.a(localbTI, ((dSR)bsL()).getId());
      if (l < 0L)
        return null;
      locallZ = new lZ();
      if (localcjE.g(localbTI, ((dSR)bsL()).getId())) {
        locallZ.am(bNa.gRz.bUW());
      }
      locallZ.a("- " + bU.fH().getString("xpGain", new Object[] { Long.valueOf(l) }));
      return locallZ.tP();
    }
    if (paramString.equals("xpFromRemovingLevel")) {
      l = localcjE.c(localbTI, ((dSR)bsL()).getId());
      if (l < 0L)
        return null;
      locallZ = new lZ();
      if (localcjE.f(localbTI, ((dSR)bsL()).getId())) {
        locallZ.am(bNa.gRz.bUW());
      }
      locallZ.a("+ " + bU.fH().getString("xpGain", new Object[] { Long.valueOf(l) }));
      return locallZ.tP();
    }
    if (paramString.equals("activated")) {
      return Boolean.valueOf(localcjE.h(localbTI, ((dSR)bsL()).getId()));
    }
    return byq().getFieldValue(paramString);
  }

  public apX byq() {
    cjE localcjE = acp.cRI.aoI();
    return localcjE.e(bTI.dx(((dSR)bsL()).bHU()), ((dSR)bsL()).getId());
  }

  public int compareTo(Object paramObject) {
    int i = ((dSR)bsL()).vp();
    if (!(paramObject instanceof boI))
      return 0;
    return i - ((dSR)((boI)paramObject).bsL()).vp();
  }

  static
  {
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(apX.bF, 0, bwd, bwe.length, apX.bF.length);
  }
}