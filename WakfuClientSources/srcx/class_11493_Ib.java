public class Ib
{
  private dDq bQC;
  private int hY;
  private int hZ;

  public Ib(dDq paramdDq, int paramInt1, int paramInt2)
  {
    this.bQC = paramdDq;
    this.hY = paramInt1;
    this.hZ = paramInt2;
  }

  public dDq getPixmap() {
    return this.bQC;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int getWidth() {
    return this.bQC.getWidth();
  }

  public int getHeight() {
    return this.bQC.getHeight();
  }
}