import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class ceK extends deg
{
  private K hzk;

  public ceK(PrintWriter paramPrintWriter, String paramString1, String paramString2, K paramK)
  {
    super(paramPrintWriter, paramString1, paramString2);

    C(paramK);

    al(bdj.class);
    al(aNL.class);
    al(cEa.class);
    al(K.class);
    al(Stack.class);
  }

  protected void C(K paramK)
  {
    this.kYh = new cEo(paramK, null, null, "getElement", null, true);
    this.kYg.add(this.kYh);
  }

  public String chI()
  {
    return ((cEo)this.kYg.get(0)).chI();
  }

  public String chJ()
  {
    return ((cEo)this.kYg.get(0)).chJ();
  }

  public void a(K paramK, bdj parambdj, String paramString) {
    a(new cEo(paramK, parambdj, paramString, "method" + this.kYj++, (cEo)this.kYh, false));
  }

  public void Hg()
  {
    bol localbol = new bol(null, this.kYh.getMethodName(), null, new String[] { this.kYh.dqj() });
    super.Hg();
    this.kYh.a(localbol);
  }

  public void Hh() {
    int i = 0;
    Object localObject;
    for (int j = this.kYg.size(); i < j; i++) {
      cEo localcEo = (cEo)this.kYg.get(i);
      localObject = localcEo.dql();
      int m = 0; for (int n = ((ArrayList)localObject).size(); m < n; m++) {
        Class localClass = ((dpf)((ArrayList)localObject).get(m)).bya();
        if (localClass != null) {
          al(localClass);
        }
      }
    }

    if (this.bT != null) {
      this.kYi.println("package " + this.bT + ";");
    }

    this.kYi.println();

    Iterator localIterator = this.kYf.iterator();
    while (localIterator.hasNext()) {
      this.kYi.println("import " + ((Class)localIterator.next()).getCanonicalName() + ";");
    }

    this.kYi.println();

    this.kYi.println("public class " + this.m_name + " implements BasicElementFactory {");

    this.kYi.println();

    this.kYi.println("private Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
    this.kYi.println("private Environment env;");

    this.kYi.println();

    j = 0; for (int k = this.kYg.size(); j < k; j++) {
      localObject = (cEo)this.kYg.get(j);
      ((cEo)localObject).a(this.kYi);
      this.kYi.println();
    }

    this.kYi.println("}");
    this.kYi.flush();
  }
}