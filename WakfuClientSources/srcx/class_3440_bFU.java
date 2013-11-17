final class bFU
  implements dRH
{
  private final dtw gBX;

  bFU(dtw paramdtw)
  {
    this.gBX = paramdtw;
  }

  public final boolean d(short paramShort, byte paramByte) {
    int i = this.gBX.dU(paramShort);
    if ((i >= 0) && (g(paramByte, this.gBX.es(paramShort)))) {
      return true;
    }
    return false;
  }

  private final boolean g(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
}