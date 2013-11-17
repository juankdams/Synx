import java.io.Reader;
import java.util.Properties;

public final class djS extends bgQ
  implements bEc
{
  private static final int EOF = -1;
  private char[] lgZ;
  private int index;
  private cex lha;

  public djS()
  {
  }

  public djS(Reader paramReader)
  {
    super(paramReader);
  }

  public void b(cex paramcex)
  {
    if (this.lha != null) {
      throw new cJ("expandproperties filter accepts only one propertyset");
    }
    this.lha = paramcex;
  }

  public int read()
  {
    if (this.index > -1) {
      if (this.lgZ == null) {
        String str = btq();
        FF localFF = Ga();
        Object localObject1;
        if (this.lha == null) {
          localObject1 = afR.t(localFF);
        } else {
          localObject2 = this.lha.getProperties();
          localObject1 = new ckC(this, (Properties)localObject2);
        }

        Object localObject2 = new azu(localFF, afR.t(localFF).arj(), (Yb)localObject1).ei(str);

        this.lgZ = (localObject2 == null ? new char[0] : localObject2.toString().toCharArray());
      }

      if (this.index < this.lgZ.length) {
        return this.lgZ[(this.index++)];
      }
      this.index = -1;
    }
    return -1;
  }

  public Reader b(Reader paramReader)
  {
    djS localdjS = new djS(paramReader);
    localdjS.b(Ga());
    localdjS.b(this.lha);
    return localdjS;
  }
}