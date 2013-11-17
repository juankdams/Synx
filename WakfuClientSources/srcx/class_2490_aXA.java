import com.ankamagames.framework.graphics.engine.entity.Entity;

public abstract class aXA extends OS
{
  protected dHr[] fcA;

  protected aXA(String paramString)
  {
    super(paramString);
  }

  public final void a(bSr parambSr, Entity paramEntity)
  {
    int i = 0; for (int j = this.fcA.length; i < j; i++)
      this.fcA[i].a(parambSr, paramEntity);
  }

  public final void reset()
  {
    int i = 0; for (int j = this.fcA.length; i < j; i++)
      this.fcA[i].reset();
  }
}