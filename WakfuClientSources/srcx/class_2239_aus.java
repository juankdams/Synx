public class aus extends dwE
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
      throw new cJ("Nothing to test for falsehood");
    }
    return !this.dGF.booleanValue();
  }
}