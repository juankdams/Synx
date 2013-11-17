import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.ColorModel;

public class dLS
{
  private int ifi;
  private int kQ;
  private int mcb;
  private String mcc;

  public dLS(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.ifi = paramInt1;
    this.kQ = paramInt2;
    this.mcb = paramInt3;
    this.mcc = paramString;
  }

  public final int getScreenWidth()
  {
    return this.ifi;
  }

  public final void CT(int paramInt)
  {
    this.ifi = paramInt;
  }

  public final int getScreenHeight()
  {
    return this.kQ;
  }

  public final void CU(int paramInt)
  {
    this.kQ = paramInt;
  }

  public final int dpa()
  {
    return this.mcb;
  }

  public final void CV(int paramInt)
  {
    this.mcb = paramInt;
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.ifi).append("x").append(this.kQ);
    if (this.mcb > 0)
      localStringBuffer.append(" (").append(this.mcb).append(")");
    if ((this.mcc != null) && (!this.mcc.equals("")))
      localStringBuffer.append(" (").append(this.mcc).append(")");
    return localStringBuffer.toString();
  }

  public static dLS dpb()
  {
    Toolkit localToolkit = Toolkit.getDefaultToolkit();
    Dimension localDimension = localToolkit.getScreenSize();
    int i = localDimension.width;
    int j = localDimension.height;
    int k = localToolkit.getColorModel().getPixelSize();
    return new dLS(i, j, k, "courante");
  }
}