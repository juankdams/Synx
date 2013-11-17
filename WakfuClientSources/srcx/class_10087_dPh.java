public final class dPh
  implements Vj
{
  public static final Class caa = cwC.class;

  public cwC rJ(String paramString) {
    return l(caa, paramString);
  }

  public cwC l(Class paramClass, String paramString) {
    if (paramString != null) {
      return cwC.mr(paramString);
    }
    return null;
  }

  public Class WY() {
    return caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA) {
    if (paramString != null) {
      paramdeg.al(caa);
      StringBuilder localStringBuilder = new StringBuilder();
      cwC localcwC = cwC.mr(paramString);
      double d = localcwC.getValue();
      localStringBuilder.append("new Percentage(").append(d).append(")");

      return localStringBuilder.toString();
    }
    return "null";
  }
}