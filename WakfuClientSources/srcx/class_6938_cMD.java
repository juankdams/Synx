import java.io.IOException;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.apache.log4j.Logger;

public class cMD extends bXH
{
  private static final Logger K = Logger.getLogger(cMD.class);
  public static final Logger krX = Logger.getLogger("Traceur");

  protected int bvv = 500;
  protected int bvu = 2147483647;

  public cMD(DL paramDL)
  {
    super(paramDL);
    this.hnu = new akg(new bFk(this));

    kI("listener");
  }

  public void cFA()
  {
  }

  public void dS(int paramInt)
  {
    this.bvv = paramInt;
  }

  public void dR(int paramInt)
  {
    this.bvu = paramInt;
  }

  public synchronized Ac J(String paramString, int paramInt)
  {
    Ac localAc = (Ac)cde();
    if (localAc != null) {
      localAc.setHost(paramString);
      localAc.setPort(paramInt);

      this.hnE.offer(new bex(pb.aUM, localAc));
      this.hnt.wakeup();
    }
    return localAc;
  }

  protected void a(Ac paramAc)
  {
    if (paramAc == null) {
      K.error("Unable to create a connection");
      return;
    }
    SocketChannel localSocketChannel = cFB();
    if (localSocketChannel == null) {
      return;
    }
    f(paramAc);
    paramAc.dR(this.bvu);
    paramAc.dS(this.bvv);
    try {
      InetSocketAddress localInetSocketAddress = new InetSocketAddress(paramAc.getHost(), paramAc.getPort());
      boolean bool = localSocketChannel.connect(localInetSocketAddress);
      paramAc.b(localSocketChannel);

      if (bool)
      {
        paramAc.bqY();
        paramAc.ar(true);
        paramAc.aq(false);
        if (!this.bZZ.a(this, paramAc)) {
          K.error("onNewConnection failed");
          paramAc.IZ();
        }

      }
      else
      {
        paramAc.bqX();
      }
    } catch (ConnectException localConnectException) {
      K.error("Une exception dans l'ouverture de la connection a ete levee (" + paramAc + ")", localConnectException);
      this.bZZ.d(this, paramAc);
      paramAc.IZ();
    }
    catch (Exception localException) {
      this.bZZ.d(this, paramAc);
      K.error("Une exception dans l'ouverture de la connection a ete levee (" + paramAc + ")", localException);
    }
  }

  static SocketChannel cFB()
  {
    SocketChannel localSocketChannel;
    try
    {
      localSocketChannel = SocketChannel.open();
    } catch (IOException localIOException) {
      K.error("Impossible de générer un nouveau SocketChannel.");
      return null;
    }
    try {
      localSocketChannel.configureBlocking(false);
      Socket localSocket = localSocketChannel.socket();
      localSocket.setReuseAddress(true);
      localSocket.setKeepAlive(true);
      localSocket.setTcpNoDelay(true);
      localSocket.setTrafficClass(128);
      return localSocketChannel;
    } catch (Throwable localThrowable) {
      K.error("generateNewSocketChannel() a levé une exception :", localThrowable);
    }return null;
  }

  public void run()
  {
    K.info("Client ConnectionHandler started: " + toString());

    while (this.aKV) {
      try
      {
        while (this.aKV)
        {
          cdf();

          int i = 0;
          try
          {
            i = this.hnt.select(hns);
          }
          catch (Throwable localThrowable2) {
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
                  Object localObject;
                  if ((localSelectionKey.isValid()) && (localSelectionKey.isConnectable()))
                  {
                    localObject = (SocketChannel)localSelectionKey.channel();
                    if (!((SocketChannel)localObject).isConnectionPending())
                    {
                      K.error("Le sélecteur a retourné une clef connectable qui n'est pas connection_pending.");
                    }
                    else { localAc = (Ac)localSelectionKey.attachment();
                      boolean bool1;
                      try {
                        bool1 = ((SocketChannel)localObject).finishConnect();
                      }
                      catch (ConnectException localConnectException)
                      {
                        bool1 = false;
                      }
                      if (bool1) {
                        boolean bool2 = localAc.IX();
                        boolean bool3 = localAc.Jg();
                        localAc.aq(false);
                        localAc.ar(true);

                        localAc.bqY();
                        cda();

                        int j = (!bool2) || (!bool3) ? 1 : 0;
                        if (j != 0)
                        {
                          System.out.println("Connecté à l'hôte " + localAc.getHost() + ":" + localAc.getPort());
                          if (!this.bZZ.a(this, localAc)) {
                            l(localAc);
                          }

                        }
                        else
                        {
                          System.out.println("Reconnecté à l'hôte " + localAc.getHost() + ":" + localAc.getPort());
                          if (!this.bZZ.e(this, localAc)) {
                            l(localAc);
                          }
                        }

                      }
                      else
                      {
                        localAc.IZ();
                      } }
                  }
                  else {
                    localObject = (bcT)localSelectionKey.attachment();
                    if ((!localSelectionKey.isValid()) || (!localSelectionKey.isWritable()) || 
                      (((bcT)localObject).brf()))
                    {
                      if ((localSelectionKey.isValid()) && (localSelectionKey.isReadable()) && 
                        (!this.bZZ.b(this, (bcT)localObject))) {
                        l((bcT)localObject);
                      }

                    }

                  }

                }
                catch (Throwable localThrowable4)
                {
                  K.error("Exception en traitant une clef dans le ConnectorConnectionHandler : ", localThrowable4);
                  Ac localAc = (Ac)localSelectionKey.attachment();
                  this.bZZ.d(this, localAc);
                  localAc.IZ();
                }
              }
            }
            catch (Throwable localThrowable3) {
              K.error("Exception dans la loop interne du ConnectorConnectionHandler : ", localThrowable3);
            }
          }
        }
      }
      catch (Throwable localThrowable1)
      {
        K.error("Exception dans la loop externe du ConnectorConnectionHandler : ", localThrowable1);
      }
    }

    K.info("ConnectorConnectionHandler stopped");
  }

  private void l(bcT parambcT) {
    parambcT.close();
    cdb();
    parambcT.release();
  }
}