import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cGt
{
  private static final Logger K = Logger.getLogger(cGt.class);
  protected aLD hpP;
  protected dDO aLp;
  private final cxX iBz;

  protected cGt(cxX paramcxX)
  {
    this.iBz = paramcxX;
  }

  protected cGt() {
    this(new cxX(false, false));
  }

  public final void e(aLD paramaLD) {
    this.hpP = paramaLD;
    paramaLD.a(this.iBz);
  }

  protected abstract void P(int paramInt1, int paramInt2);

  public final boolean ef(int paramInt1, int paramInt2) {
    this.hpP.bdh();
    if (!eh(paramInt1, paramInt2)) {
      return false;
    }
    P(paramInt1, paramInt2);
    if (this.aLp != null) {
      ArrayList localArrayList = this.aLp.dfH();
      for (Gz localGz : localArrayList) {
        if (localGz.yE() == cLT.iLz) {
          this.hpP.f(localGz.Qw());
        }
      }
    }
    return (this.aLp != null) && (!this.aLp.dfG());
  }

  public void eg(int paramInt1, int paramInt2) {
    if (!ef(paramInt1, paramInt2)) {
      clear();
      return;
    }

    this.aLp.a(this.hpP.getWorkingHavenWorld());
    cjO.clE().j(new cAt(this.aLp));
    this.aLp = null;
    Ku();
  }

  protected void Ku() {
  }

  private boolean eh(int paramInt1, int paramInt2) {
    MD localMD = this.hpP.getPatchCoordFromMouse(paramInt1, paramInt2);
    return this.hpP.getWorkingHavenWorld().Q(localMD.getX(), localMD.getY());
  }

  public void clear() {
    if (this.aLp != null) {
      this.aLp.g(this.hpP);
      this.hpP.a(this.iBz);
      this.aLp = null;
    }
  }

  public abstract dmh Kt();
}