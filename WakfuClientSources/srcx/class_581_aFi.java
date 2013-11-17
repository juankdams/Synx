import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class aFi
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aFi.class);

  private static aFi eba = new aFi();

  private final Map ebb = new HashMap();
  private final Map ebc = new HashMap();
  private final Map ebd = new HashMap();
  private final Map ebe = new HashMap();

  public static aFi aRF()
  {
    return eba;
  }

  public long bD(byte paramByte)
  {
    return this.ebb.containsKey(Byte.valueOf(paramByte)) ? ((Long)this.ebb.get(Byte.valueOf(paramByte))).longValue() : 0L;
  }

  public int bE(byte paramByte) {
    return this.ebe.containsKey(Byte.valueOf(paramByte)) ? ((Integer)this.ebe.get(Byte.valueOf(paramByte))).intValue() : 0;
  }

  public double bF(byte paramByte) {
    return this.ebc.containsKey(Byte.valueOf(paramByte)) ? ((Double)this.ebc.get(Byte.valueOf(paramByte))).doubleValue() : 0.0D;
  }

  public double bG(byte paramByte) {
    return this.ebd.containsKey(Byte.valueOf(paramByte)) ? ((Double)this.ebd.get(Byte.valueOf(paramByte))).doubleValue() : 0.0D;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId()) {
    case 106:
      localObject1 = (bGu)paramcWG;
      String str1;
      aEe localaEe1;
      switch (((bGu)localObject1).bOq()) {
      case 1:
        int i = ((bGu)localObject1).BO();
        int j = i / 60;
        int k = i % 60;
        String str2 = bU.fH().getString("systemNotification.shutdown.time", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        localObject2 = new aEe(str2);
        ((aEe)localObject2).mm(3);
        CM.LV().ez(3).a((aEe)localObject2);

        KO.Vm().a(new coS(cMS.ksc, str2, 5000));

        break;
      case 2:
        str1 = bU.fH().getString("systemNotification.shutdown.canceled");
        localaEe1 = new aEe(str1);
        localaEe1.mm(3);
        CM.LV().ez(3).a(localaEe1);

        KO.Vm().a(new coS(cMS.ksc, str1, 5000));

        break;
      case 3:
        str1 = ((bGu)localObject1).BN();
        localaEe1 = new aEe(str1);
        localaEe1.mm(3);
        CM.LV().ez(3).a(localaEe1);
        KO.Vm().a(new coS(cMS.ksd, str1, go(str1)));

        break;
      case 4:
        str1 = ((bGu)localObject1).BN();
        localaEe1 = new aEe(str1);
        localaEe1.mm(4);
        CM.LV().ez(4).a(localaEe1);

        break;
      case 5:
        str1 = bU.fH().getString("systemNotification.moderatedZone.start");
        localaEe1 = new aEe(str1);
        localaEe1.mm(4);
        CM.LV().ez(4).a(localaEe1);

        break;
      case 6:
        str1 = bU.fH().getString("systemNotification.moderatedZone.stop");
        localaEe1 = new aEe(str1);
        localaEe1.mm(4);
        CM.LV().ez(4).a(localaEe1);

        break;
      case 7:
        str1 = bU.fH().getString("systemNotification.moderatedZone.enter");
        localaEe1 = new aEe(str1);
        localaEe1.mm(4);
        CM.LV().ez(4).a(localaEe1);

        break;
      case 8:
        str1 = bU.fH().getString("systemNotification.moderatedZone.leave");
        localaEe1 = new aEe(str1);
        localaEe1.mm(4);
        CM.LV().ez(4).a(localaEe1);

        break;
      case 9:
        str1 = bU.fH().getString("systemNotification.moderatedZone.cannotChat");
        localaEe1 = new aEe(str1);
        localaEe1.mm(3);
        CM.LV().ez(3).a(localaEe1);

        break;
      case 10:
        str1 = bU.fH().getString("systemNotification.cannotChatWhenMuted");
        localaEe1 = new aEe(str1);
        localaEe1.mm(3);
        CM.LV().ez(3).a(localaEe1);

        break;
      default:
        K.error("Notification système inconnue : type=" + ((bGu)localObject1).bOq());
      }

      return false;
    case 108:
      localObject1 = (adK)paramcWG;
      double d1 = (((adK)localObject1).apO() - ((adK)localObject1).apL()) / 1000000.0D;
      double d2 = (((adK)localObject1).apN() - ((adK)localObject1).apM()) / 1000000.0D;

      if ((((adK)localObject1).getKey() == 0) && (((adK)localObject1).apK() == 0)) {
        localObject2 = bU.fH().getString("chat.ping", new Object[] { Long.valueOf(Math.round(d1)) });
        aEe localaEe2 = new aEe((String)localObject2);
        localaEe2.mm(4);
        CM.LV().ez(4).a(localaEe2);
      }

      K.info("Pong! serverGroup=" + ((adK)localObject1).apK() + " rtt=" + d1 + " processing=" + d2 + " key=" + ((adK)localObject1).getKey());
      this.ebb.put(Byte.valueOf(((adK)localObject1).apK()), Long.valueOf(System.currentTimeMillis()));
      this.ebe.put(Byte.valueOf(((adK)localObject1).apK()), Integer.valueOf(((adK)localObject1).getKey()));
      this.ebc.put(Byte.valueOf(((adK)localObject1).apK()), Double.valueOf(d1));
      this.ebd.put(Byte.valueOf(((adK)localObject1).apK()), Double.valueOf(d2));

      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  private int go(String paramString)
  {
    return 500 + paramString.length() * 100;
  }
}