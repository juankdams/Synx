 enum xp
{
  private String bqa;

  private xp(String arg3)
  {
    Object localObject;
    this.bqa = localObject;
  }

  public String GB() {
    return this.bqa;
  }

  public abstract String getValue();

  public static xp bj(String paramString) {
    for (xp localxp : values())
      if (localxp.GB().equals(paramString))
        return localxp;
    return null;
  }
}