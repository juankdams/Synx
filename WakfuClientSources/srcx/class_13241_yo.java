import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class yo extends deg
{
  private int brR = 0;

  public yo(PrintWriter paramPrintWriter, String paramString1, String paramString2) {
    super(paramPrintWriter, paramString1, paramString2);

    al(cTp.class);
    al(aTK.class);
    al(HashMap.class);

    this.kYh = new diK("init", null);
    this.kYg.add(this.kYh);
  }

  public void a(dpf paramdpf)
  {
    if (((diK)this.kYh).isFull()) {
      Hf();
      this.brR += 1;
    }
    super.a(paramdpf);
  }

  public void Hf() {
    a(new diK("init" + this.kYj++, (diK)this.kYh));
  }

  public void Hg()
  {
    bol localbol = new bol(null, ((diK)this.kYh).getMethodName(), null);
    super.Hg();
    ((diK)this.kYh).a(localbol);
  }

  public void Hh() {
    for (int i = this.brR - 1; i >= 0; i--) {
      Hg();
    }

    for (Iterator localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (diK)localIterator1.next();
      for (dpf localdpf : ((diK)localObject).dql()) {
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

    this.kYi.println("public class " + this.m_name + " implements StyleProvider {");

    this.kYi.println();

    this.kYi.println("\tprivate HashMap<String, StyleSetter> m_setters = new HashMap<String, StyleSetter>();");

    this.kYi.println("\tpublic " + this.m_name + "() {");
    this.kYi.println("\t\tinit();");
    this.kYi.println("\t}");

    this.kYi.println("\tpublic StyleSetter getStyleSetter(String style) {");
    this.kYi.println("\t\treturn m_setters.get(style);");
    this.kYi.println("\t}");

    this.kYi.println();

    for (localIterator1 = this.kYg.iterator(); localIterator1.hasNext(); ) { localObject = (diK)localIterator1.next();
      ((diK)localObject).a(this.kYi);
      this.kYi.println();
    }

    this.kYi.println("}");
    this.kYi.flush();
  }
}