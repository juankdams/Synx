import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class deg
{
  protected String m_name;
  protected String bT;
  protected final HashSet kYf = new HashSet();
  protected final ArrayList kYg = new ArrayList();

  protected dOi kYh = null;
  protected PrintWriter kYi;
  protected int kYj = 0;

  public deg(PrintWriter paramPrintWriter, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
      this.m_name = "Class0";
    else {
      this.m_name = paramString1;
    }

    this.bT = paramString2;

    this.kYi = paramPrintWriter;
  }

  protected void init()
  {
  }

  public void al(Class paramClass)
  {
    if (!paramClass.isPrimitive())
      this.kYf.add(paramClass);
  }

  public void a(dpf paramdpf)
  {
    this.kYh.a(paramdpf);
  }

  public String bc(Object paramObject)
  {
    return this.kYh.bc(paramObject);
  }

  public Object oW(String paramString)
  {
    return this.kYh.oW(paramString);
  }

  public String can()
  {
    return this.kYh.can();
  }

  public void u(String paramString, Object paramObject)
  {
    this.kYh.u(paramString, paramObject);
  }

  public boolean ks(String paramString)
  {
    return this.kYh.ks(paramString);
  }

  public void kt(String paramString)
  {
    this.kYh.kt(paramString);
  }

  public String getClassName() {
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append(this.m_name.substring(0, 1).toUpperCase());
    if (this.m_name.length() > 1) {
      localStringBuilder.append(this.m_name.substring(0, this.m_name.length()));
    }

    return localStringBuilder.toString();
  }

  public boolean cOW()
  {
    return this.kYh.isFull();
  }

  public void mark() {
    this.kYh.mark();
  }

  public void resetMark() {
    this.kYh.resetMark();
  }

  public void cOX() {
    this.kYh.cOX();
  }

  protected void a(dOi paramdOi)
  {
    this.kYh.b(paramdOi);
    this.kYh = paramdOi;
    this.kYg.add(this.kYh);
  }

  public void Hg()
  {
    this.kYh = this.kYh.dqk();
  }

  public void Hh()
  {
    for (Iterator localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (dOi)localIterator1.next();
      for (dpf localdpf : ((dOi)localObject).dql()) {
        Class localClass = localdpf.bya();
        if (localClass != null)
          al(localClass);
      }
    }
    Object localObject;
    if (this.bT != null) {
      this.kYi.println("package " + this.bT + ";");
    }

    this.kYi.println();

    for (localIterator1 = this.kYf.iterator(); localIterator1.hasNext(); ) { localObject = (Class)localIterator1.next();

      this.kYi.println("import " + ((Class)localObject).getCanonicalName() + ";");
    }

    this.kYi.println();

    this.kYi.println("public class " + this.m_name + " implements BasicElementFactory {");

    this.kYi.println();

    this.kYi.println("private Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
    this.kYi.println("private Environment env;");

    this.kYi.println();

    for (localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (dOi)localIterator1.next();
      ((dOi)localObject).a(this.kYi);
      this.kYi.println();
    }

    this.kYi.println("}");
    this.kYi.flush();
  }
}