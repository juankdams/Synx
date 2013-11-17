import java.io.Serializable;

public class boo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private final int id;
  private final String description;

  public boo(int paramInt, String paramString)
  {
    this.id = paramInt;
    this.description = paramString;
  }

  public int id()
  {
    return this.id;
  }

  public String description()
  {
    return this.description;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(60);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("id=").append(this.id).append(',');
    localStringBuilder.append("description=").append(this.description).append(']');
    return localStringBuilder.toString();
  }
}