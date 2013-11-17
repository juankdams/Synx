import java.net.URL;

public class gQ extends aka
{
  public static final String TAG = "MapNavigator";

  public String getTag()
  {
    return "MapNavigator";
  }

  protected void setMeshCenter()
  {
    ((cJW)this.dkt).a(this.dkp, this.dkq);
  }

  protected void a(String paramString, URL paramURL, K paramK)
  {
  }

  protected void setBaseMapDisplayer()
  {
    ((cJW)this.dkt).setMapDisplayer(new dfz());
  }

  protected void oU()
  {
    super.oU();
    this.dku = true;
  }

  protected void a(atz paramatz, uz paramuz)
  {
    super.a(paramatz, paramuz);
    ((cJW)this.dkt).setPixmap(this.bQC);
  }

  public void setMapRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setMapRect(paramInt1, paramInt2, paramInt3, paramInt4);
    setMeshCenter();
  }

  protected void oV()
  {
    ((cJW)this.dkt).setSize(this.haN.width, this.haN.height);
    super.oV();
  }

  public void aJ()
  {
    super.aJ();

    this.dkt = new cJW();
    ((cJW)this.dkt).aJ();

    ((cJW)this.dkt).setModulationColor(new bNa(bNa.gRx));

    this.djX = false;
  }

  public boolean r(int paramInt)
  {
    super.r(paramInt);

    if (this.dku) {
      axq();
    }

    float f1 = getIsoCenterX();
    float f2 = getIsoCenterY();
    float f3 = getIsoCenterZ();

    float f4 = (f1 - f2) * 86.0F / 2.0F;
    float f5 = -(f1 + f2) * 43.0F / 2.0F + f3 * 10.0F;

    ((cJW)this.dkt).ai(f4, f5);
    return true;
  }
}