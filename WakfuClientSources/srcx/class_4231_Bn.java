import java.util.ArrayList;

public class Bn
{
  private final bdD bxl;
  private final int aw;
  private final qi[] bxm;

  public Bn(bdD parambdD, int paramInt, ArrayList paramArrayList)
  {
    this.bxl = parambdD;
    this.aw = paramInt;
    this.bxm = new qi[paramArrayList.size()];
    for (qi localqi : paramArrayList)
      this.bxm[localqi.xr()] = localqi;
  }

  public bdD Kw()
  {
    return this.bxl;
  }

  public int getId() {
    return this.aw;
  }

  public qi[] Kx() {
    return this.bxm;
  }
}