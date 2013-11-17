import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public class bJj extends djs
{
  public void a(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    bTW localbTW1 = paramdlW.cTL();
    Object localObject = null;

    if (localbTW1 != null) {
      localObject = localbTW1.bsm();
    }

    aQS localaQS = new aQS(paramString2);
    localaQS.b(paramdlW.Ga());
    localaQS.setNamespace(paramString1);
    localaQS.hc(paramString3);
    localaQS.gu(dhB.bg(localaQS.getNamespace(), paramString2));
    localaQS.dt(paramString3);

    aaA localaaA = new aaA(paramdlW.getLocator().getSystemId(), paramdlW.getLocator().getLineNumber(), paramdlW.getLocator().getColumnNumber());

    localaQS.a(localaaA);
    localaQS.d(paramdlW.cTP());

    if (localObject != null)
    {
      ((aQS)localObject).a(localaQS);
    }
    else {
      paramdlW.cTP().a(localaQS);
    }

    paramdlW.a(localaQS, paramAttributes);

    bTW localbTW2 = new bTW(localaQS, localaQS.aSI());

    for (int i = 0; i < paramAttributes.getLength(); i++) {
      String str1 = paramAttributes.getLocalName(i);
      String str2 = paramAttributes.getURI(i);
      if ((str2 != null) && (!str2.equals("")) && (!str2.equals(paramString1))) {
        str1 = str2 + ":" + paramAttributes.getQName(i);
      }
      String str3 = paramAttributes.getValue(i);

      if (("ant-type".equals(str1)) || (("antlib:org.apache.tools.ant".equals(str2)) && ("ant-type".equals(paramAttributes.getLocalName(i)))))
      {
        str1 = "ant-type";
        int j = str3.indexOf(":");
        if (j >= 0) {
          String str4 = str3.substring(0, j);
          String str5 = paramdlW.pv(str4);
          if (str5 == null) {
            throw new cJ("Unable to find XML NS prefix \"" + str4 + "\"");
          }

          str3 = dhB.bg(str5, str3.substring(j + 1));
        }
      }

      localbTW2.setAttribute(str1, str3);
    }
    if (localbTW1 != null) {
      localbTW1.c(localbTW2);
    }
    paramdlW.e(localbTW2);
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, dlW paramdlW)
  {
    bTW localbTW = paramdlW.cTL();
    localbTW.b(paramArrayOfChar, paramInt1, paramInt2);
  }

  public djs b(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    return dEL.dgy();
  }

  public void a(String paramString1, String paramString2, dlW paramdlW)
  {
    paramdlW.cTN();
  }
}