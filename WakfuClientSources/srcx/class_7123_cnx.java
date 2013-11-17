public class cnx
  implements Vj
{
  private Class caa = bAu.class;

  public bAu lx(String paramString) {
    return h(this.caa, paramString);
  }

  public bAu h(Class paramClass, String paramString)
  {
    if (paramString == null) {
      return null;
    }

    if (paramClass.equals(bAu.class)) {
      bAu localbAu = new bAu();
      cDA localcDA = cBQ.cxL().coO();
      cpa localcpa = localcDA.czv();
      dso localdso = localcDA.czx();
      localbAu.a(paramString, localcpa, localdso);
      return localbAu;
    }

    return null;
  }

  public Class WY()
  {
    return this.caa;
  }

  public boolean WZ()
  {
    return true;
  }

  public boolean Xa()
  {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    if (paramString == null) {
      return null;
    }

    if (paramClass.equals(bAu.class)) {
      String str = paramdeg.can();
      paramdeg.al(paramClass);
      paramdeg.al(cDA.class);
      paramdeg.a(new cHH(paramClass, str, "new " + paramClass.getSimpleName() + "()"));

      paramdeg.a(new bol(null, "setFunc", str, new String[] { "\"" + paramString + "\"", "env.getCurrentElementMap()", "env.getCurrentForm()" }));

      return str;
    }

    return null;
  }
}