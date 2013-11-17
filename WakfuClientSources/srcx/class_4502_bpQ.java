import org.apache.log4j.Logger;

final class bpQ
  implements dFU
{
  private static final Logger K = Logger.getLogger(bpQ.class);

  public boolean a(Aw paramAw) {
    int i = paramAw.Jz();
    String str1 = bU.fH().b(77, i, new Object[0]);
    String str2 = "notification.havenWorldObtainedTitle";
    String str3 = bU.fH().getString("notification.havenWorldObtainedText", new Object[] { str1 });

    String str4 = bU.fH().getString("notification.havenWorldObtainedTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("havenWorld.chatWorldObtained", new Object[] { str1 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);

    return false;
  }

  public int vN() {
    return 20099;
  }
}