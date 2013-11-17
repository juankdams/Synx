import java.io.Serializable;

public abstract interface KN extends Serializable
{
  public abstract boolean matches(Object paramObject);
}