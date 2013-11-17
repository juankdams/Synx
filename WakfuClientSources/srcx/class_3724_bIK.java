public enum bIK
{
  public static byte a(bIK parambIK)
  {
    bIK[] arrayOfbIK = values();
    int j;
    for (int i = 0; i < arrayOfbIK.length; j = (byte)(i + 1)) {
      bIK localbIK = arrayOfbIK[i];
      if (parambIK == localbIK)
        return i;
    }
    return -1;
  }

  public static bIK dq(byte paramByte) {
    if ((paramByte < 0) || (paramByte >= values().length))
      return null;
    return values()[paramByte];
  }
}