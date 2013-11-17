import java.io.Serializable;

public final class Fr
  implements cSc, Serializable
{
  private static final long serialVersionUID = -6682656911025165584L;
  private final Class bMH;

  public static cSc e(Class paramClass)
  {
    if (paramClass == null) {
      throw new IllegalArgumentException("The type to check instanceof must not be null");
    }
    return new Fr(paramClass);
  }

  public Fr(Class paramClass)
  {
    this.bMH = paramClass;
  }

  public boolean evaluate(Object paramObject)
  {
    return this.bMH.isInstance(paramObject);
  }

  public Class getType()
  {
    return this.bMH;
  }
}