import java.util.List;
import org.apache.log4j.Logger;

public class cWz
{
  private static final Logger K = Logger.getLogger(cWz.class);

  private static final cWz kJq = new cWz();
  private aoL kJr;

  private cWz()
  {
    this.kJr = new aoL();
  }

  public Tn ji(long paramLong) {
    return (Tn)this.kJr.get(paramLong);
  }

  public void b(byo parambyo, List paramList) {
    long l = parambyo.hf();
    if (l == 0L) {
      return;
    }
    Tn localTn = (Tn)this.kJr.get(l);
    if (localTn == null)
    {
      localTn = new Tn(parambyo.hf());
      this.kJr.put(l, localTn);
    }

    localTn.a(parambyo, paramList);
  }

  public void a(byo parambyo, boolean paramBoolean) {
    long l = parambyo.hf();
    if (l != 0L) {
      Tn localTn = (Tn)this.kJr.get(l);
      if (localTn != null)
        if (paramBoolean)
          localTn.c(parambyo);
        else
          localTn.d(parambyo);
    }
  }

  public void a(Tn paramTn)
  {
    this.kJr.remove(paramTn.getId());
  }

  public static cWz cKu() {
    return kJq;
  }

  public void removeAll() {
    this.kJr.clear();
  }
}