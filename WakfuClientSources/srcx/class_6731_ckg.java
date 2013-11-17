final class ckg
  implements cIw
{
  ckg(int paramInt, dSr paramdSr, short paramShort, TY paramTY)
  {
  }

  public boolean R(int paramInt)
  {
    if (paramInt == this.hKT) {
      return true;
    }
    bWG localbWG = this.hKU.bq((short)paramInt);
    if (localbWG == null) {
      return true;
    }
    if (localbWG.nU() >= this.hKV) {
      this.hKW.ahr();
      return false;
    }

    return true;
  }
}