import com.ankamagames.wakfu.client.binaryStorage.TravelLoadingBinaryData;

public class cwb
{
  protected int aw;
  protected int dah;
  protected int dai;
  protected int daj;
  protected int cPK;
  protected String aRT;
  protected TravelLoadingBinaryData fiG;

  public int getId()
  {
    return this.aw;
  }
  public int arR() {
    return this.dah;
  }
  public int arS() {
    return this.dai;
  }
  public int arT() {
    return this.daj;
  }
  public int anN() {
    return this.cPK;
  }
  public String uL() {
    return this.aRT;
  }
  public TravelLoadingBinaryData bpi() {
    return this.fiG;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dah = parambUT.getInt();
    this.dai = parambUT.getInt();
    this.daj = parambUT.getInt();
    this.cPK = parambUT.getInt();
    this.aRT = parambUT.caP();
    if (parambUT.get() != 0) {
      this.fiG = new TravelLoadingBinaryData();
      this.fiG.a(parambUT);
    } else {
      this.fiG = null;
    }
  }
}