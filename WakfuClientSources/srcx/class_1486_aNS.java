import java.util.ArrayList;

public final class aNS extends csl
{
  private ArrayList dLH = new ArrayList();
  private String dzS;
  private boolean dzT;

  public aNS beS()
  {
    return new aNS();
  }

  public boolean isEnabled() {
    if (!this.dzT)
      return false;
    return super.isEnabled();
  }

  public String getLabel()
  {
    String str1 = super.getLabel();
    lZ locallZ = new lZ().a(str1);
    if (this.dLH.size() > 0) {
      for (String str2 : this.dLH) {
        locallZ.tH().am(ict);
        locallZ.a(str2);
      }
    }
    if ((this.dzS != null) && (this.dzS.length() > 0))
      locallZ.tH().a(this.dzS);
    return locallZ.tP();
  }

  public void gW(String paramString) {
    this.dLH.add(paramString);
  }

  public void fn(String paramString)
  {
    this.dzS = paramString;
  }

  public void cM(boolean paramBoolean) {
    this.dzT = paramBoolean;
  }
}