import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aqv
  implements dUd
{
  protected static final Logger K = Logger.getLogger(aqv.class);

  private final ArrayList dxV = new ArrayList();
  private final ArrayList dxW = new ArrayList();
  private final ArrayList dxX = new ArrayList();
  private final ArrayList dxY = new ArrayList();
  private final ArrayList dxZ = new ArrayList();
  private boolean dya;
  private long aTz;

  public aqv()
  {
    this.aTz = 0L;
    this.dya = false;
  }

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  public boolean a(cWG paramcWG)
  {
    boolean bool = true;
    aCw();

    synchronized (this.dxV) {
      this.dya = true;
      int i = this.dxV.size();
      if (i > 0)
      {
        for (int j = 0; j < i; j++) {
          cvW localcvW = (cvW)this.dxV.get(j);
          if (localcvW != null) {
            try {
              bool = localcvW.a(paramcWG);
            } catch (Exception localException) {
              K.error("Exception levée lors du traitement d'un message : " + paramcWG.getClass().getSimpleName() + " " + ((localException.getStackTrace() != null) && (localException.getStackTrace().length > 0) ? localException.getStackTrace()[0] : " "), localException);
            }

            if (!bool) break;
          }
        }
      }
      else {
        K.warn("L'entité destinataire du message n'a pas de frames, message : " + paramcWG.getClass().getSimpleName());
        bool = true;
      }
      this.dya = false;
    }
    if (bool) {
      K.warn("[DEFAUT DE CONCEPTION] Message (" + paramcWG.getClass().getSimpleName() + ") non traité" + ", type " + paramcWG.getId() + ", Handler=" + this + ", Message=" + paramcWG);
    }

    aCx();

    return false;
  }

  private void aCw()
  {
    synchronized (this.dxV)
    {
      int i;
      int j;
      cvW localcvW;
      synchronized (this.dxX) {
        i = this.dxX.size();
        for (j = 0; j < i; j++) {
          localcvW = (cvW)this.dxX.get(j);
          if (!this.dxV.contains(localcvW)) {
            this.dxV.add(0, localcvW);
            localcvW.a(this, false);
          }
        }
        this.dxX.clear();
      }
      synchronized (this.dxW) {
        i = this.dxW.size();
        for (j = 0; j < i; j++) {
          localcvW = (cvW)this.dxW.get(j);
          if (this.dxV.remove(localcvW))
            localcvW.b(this, false);
        }
        this.dxW.clear();
      }
    }
  }

  private void aCx()
  {
    synchronized (this.dxV)
    {
      int i;
      int j;
      cvW localcvW;
      synchronized (this.dxZ) {
        i = this.dxZ.size();
        for (j = 0; j < i; j++) {
          localcvW = (cvW)this.dxZ.get(j);
          if (!this.dxV.contains(localcvW)) {
            this.dxV.add(0, localcvW);
            localcvW.a(this, false);
          }
        }
        this.dxZ.clear();
      }
      synchronized (this.dxY) {
        i = this.dxY.size();
        for (j = 0; j < i; j++) {
          localcvW = (cvW)this.dxY.get(j);
          if (this.dxV.remove(localcvW))
            localcvW.b(this, false);
        }
        this.dxY.clear();
      }
    }
  }

  public void a(cvW paramcvW)
  {
    if (this.dya)
    {
      boolean bool;
      synchronized (this.dxY) {
        bool = this.dxY.contains(paramcvW);
      }

      if (bool) {
        synchronized (this.dxX) {
          if (!this.dxX.contains(paramcvW))
            this.dxX.add(paramcvW);
          paramcvW.a(this, true);
        }
        synchronized (this.dxW) {
          this.dxW.remove(paramcvW);
        }
      } else {
        synchronized (this.dxZ) {
          this.dxZ.add(paramcvW);
          paramcvW.a(this, true);
        }
      }
    } else {
      synchronized (this.dxV) {
        if (!this.dxV.contains(paramcvW)) {
          this.dxV.add(0, paramcvW);
          paramcvW.a(this, false);
        }
      }
    }
  }

  public void b(cvW paramcvW)
  {
    if (this.dya)
    {
      boolean bool;
      synchronized (this.dxZ) {
        bool = this.dxZ.contains(paramcvW);
      }

      if (bool) {
        synchronized (this.dxW) {
          if (!this.dxW.contains(paramcvW))
            this.dxW.add(paramcvW);
        }
        synchronized (this.dxX) {
          if (this.dxX.remove(paramcvW))
            paramcvW.b(this, false);
        }
      } else {
        synchronized (this.dxY) {
          if (!this.dxY.contains(paramcvW)) {
            this.dxY.add(paramcvW);
            paramcvW.b(this, true);
          }
        }
      }
    } else {
      synchronized (this.dxV) {
        if (this.dxV.remove(paramcvW))
          paramcvW.b(this, false);
      }
    }
  }

  public void aCy()
  {
    Object[] arrayOfObject1 = null;
    synchronized (this.dxV) {
      arrayOfObject1 = this.dxV.toArray();
    }
    Object localObject3;
    if (this.dya) {
      if (arrayOfObject1 != null)
        synchronized (this.dxY) {
          for (localObject3 : arrayOfObject1) {
            cvW localcvW = (cvW)localObject3;
            if (!this.dxY.contains(localcvW)) {
              this.dxY.add(localcvW);
              localcvW.b(this, true);
            }
          }
        }
    }
    else {
      synchronized (this.dxV) {
        this.dxV.clear();
      }

      for (Object localObject2 : arrayOfObject1) {
        localObject3 = (cvW)localObject2;
        ((cvW)localObject3).b(this, false);
      }
    }
  }

  public boolean c(cvW paramcvW)
  {
    boolean bool;
    if (this.dya)
      bool = this.dxV.contains(paramcvW);
    else {
      synchronized (this.dxV) {
        bool = this.dxV.contains(paramcvW);
      }
    }
    if (!bool) {
      synchronized (this.dxX) {
        bool = this.dxX.contains(paramcvW);
      }
    }
    if (!bool) {
      synchronized (this.dxZ) {
        bool = this.dxZ.contains(paramcvW);
      }
    }

    return bool;
  }

  public boolean aCz()
  {
    return this.dya;
  }

  public void cJ(boolean paramBoolean)
  {
    this.dya = paramBoolean;
  }

  public ArrayList aCA()
  {
    return this.dxV;
  }

  public ArrayList aCB()
  {
    return this.dxW;
  }

  public ArrayList aCC()
  {
    return this.dxX;
  }

  public ArrayList aCD()
  {
    return this.dxY;
  }

  public ArrayList aCE()
  {
    return this.dxZ;
  }

  public final void aCF()
  {
    StringBuffer localStringBuffer = new StringBuffer("Frames in ");
    localStringBuffer.append(getClass().getName()).append("\n");
    int i = 0;
    for (cvW localcvW : this.dxV) {
      localStringBuffer.append(i).append("> ").append(localcvW.getClass().getName()).append("\n");
      i++;
    }
    K.info(localStringBuffer.toString());
  }
}