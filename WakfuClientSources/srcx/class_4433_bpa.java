import org.apache.log4j.Logger;

public class bpa
{
  protected static final Logger K = Logger.getLogger(bpa.class);
  private final cSR fIJ = new cSR();

  public void a(LE paramLE)
  {
    this.fIJ.put(paramLE.getId(), paramLE);
  }

  public dmn byE() {
    return this.fIJ.yF();
  }

  public LE qy(int paramInt) {
    return (LE)this.fIJ.get(paramInt);
  }

  public LE a(bcR parambcR, short paramShort) {
    dmn localdmn = this.fIJ.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      LE localLE = (LE)localdmn.value();
      if ((localLE.Wh() == parambcR) && 
        (localLE.Wi().contains(paramShort))) {
        return localLE;
      }
    }

    return null;
  }
}