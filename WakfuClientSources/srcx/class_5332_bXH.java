import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;

public abstract class bXH extends Thread
  implements bnu
{
  protected static final int DC = 0;
  protected static final int hmY = 40;
  protected static final int hmZ = 72;
  protected static final int hna = 104;
  protected static final int hnb = 136;
  protected static final int hnc = 48;
  protected static final int hnd = 80;
  protected static final int hne = 112;
  protected static final int hnf = 144;
  protected static final int hng = 56;
  protected static final int hnh = 88;
  protected static final int hni = 120;
  protected static final int hnj = 152;
  protected static final int hnk = 184;
  protected static final int hnl = 32;
  protected static final int hnm = 64;
  protected static final int hnn = 96;
  protected static final int hno = 128;
  protected static final int hnp = 160;
  protected static final int hnq = 192;
  protected static final int hnr = 128;
  private static Logger K = Logger.getLogger(bXH.class);
  protected static final boolean aRN = false;
  public static int hns = 10;
  protected Selector hnt;
  protected aee hnu;
  protected DL bZZ;
  protected int aw;
  protected static int hnv = 0;
  protected int hnw;
  protected int hnx;
  protected boolean aKV;
  protected boolean dMV;
  protected final List hny;
  protected int hnz;
  protected String hnA;
  protected int hnB;
  private final HQ hnC = new HQ();

  private long hnD = 9223372036854775807L;

  protected final Queue hnE = new ConcurrentLinkedQueue();
  protected final dQV hnF;

  public bXH(DL paramDL)
  {
    this.aw = (++hnv);
    super.setName("ConnectionHandler-" + this.aw);
    this.hnF = dQV.e(this);

    this.bZZ = paramDL;
    this.hnw = 0;
    this.hnx = 0;
    this.hny = Collections.synchronizedList(new ArrayList());

    if (this.bZZ == null)
      throw new IllegalArgumentException("L'argument 'eventsHandler' ne doit pas Ãªtre nul");
    try
    {
      this.hnt = Selector.open();
      this.aKV = false;

      this.dMV = false;
    } catch (Exception localException) {
      K.error(localException);
      this.bZZ.a(this);
    }

    this.hnC.setName("ConnectionWriter-" + getName());
  }

  void un(int paramInt) {
    this.hnF.un(paramInt);
  }

  void uo(int paramInt) {
    this.hnF.DH(paramInt);
  }

  void cda() {
    this.hnF.cda();
  }

  void cdb() {
    this.hnF.cdb();
  }

  public synchronized void start()
  {
    if (!this.aKV) {
      this.aKV = true;
      super.start();
    }
  }

  public int getID()
  {
    return this.aw;
  }

  public boolean isRunning()
  {
    return this.aKV;
  }

  public void cdc()
  {
    this.aKV = false;
  }

  public boolean aJl()
  {
    return this.dMV;
  }

  public void G(boolean paramBoolean)
  {
    this.dMV = paramBoolean;
  }

  public void h(Throwable paramThrowable)
  {
    String str = bBd.g(paramThrowable);
    K.error("Exception raised : ", paramThrowable);

    this.hnx += 1;
    synchronized (this.hny) {
      if (this.hnx >= 10)
        this.hny.remove(0);
      this.hny.add(str);
    }
  }

  public Object[] cdd()
  {
    synchronized (this.hny) {
      return this.hny.toArray();
    }
  }

  protected bcT cde()
  {
    bcT localbcT = null;
    try {
      localbcT = (bcT)this.hnu.Mm();
      localbcT.a(this.hnu);
    } catch (Throwable localThrowable) {
      this.bZZ.c(this);
      K.error("createConnection exception : ", localThrowable);
    }
    return localbcT;
  }

  boolean f(bcT parambcT)
  {
    boolean bool = false;
    if (parambcT != null) {
      this.hnw += 1;
      parambcT.d(this);
      parambcT.c(this.bZZ);
    }
    return bool;
  }

  protected boolean a(SelectionKey paramSelectionKey)
  {
    try
    {
      bcT localbcT = (bcT)paramSelectionKey.attachment();

      if (localbcT == null) {
        return true;
      }
      if (!localbcT.isRegistered()) {
        return true;
      }
      return this.bZZ.b(this, localbcT);
    }
    catch (Throwable localThrowable1) {
      K.error("read exception : ", localThrowable1);
      return false;
    }
    catch (Throwable localThrowable2) {
      K.error("key exception : ", localThrowable2);
    }return false;
  }

  protected final void cdf()
  {
    if (this.hnB > 0) {
      this.hnB -= 1;
      return;
    }
    bex localbex;
    while ((localbex = (bex)this.hnE.poll()) != null)
      a(localbex);
  }

  protected void a(bex parambex)
  {
    switch (bSM.fbI[parambex.frx.ordinal()]) {
    case 1:
      this.hnB = parambex.frz;
      break;
    case 2:
      a((Ac)parambex.fry);
      break;
    case 3:
      ((Ac)parambex.fry).Ja();
      break;
    case 4:
      cdb();
      parambex.fry.release();
      break;
    case 5:
      i(parambex.fry);
      break;
    case 6:
      h(parambex.fry);
      break;
    default:
      K.warn("Unhandled operation ! " + parambex);
    }
  }

  protected void a(Ac paramAc)
  {
    throw new UnsupportedOperationException("Non implÃ©mentÃ© dans " + getClass().getSimpleName());
  }

  void b(Ac paramAc)
  {
    bex localbex = new bex(pb.aUO, paramAc);
    localbex.frz = 250;
    this.hnE.offer(localbex);
    this.hnE.offer(new bex(pb.aUL, paramAc));
    this.hnt.wakeup();
  }

  void c(bcT parambcT) {
    this.hnE.offer(new bex(pb.aUJ, parambcT));
    this.hnt.wakeup();
  }

  public String bxB()
  {
    return this.hnA;
  }

  public void kI(String paramString)
  {
    this.hnA = paramString;
  }

  public int bxC()
  {
    return this.hnz;
  }

  public void qr(int paramInt)
  {
    this.hnz = paramInt;
  }

  public long cdg()
  {
    return this.hnD;
  }

  public void hg(long paramLong)
  {
    K.info("Configuration du timeout d'Ã©criture fixÃ© Ã  : " + paramLong + " ms");
    this.hnD = paramLong;
  }

  protected synchronized void g(bcT parambcT) {
    SocketChannel localSocketChannel = parambcT.getSocketChannel();

    if (localSocketChannel != null) {
      if (!localSocketChannel.isConnected())
      {
        try
        {
          localSocketChannel.register(this.hnt, 8, parambcT);
        } catch (ClosedChannelException localClosedChannelException1) {
          K.error("ClosedChannelException", localClosedChannelException1);
        }
      }
      else {
        try
        {
          localSocketChannel.register(this.hnt, 1, parambcT);
        } catch (ClosedChannelException localClosedChannelException2) {
          K.error("ClosedChannelException", localClosedChannelException2);
        }
      }
      this.hnt.wakeup();
    } else {
      K.error("Channel invalide = null");
    }
  }

  protected synchronized void h(bcT parambcT) {
    SocketChannel localSocketChannel = parambcT.getSocketChannel();

    if ((localSocketChannel != null) && (localSocketChannel.isConnected()))
    {
      try
      {
        localSocketChannel.register(this.hnt, 1, parambcT);
        this.hnt.wakeup();
      } catch (ClosedChannelException localClosedChannelException) {
        K.error("ClosedChannelException", localClosedChannelException);
      }
    }
  }

  protected synchronized void i(bcT parambcT) {
    SocketChannel localSocketChannel = parambcT.getSocketChannel();
    if ((localSocketChannel != null) && (localSocketChannel.isConnected()))
    {
      try
      {
        localSocketChannel.register(this.hnt, 5, parambcT);
        this.hnt.wakeup();
      } catch (ClosedChannelException localClosedChannelException) {
        K.error("ClosedChannelException", localClosedChannelException);
      }
    }
  }

  protected synchronized void j(bcT parambcT)
  {
    h(parambcT);
  }

  protected synchronized void k(bcT parambcT)
  {
    SocketChannel localSocketChannel = parambcT.getSocketChannel();
    if (localSocketChannel != null) {
      SelectionKey localSelectionKey = localSocketChannel.keyFor(this.hnt);
      if (localSelectionKey != null) {
        localSelectionKey.attach(null);
        localSelectionKey.cancel();
      }
      try {
        localSocketChannel.close();
      } catch (IOException localIOException) {
        K.error("Exception levÃ©e lors de la fermeture du channel", localIOException);
      }
    } else {
      K.error("Channel is null");
    }
  }
}