import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.apache.log4j.Logger;

public class Ac extends bcT
{
  private static final Logger K = Logger.getLogger(Ac.class);
  private static final boolean aRN = false;
  protected String bvr;
  protected int bvs;
  protected int bvt = 0;
  protected int bvu = 2147483647;
  protected int bvv = 500;
  protected boolean bvw;
  protected boolean bvx;
  protected boolean bvy;
  private final Runnable bvz = new cpd(this);
  private boolean bvA;

  protected void IW()
  {
    super.IW();
    this.bvw = false;
    this.bvt = 0;
    this.bvu = 2147483647;
    this.bvv = 500;
    this.bvy = false;
    this.bvx = false;
    this.bvr = "";
    this.bvs = 0;
  }

  public synchronized boolean IX()
  {
    return this.bvw;
  }

  void aq(boolean paramBoolean)
  {
    this.bvw = paramBoolean;
  }

  public synchronized boolean IY()
  {
    return true;
  }

  void IZ()
  {
    if (this.fnm == null) {
      K.error("Impossible de lancer la reconnexion, aucun ConnectionHandler n'est défini.");
      return;
    }

    if (this.bvt >= this.bvu) {
      if (!this.bvx) {
        K.warn("Limite de reconnexion dépassée.");
        this.bvx = true;

        close();

        this.fnm.cdb();
        release();
      }
      return;
    }

    if (!IX()) {
      K.info("Lancement de la procédure de reconnexion pour " + this);
      this.bvw = true;
      this.bvt = 0;
      this.fnl.f(this.fnm, this);
    }
    try
    {
      if (this.fnj != null)
      {
        brb();
      }

      b(null);

      this.fnm.b(this);
    }
    catch (Throwable localThrowable) {
      K.error("Exception lors de la reconnexion " + toString() + " :", localThrowable);
    }
  }

  void Ja() {
    this.bvt += 1;
    try
    {
      K.info("Tentative de reconnexion #" + this.bvt + "/" + this.bvu + " à l'hôte " + this.bvr + ":" + this.bvs);
      ((cMD)this.fnm); SocketChannel localSocketChannel = cMD.cFB();
      if (localSocketChannel != null)
      {
        if (this.fnj != null) {
          brb();
        }

        boolean bool = localSocketChannel.connect(new InetSocketAddress(this.bvr, this.bvs));
        b(localSocketChannel);

        if (bool) {
          K.info("(Re)connexion instantanée.");
          this.bvy = true;
          this.bvw = false;

          bqY();
          int i = (!this.bvy) || (!this.bvw) ? 1 : 0;

          if (i != 0) {
            if (!this.fnl.a(this.fnm, this))
            {
              IZ();
            }
          }
          else if (!this.fnl.e(this.fnm, this))
          {
            IZ();
          }

        }
        else
        {
          bqX();
        }
      } else {
        K.warn("Impossible de créer un nouveau SocketChannel " + toString());
        IZ();
      }
    }
    catch (IOException localIOException) {
      K.warn("Exception levée " + toString() + " lors de la tentative de reconnexion : ", localIOException);
      IZ();
    }
  }

  protected ByteBuffer Jb()
  {
    super.Jb();

    IZ();
    this.fnn.flip();
    return this.fnn;
  }

  protected void Jc()
  {
    synchronized (this.fnp) {
      this.fno.clear();
    }

    IZ();
  }

  public synchronized String getHost()
  {
    return this.bvr;
  }

  void setHost(String paramString)
  {
    this.bvr = paramString.intern();
  }

  public synchronized int getPort()
  {
    return this.bvs;
  }

  void setPort(int paramInt)
  {
    this.bvs = paramInt;
  }

  public synchronized int Jd()
  {
    return this.bvt;
  }

  public synchronized int Je()
  {
    return this.bvu;
  }

  public synchronized void dR(int paramInt)
  {
    this.bvu = paramInt;
  }

  public synchronized int Jf()
  {
    return this.bvv;
  }

  public synchronized void dS(int paramInt)
  {
    this.bvv = paramInt;
  }

  public String toString()
  {
    return "(persistant [" + this.bvr + ":" + this.bvs + "] connected=" + isConnected() + ")";
  }

  public synchronized boolean Jg()
  {
    return this.bvy;
  }

  void ar(boolean paramBoolean)
  {
    this.bvy = paramBoolean;
  }

  public synchronized boolean Jh()
  {
    return this.bvx;
  }

  public boolean Ji()
  {
    return (this.bvx) || (this.bvA);
  }

  public synchronized void Jj()
  {
    this.bvA = true;
    super.Jj();
  }

  public void aJ()
  {
    super.aJ();
    this.bvA = false;
  }
}