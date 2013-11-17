import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aYA extends aGK
  implements aFO
{
  public static final String TAG = "antlib";
  private ClassLoader classLoader;
  private String uri = "";
  private List few = new ArrayList();

  public static aYA a(FF paramFF, URL paramURL, String paramString)
  {
    try
    {
      paramURL.openConnection().connect();
    } catch (IOException localIOException) {
      throw new cJ("Unable to find " + paramURL, localIOException);
    }

    aXW localaXW = aXW.v(paramFF);

    localaXW.hA(paramString);
    arR localarR = new arR(paramURL);
    try
    {
      dhB localdhB = null;
      Object localObject1 = paramFF.bR("ant.projectHelper");

      if ((localObject1 instanceof dhB)) {
        localdhB = (dhB)localObject1;
        if (!localdhB.j(localarR)) {
          localdhB = null;
        }
      }
      if (localdhB == null) {
        localObject2 = azA.aLs();

        localdhB = ((azA)localObject2).d(localarR);
      }
      Object localObject2 = localdhB.a(paramFF, localarR);

      if (!((aQS)localObject2).getTag().equals("antlib")) {
        throw new cJ("Unexpected tag " + ((aQS)localObject2).getTag() + " expecting " + "antlib", ((aQS)localObject2).gu());
      }

      aYA localaYA1 = new aYA();
      localaYA1.b(paramFF);
      localaYA1.a(((aQS)localObject2).gu());
      localaYA1.dt("antlib");
      localaYA1.init();
      ((aQS)localObject2).ar(localaYA1);
      return localaYA1;
    } finally {
      localaXW.bno();
    }
  }

  protected void setClassLoader(ClassLoader paramClassLoader)
  {
    this.classLoader = paramClassLoader;
  }

  protected void setURI(String paramString)
  {
    this.uri = paramString;
  }

  private ClassLoader getClassLoader() {
    if (this.classLoader == null) {
      this.classLoader = aYA.class.getClassLoader();
    }
    return this.classLoader;
  }

  public void a(aGK paramaGK)
  {
    this.few.add(paramaGK);
  }

  public void execute()
  {
    for (Iterator localIterator = this.few.iterator(); localIterator.hasNext(); ) {
      aQS localaQS = (aQS)localIterator.next();
      a(localaQS.gu());
      localaQS.aSK();
      Object localObject = localaQS.bhq();
      if (localObject != null)
      {
        if (!(localObject instanceof blM)) {
          throw new cJ("Invalid task in antlib " + localaQS.getTag() + " " + localObject.getClass() + " does not " + "extend org.apache.tools.ant.taskdefs.AntlibDefinition");
        }

        blM localblM = (blM)localObject;
        localblM.setURI(this.uri);
        localblM.d(getClassLoader());
        localblM.init();
        localblM.execute();
      }
    }
  }
}