public enum asK
{
  public final byte bUy;

  private asK(int arg3)
  {
    int j;
    this.bUy = ((byte)j);
  }

  public static asK bq(byte paramByte) {
    asK[] arrayOfasK = values();
    for (int i = 0; i < arrayOfasK.length; i++) {
      asK localasK = arrayOfasK[i];
      if (localasK.bUy == paramByte)
        return localasK;
    }
    return null;
  }
}