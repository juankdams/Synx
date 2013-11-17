import java.io.PrintWriter;
import java.util.HashSet;

public class diK extends dOi
{
  public diK(String paramString, diK paramdiK)
  {
    super(null, paramString, paramdiK, false);
  }

  public void a(PrintWriter paramPrintWriter)
  {
    this.mfZ.clear();

    paramPrintWriter.println("\tpublic void " + getMethodName() + "() {");

    for (dpf localdpf : this.mfY) {
      paramPrintWriter.println("\t\t" + localdpf.a(this));
    }

    paramPrintWriter.println("\t}");
  }
}