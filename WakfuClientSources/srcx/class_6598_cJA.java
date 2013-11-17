import java.util.Arrays;
import java.util.List;

class cJA
  implements dFU
{
  public boolean a(GP paramGP)
  {
    Object localObject;
    if (paramGP.QG())
    {
      localObject = new awY();
      ((awY)localObject).aIG();
      acp.cRI.a((cjE)localObject);
    }
    else
    {
      localObject = paramGP.QH();
      List localList = Arrays.asList(((dxQ)localObject).p(new bTI[0]));
      bwy localbwy = new bwy(localList);
      for (bTI localbTI : localList)
      {
        long l = ((dxQ)localObject).get(localbTI);
        if (l > 0L)
        {
          localbwy.a(localbTI, l);
        }
      }

      acp.cRI.a(localbwy);
    }

    return false;
  }

  public int vN() {
    return 13200;
  }
}