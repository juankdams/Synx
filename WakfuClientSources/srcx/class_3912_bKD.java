import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class bKD extends deg
{
  static final String gNx = "doc";
  private final uk aEF;

  public bKD(PrintWriter paramPrintWriter, String paramString1, String paramString2, uk paramuk)
  {
    super(paramPrintWriter, paramString1, paramString2);

    this.kYh = new gx(paramuk, "doc", "initTheme", null, true);
    this.kYg.add(this.kYh);

    al(cDt.class);
    al(uk.class);
    al(bNa.class);

    this.kYi = paramPrintWriter;
    this.aEF = paramuk;
  }

  public String bSL()
  {
    return "doc";
  }

  public uk bSM() {
    return this.aEF;
  }

  public void b(uk paramuk)
  {
    a(new gx(paramuk, "doc", "method" + this.kYj++, (gx)this.kYh, false));
  }

  public void Hg()
  {
    bol localbol = new bol(null, ((gx)this.kYh).getMethodName(), null, new String[] { ((gx)this.kYh).dqj() });
    super.Hg();
    ((gx)this.kYh).a(localbol);
  }

  public void Hh() {
    for (Iterator localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (gx)localIterator1.next();
      for (dpf localdpf : ((gx)localObject).dql()) {
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

    this.kYi.println("public class " + this.m_name + " implements ThemeLoader {");

    this.kYi.println();

    for (localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (gx)localIterator1.next();
      ((gx)localObject).a(this.kYi);
      this.kYi.println();
    }

    this.kYi.println("}");
    this.kYi.flush();
  }
}