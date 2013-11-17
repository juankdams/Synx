public enum bIY
  implements ccY
{
  public final byte bUy;

  private bIY()
  {
    this.bUy = ((byte)ordinal());
  }

  public static bIY dr(byte paramByte)
  {
    bIY[] arrayOfbIY = values();
    int i = 0; for (int j = arrayOfbIY.length; i < j; i++) {
      bIY localbIY = arrayOfbIY[i];
      if (localbIY.bUy == paramByte) {
        return localbIY;
      }
    }
    return null;
  }

  public String toString()
  {
    return "PetChangeType{idx=" + this.bUy + '}';
  }
}