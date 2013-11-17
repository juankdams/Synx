public enum bqr
  implements ccY
{
  public final byte ewr;

  private bqr(int arg3)
  {
    int j;
    this.ewr = bCO.gn(j);
  }

  public static bqr cZ(byte paramByte) {
    bqr[] arrayOfbqr = values();
    int i = 0; for (int j = arrayOfbqr.length; i < j; i++) {
      bqr localbqr = arrayOfbqr[i];
      if (localbqr.ewr == paramByte) {
        return localbqr;
      }
    }

    throw new bIp("[HAVEN_WORLD] Action " + paramByte + " inconnue");
  }
}