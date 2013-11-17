class cij
{
  private final bXf boY;
  private final String hGY;
  private final String hGZ;
  private final String hHa;
  private final String gbe;
  private final String hX;

  private cij(cIM paramcIM, bXf parambXf, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.hGZ = paramString1;
    this.hGY = paramString2;
    this.hHa = paramString3;
    this.gbe = paramString4;
    this.boY = parambXf;

    this.hX = (parambXf.getId() + "|" + paramString2 + "|" + paramString1 + "|" + paramString3 + "|" + paramString4);
  }

  public String ckd()
  {
    return this.hGZ;
  }

  public String cke() {
    return this.hGY;
  }

  public String ckf() {
    return this.hHa;
  }

  public String getFunctionName() {
    return this.gbe;
  }

  public bXf ckg() {
    return this.boY;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null)
      return false;
    if (this == paramObject) {
      return true;
    }
    cij localcij = (cij)paramObject;
    return this.hX.equals(localcij.hX);
  }

  public int hashCode()
  {
    return this.hX.hashCode();
  }
}