public class cxK
{
  private String ilF;
  private FF aIn;

  public cxK()
  {
  }

  public cxK(String paramString)
  {
    my(paramString);
  }

  public cxK(FF paramFF, String paramString)
  {
    my(paramString);
    b(paramFF);
  }

  public void my(String paramString)
  {
    this.ilF = paramString;
  }

  public String cuW()
  {
    return this.ilF;
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public Object V(FF paramFF)
  {
    if (this.ilF == null) {
      throw new cJ("No reference specified");
    }

    Object localObject = this.aIn == null ? paramFF.bR(this.ilF) : this.aIn.bR(this.ilF);
    if (localObject == null) {
      throw new cJ("Reference " + this.ilF + " not found.");
    }
    return localObject;
  }

  public Object cuX()
  {
    if (this.aIn == null) {
      throw new cJ("No project set on reference to " + this.ilF);
    }
    return V(this.aIn);
  }
}