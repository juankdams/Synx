public class dVB extends Number
  implements DQ, Comparable
{
  private static final long serialVersionUID = 512176391864L;
  private int value;

  public dVB()
  {
  }

  public dVB(int paramInt)
  {
    this.value = paramInt;
  }

  public dVB(Number paramNumber)
  {
    this.value = paramNumber.intValue();
  }

  public dVB(String paramString)
  {
    this.value = Integer.parseInt(paramString);
  }

  public Integer dvs()
  {
    return Integer.valueOf(this.value);
  }

  public void setValue(int paramInt)
  {
    this.value = paramInt;
  }

  public void c(Number paramNumber)
  {
    this.value = paramNumber.intValue();
  }

  public void dvt()
  {
    this.value += 1;
  }

  public void dvu()
  {
    this.value -= 1;
  }

  public void add(int paramInt)
  {
    this.value += paramInt;
  }

  public void d(Number paramNumber)
  {
    this.value += paramNumber.intValue();
  }

  public void Ek(int paramInt)
  {
    this.value -= paramInt;
  }

  public void e(Number paramNumber)
  {
    this.value -= paramNumber.intValue();
  }

  public int intValue()
  {
    return this.value;
  }

  public long longValue()
  {
    return this.value;
  }

  public float floatValue()
  {
    return this.value;
  }

  public double doubleValue()
  {
    return this.value;
  }

  public Integer toInteger()
  {
    return Integer.valueOf(intValue());
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof dVB)) {
      return this.value == ((dVB)paramObject).intValue();
    }
    return false;
  }

  public int hashCode()
  {
    return this.value;
  }

  public int a(dVB paramdVB)
  {
    int i = paramdVB.value;
    return this.value == i ? 0 : this.value < i ? -1 : 1;
  }

  public String toString()
  {
    return String.valueOf(this.value);
  }
}