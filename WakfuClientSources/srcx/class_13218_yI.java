final class yI
  implements eH
{
  private final bEw bsm;

  yI(bEw parambEw)
  {
    this.bsm = parambEw;
  }

  public final boolean a(Object paramObject, byte paramByte) {
    int i = this.bsm.index(paramObject);
    if ((i >= 0) && (g(paramByte, this.bsm.aH(paramObject)))) {
      return true;
    }
    return false;
  }

  private final boolean g(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
}