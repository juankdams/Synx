import java.awt.event.KeyEvent;

class cjt
  implements apZ
{
  private bln aRp;
  private boolean hIN = false;

  public cjt(c paramc, bln parambln)
  {
    this.aRp = parambln;
  }

  public boolean d(KeyEvent paramKeyEvent) {
    return false;
  }

  public boolean c(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    if (this.hIN) {
      return true;
    }
    if (((this.aRp.bwn() == i) && (this.aRp.getModifiersEx() == paramKeyEvent.getModifiersEx())) || (paramKeyEvent.getKeyCode() == 27)) {
      c.a(this.Sf);
      return true;
    }

    if ((i != 18) && (i != 16) && (i != 17))
    {
      this.hIN = true;
      long l = bCO.cM(i, paramKeyEvent.getModifiersEx());
      if (bqJ.bzC().fU(l)) {
        cBQ.cxL().a(bU.fH().getString("notification.reservedKey"), Cn.et(7), 3L, 102, 1);

        c.a(this.Sf);
        return true;
      }
      bln localbln = bqJ.bzC().fW(l);
      ckW localckW = localbln == null ? null : localbln.bwo();

      if (localckW != null)
      {
        cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.swapShortcutsKey"), Cn.et(7), 2073L, 102, 1);

        localcKX.a(new cdw(this, localckW, paramKeyEvent));
      }
      else
      {
        c.a(this.Sf, this.aRp.bwo());
        this.Sf.a(this.aRp.getId(), paramKeyEvent.getKeyCode(), paramKeyEvent.getModifiersEx());
        bqJ.bzC().bzD();
        c.a(this.Sf);
      }
    }
    return true;
  }

  public boolean b(KeyEvent paramKeyEvent) {
    return false;
  }
}