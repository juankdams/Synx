import java.util.ArrayList;

public class baU extends czv
{
  public static final String TAG = "AnimatedImage";
  private ArrayList aKO = new ArrayList();
  private long fiV = 1000L;
  private int TR;
  private Runnable cdh;
  public static final int fiW = "delay".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      a((aAR)paramaNL);
      return;
    }
    super.a(paramaNL);
  }

  private void a(aAR paramaAR) {
    if (!this.aKO.contains(paramaAR))
      this.aKO.add(paramaAR);
    if (this.aKO.size() == 1)
      setPixmap(paramaAR);
    else if (this.aKO.size() == 2)
      startAnimation();
  }

  private void startAnimation()
  {
    this.cdh = new HX(this);

    dka.cSF().a(this.cdh, this.fiV, -1);
  }

  public void setDelay(long paramLong)
  {
    this.fiV = paramLong;
  }

  public String getTag() {
    return "AnimatedImage";
  }

  public void bc()
  {
    dka.cSF().j(this.cdh);
    this.aKO.clear();
    super.bc();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fiW)
      setDelay(bUD.getLong(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}