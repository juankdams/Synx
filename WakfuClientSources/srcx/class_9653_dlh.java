import java.util.Collections;
import java.util.List;

public class dlh
{
  private final String name;
  private final String hiB;
  private final List liB;

  public dlh(String paramString1, String paramString2, List paramList)
  {
    this.name = paramString1;
    this.hiB = paramString2;
    this.liB = paramList;
  }

  public final String name()
  {
    return this.name;
  }

  public final String cst()
  {
    return this.hiB;
  }

  public final List cru()
  {
    return Collections.unmodifiableList(this.liB);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("name=").append(this.name).append(',');
    localStringBuilder.append("mrl=").append(this.hiB).append(',');
    localStringBuilder.append("subItems=").append(this.liB).append(']');
    return localStringBuilder.toString();
  }
}