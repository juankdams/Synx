import java.util.ArrayList;

class cDU
  implements dGy
{
  cDU(azF paramazF)
  {
  }

  public boolean q(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    float f = 1.0F / i;
    for (int j = 0; j < i; j++) {
      ((cwG)paramArrayList.get(j)).cq(f);
    }
    paramArrayList.clear();
    return true;
  }
}