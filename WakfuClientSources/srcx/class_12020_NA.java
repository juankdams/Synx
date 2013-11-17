import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class NA extends bRt
  implements bNe, bXm
{
  private static final String cdD = "cache.";
  private static final String cdE = "algorithm.";
  private static final String cdF = "comparator.";
  private dDb cdG = null;
  private String cdH;
  private dwQ cdI = null;
  private String cdJ;
  private bHZ cdK = null;
  private String cdL;
  private boolean cdM = true;

  private boolean cdN = true;

  private boolean cdO = true;

  private boolean cdP = true;

  private Comparator cdQ = null;

  private aHJ cdR = null;

  private ctF cdS = null;

  private int cdT = 0;

  private boolean cdU = false;

  private Vector cdV = new Vector();

  private Vector cdW = new Vector();

  private ClassLoader cdX = null;

  private aoo cdY = null;

  public void cd()
  {
    configure();
    if (this.cdS == null)
      be("Cache must be set.");
    else if (this.cdR == null)
      be("Algorithm must be set.");
    else if (!this.cdS.isValid())
      be("Cache must be proper configured.");
    else if (!this.cdR.isValid())
      be("Algorithm must be proper configured.");
  }

  public void configure()
  {
    if (this.cdU) {
      return;
    }
    this.cdU = true;

    FF localFF = Ga();
    String str = "cache.properties";
    File localFile = null;
    if (localFF != null)
    {
      localFile = new File(localFF.PE(), str);

      Ga().a(this);
    }
    else {
      localFile = new File(str);
      bd(false);
    }
    aBM localaBM = new aBM(localFile);
    ac localac = new ac();
    blO localblO = new blO();

    for (Object localObject = this.cdV.iterator(); ((Iterator)localObject).hasNext(); ) { localdaL = (daL)((Iterator)localObject).next();
      if (localdaL.getName().indexOf(".") > 0)
      {
        this.cdW.add(localdaL);
      }
      else b(localdaL);
    }
    daL localdaL;
    this.cdV = new Vector();

    if (this.cdI != null)
    {
      if ("hashvalue".equals(this.cdI.getValue()))
        this.cdR = new dhA();
      else if ("digest".equals(this.cdI.getValue()))
        this.cdR = new ac();
      else if ("checksum".equals(this.cdI.getValue())) {
        this.cdR = new dOV();
      }
    }
    else if (this.cdJ != null)
    {
      this.cdR = ((aHJ)a(this.cdJ, "is not an Algorithm.", aHJ.class));
    }
    else
    {
      this.cdR = localac;
    }

    if (this.cdG != null)
    {
      if ("propertyfile".equals(this.cdG.getValue())) {
        this.cdS = new aBM();
      }
    }
    else if (this.cdH != null)
    {
      this.cdS = ((ctF)a(this.cdH, "is not a Cache.", ctF.class));
    }
    else {
      this.cdS = localaBM;
    }

    if (this.cdK != null)
    {
      if ("equal".equals(this.cdK.getValue()))
        this.cdQ = new blO();
      else if ("rule".equals(this.cdK.getValue()))
      {
        throw new cJ("RuleBasedCollator not yet supported.");
      }

    }
    else if (this.cdL != null)
    {
      localObject = (Comparator)a(this.cdL, "is not a Comparator.", Comparator.class);
      this.cdQ = ((Comparator)localObject);
    }
    else {
      this.cdQ = localblO;
    }

    for (localObject = this.cdW.iterator(); ((Iterator)localObject).hasNext(); ) {
      localdaL = (daL)((Iterator)localObject).next();
      b(localdaL);
    }
    this.cdW = new Vector();
  }

  protected Object a(String paramString1, String paramString2, Class paramClass)
  {
    try
    {
      ClassLoader localClassLoader = getClassLoader();
      Class localClass = null;
      if (localClassLoader != null)
        localClass = localClassLoader.loadClass(paramString1);
      else {
        localClass = Class.forName(paramString1);
      }

      Object localObject = localClass.asSubclass(paramClass).newInstance();

      if (!paramClass.isInstance(localObject)) {
        throw new cJ("Specified class (" + paramString1 + ") " + paramString2);
      }
      return localObject;
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new cJ("Specified class (" + paramString1 + ") not found.");
    } catch (Exception localException) {
      throw new cJ(localException);
    }
  }

  public boolean a(bFe parambFe)
  {
    Object localObject1;
    File localFile1;
    Object localObject2;
    if (parambFe.Jm())
    {
      localObject1 = (WO)parambFe;
      localFile1 = ((WO)localObject1).getFile();
      localObject2 = ((WO)localObject1).getName();
      File localFile2 = ((WO)localObject1).PE();
      return a(localFile2, (String)localObject2, localFile1);
    }

    try
    {
      localObject1 = wh.Fo();
      localFile1 = ((wh)localObject1).a("modified-", ".tmp", null, true, false);
      localObject2 = new WO(localFile1);
      btC.a(parambFe, (bFe)localObject2);
      boolean bool = a(localFile1.getParentFile(), localFile1.getName(), parambFe.bMV());

      localFile1.delete();
      return bool;
    } catch (UnsupportedOperationException localUnsupportedOperationException) {
      d("The resource '" + parambFe.getName() + "' does not provide an InputStream, so it is not checked. " + "Akkording to 'selres' attribute value it is " + (this.cdO ? "" : " not") + "selected.", 2);

      return this.cdO;
    } catch (Exception localException) {
      throw new cJ(localException);
    }
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    return a(paramFile1, paramString, paramFile2.getAbsolutePath());
  }

  private boolean a(File paramFile, String paramString1, String paramString2)
  {
    validate();
    File localFile = new File(paramFile, paramString1);

    if (localFile.isDirectory()) {
      return this.cdN;
    }

    String str1 = String.valueOf(this.cdS.get(localFile.getAbsolutePath()));
    String str2 = this.cdR.a(localFile);

    boolean bool = this.cdQ.compare(str1, str2) != 0;

    if ((this.cdM) && (bool)) {
      this.cdS.put(localFile.getAbsolutePath(), str2);
      fY(ZJ() + 1);
      if (!ZK()) {
        ZI();
      }
    }

    return bool;
  }

  protected void ZI()
  {
    if (ZJ() > 0) {
      this.cdS.save();
      fY(0);
    }
  }

  public void cM(String paramString)
  {
    this.cdJ = paramString;
  }

  public void cN(String paramString)
  {
    this.cdL = paramString;
  }

  public void cO(String paramString)
  {
    this.cdH = paramString;
  }

  public void ba(boolean paramBoolean)
  {
    this.cdM = paramBoolean;
  }

  public void bb(boolean paramBoolean)
  {
    this.cdN = paramBoolean;
  }

  public void bc(boolean paramBoolean)
  {
    this.cdO = paramBoolean;
  }

  public int ZJ()
  {
    return this.cdT;
  }

  public void fY(int paramInt)
  {
    this.cdT = paramInt;
  }

  public boolean ZK()
  {
    return this.cdP;
  }

  public void bd(boolean paramBoolean)
  {
    this.cdP = paramBoolean;
  }

  public void c(aoo paramaoo)
  {
    if (this.cdY != null) {
      throw new cJ("<classpath> can be set only once.");
    }
    this.cdY = paramaoo;
  }

  public ClassLoader getClassLoader()
  {
    if (this.cdX == null) {
      this.cdX = (this.cdY == null ? getClass().getClassLoader() : Ga().b(this.cdY));
    }

    return this.cdX;
  }

  public void setClassLoader(ClassLoader paramClassLoader)
  {
    this.cdX = paramClassLoader;
  }

  public void i(String paramString, Object paramObject)
  {
    daL localdaL = new daL();
    localdaL.setName(paramString);
    localdaL.setValue(String.valueOf(paramObject));
    this.cdV.add(localdaL);
  }

  public void a(daL paramdaL)
  {
    this.cdV.add(paramdaL);
  }

  public void a(daL[] paramArrayOfdaL)
  {
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++)
        this.cdV.add(paramArrayOfdaL[i]);
  }

  public void b(daL paramdaL)
  {
    String str1 = paramdaL.getName();
    String str2 = paramdaL.getValue();
    Object localObject;
    if ("cache".equals(str1)) {
      localObject = new dDb();
      ((dDb)localObject).setValue(str2);
      a((dDb)localObject);
    } else if ("algorithm".equals(str1)) {
      localObject = new dwQ();
      ((dwQ)localObject).setValue(str2);
      a((dwQ)localObject);
    } else if ("comparator".equals(str1)) {
      localObject = new bHZ();
      ((bHZ)localObject).setValue(str2);
      a((bHZ)localObject);
    }
    else
    {
      boolean bool;
      if ("update".equals(str1)) {
        bool = "true".equalsIgnoreCase(str2);

        ba(bool);
      } else if ("delayupdate".equals(str1)) {
        bool = "true".equalsIgnoreCase(str2);

        bd(bool);
      } else if ("seldirs".equals(str1)) {
        bool = "true".equalsIgnoreCase(str2);

        bb(bool);
      }
      else
      {
        String str3;
        if (str1.startsWith("cache.")) {
          str3 = str1.substring("cache.".length());
          a(this.cdS, str3, str2);
        } else if (str1.startsWith("algorithm.")) {
          str3 = str1.substring("algorithm.".length());
          a(this.cdR, str3, str2);
        } else if (str1.startsWith("comparator.")) {
          str3 = str1.substring("comparator.".length());
          a(this.cdQ, str3, str2);
        } else {
          be("Invalid parameter " + str1);
        }
      }
    }
  }

  protected void a(Object paramObject, String paramString1, String paramString2)
  {
    FF localFF = Ga() != null ? Ga() : new FF();
    wE localwE = wE.a(localFF, paramObject.getClass());
    try
    {
      localwE.a(localFF, paramObject, paramString1, paramString2);
    }
    catch (cJ localcJ)
    {
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("{modifiedselector");
    localStringBuffer.append(" update=").append(this.cdM);
    localStringBuffer.append(" seldirs=").append(this.cdN);
    localStringBuffer.append(" cache=").append(this.cdS);
    localStringBuffer.append(" algorithm=").append(this.cdR);
    localStringBuffer.append(" comparator=").append(this.cdQ);
    localStringBuffer.append("}");
    return localStringBuffer.toString();
  }

  public void b(aaQ paramaaQ)
  {
    if (ZK())
      ZI();
  }

  public void f(aaQ paramaaQ)
  {
    if (ZK())
      ZI();
  }

  public void h(aaQ paramaaQ)
  {
    if (ZK())
      ZI();
  }

  public void a(aaQ paramaaQ)
  {
  }

  public void e(aaQ paramaaQ)
  {
  }

  public void g(aaQ paramaaQ)
  {
  }

  public void i(aaQ paramaaQ)
  {
  }

  public ctF ZL()
  {
    return this.cdS;
  }

  public void a(dDb paramdDb)
  {
    this.cdG = paramdDb;
  }

  public aHJ ZM()
  {
    return this.cdR;
  }

  public void a(dwQ paramdwQ)
  {
    this.cdI = paramdwQ;
  }

  public Comparator getComparator()
  {
    return this.cdQ;
  }

  public void a(bHZ parambHZ)
  {
    this.cdK = parambHZ;
  }
}