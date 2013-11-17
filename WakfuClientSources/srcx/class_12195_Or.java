import java.awt.Dimension;
import org.apache.log4j.Logger;

public class Or extends Dimension
  implements Cloneable
{
  private static Logger K = Logger.getLogger(Or.class);

  private float cfy = -1.0F;
  private float cfz = -1.0F;

  public Or() {
  }

  public Or(int paramInt1, int paramInt2) {
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public Or(Or paramOr) {
    this.width = paramOr.width;
    this.height = paramOr.height;

    this.cfy = paramOr.cfy;
    this.cfz = paramOr.cfz;
  }

  public Or(float paramFloat1, float paramFloat2) {
    this.cfy = paramFloat1;
    this.cfz = paramFloat2;
  }

  public Or(int paramInt, float paramFloat) {
    this.width = paramInt;
    this.cfz = paramFloat;
  }

  public Or(float paramFloat, int paramInt) {
    this.cfy = paramFloat;
    this.height = paramInt;
  }

  public float aay() {
    return this.cfy;
  }

  public float aaz() {
    return this.cfz;
  }

  public void af(int paramInt1, int paramInt2) {
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public void n(float paramFloat1, float paramFloat2) {
    this.cfz = paramFloat2;
    this.cfy = paramFloat1;
  }

  public void setHeight(int paramInt)
  {
    this.height = paramInt;
  }

  public void U(float paramFloat)
  {
    this.cfz = paramFloat;
  }

  public void setWidth(int paramInt)
  {
    this.width = paramInt;
  }

  public void V(float paramFloat)
  {
    this.cfy = paramFloat;
  }

  public boolean aaA() {
    return (this.cfy != -1.0F) || (this.cfz != -1.0F);
  }

  public boolean a(Or paramOr)
  {
    if (paramOr == null) {
      return false;
    }
    if ((paramOr.height != this.height) || (paramOr.width != this.width) || (paramOr.cfz != this.cfz) || (paramOr.cfy != this.cfy))
    {
      return false;
    }

    return true;
  }

  public Or aaB() {
    Or localOr = new Or(this.width, this.height);
    localOr.U(this.cfz);
    localOr.V(this.cfy);
    return localOr;
  }
}