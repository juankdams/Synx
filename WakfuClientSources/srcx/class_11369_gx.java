import java.io.PrintWriter;
import java.util.HashSet;

public class gx extends dOi
{
  private uk aEF;

  public gx(uk paramuk, String paramString1, String paramString2, gx paramgx, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramgx, paramBoolean);

    this.aEF = paramuk;
  }

  public void a(PrintWriter paramPrintWriter)
  {
    this.mfZ.clear();

    paramPrintWriter.println("\tpublic void " + getMethodName() + "(DocumentParser " + this.mfV + ") {");

    for (dpf localdpf : this.mfY) {
      paramPrintWriter.println("\t\t" + localdpf.a(this));
    }

    paramPrintWriter.println("\t}");
  }
}