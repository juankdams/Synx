import com.ankamagames.wakfu.client.console.command.debug.NotificationTestCommand;

public class bxD
  implements Runnable
{
  public bxD(NotificationTestCommand paramNotificationTestCommand)
  {
  }

  public void run()
  {
    String str1 = bU.fH().getString("notification.skillLevelUpTitle", new Object[] { "Catin" });

    String str2 = cda.createLink(bU.fH().getString("notification.skillLevelUpText", new Object[] { "Catin", Integer.valueOf(10) }), ana.dqf);

    az localaz = new az(str1, str2, ana.dqf);
    cjO.clE().j(localaz);
  }
}