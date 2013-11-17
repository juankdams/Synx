import org.apache.log4j.Logger;

public class cul extends aSW
{
  private static final Logger K = Logger.getLogger(cul.class);
  public static final String ieK = "requestArenaSSO";
  public static final String ieL = "requestArenaClose";
  public static final String ieM = "requestURL";
  private static final String bxp = "receiveArenaSSO";

  public cul()
  {
    super(new dFU[0]);
  }

  public void g(String paramString, Object[] paramArrayOfObject) {
    if (paramString.equals("requestArenaSSO")) {
      bbN.fls.a(new awF(this));
    }
    else if (paramString.equals("requestArenaClose")) {
      csK();
    } else if (paramString.equals("requestURL")) {
      K.info("requestUrl recu de Arena params={" + paramArrayOfObject + "}");
      if ((paramArrayOfObject.length == 2) && ((paramArrayOfObject[0] instanceof String)) && ((paramArrayOfObject[1] instanceof String)))
        aA((String)paramArrayOfObject[0], (String)paramArrayOfObject[1]);
    }
  }

  private static void aA(String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (paramString2.equals("_top"))) {
      hx.aGS.unload();

      El localEl = El.Q(El.bIV.bJ());
      if (dDE.dft().VN().Q(localEl.tw())) {
        return;
      }

      hx.aGS.b(localEl);
      return;
    }

    dQI.rN(paramString1);
  }

  private static void csK() {
    hx.aGS.unload();
  }
}