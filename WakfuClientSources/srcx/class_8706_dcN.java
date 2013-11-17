import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class dcN extends dMa
{
  public int kVS;
  public aFT kVT;

  protected List aR()
  {
    ArrayList localArrayList = new ArrayList(super.aR());
    localArrayList.addAll(Arrays.asList(new String[] { "Mask", "SidStart" }));
    return localArrayList;
  }
  public dcN() {
  }
  public dcN(axA paramaxA) { super(paramaxA);
    hb();

    int i = this.mck - size() + 4;

    int j = 8;
    byte[] arrayOfByte = paramaxA.i(j, i);
    this.mcl = new SR(arrayOfByte);
  }
}