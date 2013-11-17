import java.util.HashMap;

public class dDA
{
  private HashMap lLJ = new HashMap();

  public HashMap dfp()
  {
    return this.lLJ;
  }

  public void b(axJ paramaxJ)
  {
    this.lLJ.put(paramaxJ.getName(), paramaxJ);
  }

  public void e(Iterable paramIterable)
  {
    for (axJ localaxJ : paramIterable)
      b(localaxJ);
  }

  public boolean c(axJ paramaxJ)
  {
    return this.lLJ.remove(paramaxJ.getName()) != null;
  }

  public boolean qQ(String paramString)
  {
    if (this.lLJ.containsKey(paramString)) {
      this.lLJ.remove(paramString);
      return true;
    }
    return false;
  }

  public axJ qR(String paramString)
  {
    return (axJ)this.lLJ.get(paramString);
  }

  public String dfq()
  {
    StringBuilder localStringBuilder = new StringBuilder("");

    for (axJ localaxJ : dfp().values()) {
      localStringBuilder.append(" +").append(localaxJ.getName()).append(" (");
      if (localaxJ.aJl())
        localStringBuilder.append("onLine");
      else
        localStringBuilder.append("offLine");
      localStringBuilder.append(")\n");
    }

    return localStringBuilder.toString();
  }

  public boolean contains(String paramString)
  {
    return this.lLJ.containsKey(paramString);
  }
}