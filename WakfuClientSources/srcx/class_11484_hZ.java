import java.awt.Point;

final class hZ
  implements dCS
{
  hZ(dRq paramdRq, aLD paramaLD, bpn parambpn)
  {
  }

  public void pL()
  {
    int i = this.aHx.getWidth() / 2;
    int j = Math.max(0, Math.min(this.aHz.getWidth() - this.aHx.getWidth(), bUO.caO() - i));
    int k = Math.min(this.aHz.getHeight() - this.aHx.getHeight(), bUO.rW() + 15);
    this.aHx.setPosition(new Point(j, k));
    this.aHx.setVisible(true);
    this.aHA.b(this);
    aWc.blo().eO(600072L);
  }
}