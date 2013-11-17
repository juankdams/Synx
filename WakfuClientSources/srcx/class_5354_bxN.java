import java.util.Locale;

public class bxN
{
  private String name;
  private String defaultValue;
  private String description;
  private boolean giS = true;

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

  public void bK(String paramString)
  {
    this.defaultValue = paramString;
  }

  public String bFa()
  {
    return this.defaultValue;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void fx(boolean paramBoolean)
  {
    this.giS = paramBoolean;
  }

  public boolean bFb()
  {
    return this.giS;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject.getClass() != getClass()) {
      return false;
    }
    bxN localbxN = (bxN)paramObject;
    if (this.name == null) {
      if (localbxN.name != null)
        return false;
    }
    else if (!this.name.equals(localbxN.name)) {
      return false;
    }
    if (this.defaultValue == null) {
      if (localbxN.defaultValue != null)
        return false;
    }
    else if (!this.defaultValue.equals(localbxN.defaultValue)) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    return dnE.bo(this.defaultValue) + dnE.bo(this.name);
  }
}