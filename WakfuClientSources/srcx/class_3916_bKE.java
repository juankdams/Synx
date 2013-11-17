import java.util.List;

public class bKE
{
  private int position;
  private int gNy = -1;
  private String prefix = "";
  private String suffix = "";

  bKE(aDr paramaDr, int paramInt)
  {
    this.position = paramInt;
  }

  public int getPosition()
  {
    if (this.gNy == -1) {
      this.gNy = (aDr.c(this.gNz) == null ? 0 : 1);
      for (int i = 0; i < this.position; i++) {
        daB localdaB = (daB)aDr.d(this.gNz).get(i);
        this.gNy += localdaB.bEZ().length;
      }
    }
    return this.gNy;
  }

  public void setPrefix(String paramString)
  {
    this.prefix = (paramString != null ? paramString : "");
  }

  public String getPrefix()
  {
    return this.prefix;
  }

  public void gB(String paramString)
  {
    this.suffix = (paramString != null ? paramString : "");
  }

  public String getSuffix()
  {
    return this.suffix;
  }
}