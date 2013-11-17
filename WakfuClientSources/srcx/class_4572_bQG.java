import java.util.HashMap;

public class bQG
{
  public static final bQG gZe = new bQG();

  HashMap gZf = new HashMap();

  public static bQG bXD()
  {
    return gZe;
  }

  public final void a(bsc parambsc)
  {
    this.gZf.put(Byte.valueOf(parambsc.bAs()), parambsc);
  }

  public Iterable bXE() {
    return this.gZf.values();
  }
}