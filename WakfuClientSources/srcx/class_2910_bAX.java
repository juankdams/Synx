import org.apache.log4j.Logger;

public class bAX extends Number
{
  public static final Logger K = Logger.getLogger(bAX.class);
  private final double grO;
  private final Long grP;

  public bAX(long paramLong, double paramDouble)
  {
    this.grO = paramDouble;
    this.grP = Long.valueOf(paramLong);
  }

  public double bJK() {
    return this.grO;
  }

  public int intValue()
  {
    return this.grP.intValue();
  }

  public long longValue()
  {
    return this.grP.longValue();
  }

  public float floatValue()
  {
    return this.grP.floatValue();
  }

  public double doubleValue()
  {
    return this.grP.doubleValue();
  }

  public String toString()
  {
    return this.grP.toString();
  }

  public int hashCode()
  {
    return this.grP.hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof bAX)) {
      return this.grP == ((bAX)paramObject).grP;
    }
    if ((paramObject instanceof Long)) {
      return this.grP.equals((Long)paramObject);
    }
    return false;
  }
}