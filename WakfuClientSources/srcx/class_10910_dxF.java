import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class dxF extends ceK
{
  private static final String lEy = "doc";
  private bdj iya;

  public dxF(PrintWriter paramPrintWriter, String paramString1, String paramString2, K paramK, bdj parambdj, uk paramuk)
  {
    super(paramPrintWriter, paramString1, paramString2, paramK);

    al(aTK.class);

    ((dVh)this.kYh).a(parambdj, "element", true);
  }

  protected void C(K paramK)
  {
    this.kYh = new dVh(paramK, null, null, "applyStyle", null, true);
    this.kYg.add(this.kYh);
  }

  public void a(K paramK, bdj parambdj, String paramString) {
    a(new dVh(paramK, parambdj, paramString, "method" + this.kYj++, (dVh)this.kYh, false));
  }

  public void Hg()
  {
    bol localbol = new bol(null, this.kYh.getMethodName(), null, new String[] { this.kYh.dqj() });
    this.kYh = this.kYh.dqk();
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

    this.kYi.println("public class " + this.m_name + " implements StyleSetter {");

    this.kYi.println();

    this.kYi.println("private DocumentParser doc;");
    this.kYi.println("private Stack<ElementMap> elementMaps = new Stack<ElementMap>();");

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