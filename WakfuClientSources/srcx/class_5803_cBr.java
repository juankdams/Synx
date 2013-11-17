public class cBr
  implements Vj
{
  private Class caa = bmy.class;

  public bmy mE(String paramString) {
    return j(this.caa, paramString);
  }

  public bmy j(Class paramClass, String paramString)
  {
    if (paramString == null) {
      return null;
    }

    if (paramClass.equals(bmy.class)) {
      bmy localbmy = new bmy();
      cpa localcpa = cBQ.cxL().coO().czv();
      localbmy.b(paramString, localcpa);
      return localbmy;
    }

    return null;
  }

  public Class WY()
  {
    return this.caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    if (paramString == null) {
      return "null";
    }

    if (paramClass.equals(bmy.class)) {
      paramdeg.al(bmy.class);
      paramdeg.al(cDA.class);

      String str = paramdeg.can();
      paramdeg.a(new cHH(bmy.class, str, "new DropValidateCallBack()"));
      paramdeg.a(new bol(null, "setFunc", str, new String[] { "\"" + paramString + "\"", "env.getCurrentElementMap()" }));

      return str;
    }

    return "null";
  }
}