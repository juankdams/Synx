final class ddY
  implements nf
{
  private final rU kXZ;

  ddY(rU paramrU)
  {
    this.kXZ = paramrU;
  }

  public final boolean c(byte paramByte1, byte paramByte2) {
    int i = this.kXZ.j(paramByte1);
    if ((i >= 0) && (g(paramByte2, this.kXZ.A(paramByte1)))) {
      return true;
    }
    return false;
  }

  private final boolean g(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
}