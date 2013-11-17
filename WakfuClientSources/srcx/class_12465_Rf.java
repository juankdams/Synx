public class Rf
{
  public static void a(vH paramvH)
  {
    String str1 = bU.fH().getString("antiAddictionLevel.name." + paramvH.bJ());
    String str2 = bU.fH().getString("antiAddictionLevel.desc." + paramvH.bJ());
    if ((dzp.qF(str1)) && (dzp.qF(str2))) {
      return;
    }
    az localaz = new az(str1, str2, ana.dqe, 600011);

    cjO.clE().j(localaz);
  }
}