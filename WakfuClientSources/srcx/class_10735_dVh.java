import java.io.PrintWriter;
import java.util.HashSet;

public class dVh extends cEo
{
  private static final String mtY = "doc";
  private boolean gJq;

  public dVh(K paramK, bdj parambdj, String paramString1, String paramString2, dVh paramdVh, boolean paramBoolean)
  {
    super(paramK, parambdj, paramString1, paramString2, paramdVh, paramBoolean);

    this.gJq = paramBoolean;
  }

  protected void init(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(new cHH(uk.class, "doc", "parser", true));
      a(new bol(null, "push", "elementMaps", new String[] { "currentElementMap" }));
    }
    a(new cHH(cpa.class, "elementMap", "elementMaps.peek()"));
  }

  public String bSL() {
    return "doc";
  }

  public void b(bdj parambdj, String paramString) {
    this.iya = parambdj;
    this.mfV = paramString;

    if (this.iya != null) {
      this.iyb = bc(parambdj);
    }

    if ((this.iya != null) && (this.mfV != null))
      u(this.mfV, this.iya);
  }

  public void a(PrintWriter paramPrintWriter)
  {
    this.mfZ.clear();

    if (this.gJq)
      paramPrintWriter.println("\tpublic void " + getMethodName() + "(ElementMap currentElementMap, DocumentParser parser, Widget " + this.mfV + ") {");
    else {
      paramPrintWriter.println("\tpublic BasicElement " + getMethodName() + "(BasicElement " + this.mfV + ") {");
    }

    for (dpf localdpf : this.mfY) {
      paramPrintWriter.println("\t\t" + localdpf.a(this));
    }

    if (!this.gJq) {
      paramPrintWriter.println("\t\treturn " + this.iyd + ";");
    }

    paramPrintWriter.println("\t}");
  }
}