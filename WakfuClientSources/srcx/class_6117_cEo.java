import java.io.PrintWriter;
import java.util.HashSet;

public class cEo extends dOi
{
  protected bdj iya;
  protected String iyb;
  protected String iyc;
  protected String iyd = null;

  public cEo(K paramK, bdj parambdj, String paramString1, String paramString2, cEo paramcEo, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramcEo, paramBoolean);

    init(paramBoolean);

    this.iyc = bc(paramK);

    b(parambdj, paramString1);

    this.iyd = null;
  }

  protected void init(boolean paramBoolean) {
    if (paramBoolean) {
      a(new cHH(cDA.class, "env", "environment", true));
      a(new bol(null, "push", "elementMaps", new String[] { "currentElementMap" }));
    }
    a(new cHH(cpa.class, "elementMap", "elementMaps.peek()"));
  }

  String bc(Object paramObject)
  {
    String str = super.bc(paramObject);

    if ((this.iyd == null) && ((paramObject instanceof aNL))) {
      this.iyd = str;
    }

    return str;
  }

  public bdj czZ()
  {
    return this.iya;
  }

  public String chI()
  {
    return this.iyb;
  }

  public String chJ()
  {
    return this.iyc;
  }

  public String getReturnValue()
  {
    return this.iyd;
  }

  public void u(String paramString, Object paramObject)
  {
    super.u(paramString, paramObject);

    if ((this.iyd == null) && ((paramObject instanceof aNL)))
      this.iyd = paramString;
  }

  public void a(bdj parambdj, String paramString, boolean paramBoolean)
  {
    this.iya = parambdj;
    this.mfV = paramString;

    if (this.iya != null) {
      this.iyb = bc(parambdj);
    }

    if (paramBoolean) {
      this.iyb = paramString;
    }

    if ((this.iya != null) && (this.mfV != null))
      u(this.mfV, this.iya);
  }

  public void b(bdj parambdj, String paramString)
  {
    a(parambdj, paramString, false);
  }

  public void a(PrintWriter paramPrintWriter)
  {
    this.mfZ.clear();

    if ((this.mfV == null) && (this.iya == null))
      paramPrintWriter.println("\tpublic BasicElement " + getMethodName() + "(Environment environment, ElementMap currentElementMap) {");
    else {
      paramPrintWriter.println("\tpublic BasicElement " + getMethodName() + "(BasicElement " + this.mfV + ") {");
    }

    for (dpf localdpf : this.mfY) {
      paramPrintWriter.println("\t\t" + localdpf.a(this));
    }

    paramPrintWriter.println("\t\treturn " + this.iyd + ";");

    paramPrintWriter.println("\t}");
  }
}