import com.ankamagames.baseImpl.client.proxyclient.base.console.command.NavigateToCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.log4j.Logger;

public class coq extends aeF
{
  protected static final Logger K = Logger.getLogger(coq.class);
  private coq hVP;
  private ArrayList bFw;

  public coq()
  {
    this("", "", false);
  }

  public coq(String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramBoolean);
    this.bFw = new ArrayList();
  }

  public boolean f(URL paramURL)
  {
    SAXParserFactory localSAXParserFactory = SAXParserFactory.newInstance();
    try {
      SAXParser localSAXParser = localSAXParserFactory.newSAXParser();
      bTK localbTK = new bTK(this);
      localSAXParser.parse(paramURL.openStream(), localbTK);
      return true;
    } catch (Exception localException) {
      K.error("SAX parser error :", localException);
    }
    return false;
  }

  public void V(ArrayList paramArrayList) {
    for (aZi localaZi : paramArrayList)
      cov().b(localaZi);
  }

  public boolean e(String paramString, byte paramByte)
  {
    for (aeF localaeF : f(paramString, paramByte)) {
      if (localaeF.aqo())
        return true;
    }
    return false;
  }

  public ArrayList getChildren()
  {
    return this.bFw;
  }

  public void b(aeF paramaeF)
  {
    this.bFw.add(paramaeF);
  }

  private void a(coq paramcoq)
  {
    this.hVP = paramcoq;
  }

  public coq cou()
  {
    return this.hVP;
  }

  public boolean isRoot()
  {
    return this.hVP == null;
  }

  public coq cov()
  {
    if (isRoot()) {
      return this;
    }
    return cou().cov();
  }

  public String getPath()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.hVP != null) {
      localStringBuilder.append(cou().getPath());
    }
    return getName() + "/";
  }

  public ArrayList f(String paramString, byte paramByte)
  {
    ArrayList localArrayList = new ArrayList();
    for (aeF localaeF : this.bFw) {
      if (localaeF.aql() <= paramByte) {
        Matcher localMatcher = localaeF.aqm().matcher(paramString);
        if (localMatcher.matches()) {
          localArrayList.add(localaeF);
        }
      }
    }
    return localArrayList;
  }

  public ArrayList cow()
  {
    ArrayList localArrayList = new ArrayList();
    for (aeF localaeF : this.bFw) {
      localArrayList.add(localaeF.getName());
    }
    return localArrayList;
  }

  public dnc aqp()
  {
    return new NavigateToCommandSetCommand(this);
  }
}