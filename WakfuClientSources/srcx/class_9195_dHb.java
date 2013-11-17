import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dHb extends FY
  implements dBv
{
  private static final Logger K = Logger.getLogger(dHb.class);
  public static final String lRX = "realName";
  public static final String RI = "description";
  public static final String lRY = "population";
  public static final String lRZ = "community";
  public static final String lSa = "characterNumber";
  public static final String lSb = "status";
  public static final String[] bF = { "realName", "description", "population", "community", "characterNumber", "status" };

  public int dhR()
  {
    String str1 = WakfuClientInstance.awy().awB().f(bmz.fEb);
    if (str1 == null) {
      return 0;
    }
    String[] arrayOfString1 = str1.split(";");
    for (String str2 : arrayOfString1)
      if (str2.length() != 0)
      {
        String[] arrayOfString3 = str2.split(":");
        if (arrayOfString3.length == 2)
        {
          try
          {
            if (Integer.parseInt(arrayOfString3[0]) == getId())
              return Integer.parseInt(arrayOfString3[1]);
          } catch (NumberFormatException localNumberFormatException) {
            K.warn("Impossible de décoder le nombre de personnage de ce compte (données : " + str2 + ")");
          }
        }
      }
    return 0;
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("realName")) {
      return Qh();
    }
    if (paramString.equals("description")) {
      return bU.fH().getString(String.format("%s%s", new Object[] { "worldDescription.", Qh().toLowerCase() }));
    }
    if (paramString.equals("population"))
    {
      return Byte.valueOf(Qi());
    }
    if (paramString.equals("community")) {
      return bU.fH().getString(String.format("%s%s", new Object[] { "worldCommunity.", getCommunity() }));
    }
    if (paramString.equals("characterNumber")) {
      return Integer.valueOf(dhR());
    }
    if (paramString.equals("status"))
    {
      if (!Qf())
        return bU.fH().getString("worldChoice.offline");
      if (isFull())
        return bU.fH().getString("worldChoice.full");
      return new lZ().am("859740").a(bU.fH().getString("worldChoice.online")).tP();
    }

    return null;
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }
}