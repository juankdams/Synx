import java.util.ArrayList;

final class dAF
  implements dGy
{
  dAF(ArrayList paramArrayList)
  {
  }

  public boolean a(aXL paramaXL)
  {
    cUh localcUh = paramaXL.adj();

    if (!localcUh.aTC()) {
      dde localdde = (dde)localcUh;
      String str = apg.c(localdde);
      avz localavz = apg.d(localdde);

      int i = paramaXL.bmV() + paramaXL.bmZ().getWidth() / 2;
      int j = paramaXL.bmW() + paramaXL.bmZ().getHeight() / 2;
      this.lIj.add(new dwn(i, j, 0.0F, str, paramaXL, localavz, apg.aBr()));
    }
    return true;
  }
}