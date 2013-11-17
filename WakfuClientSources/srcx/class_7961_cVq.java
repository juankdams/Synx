import java.util.Locale;

public class cVq
{
  private String name;
  private String description;
  private boolean optional = false;
  private boolean kHS = false;

  public void setName(String paramString)
  {
    if (!dnE.kb(paramString)) {
      throw new cJ("Illegal name [" + paramString + "] for macro element");
    }

    this.name = paramString.toLowerCase(Locale.ENGLISH);
  }

  public String getName()
  {
    return this.name;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void iJ(boolean paramBoolean)
  {
    this.optional = paramBoolean;
  }

  public boolean cdt()
  {
    return this.optional;
  }

  public void iK(boolean paramBoolean)
  {
    this.kHS = paramBoolean;
  }

  public boolean cKd()
  {
    return this.kHS;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject == null) || (!paramObject.getClass().equals(getClass()))) {
      return false;
    }
    cVq localcVq = (cVq)paramObject;
    return (this.name == null ? localcVq.name == null : this.name.equals(localcVq.name)) && (this.optional == localcVq.optional) && (this.kHS == localcVq.kHS);
  }

  public int hashCode()
  {
    return dnE.bo(this.name) + (this.optional ? 1 : 0) + (this.kHS ? 1 : 0);
  }
}