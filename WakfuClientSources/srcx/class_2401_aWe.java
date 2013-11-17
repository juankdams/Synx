import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public class aWe extends rp
{
  private int fbn;
  private int aVh;
  private tp fbo = tp.bdw;

  public aWe(cXf paramcXf) {
    super(paramcXf);
  }

  public aWe(cXf paramcXf, float paramFloat1, float paramFloat2) {
    super(paramcXf, paramFloat1, paramFloat2);
  }

  public final int OV() {
    return this.fbn;
  }

  public final int RV() {
    return this.aVh;
  }

  public void er(boolean paramBoolean) {
    this.fbo = (paramBoolean ? tp.bdu : tp.bdw);
  }

  public boolean isLocked() {
    return this.fbo == tp.bdv;
  }

  public final void cb(int paramInt1, int paramInt2) {
    if (this.fbo == tp.bdv) {
      return;
    }
    this.fbn = paramInt1;
    this.aVh = paramInt2;

    if (this.fbo == tp.bdu)
      this.fbo = tp.bdv;
  }

  public final float[] a(aVn paramaVn)
  {
    return ayj.aJY().a(paramaVn);
  }

  public final int ye()
  {
    bSl localbSl = xZ();
    if ((localbSl instanceof aVn)) {
      aVn localaVn = (aVn)localbSl;
      return localaVn.OV();
    }
    return OV();
  }

  public static DisplayedScreenElement c(btb parambtb, int paramInt1, int paramInt2, int paramInt3) {
    return parambtb.e(paramInt1, paramInt2, paramInt3, cWj.kJk);
  }

  public final void blZ() {
    cb(0, 0);
  }
}