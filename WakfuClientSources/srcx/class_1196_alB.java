final class alB
  implements dgE
{
  private final bjI dmw;

  alB(bjI parambjI)
  {
    this.dmw = parambjI;
  }

  public final boolean k(int paramInt, byte paramByte) {
    int i = this.dmw.uK(paramInt);
    if ((i >= 0) && (g(paramByte, this.dmw.get(paramInt)))) {
      return true;
    }
    return false;
  }

  private final boolean g(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
}