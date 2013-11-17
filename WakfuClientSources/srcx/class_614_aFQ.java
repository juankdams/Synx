public class aFQ
  implements bNe
{
  private static final String ecN = "file";
  private static final String ecO = "dir";
  private static final String ecP = "any";
  public static final aFQ ecQ = new aFQ(new aqE("file"));

  public static final aFQ ecR = new aFQ(new aqE("dir"));

  public static final aFQ ecS = new aFQ(new aqE("any"));

  private aqE ecT = null;

  public aFQ()
  {
  }

  public aFQ(aqE paramaqE)
  {
    a(paramaqE);
  }

  public void a(aqE paramaqE)
  {
    this.ecT = paramaqE;
  }

  public boolean a(bFe parambFe)
  {
    if (this.ecT == null) {
      throw new cJ("The type attribute is required.");
    }
    int i = this.ecT.getIndex();
    return (i == 2) || (parambFe.isDirectory() ? i == 1 : i == 0);
  }
}