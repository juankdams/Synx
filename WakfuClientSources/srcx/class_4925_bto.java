import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public final class bto
{
  private static final Logger K = Logger.getLogger(bto.class);

  private static final bto gbS = new bto();
  private final bPu gbT;
  private final EnumMap gbU;

  public static bto bBQ()
  {
    return gbS;
  }

  private bto()
  {
    this.gbT = new bPu();
    this.gbU = new EnumMap(SB.class);
    for (SB localSB : SB.values())
      if ((localSB != SB.ctz) && (localSB != SB.cty))
        this.gbU.put(localSB, new ArrayList(48));
  }

  public void a(bJw parambJw)
  {
    this.gbT.c(parambJw.bQz(), parambJw);
    for (Map.Entry localEntry : this.gbU.entrySet())
      if (parambJw.b((bhh)localEntry.getKey()))
        ((ArrayList)localEntry.getValue()).add(parambJw);
  }

  public ArrayList b(SB paramSB)
  {
    return (ArrayList)this.gbU.get(paramSB);
  }

  public bJw bZ(short paramShort)
  {
    return (bJw)this.gbT.cx(paramShort);
  }
}