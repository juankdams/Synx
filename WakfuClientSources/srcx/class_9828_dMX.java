import java.net.URL;

public class dMX extends ig
{
  private final cSR mdE = new cSR();
  private bkm mdF = null;
  private boolean mdG = true;

  public dMX(dQx paramdQx) {
    super(dnt.lnv, paramdQx);
  }

  public boolean dpI() {
    return this.mdG;
  }

  public bkm dpJ() {
    return this.mdF;
  }

  public URL Da(int paramInt)
  {
    return (URL)this.mdE.get(paramInt);
  }

  public int dpK()
  {
    return this.mdE.size();
  }

  public int[] dpL() {
    return this.mdE.qe();
  }

  void a(URL paramURL, int paramInt)
  {
    this.mdE.put(paramInt, paramURL);
  }

  void a(bkm parambkm) {
    this.mdF = parambkm;
  }

  void kZ(boolean paramBoolean) {
    this.mdG = paramBoolean;
  }
}