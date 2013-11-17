import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cps extends aZl
{
  private static final gR[] hYA = new gR[0];

  private String hYB = null;

  private final cSR czD = new cSR();

  private final Object hYC = new Object();
  private final String hYD;
  private final String hYE;
  private final dmP czX;
  private static final dmP czY = dmP.b(dmP.llq);
  private boolean czL;

  public cps(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.hYD = paramString1;
    this.hYE = paramString2;
    this.czX = (paramBoolean ? dmP.b(dmP.llr) : dmP.b(dmP.llq));
    start();
  }

  public cps(String paramString1, String paramString2) {
    this(paramString1, paramString2, false);
  }

  public gR a(int paramInt, gR paramgR)
  {
    if (!ais()) {
      K.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialisé");
      return null;
    }

    gR[] arrayOfgR = a("id", Integer.valueOf(paramInt), paramgR);
    if ((arrayOfgR != null) && (arrayOfgR.length > 0))
      return arrayOfgR[0];
    return null;
  }

  public gR[] a(String paramString, Object paramObject, gR paramgR)
  {
    if (!ais()) {
      K.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialisé");
      return hYA;
    }

    LinkedList localLinkedList = new LinkedList();

    synchronized (this.hYC)
    {
      HashMap localHashMap = (HashMap)this.czD.get(paramgR.oZ());
      if (localHashMap == null) {
        return hYA;
      }
      if (localHashMap.get(paramString) == null)
        return hYA;
      try
      {
        localFile = new File(this.hYB + this.hYD);
        if (!localFile.exists()) {
          return hYA;
        }
        str = paramObject.toString();
        for (zD localzD : (ArrayList)localHashMap.get(paramString))
          if (localzD.Iu().equals(str))
          {
            FileInputStream localFileInputStream = null;
            DataInputStream localDataInputStream = null;
            try {
              localFileInputStream = new FileInputStream(localFile);
              localDataInputStream = this.czX.a(localFileInputStream);
              FileChannel localFileChannel = localFileInputStream.getChannel();

              localFileChannel.position(localzD.getPosition());

              bop localbop = new bop();
              localbop.read(localDataInputStream);

              localgR = paramgR.pb();
              ByteBuffer localByteBuffer = ByteBuffer.wrap(localbop.getData());
              localgR.a(localByteBuffer, localbop.getId(), localbop.oX());
              if (localByteBuffer.remaining() != 0) {
                K.warn("Objet restauré du simple binary storage : " + localByteBuffer.remaining() + " bytes restants non lus [type:" + paramgR.oZ() + " | id:" + localbop.getId() + "]");
              }

              localLinkedList.add(localgR);

              for (aSn localaSn : this.ffN)
                localaSn.c(this, localgR);
            }
            finally
            {
              gR localgR;
              if (localDataInputStream != null) {
                try {
                  localDataInputStream.close();
                } catch (IOException localIOException4) {
                  K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException4);
                }
              }

              if (localFileInputStream != null)
                try {
                  localFileInputStream.close();
                } catch (IOException localIOException5) {
                  K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException5);
                }
            }
          }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        File localFile;
        String str;
        K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
      } catch (IOException localIOException1) {
        K.error(localIOException1.getMessage(), localIOException1);
      }

    }

    if (!localLinkedList.isEmpty()) {
      return (gR[])localLinkedList.toArray(new gR[localLinkedList.size()]);
    }
    return hYA;
  }

  public gR[] d(gR paramgR)
  {
    long l = System.nanoTime();
    if (!ais()) {
      K.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialisé");
      return hYA;
    }

    LinkedList localLinkedList = new LinkedList();

    synchronized (this.hYC)
    {
      HashMap localHashMap = (HashMap)this.czD.get(paramgR.oZ());
      if (localHashMap == null) {
        return hYA;
      }
      try
      {
        localFile = new File(this.hYB + this.hYD);
        if (!localFile.exists()) {
          return hYA;
        }

        for (zD localzD : (ArrayList)localHashMap.get("id"))
        {
          FileInputStream localFileInputStream = null;
          DataInputStream localDataInputStream = null;
          bop localbop;
          try
          {
            localFileInputStream = new FileInputStream(localFile);
            localDataInputStream = this.czX.a(localFileInputStream);

            localFileInputStream.getChannel().position(localzD.getPosition());

            localbop = new bop();
            localbop.read(localDataInputStream);
          }
          finally {
            if (localDataInputStream != null) {
              try {
                localDataInputStream.close();
              } catch (IOException localIOException4) {
                K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException4);
              }
            }

            if (localFileInputStream != null) {
              try {
                localFileInputStream.close();
              } catch (IOException localIOException5) {
                K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException5);
              }
            }
          }

          localgR = paramgR.pb();
          ByteBuffer localByteBuffer = ByteBuffer.wrap(localbop.getData());
          localgR.a(localByteBuffer, localbop.getId(), localbop.oX());
          if (localByteBuffer.remaining() != 0) {
            K.warn("Objet restauré du simple binary storage : " + localByteBuffer.remaining() + " bytes restants non lus [type:" + paramgR.oZ() + " | id:" + localbop.getId() + "]");
          }

          localLinkedList.add(localgR);

          for (aSn localaSn : this.ffN)
            localaSn.c(this, localgR);
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        File localFile;
        gR localgR;
        K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
      } catch (IOException localIOException1) {
        K.error(localIOException1.getMessage(), localIOException1);
      }

    }

    if (!localLinkedList.isEmpty())
      return (gR[])localLinkedList.toArray(new gR[localLinkedList.size()]);
    return hYA;
  }

  public void lJ(String paramString)
  {
    if (paramString != null) {
      String str = paramString;

      if (str.charAt(str.length() - 1) != '/') {
        str = str + "/";
      }
      this.czL = false;
      this.hYB = str;
    }
  }

  public boolean ais() {
    return this.czL;
  }

  public boolean aiu()
  {
    if ((!bB) && (this.hYB == null)) throw new AssertionError("Il faut initialiser m_baseWorkspace");
    synchronized (this.hYC)
    {
      try {
        File localFile1 = new File(this.hYB);
        if ((localFile1.exists()) && (!localFile1.isDirectory())) {
          K.error("Tentative de changement de workspace [" + this.hYB + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
          return false;
        }
        if ((!localFile1.exists()) && 
          (!localFile1.mkdirs())) {
          K.error("Impossible de creer l'arborescence de repertoire [" + this.hYB + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");

          return false;
        }

        this.czD.clear();

        File localFile2 = new File(this.hYB + this.hYE);
        if (!localFile2.exists()) {
          localFile2.createNewFile();
          K.info("Fichier d'index non trouvé pour le chargement de la source binaire : Creation d'une nouvelle source");
          coX();
          return true;
        }

        DataInputStream localDataInputStream = null;
        try {
          localDataInputStream = czY.a(new FileInputStream(localFile2));
          try {
            while (true) {
              zD localzD = new zD();
              localzD.read(localDataInputStream);
              a(localzD);
            }

          }
          catch (EOFException localEOFException)
          {
            if (localDataInputStream == null) break label315; 
          }
          try { localDataInputStream.close();
          } catch (IOException localIOException2) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException2);
          }
        }
        finally
        {
          if (localDataInputStream != null)
            try {
              localDataInputStream.close();
            } catch (IOException localIOException3) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException3);
            }
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
      } catch (IOException localIOException1) {
        label315: K.error(localIOException1.getMessage(), localIOException1);
      }

      coX();
      return true;
    }
  }

  private void coX() {
    this.czL = true;

    for (aSn localaSn : this.ffN)
      localaSn.a(this, ait());
  }

  private void a(zD paramzD) {
    HashMap localHashMap = (HashMap)this.czD.get(paramzD.getType());
    if (localHashMap == null) {
      localHashMap = new HashMap(5);
      this.czD.put(paramzD.getType(), localHashMap);
    }

    ArrayList localArrayList = (ArrayList)localHashMap.get(paramzD.getIndexName());
    if (localArrayList == null) {
      localArrayList = new ArrayList(300);
      localHashMap.put(paramzD.getIndexName(), localArrayList);
    }
    localArrayList.add(paramzD);
  }

  protected void c(gR paramgR)
  {
    K.error("Remove call on a ReadOnlyBinaryStorage");
  }

  protected void a(gR paramgR)
  {
    synchronized (this.hYC)
    {
      byte[] arrayOfByte = paramgR.pa();
      if (arrayOfByte == null) {
        K.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de données " + paramgR);
        return;
      }
      try
      {
        File localFile = new File(this.hYB + this.hYD);
        if (!localFile.exists()) {
          localFile.createNewFile();
        }FileOutputStream localFileOutputStream = null;
        DataOutputStream localDataOutputStream = null;
        long l;
        try { localFileOutputStream = new FileOutputStream(this.hYB + this.hYD, true);
          localDataOutputStream = this.czX.c(localFileOutputStream);

          l = localFileOutputStream.getChannel().size();

          bop localbop = new bop(paramgR.oW(), paramgR.oX(), arrayOfByte);
          localbop.write(localDataOutputStream);
        } finally
        {
          if (localDataOutputStream != null) {
            try {
              localDataOutputStream.close();
            } catch (IOException localIOException4) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException4);
            }
          }

          if (localFileOutputStream != null) {
            try {
              localFileOutputStream.close();
            } catch (IOException localIOException5) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException5);
            }
          }
        }

        a("id", Integer.valueOf(paramgR.oW()), paramgR.oZ(), l);

        Field[] arrayOfField1 = paramgR.getClass().getDeclaredFields();
        for (Field localField : arrayOfField1)
          if (localField.isAnnotationPresent(bok.class)) {
            bok localbok = (bok)localField.getAnnotation(bok.class);
            Object localObject2;
            if (localField.isAccessible()) {
              localObject2 = localField.get(paramgR);
            } else {
              localField.setAccessible(true);
              localObject2 = localField.get(paramgR);
              localField.setAccessible(false);
            }
            a(localbok.name(), localObject2, paramgR.oZ(), l);
          }
      }
      catch (IOException localIOException1)
      {
        K.error(localIOException1.getMessage(), localIOException1);
      } catch (IllegalAccessException localIllegalAccessException) {
        K.error(localIllegalAccessException.getMessage(), localIllegalAccessException);
      }
    }
  }

  private void a(String paramString, Object paramObject, int paramInt, long paramLong)
  {
    try {
      DataOutputStream localDataOutputStream = null;
      try {
        localDataOutputStream = czY.c(new FileOutputStream(this.hYB + this.hYE, true));
        zD localzD = new zD(paramInt, paramString, paramObject.toString(), paramLong);
        localzD.write(localDataOutputStream);
        a(localzD);
      }
      finally {
        if (localDataOutputStream != null)
          try {
            localDataOutputStream.close();
          } catch (IOException localIOException3) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException3);
          }
      }
    }
    catch (IOException localIOException1)
    {
      K.error(localIOException1.getMessage());
    }
  }

  protected String ait()
  {
    return this.hYB;
  }

  public void aiw()
  {
    synchronized (this.hYC) {
      System.out.println("cleanUpFiles m_baseWorkspace " + this.hYB);
      File localFile1 = new File(this.hYB + this.hYE);
      File localFile2 = new File(this.hYB + this.hYD);

      localFile1.delete();
      localFile2.delete();

      this.czD.clear();
    }
  }
}