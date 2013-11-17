public class aPg extends dwE
  implements cjq
{
  private Boolean dGF = null;

  public void setValue(boolean paramBoolean)
  {
    this.dGF = (paramBoolean ? Boolean.TRUE : Boolean.FALSE);
  }

  public boolean gh()
  {
    if (this.dGF == null) {
      throw new cJ("Nothing to test for truth");
    }
    return this.dGF.booleanValue();
  }
}