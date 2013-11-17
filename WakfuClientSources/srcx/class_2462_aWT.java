public abstract class aWT
{
  private int aw;
  private Object fcn;

  protected aWT()
  {
  }

  public aWT(int paramInt, Object paramObject, avY paramavY)
  {
    this.aw = paramInt;
    this.fcn = paramObject;
    paramavY.a(this);
  }

  public int getId() {
    return this.aw;
  }

  public Object getObject() {
    return this.fcn;
  }

  public abstract String pm();
}