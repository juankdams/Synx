package Effects;
public abstract class aWT  //class_2462_aWT
{
  private int id;
  private Object obj;

  protected aWT()
  {
  }

  public aWT(int paramInt, Object paramObject, avY paramavY)
  {
    this.id = paramInt;
    this.obj = paramObject;
    paramavY.a(this);
  }

  public int getId() {
    return this.id;
  }

  public Object getObject() {
    return this.obj;
  }

  public abstract String pm();
}