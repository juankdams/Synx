import java.util.Iterator;
import java.util.List;

public class dkS
  implements Iterable
{
  private final String name;
  private final String description;
  private final List lir;

  public dkS(String paramString1, String paramString2, List paramList)
  {
    this.name = paramString1;
    this.description = paramString2;
    this.lir = paramList;
  }

  public String getName()
  {
    return this.name;
  }

  public String getDescription()
  {
    return this.description;
  }

  public List cSZ()
  {
    return this.lir;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(60);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("name=").append(this.name).append(',');
    localStringBuilder.append("description=").append(this.description).append(',');
    localStringBuilder.append("devices=").append(this.lir).append(']');
    return localStringBuilder.toString();
  }

  public Iterator iterator()
  {
    return this.lir.iterator();
  }
}