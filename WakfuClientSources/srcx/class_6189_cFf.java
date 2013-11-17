class cFf
  implements dGy
{
  private final int hY;
  private final int hZ;
  private final short aOl;
  private boolean izg;

  cFf(int paramInt1, int paramInt2, short paramShort)
  {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }

  public boolean b(dWu paramdWu) {
    if ((paramdWu.fa() != this.hY) || (paramdWu.fb() != this.hZ) || (paramdWu.fc() != this.aOl)) {
      return true;
    }
    if (!paramdWu.sO()) {
      return true;
    }

    this.izg = true;
    return false;
  }

  public boolean cAF() {
    return this.izg;
  }

  public String toString()
  {
    return "CheckCellBlockedProcedure{cellBlocked=" + this.izg + '}';
  }
}