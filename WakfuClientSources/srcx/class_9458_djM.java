import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import org.apache.log4j.Logger;

public class djM
  implements cvW
{
  protected static final Logger K = Logger.getLogger(djM.class);

  private static djM lgQ = new djM();

  private static final DateFormat lgR = DateFormat.getTimeInstance(3);
  private static final DateFormat lgS = DateFormat.getDateInstance(3);

  public static djM cSA()
  {
    return lgQ;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    switch (paramcWG.getId())
    {
    case 1032:
      localObject1 = (cMK)paramcWG;
      a((cMK)localObject1);
      return false;
    case 1024:
      localObject1 = (cWX)paramcWG;

      byv.bFN().bs((byte)0);
      byv.bFN().bru().cVy();
      Object localObject2;
      Object localObject3;
      if (((cWX)localObject1).cKK())
      {
        ckU.cmE().done();

        byv.bFN().eB(true);

        localObject2 = ((cWX)localObject1).cKL();
        if (localObject2 != null) {
          localObject3 = new aps();
          ((aps)localObject3).q((byte[])localObject2);

          byv.bFN().a((aps)localObject3);

          duB.dai().qo(dLE.doY().getStringProperty("account.name"));

          aIH localaIH = WakfuClientInstance.awy().awB();
          cee localcee = new cee(((aps)localObject3).Ea());
          localaIH.b(localcee);
          try {
            localcee.load();
          } catch (IOException localIOException) {
            K.warn("Problème au chargement du PreferenceStore", localIOException);
          }

          bEs.bMK().e("admin", !bBc.f(((aps)localObject3).bOR(), bBc.gto));
          dLE.doY().t("isAdmin", Boolean.valueOf(!bBc.f(((aps)localObject3).bOR(), bBc.gto)));
        }

        byv.bFN().b(dAE.ddW());
        byv.bFN().b(this);

        byv.bFN().a(aFi.aRF());
        byv.bFN().a(aIj.aUl());
        byv.bFN().a(aTd.biu());
        byv.bFN().a(cLQ.cEP());
        byv.bFN().a(blH.fCO);
        byv.bFN().a(azE.aLy());

        localObject3 = cBQ.cxL().coO().czu();
        ((dLE)localObject3).removeProperty("account.name");
        ((dLE)localObject3).removeProperty("account.password");
        ((dLE)localObject3).removeProperty("account.remember");
        ((dLE)localObject3).removeProperty("proxy.list");
        ((dLE)localObject3).removeProperty("proxy.selected");
      }
      else
      {
        localObject3 = new Object[0];
        byte b = (byte)(((cWX)localObject1).Kh() & 0xFF);

        if ((b == 13) || (b == 15) || (b == 18) || (b == 14) || (b == 19) || (b == 16) || (b == 17))
        {
          fa(b);
          return false;
        }

        switch (b) {
        case 2:
          localObject2 = "error.connection.invalidLogin";
          break;
        case 3:
          localObject2 = "error.connection.alreadyConnected";
          break;
        case 4:
          localObject2 = "error.connection.saveInProgress";
          break;
        case 127:
          localObject2 = "error.connection.closedBeta";
          break;
        case 9:
          localObject2 = "error.connection.locked";
          break;
        case 10:
          localObject2 = "error.connection.loginServerDown";
          break;
        case 11:
          localObject2 = "error.connection.tooManyConnection";
          break;
        case 12:
          localObject2 = "error.connection.invalidPartner";
          break;
        case 5:
          localObject2 = "error.connection.banned";
          int i = ((cWX)localObject1).cKM();
          int j = i / 1440;
          i -= j * 60 * 24;
          int k = i / 60;
          i -= k * 60;

          if (j > 0)
            localObject3 = new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(0) };
          else {
            localObject3 = new Object[] { Integer.valueOf(0), Integer.valueOf(k), Integer.valueOf(i) };
          }
          break;
        case 20:
          localObject2 = "error.connection.invalidEmail";
          break;
        case 21:
          localObject2 = "error.connection.accountModeration";
          break;
        default:
          localObject2 = "error.connection.invalidLogin";
        }
        a(paramcWG, (String)localObject2, (Object[])localObject3);
      }
      return false;
    case 1026:
      a(paramcWG, "error.connection.worldLoading", new Object[0]);
      return false;
    case 9:
      a(paramcWG, "error.connection.loginServerDown", new Object[0]);
      return false;
    }

    return true;
  }

  private void a(cMK paramcMK)
  {
    if (ay.bd().bt()) {
      String str1 = byv.bFN().getEmail();
      if ((str1 != null) && (str1.length() != 0)) {
        afB localafB = new afB(str1);
        byv.bFN().aJK().d(localafB);
      }
    }

    long l = paramcMK.cFC();
    byte[] arrayOfByte1 = paramcMK.cFD();
    Ua.cxp.r(arrayOfByte1);

    byte[] arrayOfByte2 = jI(l);

    String str2 = byv.bFN().brs();
    Object localObject;
    if (str2 == null)
    {
      localObject = new baQ();
      ((baQ)localObject).X(arrayOfByte2);
      byv.bFN().aJK().d((cWG)localObject);
    }
    else {
      localObject = new sn(arrayOfByte2, str2);
      WakfuClientInstance.awy().awz().aJK().d((cWG)localObject);
    }
  }

  private byte[] jI(long paramLong) {
    byte[] arrayOfByte1 = dzp.qC(byv.bFN().brr());
    byte b = (byte)arrayOfByte1.length;
    byte[] arrayOfByte2 = dzp.qC(byv.bFN().getPassword());
    int i = (byte)arrayOfByte2.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + b + 1 + i);

    localByteBuffer.putLong(paramLong);

    localByteBuffer.put(b);
    localByteBuffer.put(arrayOfByte1);
    localByteBuffer.put(i);
    localByteBuffer.put(arrayOfByte2);

    byte[] arrayOfByte3 = localByteBuffer.array();
    return Ua.cxp.g(arrayOfByte3);
  }

  private void fa(byte paramByte) {
    String str = "error.connection.nicknameNotSet";
    switch (paramByte) {
    case 13:
      str = "error.connection.nicknameNotSet";
      break;
    case 14:
      str = "error.connection.nicknameInvalidContent";
      break;
    case 15:
      str = "error.connection.nicknameDuplicate";
      break;
    case 16:
      str = "error.connection.nicknameTooLong";
      break;
    case 17:
      str = "error.connection.nicknameTooShort";
      break;
    case 18:
      str = "error.connection.nicknameEqualsLogin";
      break;
    case 19:
      str = "error.connection.nicknameInvalidFormat";
    }

    cBQ.cxL().a("nicknameChoiceDialog", VV.dJ("nicknameChoiceDialog"), 8448L, (short)10000);

    cBQ.cxL().a(bU.fH().getString(str), Cn.et(1), 1027L, 1, 2);
  }

  protected final void a(cWG paramcWG, String paramString, Object[] paramArrayOfObject)
  {
    byv.bFN().hY(null);
    byv.bFN().setPassword(null);

    ((aqv)paramcWG.cKx()).b(this);

    cBQ.cxL().a(bU.fH().getString(paramString, paramArrayOfObject), Cn.et(1), 1027L, 1, 2);

    byv.bFN().js("Login Error");
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }
}