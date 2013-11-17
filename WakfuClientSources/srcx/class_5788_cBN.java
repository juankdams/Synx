import com.ankamagames.wakfu.client.core.script.MonsterEvolutionFunctionsLibrary;
import org.apache.log4j.Logger;

public class cBN extends atX
{
  private final byo ehd;
  private final short isM;
  private final short isN;

  public cBN(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, short paramShort1, short paramShort2)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.ehd = ((byo)CA.Lv().bj(paramLong));
    this.isM = paramShort1;
    this.isN = paramShort2;

    c(new hQ[] { new MonsterEvolutionFunctionsLibrary(this) });

    ko(paramInt4);
  }

  public long mC()
  {
    super.mC();
    return -1L;
  }

  protected void kO()
  {
    super.kO();
    if (this.ehd != null) {
      Short localShort = Short.valueOf(this.ehd.uO());
      if (localShort.shortValue() != this.isM) {
        K.error("Oublie de script LUA définissant une évolution pour le breedId=" + localShort);
        this.ehd.D(this.isM, this.isN);
      }
    }
  }

  public long aqN() {
    return this.ehd.getId();
  }

  public short cxI() {
    return this.isM;
  }

  public short cxJ() {
    return this.isN;
  }

  public Su cxK() {
    return this.ehd;
  }
}