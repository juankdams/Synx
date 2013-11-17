public class Om
{
  private Object aOd;
  private float aOR;
  private float aOS;

  public Om(Object paramObject, float paramFloat1, float paramFloat2)
  {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOd = paramObject;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public float getX()
  {
    return this.aOR;
  }

  public void setX(float paramFloat)
  {
    this.aOR = paramFloat;
  }

  public float getY()
  {
    return this.aOS;
  }

  public void setY(float paramFloat)
  {
    this.aOS = paramFloat;
  }
}