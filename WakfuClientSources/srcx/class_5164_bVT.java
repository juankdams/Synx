final class bVT
  implements dgE
{
  private int cJZ = 0;

  private bVT(bjI parambjI) {  } 
  public int akt() { return this.cJZ; }

  public final boolean k(int paramInt, byte paramByte)
  {
    this.cJZ += (this.edx.mtX.nR(paramInt) ^ asd.jV(paramByte));
    return true;
  }
}