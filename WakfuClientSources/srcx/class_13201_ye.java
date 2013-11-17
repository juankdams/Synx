import java.util.ArrayList;

class ye
  implements doN
{
  ye(bhd parambhd)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;
    int i = localdMr.y(this.brB) - this.brB.fvw;
    int j = localdMr.z(this.brB) - this.brB.fvx;

    Object localObject = null;
    int k = 0; for (int m = bhd.h(this.brB).size(); k < m; k++) {
      aG localaG = (aG)bhd.h(this.brB).get(k);
      if (bhd.a(this.brB, localaG, i, j)) {
        localObject = localaG;
        break;
      }
    }

    if (bhd.i(this.brB) == localObject) {
      return false;
    }

    bhd.a(this.brB, localObject);
    bhd.j(this.brB).setVisible(bhd.i(this.brB) != null);
    if (bhd.i(this.brB) != null) {
      bhd.k(this.brB).setText(bhd.i(this.brB).bM());
    }

    return false;
  }
}