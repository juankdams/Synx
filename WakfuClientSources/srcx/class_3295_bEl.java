import java.util.LinkedList;

class bEl
  implements doN
{
  bEl(bSc parambSc, dRq paramdRq)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (this.gzB.getX() <= 0)
      return false;
    bSc.a(this.bOL, true);
    while ((!bSc.a(this.bOL).isEmpty()) && (bSc.b(this.bOL).size() < 9)) {
      bSc.a(this.bOL, (cbj)bSc.a(this.bOL).removeLast());
    }
    this.gzB.b(CH.bGK, this, true);
    this.gzB.setEnablePositionEvents(false);
    this.gzB.setVisible(false);
    return true;
  }
}