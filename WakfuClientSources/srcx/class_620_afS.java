import com.ankamagames.framework.graphics.engine.Anm2.Anm;

class afS
{
  public final int bjv;
  public final Anm bXW;
  public final biK cZj;
  private aWk cZk = null;
  public final int cZl;

  afS(int paramInt1, Anm paramAnm, biK parambiK, int paramInt2)
  {
    this.bjv = paramInt1;
    this.bXW = paramAnm;
    this.cZj = parambiK;
    this.cZl = paramInt2;
  }

  afS(afS paramafS) {
    this.bjv = paramafS.bjv;
    this.bXW = paramafS.bXW;
    this.cZj = null;
    this.cZl = paramafS.cZl;
  }

  public final boolean arn() {
    return (this.bXW.gI()) && (this.bXW.SH.Xq());
  }

  public final aWk aro() {
    if (!arn()) {
      return null;
    }
    if (this.cZk != null) {
      return this.cZk;
    }
    if ((!bB) && (this.cZj == null)) throw new AssertionError();
    String str = this.cZj.m_name;
    if ((!bB) && (str == null)) throw new AssertionError();
    aWk[] arrayOfaWk = this.bXW.SH.Xs();
    for (int i = 0; i < arrayOfaWk.length; i++) {
      if (str.contains(arrayOfaWk[i].fbq)) {
        this.cZk = arrayOfaWk[i];
        break;
      }
    }

    return this.cZk;
  }
}