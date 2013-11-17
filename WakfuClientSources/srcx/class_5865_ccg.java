import org.apache.log4j.Logger;

public final class ccg extends dQi
{
  private static final aee bx = new bOO(new cXL());

  public ccg()
  {
    aH();
  }

  public ccg cfC()
  {
    ccg localccg;
    try {
      localccg = (ccg)bx.Mm();
      localccg.aOr = bx;
    } catch (Exception localException) {
      localccg = new ccg();
      localccg.aOr = null;
      localccg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupWithAtLeastNullEffect : " + localException.getMessage());
    }
    return localccg;
  }

  protected boolean a(dpI paramdpI, int paramInt1, int paramInt2) {
    if ((h(paramdpI)) && (paramInt1 >= 1)) {
      return false;
    }
    return true;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }

  private boolean h(dpI paramdpI) {
    int i = 0;
    if (this.mkv != null) {
      dpI localdpI = this.mkv.nc(this.mkv.bdo() - 1);
      i = paramdpI == localdpI ? 1 : 0;
    }
    int j = paramdpI.eo();
    return (i != 0) && ((j == bsj.fTb.getId()) || (j == bsj.fTd.getId()));
  }
}