import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dCb extends bVf
  implements bZc
{
  protected static final Logger K = Logger.getLogger(dCb.class);
  public static final short lKw = 6;
  private boolean dBi = false;
  protected boolean lKx = false;
  protected ArrayList lKy = new ArrayList();

  public dCb()
  {
  }

  public dCb(long paramLong)
  {
    super(paramLong);
  }

  public dCb(long paramLong, float paramFloat1, float paramFloat2) {
    super(paramLong, paramFloat1, paramFloat2);
  }

  public dCb(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3) {
    super(paramLong, paramFloat1, paramFloat2, paramFloat3);
  }

  public void ax(short paramShort)
  {
    this.dcA = paramShort;
  }

  public boolean isSelected() {
    return this.dBi;
  }

  public void setSelected(boolean paramBoolean)
  {
    if (paramBoolean != this.dBi) {
      this.dBi = paramBoolean;
      this.lKx = true;
    }
  }

  public boolean apP() {
    return true;
  }

  public void a(buF parambuF)
  {
    if (!this.lKy.contains(parambuF))
      this.lKy.add(parambuF);
  }

  public void b(buF parambuF)
  {
    this.lKy.remove(parambuF);
  }

  public void deU()
  {
    this.lKy.clear();
  }

  public boolean b(adG paramadG, int paramInt)
  {
    boolean bool = super.b(paramadG, paramInt);

    if (this.lKx)
      deV();
    return bool;
  }

  public void a(cXf paramcXf, int paramInt)
  {
    super.a(paramcXf, paramInt);

    if (this.lKx)
      deV();
  }

  private void deV() {
    for (buF localbuF : this.lKy) {
      localbuF.a(this, isSelected());
    }
    this.lKx = false;
  }

  public int fd() {
    return -1;
  }

  public bNa ff() {
    return bNa.gRx;
  }

  public String fe() {
    return "";
  }
}