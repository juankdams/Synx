import java.util.ArrayList;

public final class awv extends csl
{
  private ArrayList dLH = new ArrayList();
  private String dzS;
  private boolean dzT;
  private short dLI;
  private ArrayList dcd;

  public awv aIt()
  {
    return new awv();
  }

  public boolean isEnabled()
  {
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

  public void w(ArrayList paramArrayList) {
    this.dcd = paramArrayList;
  }

  public void aR(short paramShort) {
    this.dLI = paramShort;
  }

  public void fn(String paramString) {
    this.dzS = paramString;
  }

  public void cM(boolean paramBoolean) {
    this.dzT = paramBoolean;
  }

  public void run() {
    if (!pZ()) {
      return;
    }
    if (this.dcd != null) {
      for (int i = 0; i < this.dcd.size(); i++) {
        buS localbuS = (buS)this.dcd.get(i);
        localbuS.execute();
      }
    }

    super.run();
  }

  protected dJO aIu()
  {
    return dJO.eH(this.dLI);
  }
}