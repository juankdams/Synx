import java.util.Locale;

public class dMS
{
  private String name;
  private boolean optional;
  private boolean eOD;
  private String description;
  private String mdw;

  public void setName(String paramString)
  {
    if (!dnE.kb(paramString)) {
      throw new cJ("Illegal name [" + paramString + "] for attribute");
    }

    this.name = paramString.toLowerCase(Locale.ENGLISH);
  }

  public String getName()
  {
    return this.name;
  }

  public void iJ(boolean paramBoolean)
  {
    this.optional = paramBoolean;
  }

  public boolean dpF()
  {
    return this.optional;
  }

  public void kF(boolean paramBoolean)
  {
    this.eOD = paramBoolean;
  }

  public boolean dpG()
  {
    return this.eOD;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void bK(String paramString)
  {
    this.mdw = paramString;
  }

  public String bFa()
  {
    return this.mdw;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject.getClass() != getClass()) {
      return false;
    }
    dMS localdMS = (dMS)paramObject;
    return (dnE.x(this.name, localdMS.name)) && (this.optional == localdMS.optional) && (this.eOD == localdMS.eOD) && (dnE.x(this.mdw, localdMS.mdw));
  }

  public int hashCode()
  {
    return dnE.bo(this.name);
  }
}