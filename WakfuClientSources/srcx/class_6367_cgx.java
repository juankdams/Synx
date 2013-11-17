final class cgx
  implements cSv
{
  private int cJZ = 0;

  private cgx(cLO paramcLO) {  } 
  public int akt() { return this.cJZ; }

  public final boolean a(byte paramByte, float paramFloat)
  {
    this.cJZ += (this.gzc.dVV.bx(paramByte) ^ asd.aA(paramFloat));
    return true;
  }
}