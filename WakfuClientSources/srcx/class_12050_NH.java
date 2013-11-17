import org.apache.log4j.Logger;

public class NH
  implements dQZ
{
  private static Logger K = Logger.getLogger(NH.class);

  private bXx cek = null;
  private dOc aUX = null;
  private axU cel;
  private bXx cem;
  private boolean aUZ;
  private Object aOd = null;

  public NH(axU paramaxU) {
    this.cel = paramaxU;
  }

  public void a(int paramInt1, int paramInt2, dOc paramdOc)
  {
    if ((!this.aUZ) && (this.cek.isDragEnabled())) {
      axU localaxU = this.cel;
      if ((paramInt1 < localaxU.getDisplayX()) || (paramInt1 > localaxU.getDisplayX() + localaxU.getWidth()) || (paramInt2 < localaxU.getDisplayY()) || (paramInt2 > localaxU.getDisplayY() + localaxU.getHeight()))
      {
        if ((this.cek == null) || (this.cek.isUnloading())) {
          return;
        }

        this.cem = ((bXx)this.cek.beO());
        if (this.cem == null) {
          K.warn("problème au clone du dnd container, le clone est null");
          return;
        }

        this.cem.setCopy(true);

        this.cem.setSize(this.cek.getSize());
        this.cem.setNonBlocking(true);
        this.cem.setLayoutData(null);

        this.cek.aT(this.aOd);

        bsP.getInstance().getLayeredContainer().b(this.cem, 30000);

        this.aUZ = true;
      }
    }

    if ((this.aUZ) && (this.cem != null)) {
      this.cem.setPosition(paramInt1 - this.cem.getWidth() / 2, paramInt2 - this.cem.getHeight() / 2);

      if ((paramdOc != null) && (!(paramdOc instanceof axU))) {
        paramdOc = (dOc)paramdOc.getParentOfType(axU.class);
      }
      if (paramdOc != this.aUX) {
        if (this.aUX != null) {
          this.cek.b(((axU)this.aUX).getDragNDropable(), this.aOd);
          this.aUX = null;
        }
        if (paramdOc != null) {
          this.aUX = paramdOc;
          this.cek.c(((axU)this.aUX).getDragNDropable(), this.aOd);
        }
      }
    }
  }

  public void b(int paramInt1, int paramInt2, dOc paramdOc) {
    if (this.aUZ) {
      bXx localbXx = null;
      Object localObject;
      if (paramdOc != null) {
        if ((paramdOc instanceof bXx))
          localbXx = (bXx)paramdOc;
        else {
          localbXx = (bXx)paramdOc.getParentOfType(aka.class);
        }

        if (localbXx == null) {
          if (!(paramdOc instanceof axU)) {
            localObject = paramdOc.getParentOfType(axU.class);
            if ((localObject instanceof axU))
              localbXx = ((axU)localObject).getDragNDropable();
          }
          else {
            localbXx = ((axU)paramdOc).getDragNDropable();
          }
        }
      }

      if ((localbXx != null) && (localbXx.isDropValid(this.cek, this.aOd))) {
        localbXx.a(this.cek, this.aOd);
      } else if (localbXx != this.cek)
      {
        localObject = cTo.a(bsP.getInstance().getCurrentAWTMouseEvent(), this.cek, this.aOd);
        this.cel.g((cSx)localObject);
      }

    }

    clean();
  }

  public void clean() {
    if (this.cem != null) {
      this.cem.beH();
      this.cem = null;
    }

    this.cek = null;
    this.aUX = null;
    this.aOd = null;
  }

  public boolean ws() {
    boolean bool = this.aUZ;
    clean();
    this.cel = null;

    return bool;
  }

  public boolean a(dOc paramdOc, int paramInt1, int paramInt2) {
    if (paramdOc == null) {
      return false;
    }

    if ((this.cel.aJx()) && ((paramdOc == this.cel) || (paramdOc.j(this.cel))) && 
      (this.cel.getItem() != null)) {
      return true;
    }

    return false;
  }

  public void select(int paramInt1, int paramInt2) {
    this.aOd = this.cel.getItemValue();
    this.cek = this.cel.getDragNDropable();
    this.aUZ = false;
    this.aUX = null;
  }

  public Object getValue() {
    return this.aOd;
  }
}