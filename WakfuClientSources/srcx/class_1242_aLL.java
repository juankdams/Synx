import java.util.Arrays;
import java.util.List;

public class aLL extends bik
{
  public byte eqE;
  public byte eqF;
  public short eqG;
  public short eqH;
  public short eqI;
  private dcN[] eqJ;

  protected List aR()
  {
    return Arrays.asList(new String[] { "AclRevision", "Sbz1", "AclSize", "AceCount", "Sbz2" });
  }

  public aLL() {
  }

  public aLL(axA paramaxA) {
    super(paramaxA);
    hb();
    this.eqJ = new dcN[this.eqH];
    int i = size();
    for (int j = 0; j < this.eqH; j++) {
      axA localaxA = paramaxA.dp(i);

      int k = localaxA.getByte(0L);
      Object localObject = null;
      switch (k) {
      case 0:
        localObject = new bVr(localaxA);
        break;
      case 1:
        localObject = new cBZ(localaxA);
        break;
      default:
        throw new IllegalArgumentException("Unknwon ACE type " + k);
      }

      this.eqJ[j] = localObject;
      i += ((dcN)localObject).mck;
    }
  }

  public dcN[] bdl()
  {
    return this.eqJ;
  }
}