public class dQQ
{
  private brR mlG;
  private int hY = 0;

  private int ia = 0;

  public brR drQ()
  {
    return this.mlG;
  }

  public void a(brR parambrR)
  {
    this.mlG = parambrR;
  }

  public int getX()
  {
    return this.hY;
  }

  public void setX(int paramInt)
  {
    this.hY = paramInt;
  }

  public int getY()
  {
    if (this.mlG != null) {
      return this.mlG.getY();
    }
    return 0;
  }

  public int getWidth()
  {
    return this.ia;
  }

  public void setWidth(int paramInt)
  {
    this.ia = paramInt;
  }

  public int getHeight()
  {
    if (this.mlG != null) {
      return this.mlG.getHeight();
    }
    return 0;
  }
}