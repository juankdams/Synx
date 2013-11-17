final class aAS
  implements Comparable
{
  private final int cxl;

  private aAS(int paramInt)
  {
    this.cxl = paramInt;
  }

  public int getValue() {
    return this.cxl;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    aAS localaAS = (aAS)paramObject;

    if (this.cxl != localaAS.cxl) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return this.cxl;
  }

  public String toString() {
    if (this.cxl == 0) {
      return "Default";
    }
    return Integer.toString(this.cxl) + " Hz";
  }

  public int a(aAS paramaAS) {
    return this.cxl - paramaAS.cxl;
  }
}