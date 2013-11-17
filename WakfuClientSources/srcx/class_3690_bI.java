import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

class bI
  implements Ye
{
  bI(dcd paramdcd)
  {
  }

  public void a(ScreenElement paramScreenElement)
  {
    if (paramScreenElement.ddQ() > dcd.a(this.kN)) {
      dcd.a(this.kN, paramScreenElement.ddQ());
    }

    if (paramScreenElement.ddN() > dcd.b(this.kN)) {
      dcd.b(this.kN, Math.abs(paramScreenElement.ddN()));
    }

    paramScreenElement.fk(0);
    paramScreenElement.Cg(0);
  }
}