import org.apache.log4j.Logger;

public class dSd
  implements ckR
{
  private static final Logger K = Logger.getLogger(dSd.class);

  private final aoL moh = new aoL();
  private dHS moi = null;
  private UG moj = null;

  public void a(dHS paramdHS) {
    this.moi = paramdHS;
  }

  public void e(UG paramUG) {
    this.moj = paramUG;
  }

  public void b(cDg paramcDg)
  {
    if (!d(paramcDg)) {
      return;
    }
    long l = paramcDg.aJq();

    if (!this.moh.containsKey(l))
    {
      localObject = paramcDg.axG();
      if (localObject == null)
      {
        K.error("Unable to create microbot for null owner. OriginalControllerId : " + l);
        return;
      }
      int i;
      if (((dle)localObject).b(eu.aAk))
        i = ((dle)localObject).e(eu.aAk);
      else
        i = 3;
      this.moh.put(l, new bCs(l, i));
    }
    Object localObject = (bCs)this.moh.get(l);

    ((bCs)localObject).a(paramcDg, this.moj, this.moi);
  }

  public void c(cDg paramcDg)
  {
    if (!d(paramcDg)) {
      return;
    }
    long l = paramcDg.aJq();

    if (!this.moh.containsKey(l))
      return;
    bCs localbCs = (bCs)this.moh.get(l);

    localbCs.b(paramcDg, this.moj, this.moi);
  }

  public bCs hz(long paramLong)
  {
    return (bCs)this.moh.get(paramLong);
  }

  private boolean d(cDg paramcDg)
  {
    if (paramcDg == null)
    {
      K.error("Trying to handle a 'null' microbot", new RuntimeException());
      return false;
    }

    if (paramcDg.czh() != 4)
    {
      K.error("Trying to handle a microbot wich is not a microbot (UserdefineID = " + paramcDg.czh() + ")", new RuntimeException());
      return false;
    }

    if (paramcDg.aJq() == 0L)
    {
      K.error("Trying to handle a microbot without owner (ownerId=0) : " + paramcDg, new RuntimeException());
      return false;
    }
    return true;
  }
}