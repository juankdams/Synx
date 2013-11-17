import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;

public class bbX extends djs
{
  public void a(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    Object localObject1 = null;
    int i = 0;

    FF localFF = paramdlW.Ga();

    paramdlW.cTQ().a(new aaA(paramdlW.getLocator()));
    Object localObject2;
    for (int j = 0; j < paramAttributes.getLength(); j++) {
      str2 = paramAttributes.getURI(j);
      if ((str2 == null) || (str2.equals("")) || (str2.equals(paramString1)))
      {
        str3 = paramAttributes.getLocalName(j);
        str4 = paramAttributes.getValue(j);

        if (str3.equals("default")) {
          if ((str4 != null) && (!str4.equals("")) && 
            (!paramdlW.cTS())) {
            localFF.bK(str4);
          }
        }
        else if (str3.equals("name")) {
          if (str4 != null) {
            paramdlW.pu(str4);
            i = 1;
            if (!paramdlW.cTS()) {
              localFF.setName(str4);
              localFF.g(str4, localFF);
            } else if ((dhB.cQi()) && 
              (!"".equals(str4)) && (dhB.cQg() != null) && (dhB.cQg().endsWith("USE_PROJECT_NAME_AS_TARGET_PREFIX"))) {
              localObject2 = dhB.cQg().replace("USE_PROJECT_NAME_AS_TARGET_PREFIX", str4);

              dhB.pb((String)localObject2);
            }
          }
        }
        else if (str3.equals("id")) {
          if (str4 != null)
          {
            if (!paramdlW.cTS())
              localFF.g(str4, localFF);
          }
        }
        else if (str3.equals("basedir")) {
          if (!paramdlW.cTS()) {
            localObject1 = str4;
          }
        }
        else {
          throw new SAXParseException("Unexpected attribute \"" + paramAttributes.getQName(j) + "\"", paramdlW.getLocator());
        }
      }

    }

    String str1 = "ant.file." + paramdlW.cTK();

    String str2 = localFF.getProperty(str1);
    String str3 = "ant.file.type." + paramdlW.cTK();

    String str4 = localFF.getProperty(str3);
    if ((str2 != null) && (i != 0)) {
      localObject2 = null;
      Object localObject3 = null;
      if ("url".equals(str4)) {
        try {
          localObject2 = new URL(str2);
        } catch (MalformedURLException localMalformedURLException) {
          throw new cJ("failed to parse " + str2 + " as URL while looking" + " at a duplicate project" + " name.", localMalformedURLException);
        }

        localObject3 = paramdlW.cTI();
      } else {
        localObject2 = new File(str2);
        localObject3 = paramdlW.cTG();
      }

      if ((paramdlW.cTS()) && (!localObject2.equals(localObject3))) {
        localFF.d("Duplicated project name in import. Project " + paramdlW.cTK() + " defined first in " + str2 + " and again in " + localObject3, 1);
      }

    }

    if (i != 0) {
      if (paramdlW.cTG() != null) {
        localFF.q(str1, paramdlW.cTG().toString());

        localFF.q(str3, "file");
      }
      else if (paramdlW.cTI() != null) {
        localFF.q(str1, paramdlW.cTI().toString());

        localFF.q(str3, "url");
      }
    }

    if (paramdlW.cTS())
    {
      return;
    }

    if (localFF.getProperty("basedir") != null) {
      localFF.K(localFF.getProperty("basedir"));
    }
    else if (localObject1 == null) {
      localFF.K(paramdlW.cTH().getAbsolutePath());
    }
    else if (new File(localObject1).isAbsolute())
      localFF.K(localObject1);
    else {
      localFF.w(dEL.dgv().e(paramdlW.cTH(), localObject1));
    }

    localFF.a("", paramdlW.cTQ());
    paramdlW.e(paramdlW.cTQ());
  }

  public djs b(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    return ((paramString2.equals("target")) || (paramString2.equals("extension-point"))) && ((paramString1.equals("")) || (paramString1.equals("antlib:org.apache.tools.ant"))) ? dEL.dgx() : dEL.dgy();
  }
}