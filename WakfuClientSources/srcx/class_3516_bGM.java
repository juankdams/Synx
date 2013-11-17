import org.apache.log4j.Logger;

class bGM
  implements daG
{
  private final UH gDo;
  private long gDp;

  private bGM(arl paramarl)
  {
    this.gDo = new UH(new bEx(), cAo.cxf());

    this.gDo.a(this);
  }

  public void sO(int paramInt)
  {
    if (this.gDp == 0L) {
      return;
    }

    long l = this.gDp;
    this.gDp = 0L;

    Su localSu = (Su)this.gDq.eu(l);
    if (localSu == null) {
      String str = "[TURNS] Tour expiré pour le fighter #" + l + ", or celui-ci est absent";
      arl.i().warn(str);

      return;
    }

    this.gDq.R(localSu);
  }

  public void aib() {
    this.gDp = 0L;
    this.gDo.aib();
  }

  public void p(int paramInt, long paramLong) {
    this.gDp = paramLong;
    this.gDo.aB(paramInt, 65535);
  }

  public boolean aia() {
    return this.gDo.aia();
  }
}