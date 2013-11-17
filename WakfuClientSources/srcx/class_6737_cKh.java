import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;

public class cKh extends djs
{
  public void a(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    Object localObject1 = null;
    Object localObject2 = "";
    Object localObject3 = null;
    wi localwi = null;

    FF localFF = paramdlW.Ga();
    aB localaB = "target".equals(paramString2) ? new wZ() : new aB();

    localaB.b(localFF);
    localaB.a(new aaA(paramdlW.getLocator()));
    paramdlW.a(localaB);

    for (int i = 0; i < paramAttributes.getLength(); i++) {
      String str2 = paramAttributes.getURI(i);
      if ((str2 == null) || (str2.equals("")) || (str2.equals(paramString1)))
      {
        str3 = paramAttributes.getLocalName(i);
        localObject4 = paramAttributes.getValue(i);

        if (str3.equals("name")) {
          localObject1 = localObject4;
          if ("".equals(localObject1))
            throw new cJ("name attribute must not be empty");
        }
        else if (str3.equals("depends")) {
          localObject2 = localObject4;
        } else if (str3.equals("if")) {
          localaB.L((String)localObject4);
        } else if (str3.equals("unless")) {
          localaB.M((String)localObject4);
        } else if (str3.equals("id")) {
          if ((localObject4 != null) && (!((String)localObject4).equals("")))
            paramdlW.Ga().g((String)localObject4, localaB);
        }
        else if (str3.equals("description")) {
          localaB.setDescription((String)localObject4);
        } else if (str3.equals("extensionOf")) {
          localObject3 = localObject4;
        } else if (str3.equals("onMissingExtensionPoint")) {
          try {
            localwi = wi.aX((String)localObject4);
          } catch (IllegalArgumentException localIllegalArgumentException) {
            throw new cJ("Invalid onMissingExtensionPoint " + (String)localObject4);
          }
        } else {
          throw new SAXParseException("Unexpected attribute \"" + str3 + "\"", paramdlW.getLocator());
        }
      }
    }

    if (localObject1 == null) {
      throw new SAXParseException("target element appears without a name attribute", paramdlW.getLocator());
    }

    String str1 = null;
    int j = (paramdlW.cTS()) && (dhB.cQi()) ? 1 : 0;

    String str3 = dhB.cQh();

    if (j != 0) {
      str1 = a(paramdlW);
      if (str1 == null) {
        throw new cJ("can't include build file " + paramdlW.cTI() + ", no as attribute has been given" + " and the project tag doesn't" + " specify a name attribute");
      }

      localObject1 = str1 + str3 + (String)localObject1;
    }

    if (paramdlW.cTT().get(localObject1) != null) {
      throw new cJ("Duplicate target '" + (String)localObject1 + "'", localaB.gu());
    }

    Object localObject4 = localFF.PN();
    int k = 0;

    if (((Hashtable)localObject4).containsKey(localObject1)) {
      localFF.d("Already defined in main or a previous import, ignore " + (String)localObject1, 3);
    }
    else {
      localaB.setName((String)localObject1);
      paramdlW.cTT().put(localObject1, localaB);
      localFF.b((String)localObject1, localaB);
      k = 1;
    }
    Object localObject5;
    if (((String)localObject2).length() > 0)
      if (j == 0)
        localaB.bg((String)localObject2);
      else
        for (localObject5 = wZ.b((String)localObject2, (String)localObject1, "depends").iterator(); ((Iterator)localObject5).hasNext(); ) { localObject6 = (String)((Iterator)localObject5).next();
          localaB.bh(str1 + str3 + (String)localObject6);
        }
    Object localObject6;
    if ((j == 0) && (paramdlW.cTS()) && ((str1 = a(paramdlW)) != null))
    {
      localObject5 = str1 + str3 + (String)localObject1;
      localObject6 = localaB;
      if (k != 0) {
        localObject6 = "target".equals(paramString2) ? new wZ(localaB) : new aB(localaB);
      }

      ((wZ)localObject6).setName((String)localObject5);
      paramdlW.cTT().put(localObject5, localObject6);
      localFF.b((String)localObject5, (wZ)localObject6);
    }
    if ((localwi != null) && (localObject3 == null)) {
      throw new cJ("onMissingExtensionPoint attribute cannot be specified unless extensionOf is specified", localaB.gu());
    }

    if (localObject3 != null) {
      localObject5 = (dhB)paramdlW.Ga().bR("ant.projectHelper");

      for (localObject6 = wZ.b(localObject3, (String)localObject1, "extensionOf").iterator(); ((Iterator)localObject6).hasNext(); ) { String str4 = (String)((Iterator)localObject6).next();
        if (localwi == null) {
          localwi = wi.blv;
        }

        if (dhB.cQi())
        {
          ((dhB)localObject5).cQf().add(new String[] { str4, localaB.getName(), localwi.name(), str1 + str3 });
        }
        else
        {
          ((dhB)localObject5).cQf().add(new String[] { str4, localaB.getName(), localwi.name() });
        }
      }
    }
  }

  private String a(dlW paramdlW)
  {
    String str1 = dhB.cQg();
    if ((str1 != null) && (str1.length() == 0)) {
      str1 = null;
    }
    if (str1 != null) {
      return str1;
    }

    String str2 = paramdlW.cTK();
    if ("".equals(str2)) {
      str2 = null;
    }

    return str2;
  }

  public djs b(String paramString1, String paramString2, String paramString3, Attributes paramAttributes, dlW paramdlW)
  {
    return dEL.dgy();
  }

  public void a(String paramString1, String paramString2, dlW paramdlW)
  {
    paramdlW.e(paramdlW.cTQ());
  }
}