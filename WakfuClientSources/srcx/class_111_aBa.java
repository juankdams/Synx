import org.apache.log4j.Logger;

public class aBa
  implements DL
{
  private static Logger K = Logger.getLogger(aBa.class);

  public boolean c(bXH parambXH, bcT parambcT)
  {
    K.info("Connexion avec le serveur perdue.");
    byte b1 = byv.bFN().aJM();
    if (b1 == 20) {
      return true;
    }

    if ((b1 == 0) && ((parambcT == null) || (((Ac)parambcT).Ji())))
      b1 = 8;
    String str1;
    switch (b1) {
    case 1:
      str1 = bU.fH().getString("disconnection.spam");
      break;
    case 2:
      str1 = bU.fH().getString("disconnection.timeout");
      break;
    case 3:
      str1 = bU.fH().getString("disconnection.kickedByReco");
      break;
    case 4:
      str1 = bU.fH().getString("disconnection.kickedByAdmin");
      break;
    case 18:
      str1 = bU.fH().getString("disconnection.accountBanned");
      break;
    case 5:
      str1 = bU.fH().getString("disconnection.bannedByAdmin");
      break;
    case 6:
      str1 = bU.fH().getString("disconnection.architectureNotReady");
      break;
    case 7:
      str1 = bU.fH().getString("disconnection.sessionDestroyed");
      break;
    case 8:
      str1 = bU.fH().getString("disconnection.remoteServerDoesNotAnswer");
      break;
    case 9:
      str1 = bU.fH().getString("disconnection.serverShutdown");
      break;
    case 10:
      str1 = bU.fH().getString("disconnection.invalidPosition");
      break;
    case 11:
      str1 = bU.fH().getString("disconnection.openOfflineFlea");
      break;
    case 13:
      str1 = bU.fH().getString("disconnection.unknown");
      break;
    case 12:
      str1 = bU.fH().getString("disconnection.serverError");
      break;
    case 14:
      str1 = bU.fH().getString("disconnection.synchronisationError");
      break;
    case 17:
      str1 = bU.fH().getString("disconnection.timedSessionEnd");
      break;
    case 15:
    case 16:
    default:
      str1 = bU.fH().getString("connection.closed");
    }

    byte b2 = b1;
    String str2 = str1;
    dka.cSF().a(new aeu(this, b2, str2), 20L, 1);

    return true;
  }

  public boolean d(bXH parambXH, bcT parambcT)
  {
    K.info("onConnectionError isConnected=" + parambcT.isConnected() + " isRetrying=" + parambcT.IX());

    dka.cSF().a(new aes(this, parambcT), 20L, 1);

    return true;
  }

  public boolean a(bXH parambXH)
  {
    K.info("onConnectionHandlerCreationError");
    return true;
  }

  public boolean c(bXH parambXH)
  {
    K.info("onConnectionHandlerInLoopError");
    return true;
  }

  public boolean b(bXH parambXH)
  {
    K.info("onConnectionHandlerInitializationError");
    return true;
  }

  public boolean b(bXH parambXH, bcT parambcT)
  {
    return true;
  }

  public boolean e(bXH parambXH, bcT parambcT)
  {
    K.debug("onConnectionRecovered");

    dka.cSF().a(new aex(this), 20L, 1);

    return true;
  }

  public boolean a(bXH parambXH, bcT parambcT)
  {
    K.info("onNewConnection");

    dka.cSF().a(new aew(this), 20L, 1);

    return true;
  }

  public void f(bXH parambXH, bcT parambcT)
  {
  }

  public void a(cpU paramcpU)
  {
  }
}