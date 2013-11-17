public class qa
{
  public static dnm a(Hp paramHp)
  {
    dnm localdnm;
    if (paramHp.bPC != null)
      localdnm = dIi.lTe.Ri();
    else if (paramHp.bPB != null)
      localdnm = dIi.lTd.Ri();
    else if (paramHp.bPD != null)
      localdnm = dIi.lTf.Ri();
    else {
      localdnm = dIi.lTg;
    }

    localdnm.k(paramHp);
    return localdnm;
  }
}