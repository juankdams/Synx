import java.util.ArrayList;

class DP
  implements dGy
{
  DP(dfX paramdfX, ArrayList paramArrayList)
  {
  }

  public boolean c(cuF paramcuF)
  {
    this.bID.add(paramcuF);
    if (paramcuF.adj().aTC()) {
      return true;
    }

    dde localdde = (dde)paramcuF.adj();
    localdde.k(new KI(this, paramcuF));

    return true;
  }
}