import java.io.Serializable;

public abstract class acA
  implements Serializable, Cloneable
{
  public static final long serialVersionUID = 1020L;

  public Object clone()
  {
    try
    {
      return super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new InternalError();
  }
}