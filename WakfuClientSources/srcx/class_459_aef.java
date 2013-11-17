import java.io.Serializable;
import java.util.Map.Entry;

public abstract class aef
  implements Serializable, Comparable, Map.Entry
{
  private static final long serialVersionUID = 4954918890077093841L;

  public static aef e(Object paramObject1, Object paramObject2)
  {
    return new blI(paramObject1, paramObject2);
  }

  public abstract Object aqa();

  public abstract Object aqb();

  public final Object getKey()
  {
    return aqa();
  }

  public Object getValue()
  {
    return aqb();
  }

  public int a(aef paramaef)
  {
    return new ON().d(aqa(), paramaef.aqa()).d(aqb(), paramaef.aqb()).aaL();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof Map.Entry)) {
      Map.Entry localEntry = (Map.Entry)paramObject;
      return (aqV.equals(getKey(), localEntry.getKey())) && (aqV.equals(getValue(), localEntry.getValue()));
    }

    return false;
  }

  public int hashCode()
  {
    return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode());
  }

  public String toString()
  {
    return '(' + aqa() + ',' + aqb() + ')';
  }

  public String toString(String paramString)
  {
    return String.format(paramString, new Object[] { aqa(), aqb() });
  }
}