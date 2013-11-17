import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

public class dAK extends bXH
{
  private static final int lIp = 1024;
  private static final int lIq = 5;
  private static Logger K = Logger.getLogger(dAK.class);
  protected ServerSocketChannel lIr;
  protected int lIs;
  protected String lIt;
  protected int lIu = 0;
  protected MV[] lIv = new MV[5];

  public dAK(DL paramDL)
  {
    super(paramDL);
    this.lIt = "";
    this.lIs = 0;
    kI("listener");
    this.hnu = new bOO(new dKO(this));
    try
    {
      this.lIr = ServerSocketChannel.open();
    } catch (Exception localException) {
      K.error(localException);
      this.bZZ.a(this);
    }
  }

  public void Z(String paramString, int paramInt)
  {
    this.lIt = paramString;
    this.lIs = paramInt;

    setName(getName() + "-listener-port-" + paramString + ":" + paramInt);
    try
    {
      this.lIr.socket().setReuseAddress(true);
      this.lIr.socket().bind(new InetSocketAddress(this.lIt, this.lIs), 1024);
      this.lIr.configureBlocking(false);

      this.lIr.register(this.hnt, 16);

      for (int i = 0; i < 5; i++) {
        this.lIv[i] = new MV(this.bZZ);
        this.lIv[i].setName(getName() + "-slave-" + i);
        this.lIv[i].start();
      }
    }
    catch (BindException localBindException) {
      K.error("Ouverture de socket impossible sur " + this.lIt + ":" + this.lIs + ". Port probablement déjà utilisé.");
      this.bZZ.b(this);
    } catch (IOException localIOException) {
      K.error(localIOException);
      this.bZZ.b(this);
    }

    K.info(getName() + " initialized: server mode.");
  }

  public int dej()
  {
    return this.lIs;
  }

  public String dek()
  {
    return this.lIt;
  }

  private MV del() {
    if (this.lIu >= this.lIv.length)
      this.lIu = 0;
    return this.lIv[(this.lIu++)];
  }

  public void run()
  {
    K.info("Server ConnectionHandler started : bindAddress=" + this.lIt + ", bindPort=" + this.lIs + ", " + toString());

    while (this.aKV) {
      try
      {
        while (this.aKV) {
          cdf();

          int i = 0;
          try {
            i = this.hnt.select(hns);
          } catch (Throwable localThrowable2) {
            K.error("select() exception : ", localThrowable2);
          }

          if (i > 0) {
            try {
              Set localSet = this.hnt.selectedKeys();
              Iterator localIterator = localSet.iterator();
              while (localIterator.hasNext()) {
                SelectionKey localSelectionKey = (SelectionKey)localIterator.next();
                localIterator.remove();
                try
                {
                  if ((localSelectionKey.isValid()) && (localSelectionKey.isAcceptable()))
                  {
                    try
                    {
                      SocketChannel localSocketChannel = this.lIr.accept();

                      if (localSocketChannel != null) {
                        MV localMV = del();
                        localMV.a(localSocketChannel);
                      }

                    }
                    catch (Throwable localThrowable4)
                    {
                      K.error("accept() exception : ", localThrowable4);
                    }
                  }
                }
                catch (Throwable localThrowable5) {
                  K.error("Exception en traitant une clef dans le ListenerConnectionHandler : ", localThrowable5);
                  bcT localbcT = (bcT)localSelectionKey.attachment();
                  this.bZZ.d(this, localbcT);
                  localbcT.close();

                  localbcT.release();
                }
              }
            }
            catch (Throwable localThrowable3) {
              K.error("Exception dans la loop interne du ListenerConnectionHandler : ", localThrowable3);
            }
          }
        }
      }
      catch (Throwable localThrowable1)
      {
        K.error("Exception dans la loop externe du ListenerConnectionHandler : ", localThrowable1);
      }
    }

    K.info("ListenerConnectionHandler stopped");
  }
}