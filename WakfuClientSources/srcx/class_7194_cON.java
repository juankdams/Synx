final class cON
  implements diA
{
  private int cJZ = 0;

  private cON(cyE paramcyE) {  } 
  public int akt() { return this.cJZ; }

  public final boolean a(byte paramByte, short paramShort)
  {
    this.cJZ += (this.cOD.dVV.bx(paramByte) ^ asd.jV(paramShort));
    return true;
  }
}