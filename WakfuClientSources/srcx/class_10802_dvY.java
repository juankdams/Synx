import java.util.ArrayList;

class dvY
  implements bnm
{
  dvY(aCg paramaCg)
  {
  }

  public void i(String paramString)
  {
    if (!paramString.startsWith("petDialog")) {
      return;
    }
    if (paramString.equals(aCg.b(this.ddi))) {
      aCg.a(this.ddi, null);
    }
    aCg.a(this.ddi).remove(paramString);
    this.ddi.aOu();
    ckV localckV1 = (ckV)dLE.doY().br("pet", paramString);
    ckV localckV2 = (ckV)dLE.doY().rv("pet");
    if ((localckV2 == null) || (localckV1.cmF().oj() != localckV2.cmF().oj()))
      localckV1.clean();
  }
}