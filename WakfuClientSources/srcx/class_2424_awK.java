import java.util.ArrayList;

class awK
  implements doN
{
  awK(dBz paramdBz)
  {
  }

  public boolean a(cSx paramcSx)
  {
    ArrayList localArrayList = ((dos)dBz.b(this.dLX).get(dBz.c(this.dLX))).fcK;
    for (int i = 0; i < localArrayList.size(); i++) {
      ((biy)localArrayList.get(i)).setVisible(false);
    }
    dBz.a(this.dLX, (byte)(dBz.c(this.dLX) == dBz.b(this.dLX).size() - 1 ? 0 : dBz.c(this.dLX) + 1));
    bZx localbZx = new bZx(this.dLX, dBz.c(this.dLX));
    localbZx.aJ();
    this.dLX.g(localbZx);

    localArrayList = ((dos)dBz.b(this.dLX).get(dBz.c(this.dLX))).fcK;
    for (int j = 0; j < localArrayList.size(); j++) {
      ((biy)localArrayList.get(j)).setVisible(true);
    }
    this.dLX.cfM();
    return true;
  }
}