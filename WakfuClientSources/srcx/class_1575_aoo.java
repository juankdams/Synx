import java.io.File;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class aoo extends cwV
  implements Ae, Cloneable
{
  public static aoo dtm = new aoo(null, System.getProperty("java.class.path"));

  public static aoo dtn = new aoo(null, System.getProperty("sun.boot.class.path"));
  private Boolean dto;
  private oK dtp = null;
  private boolean dtq = false;

  public aoo(FF paramFF, String paramString)
  {
    this(paramFF);
    aAC().setPath(paramString);
  }

  public aoo(FF paramFF)
  {
    b(paramFF);
  }

  public void E(File paramFile)
  {
    cuu();
    aAC().E(paramFile);
  }

  public void setPath(String paramString)
  {
    cuu();
    aAC().setPath(paramString);
  }

  public void a(cxK paramcxK)
  {
    if (this.dtp != null) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public bxJ aAC()
  {
    if (cum()) {
      throw cur();
    }
    bxJ localbxJ = new bxJ(this);
    b(localbxJ);
    return localbxJ;
  }

  public void b(bQM parambQM)
  {
    if (parambQM.Ga() == null) {
      parambQM.b(Ga());
    }
    b(parambQM);
  }

  public void a(Ba paramBa)
  {
    if (paramBa.Ga() == null) {
      paramBa.b(Ga());
    }
    b(paramBa);
  }

  public void a(dvE paramdvE)
  {
    if (paramdvE.Ga() == null) {
      paramdvE.b(Ga());
    }
    b(paramdvE);
  }

  public void d(aoo paramaoo)
  {
    if (paramaoo == this) {
      throw cus();
    }
    if (paramaoo.Ga() == null) {
      paramaoo.b(Ga());
    }
    b(paramaoo);
  }

  public void b(Ae paramAe)
  {
    cuv();
    if (paramAe == null) {
      return;
    }
    if (this.dtp == null) {
      this.dtp = new oK();
      this.dtp.b(Ga());
      this.dtp.cD(this.dtq);
    }
    this.dtp.b(paramAe);
    setChecked(false);
  }

  public aoo aAD()
  {
    aoo localaoo = new aoo(Ga());
    d(localaoo);
    return localaoo;
  }

  public void e(aoo paramaoo)
  {
    if (paramaoo == null) {
      return;
    }
    d(paramaoo);
  }

  public void f(aoo paramaoo)
  {
    a(paramaoo, false);
  }

  public void a(aoo paramaoo, boolean paramBoolean)
  {
    String[] arrayOfString = paramaoo.list();
    File localFile1 = paramBoolean ? new File(System.getProperty("user.dir")) : null;

    for (int i = 0; i < arrayOfString.length; i++) {
      File localFile2 = c(Ga(), arrayOfString[i]);

      if ((paramBoolean) && (!localFile2.exists())) {
        localFile2 = new File(localFile1, arrayOfString[i]);
      }
      if (localFile2.exists()) {
        E(localFile2);
      } else if ((localFile2.getParentFile() != null) && (localFile2.getParentFile().exists()) && (eS(localFile2.getName())))
      {
        E(localFile2);
        d("adding " + localFile2 + " which contains wildcards and may not" + " do what you intend it to do depending on your OS or" + " version of Java", 3);
      }
      else
      {
        d("dropping " + localFile2 + " from path as it doesn't exist", 3);
      }
    }
  }

  public void cD(boolean paramBoolean)
  {
    cuu();
    this.dtq = paramBoolean;
    if (this.dtp != null)
      this.dtp.cD(paramBoolean);
  }

  public String[] list()
  {
    if (cum()) {
      return ((aoo)cup()).list();
    }
    return c(this.dtp) == null ? new String[0] : this.dtp.list();
  }

  public String toString()
  {
    return this.dtp == null ? "" : cum() ? cup().toString() : this.dtp.toString();
  }

  public static String[] b(FF paramFF, String paramString)
  {
    Vector localVector = new Vector();
    if (paramString == null) {
      return new String[0];
    }
    dGZ localdGZ = new dGZ(paramString);
    StringBuffer localStringBuffer = new StringBuffer();
    while (localdGZ.hasMoreTokens()) {
      String str = localdGZ.nextToken();
      try {
        localStringBuffer.append(c(paramFF, str).getPath());
      } catch (cJ localcJ) {
        paramFF.d("Dropping path element " + str + " as it is not valid relative to the project", 3);
      }

      for (int i = 0; i < localStringBuffer.length(); i++) {
        a(localStringBuffer, i);
      }
      localVector.addElement(localStringBuffer.toString());
      localStringBuffer = new StringBuffer();
    }
    return (String[])localVector.toArray(new String[localVector.size()]);
  }

  public static String eP(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    for (int i = 0; i < localStringBuffer.length(); i++) {
      a(localStringBuffer, i);
    }
    return localStringBuffer.toString();
  }

  protected static boolean a(StringBuffer paramStringBuffer, int paramInt)
  {
    if ((paramStringBuffer.charAt(paramInt) == '/') || (paramStringBuffer.charAt(paramInt) == '\\')) {
      paramStringBuffer.setCharAt(paramInt, File.separatorChar);
      return true;
    }
    return false;
  }

  public synchronized int size()
  {
    if (cum()) {
      return ((aoo)cup()).size();
    }
    cuo();
    return this.dtp == null ? 0 : c(this.dtp).size();
  }

  public Object clone()
  {
    try
    {
      aoo localaoo = (aoo)super.clone();
      localaoo.dtp = (this.dtp == null ? this.dtp : (oK)this.dtp.clone());
      return localaoo;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      if (this.dtp != null) {
        b(this.dtp, paramStack, paramFF);
      }
      setChecked(true);
    }
  }

  private static File c(FF paramFF, String paramString)
  {
    return wh.Fo().e(paramFF == null ? null : paramFF.PE(), paramString);
  }

  public aoo aAE()
  {
    return eQ("last");
  }

  public aoo eQ(String paramString)
  {
    return a(paramString, dtm);
  }

  public aoo eR(String paramString)
  {
    return a(paramString, dtn);
  }

  private aoo a(String paramString, aoo paramaoo)
  {
    aoo localaoo = new aoo(Ga());

    Object localObject = paramString;
    String str = Ga() != null ? Ga().getProperty("build.sysclasspath") : System.getProperty("build.sysclasspath");

    if (str != null) {
      localObject = str;
    }
    if (((String)localObject).equals("only"))
    {
      localaoo.a(paramaoo, true);
    }
    else if (((String)localObject).equals("first"))
    {
      localaoo.a(paramaoo, true);
      localaoo.f(this);
    }
    else if (((String)localObject).equals("ignore"))
    {
      localaoo.f(this);
    }
    else
    {
      if (!((String)localObject).equals("last")) {
        d("invalid value for build.sysclasspath: " + (String)localObject, 1);
      }

      localaoo.f(this);
      localaoo.a(paramaoo, true);
    }
    return localaoo;
  }

  public void aAF()
  {
    Object localObject;
    if (cpW.cpk())
    {
      localObject = new File(System.getProperty("java.home") + File.separator + "share" + File.separator + "kaffe");

      if (((File)localObject).isDirectory()) {
        bQM localbQM = new bQM();
        localbQM.s((File)localObject);
        localbQM.bE("*.jar");
        b(localbQM);
      }
    } else if ("GNU libgcj".equals(System.getProperty("java.vm.name"))) {
      f(dtn);
    }

    if (System.getProperty("java.vendor").toLowerCase(Locale.ENGLISH).indexOf("microsoft") >= 0)
    {
      localObject = new bQM();
      ((bQM)localObject).s(new File(System.getProperty("java.home") + File.separator + "Packages"));

      ((bQM)localObject).bE("*.ZIP");
      b((bQM)localObject);
    }
    else {
      f(new aoo(null, System.getProperty("java.home") + File.separator + "lib" + File.separator + "rt.jar"));

      f(new aoo(null, System.getProperty("java.home") + File.separator + "jre" + File.separator + "lib" + File.separator + "rt.jar"));

      localObject = new String[] { "jce", "jsse" };
      for (int i = 0; i < localObject.length; i++) {
        f(new aoo(null, System.getProperty("java.home") + File.separator + "lib" + File.separator + localObject[i] + ".jar"));

        f(new aoo(null, System.getProperty("java.home") + File.separator + ".." + File.separator + "Classes" + File.separator + localObject[i] + ".jar"));
      }

      String[] arrayOfString = { "core", "graphics", "security", "server", "xml" };

      for (int j = 0; j < arrayOfString.length; j++) {
        f(new aoo(null, System.getProperty("java.home") + File.separator + "lib" + File.separator + arrayOfString[j] + ".jar"));
      }

      f(new aoo(null, System.getProperty("java.home") + File.separator + ".." + File.separator + "Classes" + File.separator + "classes.jar"));

      f(new aoo(null, System.getProperty("java.home") + File.separator + ".." + File.separator + "Classes" + File.separator + "ui.jar"));
    }
  }

  public void g(aoo paramaoo)
  {
    if (paramaoo == null) {
      localObject = System.getProperty("java.ext.dirs");
      if (localObject != null)
        paramaoo = new aoo(Ga(), (String)localObject);
      else {
        return;
      }
    }

    Object localObject = paramaoo.list();
    for (int i = 0; i < localObject.length; i++) {
      File localFile = c(Ga(), localObject[i]);
      if ((localFile.exists()) && (localFile.isDirectory())) {
        bQM localbQM = new bQM();
        localbQM.s(localFile);
        localbQM.bE("*");
        b(localbQM);
      }
    }
  }

  public final synchronized Iterator iterator()
  {
    if (cum()) {
      return ((aoo)cup()).iterator();
    }
    cuo();
    if (aAH()) {
      return new CJ(Ga(), null, list());
    }
    return this.dtp == null ? Collections.emptySet().iterator() : c(this.dtp).iterator();
  }

  public synchronized boolean Jm()
  {
    if (cum()) {
      return ((aoo)cup()).Jm();
    }
    cuo();
    c(this.dtp);
    return true;
  }

  protected Ae c(Ae paramAe)
  {
    if ((paramAe != null) && (!paramAe.Jm())) {
      throw new cJ(cun() + " allows only filesystem resources.");
    }

    return paramAe;
  }

  protected boolean aAG()
  {
    if (getClass().equals(aoo.class))
      return false;
    try
    {
      Method localMethod = getClass().getMethod("list", (Class[])null);
      return !localMethod.getDeclaringClass().equals(aoo.class);
    } catch (Exception localException) {
    }
    return false;
  }

  private synchronized boolean aAH()
  {
    if (this.dto == null) {
      this.dto = (aAG() ? Boolean.TRUE : Boolean.FALSE);
    }
    return this.dto.booleanValue();
  }

  private static boolean eS(String paramString)
  {
    return (paramString != null) && ((paramString.indexOf("*") > -1) || (paramString.indexOf("?") > -1));
  }
}