import org.apache.log4j.Logger;

final class adw
  implements bPA
{
  adw(ctU paramctU)
  {
  }

  public boolean a(int paramInt, int[] paramArrayOfInt)
  {
    for (int k : paramArrayOfInt) {
      dpI localdpI = ciQ.ckL().vt(k);
      if (localdpI != null)
        this.cTF.a(paramInt, localdpI);
      else {
        bCc.ch().error("Problème lors de chargemetn de itemSEt " + this.cTF.nc());
      }
    }
    return true;
  }
}