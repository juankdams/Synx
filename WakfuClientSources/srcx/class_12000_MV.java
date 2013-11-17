import java.io.IOException;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.apache.log4j.Logger;

class MV extends dAK
{
  protected static final Logger K = Logger.getLogger(MV.class);

  private volatile boolean aKV = false;
  private DL bZZ;

  MV(DL paramDL)
  {
    super(paramDL);
    this.bZZ = paramDL;
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
    this.hnt.wakeup();
  }

  public synchronized void start()
  {
    if (!this.aKV) {
      this.aKV = true;
      super.start();
    }
  }

  void a(SocketChannel paramSocketChannel) {
    try {
      paramSocketChannel.configureBlocking(false);
      paramSocketChannel.socket().setTcpNoDelay(true);

      paramSocketChannel.socket().setPerformancePreferences(0, 2, 1);
      paramSocketChannel.socket().setTrafficClass(128);

      bcT localbcT = cde();

      if (localbcT != null) {
        f(localbcT);
        localbcT.b(paramSocketChannel);
        e(localbcT);
      }

    }
    catch (IOException localIOException)
    {
      K.error("Exception", localIOException);
    }
  }

  private void e(bcT parambcT) {
    cda();
    parambcT.d(this);
    this.hnE.offer(new bex(pb.aUI, parambcT));
    this.hnt.wakeup();
  }

  protected void a(bex parambex)
  {
    bcT localbcT = parambex.fry;
    switch (aWA.fbI[parambex.frx.ordinal()]) {
    case 1:
      h(localbcT);
      if (!this.bZZ.a(this, localbcT))
      {
        localbcT.close();

        cdb();
        localbcT.release(); } break;
    default:
      super.a(parambex);
    }
  }

  public void run()
  {
    while (this.aKV) {
      cdf();

      int i = 0;
      try {
        i = this.hnt.select(hns);
      } catch (IOException localIOException) {
        K.error("Exception", localIOException);
      }

      if (i > 0) {
        Iterator localIterator = null;

        localIterator = this.hnt.selectedKeys().iterator();

        while (localIterator.hasNext()) {
          SelectionKey localSelectionKey = (SelectionKey)localIterator.next();
          localIterator.remove();
          bcT localbcT = (bcT)localSelectionKey.attachment();

          if ((!localSelectionKey.isValid()) || 
            (!localSelectionKey.isWritable()) || 
            (localbcT.brf()))
          {
            if ((localSelectionKey.isValid()) && 
              (localSelectionKey.isReadable()) && 
              (!this.bZZ.b(this, localbcT)))
            {
              localbcT.close();

              cdb();
              localbcT.release();
            }
          }
        }
      }
    }
  }
}