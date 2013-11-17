import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;

public class bcT
  implements bWU, ctb
{
  private static final boolean aRN = false;
  private static final boolean fng = false;
  private static final int fnh = 8192;
  private static final int fni = 8192;
  private static final Logger K = Logger.getLogger(bcT.class);
  protected SocketChannel fnj;
  protected brd fnk;
  protected DL fnl;
  protected bXH fnm;
  protected ByteBuffer fnn;
  protected ByteBuffer fno;
  protected final Object fnp = new Object();
  protected aee aOr;
  protected final Queue fnq = new ConcurrentLinkedQueue();

  private static int fnr = 1;
  protected long aTz;
  protected volatile boolean fns;
  private long fnt;
  private boolean fnu;

  bcT()
  {
    this.aTz = 0L;

    this.fnn = ByteBuffer.allocate(8192);
    this.fnn.clear();

    this.fno = ByteBuffer.allocate(8192);
    this.fno.clear();
  }

  public void aJ()
  {
    this.aTz = (fnr++);
    IW();
  }

  public void bc()
  {
    this.aTz = 0L;
    this.aOr = null;
    IW();
  }

  public synchronized boolean bqT() {
    return this.fnu;
  }

  public synchronized void ey(boolean paramBoolean) {
    this.fnu = paramBoolean;
  }

  protected void IW()
  {
    this.fns = false;
    this.fnj = null;
    this.fnk = null;
    this.fnl = null;
    this.fnm = null;
    if (this.fnn != null) {
      this.fnn.clear();
    }
    if (this.fno != null) {
      this.fno.clear();
    }
    this.fnt = System.currentTimeMillis();
    this.fnu = false;
    this.fnq.clear();
  }

  public synchronized long getId()
  {
    return this.aTz;
  }

  public synchronized void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  public synchronized void p(brd parambrd)
  {
    this.fnk = parambrd;
  }

  public synchronized brd bqU()
  {
    return this.fnk;
  }

  void d(bXH parambXH)
  {
    this.fnm = parambXH;
  }

  public synchronized bXH bqV()
  {
    return this.fnm;
  }

  void c(DL paramDL)
  {
    this.fnl = paramDL;
  }

  public synchronized DL bqW()
  {
    return this.fnl;
  }

  void b(SocketChannel paramSocketChannel)
  {
    this.fnj = paramSocketChannel;
  }

  SocketChannel getSocketChannel()
  {
    return this.fnj;
  }

  public boolean isRegistered()
  {
    return this.fnm != null;
  }

  synchronized void close()
  {
    this.fno.clear();
    this.fnn.clear();

    if (this.fnk != null) {
      this.fnk.Bn();
      this.fnk.a(null);
    }
    this.fnk = null;

    if ((this.fnl != null) && (this.fnm != null)) {
      this.fnl.c(this.fnm, this);
    }

    brb();
  }

  protected void bqX() {
    this.fnm.g(this);
  }

  protected void bqY() {
    this.fnm.h(this);
  }

  protected void bqZ() {
    this.fnm.c(this);
  }

  protected void bra() {
    bqY();
  }

  protected void brb() {
    this.fnm.k(this);
    this.fnj = null;
  }

  public synchronized void brc()
  {
    if ((!this.fns) && (this.fnm != null)) {
      this.fns = true;
      this.fnm.c(this);
    } else {
      K.info("La connexion a été fermée, ou la fermeture est déjà programmée (cleanClose=" + this.fns);
    }
  }

  public boolean brd()
  {
    return this.fns;
  }

  public synchronized void Jj()
  {
    if (this.fnl != null) {
      this.fnl.c(this.fnm, this);
      this.fnl = null;
    }
  }

  public synchronized boolean IY()
  {
    return false;
  }

  public synchronized boolean isConnected()
  {
    return (this.fnj != null) && (this.fnj.isConnected()) && (!IX());
  }

  public synchronized boolean isConnectionPending()
  {
    return (this.fnj != null) && (this.fnj.isConnectionPending());
  }

  public ByteBuffer bre()
  {
    if (this.fnj == null) {
      K.warn("Tentative de lecture sur une Connection sans SocketChannel.");
      return null;
    }
    ByteBuffer localByteBuffer1;
    if ((!this.fnj.isConnected()) || (!this.fnj.isOpen())) {
      K.warn("Tentative de lecture sur une Connection avec un SocketChannel dans l'état connected=" + this.fnj.isConnected() + " open=" + this.fnj.isOpen());
      localByteBuffer1 = Jb();
      this.fnl.d(this.fnm, this);
      return localByteBuffer1;
    }
    ByteBuffer localByteBuffer2;
    try
    {
      if (this.fnn.position() == this.fnn.limit()) {
        localByteBuffer1 = ByteBuffer.allocate(this.fnn.limit() * 2);
        localByteBuffer1.rewind();
        this.fnn.compact();
        localByteBuffer1.put(this.fnn);
        this.fnn = localByteBuffer1;
      }
    } catch (Throwable localThrowable1) {
      K.warn("Impossible d'agrandir le buffer d'entrée:", localThrowable1);
      localByteBuffer2 = Jb();
      this.fnl.d(this.fnm, this);
      return localByteBuffer2;
    }
    try
    {
      int i = this.fnj.read(this.fnn);

      if (i <= 0)
      {
        localByteBuffer2 = Jb();
        this.fnl.d(this.fnm, this);
        return localByteBuffer2;
      }
      this.fnm.uo(i);
    }
    catch (Throwable localThrowable2)
    {
      K.warn("Impossible de lire : la connexion a été perdue. [" + localThrowable2.getMessage() + "]");
      localByteBuffer2 = Jb();
      this.fnl.d(this.fnm, this);
      return localByteBuffer2;
    }

    this.fnn.flip();
    return this.fnn;
  }

  protected ByteBuffer Jb()
  {
    return null;
  }

  protected void Jc()
  {
    close();
    this.fnm.cdb();
    release();
  }

  boolean brf()
  {
    if (this.fnj == null) {
      K.warn("Tentative d'écriture sur une Connection sans SocketChannel.");
      return false;
    }

    if ((!this.fnj.isConnected()) || (!this.fnj.isOpen())) {
      K.warn("Tentative d'écriture sur une Connection avec un SocketChannel dans l'état connected=" + this.fnj.isConnected() + " open=" + this.fnj.isOpen());
      this.fnl.d(this.fnm, this);
      Jc();
      return false;
    }
    try
    {
      byte[] arrayOfByte;
      while ((arrayOfByte = (byte[])this.fnq.poll()) != null) {
        Z(arrayOfByte);
      }

      this.fno.flip();

      if (this.fno.remaining() > 0) {
        int i = this.fnj.write(this.fno);

        if (i == 0) {
          this.fno.position(this.fno.limit());
          this.fno.limit(this.fno.capacity());

          long l = this.fnm.cdg();
          if (System.currentTimeMillis() - this.fnt >= l)
          {
            K.error("[WRITE ERROR] Write timeout");
            this.fnl.d(this.fnm, this);
            Jc();
            return false;
          }
        } else {
          if (i < 0) {
            K.error("[WRITE ERROR] Write error");
            this.fnl.d(this.fnm, this);
            Jc();
            return false;
          }

          this.fnm.un(i);

          this.fnt = System.currentTimeMillis();
          int j = this.fno.remaining();
          this.fno.compact();

          if (j == 0) {
            bra();
            if (this.fns) {
              close();
              this.fnm.cdb();
              release();
            }
          }
          else {
            this.fnm.c(this);
          }
        }
      }
      else {
        bra();
        if (this.fns) {
          close();
          this.fnm.cdb();
          release();
        }
      }
    } catch (Exception localException) {
      K.error("[WRITE ERROR] Connection closed (exception=" + localException.toString() + ")");
      this.fnl.d(this.fnm, this);
      Jc();
      return false;
    }

    return true;
  }

  public void Y(byte[] paramArrayOfByte) {
    if (paramArrayOfByte != null) {
      this.fnq.offer(paramArrayOfByte);
      this.fnm.c(this);
    }
  }

  private void Z(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      aa(paramArrayOfByte);

      int i = this.fno.limit();
      int j = this.fno.position() + paramArrayOfByte.length;

      if (j > i) {
        ByteBuffer localByteBuffer = ByteBuffer.allocate(j * 2);
        if (this.fno.position() > 0) {
          this.fno.flip();
          localByteBuffer.put(this.fno);
        }
        this.fno = localByteBuffer;
      }

      this.fno.put(paramArrayOfByte);
    } else {
      K.error("Données du message inexistantes ou de longueur nulle.");
    }
  }

  private void aa(byte[] paramArrayOfByte)
  {
  }

  public synchronized InetAddress getInetAddress()
  {
    if (this.fnj == null) {
      return null;
    }

    Socket localSocket = this.fnj.socket();
    if (localSocket == null) {
      return null;
    }
    return localSocket.getInetAddress();
  }

  public synchronized InetAddress getLocalAddress() {
    if (this.fnj == null) {
      return null;
    }

    Socket localSocket = this.fnj.socket();
    if (localSocket == null) {
      return null;
    }
    return localSocket.getLocalAddress();
  }

  public synchronized int getPort()
  {
    return 0;
  }

  public synchronized String getHost()
  {
    return "";
  }

  public synchronized int Je()
  {
    return 0;
  }

  public synchronized int Jd()
  {
    return 0;
  }

  public synchronized String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();

    localStringBuffer.append("Connection(");
    localStringBuffer.append("cleanClose=").append(this.fns);
    localStringBuffer.append(")");

    return localStringBuffer.toString();
  }

  public synchronized boolean IX()
  {
    return false;
  }

  void a(aee paramaee) {
    this.aOr = paramaee;
  }

  void release() {
    if (this.aOr != null)
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("Exception lors du release de la connexion : ", localException);
      }
  }
}