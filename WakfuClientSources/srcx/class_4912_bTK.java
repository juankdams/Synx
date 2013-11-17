import java.util.Stack;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class bTK extends DefaultHandler
{
  private static final String hfr = "commandList";
  private static final String hfs = "commandSet";
  private static final String hft = "command";
  private static final String NAME_ATTRIBUTE = "name";
  private static final String hfu = "cmdPattern";
  private static final String hfv = "argsPattern";
  private static final String hfw = "allowNoArg";
  private static final String CLASS_ATTRIBUTE = "class";
  private static final String LEVEL_ATTRIBUTE = "level";
  private static final String hfx = "autoCompletion";
  private Stack hfy;

  public bTK(coq paramcoq)
  {
    this.hfy = new Stack();
    this.hfy.add(paramcoq);
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    if (!paramString3.equals("commandList"))
    {
      String str1 = paramAttributes.getValue("name");
      String str2 = paramAttributes.getValue("cmdPattern");
      String str3 = paramAttributes.getValue("argsPattern");
      boolean bool1 = (paramAttributes.getValue("allowNoArg") != null) && (Boolean.parseBoolean(paramAttributes.getValue("allowNoArg")));
      String str4 = paramAttributes.getValue("level");
      boolean bool2 = (paramAttributes.getValue("autoCompletion") != null) && (Boolean.parseBoolean(paramAttributes.getValue("autoCompletion")));

      if ((str2 == null) || (str2.length() == 0))
        coq.K.error("cmdPattern est invalide pour " + str1 + "!");
      Object localObject1;
      Object localObject2;
      if (paramString3.equals("commandSet"))
      {
        localObject1 = new coq(str2, str3, bool1);
        if (str1 != null) {
          ((coq)localObject1).setName(str1);
        }
        if (str4 != null) {
          ((coq)localObject1).aN(Byte.valueOf(str4).byteValue());
        }

        if (!this.hfy.isEmpty()) {
          localObject2 = (coq)this.hfy.lastElement();
          coq.a((coq)localObject1, (coq)localObject2);
          ((coq)localObject2).b((aeF)localObject1);
        }

        this.hfy.add(localObject1);
      }
      else if (paramString3.equals("command"))
      {
        localObject1 = paramAttributes.getValue("class");
        try {
          localObject2 = null;
          try {
            localObject2 = (dnc)getClass().getClassLoader().loadClass((String)localObject1).newInstance();
          } catch (InstantiationException localInstantiationException) {
            coq.K.error(localInstantiationException.getMessage());
          } catch (IllegalAccessException localIllegalAccessException) {
            coq.K.error(localIllegalAccessException.getMessage());
          } catch (ClassCastException localClassCastException) {
            coq.K.error(localClassCastException.getMessage());
          }

          if (!this.hfy.isEmpty()) {
            aZi localaZi = new aZi(str2, str3, (dnc)localObject2, bool1);
            if (str1 != null) {
              localaZi.setName(str1);
            }
            if (str4 != null) {
              localaZi.aN(Byte.valueOf(str4).byteValue());
            }
            localaZi.bV(bool2);
            ((coq)this.hfy.lastElement()).b(localaZi);
          }
        } catch (ClassNotFoundException localClassNotFoundException) {
          coq.K.error("ClassNotFound", localClassNotFoundException);
        }
      }
    }
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3.equals("commandSet"))
    {
      this.hfy.pop();
    }
  }

  public void endDocument()
  {
  }
}