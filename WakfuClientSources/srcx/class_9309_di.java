class di
{
  private final char[] Te;
  private dvm Tf;

  di(char[] paramArrayOfChar)
  {
    this.Te = paramArrayOfChar;
  }

  public synchronized dvm hc()
  {
    if (this.Tf == null) {
      this.Tf = new dvm(this.Te);
    }
    return this.Tf;
  }
}