import java.util.ArrayList;

class bhp
  implements Runnable
{
  bhp(dxw paramdxw, boolean paramBoolean, float paramFloat1, short paramShort, float paramFloat2, int paramInt)
  {
  }

  public void run()
  {
    if (dxw.a(this.fwg).isUnloading())
      return;
    float f1 = dxw.a(this.fwg).getOffset();
    float f2 = this.fwb ? this.fwc : -this.fwc;

    if ((bsK.a(this.fwg.lDJ)) && (a(f1, f2, this.fwb))) {
      return;
    }

    if ((this.fwd != -1) && (!bsK.a(this.fwg.lDJ)))
    {
      int i;
      if (this.fwb)
        i = dxw.a(this.fwg).getOffset() - this.fwe + f2 >= this.fwf ? 1 : 0;
      else {
        i = dxw.a(this.fwg).getOffset() - this.fwe + f2 <= this.fwf ? 1 : 0;
      }
      if (i != 0) {
        a(f1, f2, this.fwb);
        return;
      }
    }
    dxw.a(this.fwg, f1 + f2);

    if (dxw.a(this.fwg).getRenderables().isEmpty())
      return;
    duS localduS = (duS)dxw.a(this.fwg).getRenderableByOffset((int)dxw.a(this.fwg).getOffset()).getInnerElementMap().fi("text");
    String str = localduS.getText();
    if (str.length() == 0)
      return;
    Byte localByte = Byte.valueOf(str);
    int j = localByte.byteValue() != dxw.b(this.fwg) ? 1 : 0;
    dxw.a(this.fwg, localByte.byteValue());
    if ((j != 0) && (dxw.c(this.fwg) == bsK.b(this.fwg.lDJ) - 1))
      bsK.a(this.fwg.lDJ, bsK.c(this.fwg.lDJ));
  }

  private boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean) {
      i = bCO.aB(paramFloat1);
      j = paramFloat1 + paramFloat2 >= i ? 1 : 0;
    } else {
      i = bCO.bD(paramFloat1);
      j = paramFloat1 + paramFloat2 <= i ? 1 : 0;
    }
    if (j != 0) {
      dxw.a(this.fwg, i);

      dka.cSF().j(dxw.d(this.fwg));
      dxw.a(this.fwg, null);

      dxw.a(this.fwg, this.fwd);

      if ((bsK.d(this.fwg.lDJ) == dxw.c(this.fwg)) && (dxw.e(this.fwg) == dxw.f(this.fwg))) {
        bsK.e(this.fwg.lDJ);
        if (dxw.c(this.fwg) == bsK.b(this.fwg.lDJ) - 1)
          bsK.f(this.fwg.lDJ);
        return true;
      }

      if ((dxw.g(this.fwg) != null) && (dxw.f(this.fwg) == bsK.bAT().length))
      {
        if (bsK.d(this.fwg.lDJ) == dxw.c(this.fwg)) {
          this.fwg.dcq();
        } else {
          this.fwg.dcr();
          if (bsK.d(this.fwg.lDJ) == dxw.g(this.fwg).dcu())
            dxw.g(this.fwg).dcq();
          else {
            dxw.g(this.fwg).dcr();
          }
        }
      }
      return true;
    }
    return false;
  }
}