import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public final class Vm extends aZl
{
  private final cSR czC = new cSR();

  private final cSR czD = new cSR();
  private static final boolean czE = false;
  private final String czF;
  private int czG = 20000000;

  private int czH = 500;
  private bGq czI;
  private final Object aNy = new Object();
  private final StringBuilder czJ = new StringBuilder(20);
  private static final Pattern czK = Pattern.compile("[^a-zA-Z0-9-_/\\.]");
  private boolean czL;
  private final File czM;
  private final File czN;
  private final File czO;
  private final File czP;
  private final aoL czQ = new aoL();

  private final cSR czR = new cSR();
  private static final String czS = "data.";
  private static final String czT = ".bdat";
  private static final String czU = "index.";
  private static final String czV = ".bdat";
  private static final String czW = "metadata.bdat";
  private final dmP czX;
  private final dmP czY = dmP.b(dmP.llq);
  private final dmP czZ = dmP.b(dmP.llq);

  protected Vm(String paramString)
  {
    this(paramString, false);
  }

  private Vm(String paramString, boolean paramBoolean) {
    this.czF = dH(paramString);

    this.czP = new File(this.czF);
    this.czM = new File(this.czF + "~building_index.tmp");
    this.czN = new File(this.czF + "~building_data.tmp");
    this.czO = new File(this.czF + "metadata.bdat");

    setName("BinaryStorage (" + this.czF + ")");
    this.czX = (paramBoolean ? dmP.b(dmP.llr) : dmP.b(dmP.llq));

    if (aiu())
      start();
    else
      K.error("Echec de l'initialisation du binary storage " + this);
  }

  public static boolean dG(String paramString)
  {
    File localFile = new File(dH(paramString) + "metadata.bdat");
    return localFile.exists();
  }

  private static String dH(String paramString) {
    String str = paramString;
    str = czK.matcher(str).replaceAll("_");
    if (str.charAt(0) == '/')
      str = str.substring(1, str.length());
    if (str.charAt(str.length() - 1) != '/')
      str = str + "/";
    return str;
  }

  public boolean ais()
  {
    return this.czL;
  }

  protected String ait() {
    return this.czF;
  }

  protected boolean aiu()
  {
    synchronized (this.aNy) {
      if (this.czL) {
        K.error("Binary storage already initialize : " + this.czF);
        return false;
      }
      Object localObject1;
      try
      {
        if ((this.czP.exists()) && (!this.czP.isDirectory())) {
          K.error("Tentative de changement de workspace [" + this.czF + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
          return false;
        }
        if ((!this.czP.exists()) && 
          (!this.czP.mkdirs())) {
          K.error("Impossible de creer l'arborescence de repertoire [" + this.czF + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");

          return false;
        }

        this.czC.clear();

        if (!this.czO.exists()) {
          this.czO.createNewFile();
          K.info("Fichier de meta données non trouvé pour le chargement de la source binaire : Creation d'une nouvelle source");
        }
        else
        {
          FileInputStream localFileInputStream = null;
          localObject1 = null;
          try {
            localFileInputStream = new FileInputStream(this.czO);
            localObject1 = this.czZ.a(localFileInputStream);
            try
            {
              while (true)
              {
                int i = ((DataInputStream)localObject1).readInt();
                int j = ((DataInputStream)localObject1).readInt();
                int k = ((DataInputStream)localObject1).readInt();
                int m = ((DataInputStream)localObject1).readInt();

                int n = i;
                ArrayList localArrayList = (ArrayList)this.czC.get(n);
                if (localArrayList == null) {
                  localArrayList = new ArrayList();
                  this.czC.put(n, localArrayList);
                }

                localArrayList.add(new bGq(this, n, j, k, m));
              }

            }
            catch (EOFException localEOFException)
            {
              if (localObject1 != null) {
                try {
                  ((DataInputStream)localObject1).close();
                } catch (IOException localIOException2) {
                  K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException2);
                }
              }

              if (localFileInputStream == null) break label416; 
            }
            try { localFileInputStream.close();
            } catch (IOException localIOException3) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException3);
            }
          }
          finally
          {
            if (localObject1 != null) {
              try {
                ((DataInputStream)localObject1).close();
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
        K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
        return false;
      } catch (IOException localIOException1) {
        label416: K.error(localIOException1.getMessage(), localIOException1);
        return false;
      }

      this.czL = true;

      for (Iterator localIterator = this.ffN.iterator(); localIterator.hasNext(); ) { localObject1 = (aSn)localIterator.next();
        ((aSn)localObject1).a(this, ait());
      }

      return true;
    }
  }

  private void aiv() {
    try {
      FileOutputStream localFileOutputStream = null;
      DataOutputStream localDataOutputStream1 = null;
      try
      {
        localFileOutputStream = new FileOutputStream(this.czO, false);
        localDataOutputStream1 = this.czZ.c(localFileOutputStream);

        DataOutputStream localDataOutputStream2 = localDataOutputStream1;
        if (!this.czC.isEmpty()) {
          this.czC.a(new boA(this, localDataOutputStream2));
        }

      }
      finally
      {
        if (localDataOutputStream1 != null) {
          try {
            localDataOutputStream1.close();
          } catch (IOException localIOException4) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException4);
          }
        }

        if (localFileOutputStream != null)
          try {
            localFileOutputStream.close();
          } catch (IOException localIOException5) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException5);
          }
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
    } catch (IOException localIOException1) {
      K.error(localIOException1.getMessage(), localIOException1);
    }
  }

  protected void a(gR paramgR) {
    synchronized (this.aNy) {
      ArrayList localArrayList = a(ffT, paramgR.oZ(), Integer.valueOf(paramgR.oW()), 1);

      if (localArrayList.size() <= 0) {
        b(paramgR);
      }
      else
        a(paramgR, (aUo)localArrayList.get(0));
    }
  }

  private void b(gR paramgR)
  {
    byte[] arrayOfByte = paramgR.pa();
    if (arrayOfByte == null) {
      K.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de données " + paramgR);
      return;
    }

    long l1 = paramgR.c(arrayOfByte);

    int i = arrayOfByte.length + 4 + 2 + 4;
    aC(paramgR.oZ(), i);
    try
    {
      File localFile = this.czI.cGG;
      if (!localFile.exists()) {
        localFile.createNewFile();
      }FileOutputStream localFileOutputStream = null;
      DataOutputStream localDataOutputStream = null;
      long l2;
      try {
        localFileOutputStream = new FileOutputStream(this.czI.cGG, true);
        localDataOutputStream = this.czX.c(localFileOutputStream);

        l2 = localFileOutputStream.getChannel().size();

        bop localbop = new bop(paramgR.oW(), paramgR.oX(), arrayOfByte);
        localbop.write(localDataOutputStream);
      }
      finally {
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

      this.czI.gCF += 1;
      this.czI.size += i;

      a(ffT, Integer.valueOf(paramgR.oW()), paramgR.oZ(), this.czI.eVe, l2, l1);

      Field[] arrayOfField1 = paramgR.getClass().getDeclaredFields();
      for (Field localField : arrayOfField1) {
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
          a(localbok.name().hashCode(), localObject2, paramgR.oZ(), this.czI.eVe, l2, l1);
        }
      }

      aiv();
    }
    catch (IOException localIOException1) {
      K.error(localIOException1.getMessage(), localIOException1);
    } catch (IllegalAccessException localIllegalAccessException) {
      K.error(localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
  }

  private void a(gR paramgR, aUo paramaUo)
  {
    aUo localaUo = paramaUo;
    byte[] arrayOfByte = paramgR.pa();
    if (arrayOfByte == null) {
      K.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de données " + paramgR);
      return;
    }
    if (localaUo.eVg != paramgR.c(arrayOfByte)) {
      b(paramgR, paramaUo);
      b(paramgR);
    }
  }

  protected void c(gR paramgR) {
    synchronized (this.aNy) {
      ArrayList localArrayList = a(ffT, paramgR.oZ(), Integer.valueOf(paramgR.oW()), 1);
      if (!localArrayList.isEmpty())
        b(paramgR, (aUo)localArrayList.get(0));
    }
  }

  private void b(gR paramgR, aUo paramaUo)
  {
    aD(paramgR.oZ(), paramaUo.eVe);
    try {
      FileInputStream localFileInputStream = null;
      DataInputStream localDataInputStream = null;
      FileOutputStream localFileOutputStream = null;
      int i;
      try { this.czJ.setLength(0);
        localFileInputStream = new FileInputStream(this.czI.cGG);
        localDataInputStream = this.czX.a(localFileInputStream);

        int j = (int)localFileInputStream.getChannel().size();

        localFileOutputStream = new FileOutputStream(this.czN, false);

        localFileInputStream.getChannel().position(paramaUo.eVf);
        i = bop.a(localDataInputStream);
        long l = paramaUo.eVf + i;

        localFileInputStream.getChannel().transferTo(0L, paramaUo.eVf, localFileOutputStream.getChannel());
        localFileInputStream.getChannel().transferTo(l, j - l, localFileOutputStream.getChannel());
      } finally
      {
        if (localDataInputStream != null) {
          try {
            localDataInputStream.close();
          } catch (IOException localIOException5) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException5);
          }
        }

        if (localFileInputStream != null) {
          try {
            localFileInputStream.close();
          } catch (IOException localIOException6) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException6);
          }
        }

        if (localFileOutputStream != null) {
          try {
            localFileOutputStream.close();
          } catch (IOException localIOException7) {
            K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException7);
          }
        }
      }

      this.czJ.setLength(0);
      File localFile = this.czI.cGG;
      if (localFile.exists())
        localFile.delete();
      this.czN.renameTo(localFile);

      this.czI.gCF -= 1;
      this.czI.size -= i;

      a(paramaUo.eVe, paramaUo.eVf, i, paramgR);
      aiv();
    }
    catch (FileNotFoundException localFileNotFoundException) {
      K.error(localFileNotFoundException.getMessage(), localFileNotFoundException);
    } catch (IOException localIOException1) {
      K.error(localIOException1.getMessage(), localIOException1);
    }
  }

  private void a(int paramInt, long paramLong1, long paramLong2, gR paramgR)
  {
    try
    {
      int i = paramgR.oZ();

      cSR localcSR = (cSR)this.czD.get(i);
      if (localcSR != null) {
        dmn localdmn = localcSR.yF();
        while (localdmn.hasNext()) {
          localdmn.fl();

          FileOutputStream localFileOutputStream = null;
          DataOutputStream localDataOutputStream = null;
          try
          {
            localFileOutputStream = new FileOutputStream(this.czM, false);
            localDataOutputStream = this.czY.c(localFileOutputStream);

            Iterator localIterator = ((ArrayList)localdmn.value()).iterator();
            while (localIterator.hasNext()) {
              aUo localaUo = (aUo)localIterator.next();
              if ((localaUo.eVe == paramInt) && (localaUo.eVf > paramLong1))
              {
                localaUo.eVf -= paramLong2;
                localaUo.write(localDataOutputStream);
              }
              else if ((localaUo.eVe == paramInt) && (localaUo.eVf == paramLong1))
              {
                localIterator.remove();
                localaUo.release();
              }
              else if ((paramInt != localaUo.eVe) || ((paramInt == localaUo.eVe) && (localaUo.eVf < paramLong1)))
              {
                localaUo.write(localDataOutputStream);
              }
            }
          }
          finally {
            if (localDataOutputStream != null) {
              try {
                localDataOutputStream.close();
              } catch (IOException localIOException3) {
                K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException3);
              }
            }
          }

          File localFile = aE(localdmn.zY(), i);
          if (localFile.exists())
            localFile.delete();
          this.czM.renameTo(localFile);
        }
      }
      else
      {
        K.error("Situation anormale : on met a jour des indexes qu'on a pas encore monté en memoire");
      }
    } catch (IOException localIOException1) {
      K.error(localIOException1.getMessage(), localIOException1);
    }
  }

  private gR[] a(ArrayList paramArrayList, gR paramgR)
  {
    if (paramArrayList.size() == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();

    int i = paramgR.oZ();
    for (aUo localaUo : paramArrayList) {
      int j = localaUo.eVe;
      long l = localaUo.eVf;

      aD(i, j);
      try
      {
        this.czJ.setLength(0);
        File localFile = this.czI.cGG;
        if (!localFile.exists()) {
          return null;
        }
        FileInputStream localFileInputStream = null;
        DataInputStream localDataInputStream = null;
        bop localbop = null;
        try {
          localFileInputStream = new FileInputStream(localFile);
          localDataInputStream = this.czX.a(localFileInputStream);

          if (l < 0L) {
            K.fatal("position négative");
            return null;
          }
          localFileInputStream.getChannel().position(l);

          localbop = new bop();
          localbop.read(localDataInputStream);
        }
        finally {
          if (localDataInputStream != null) {
            try {
              localDataInputStream.close();
            } catch (IOException localIOException6) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException6);
            }
          }

          if (localFileInputStream != null) {
            try {
              localFileInputStream.close();
            } catch (IOException localIOException7) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException7);
            }
          }
        }

        localgR = paramgR.pb();
        ByteBuffer localByteBuffer = ByteBuffer.wrap(localbop.getData());
        localgR.a(localByteBuffer, localbop.getId(), localbop.oX());
        if (localByteBuffer.remaining() != 0) {
          K.warn("Objet restauré du binary storage : " + localByteBuffer.remaining() + " bytes restants non lus [type:" + paramgR.oZ() + " | id:" + localbop.getId() + "]");
        }
        localArrayList.add(localgR);

        for (aSn localaSn : this.ffN)
          localaSn.c(this, localgR);
      }
      catch (IOException localIOException1)
      {
        gR localgR;
        K.error(localIOException1.getMessage(), localIOException1);
      }

    }

    if (localArrayList.size() > 0) {
      return (gR[])localArrayList.toArray(new gR[localArrayList.size()]);
    }
    return null;
  }

  public gR[] a(String paramString, Object paramObject, gR paramgR)
  {
    return a(paramString.hashCode(), paramObject, paramgR);
  }

  public gR[] a(int paramInt, Object paramObject, gR paramgR)
  {
    return a(paramInt, paramObject, paramgR, 2147483647);
  }

  public gR[] a(int paramInt1, Object paramObject, gR paramgR, int paramInt2)
  {
    synchronized (this.aNy) {
      return a(a(paramInt1, paramgR.oZ(), paramObject, paramInt2), paramgR);
    }
  }

  public gR a(int paramInt, gR paramgR)
  {
    gR[] arrayOfgR = a(ffT, Integer.valueOf(paramInt), paramgR, 1);
    if ((arrayOfgR != null) && (arrayOfgR.length > 0))
      return arrayOfgR[0];
    return null;
  }

  public gR[] d(gR paramgR)
  {
    synchronized (this.aNy) {
      cSR localcSR = (cSR)this.czD.get(paramgR.oZ());
      if (localcSR == null) {
        gY(paramgR.oZ());
        localcSR = (cSR)this.czD.get(paramgR.oZ());
      }
      ArrayList localArrayList = (ArrayList)localcSR.get(ffT);
      if ((localArrayList == null) || (localArrayList.isEmpty()))
        return null;
      return a(localArrayList, paramgR);
    }
  }

  public void aiw()
  {
    synchronized (this.aNy) {
      File[] arrayOfFile1 = this.czP.listFiles(new boF(this));

      for (File localFile : arrayOfFile1)
        localFile.delete();
    }
  }

  private void aC(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = (ArrayList)this.czC.get(paramInt1);
    Object localObject = null;

    if (localArrayList == null) {
      localObject = new bGq(this, paramInt1, 1, 0, 0);
      localArrayList = new ArrayList();
      localArrayList.add(localObject);
      this.czC.put(paramInt1, localArrayList);
    }

    int i = 0;

    for (bGq localbGq : localArrayList) {
      if (localbGq.eVe > i) {
        i = localbGq.eVe;
      }
      if (((this.czH < 0) || (localbGq.gCF + 1 <= this.czH)) && ((this.czG < 0) || (paramInt2 + localbGq.size <= this.czG)))
      {
        localObject = localbGq;
        break;
      }
    }

    if (localObject == null) {
      localObject = new bGq(this, paramInt1, i + 1, 0, 0);
      localArrayList.add(localObject);
    }

    a((bGq)localObject);
  }

  private boolean aD(int paramInt1, int paramInt2) {
    ArrayList localArrayList = (ArrayList)this.czC.get(paramInt1);
    bGq localbGq1 = null;

    if (localArrayList == null) {
      localbGq1 = new bGq(this, paramInt1, 1, 0, 0);
      localArrayList = new ArrayList();
      localArrayList.add(localbGq1);
      this.czC.put(paramInt1, localArrayList);
    }

    for (bGq localbGq2 : localArrayList) {
      if (localbGq2.eVe == paramInt2) {
        a(localbGq2);
        return true;
      }
    }

    return false;
  }

  private void a(bGq parambGq) {
    this.czI = parambGq;
  }

  private File aE(int paramInt1, int paramInt2)
  {
    long l = bCO.cM(paramInt2, paramInt1);
    File localFile = (File)this.czQ.get(l);
    if (localFile != null)
      return localFile;
    this.czJ.setLength(0);
    String str = this.czF + "index." + paramInt2 + "_" + paramInt1 + ".bdat";
    localFile = new File(str);
    this.czQ.put(l, localFile);
    return localFile;
  }

  private void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    try
    {
      File localFile = aE(paramInt1, paramInt2);
      if (!localFile.exists()) {
        localFile.createNewFile();
      }
      FileOutputStream localFileOutputStream = null;
      DataOutputStream localDataOutputStream = null;
      aUo localaUo = null;
      try {
        localFileOutputStream = new FileOutputStream(localFile, true);
        localDataOutputStream = this.czY.c(localFileOutputStream);

        localaUo = aUo.a(paramObject.toString(), paramInt3, paramLong1, paramLong2);
        localaUo.write(localDataOutputStream);
      }
      finally {
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

      cSR localcSR = (cSR)this.czD.get(paramInt2);
      if (localcSR == null) {
        gY(paramInt2);
        localcSR = (cSR)this.czD.get(paramInt2);
      }

      ArrayList localArrayList = (ArrayList)localcSR.get(paramInt1);
      if (localArrayList == null) {
        localArrayList = new ArrayList(50);
        localcSR.put(paramInt1, localArrayList);
      }
      localArrayList.add(localaUo);
    }
    catch (IOException localIOException1) {
      K.error(localIOException1.getMessage(), localIOException1);
    }
  }

  private ArrayList a(int paramInt1, int paramInt2, Object paramObject, int paramInt3)
  {
    cSR localcSR = (cSR)this.czD.get(paramInt2);
    if (localcSR == null) {
      gY(paramInt2);
      localcSR = (cSR)this.czD.get(paramInt2);
    }

    ArrayList localArrayList1 = new ArrayList();

    if (localcSR != null) {
      ArrayList localArrayList2 = (ArrayList)localcSR.get(paramInt1);
      if (localArrayList2 != null) {
        int i = localArrayList2.size();
        String str = paramObject.toString();
        for (int j = 0; j < i; j++) {
          aUo localaUo = (aUo)localArrayList2.get(j);
          if (localaUo.value.equals(str)) {
            localArrayList1.add(localaUo);
            if (localArrayList1.size() >= paramInt3) {
              break;
            }
          }
        }
      }
    }
    return localArrayList1;
  }

  private void gY(int paramInt)
  {
    Pattern localPattern = Pattern.compile("index.".replaceAll("\\.", "\\\\\\.") + paramInt + "_([a-zA-Z0-9_.-]+)" + ".bdat".replaceAll("\\.", "\\\\\\."));

    File[] arrayOfFile1 = this.czP.listFiles(new boE(this, localPattern));

    cSR localcSR = (cSR)this.czD.get(paramInt);
    if (localcSR == null) {
      localcSR = new cSR();
      this.czD.put(paramInt, localcSR);
    }

    label394: for (File localFile : arrayOfFile1) {
      Matcher localMatcher = localPattern.matcher(localFile.getName());

      if (localMatcher.matches())
      {
        int k;
        try {
          k = Integer.parseInt(localMatcher.group(1));
        } catch (NumberFormatException localNumberFormatException) {
          K.error("Nom de fichier d'index mal formé : " + localFile.getName());
          continue;
        }
        try
        {
          FileInputStream localFileInputStream = null;
          DataInputStream localDataInputStream = null;
          try {
            localFileInputStream = new FileInputStream(localFile);
            localDataInputStream = this.czY.a(localFileInputStream);
            try
            {
              while (true) {
                aUo localaUo = aUo.bjw();
                localaUo.read(localDataInputStream);

                ArrayList localArrayList = (ArrayList)localcSR.get(k);
                if (localArrayList == null) {
                  localArrayList = new ArrayList();
                  localcSR.put(k, localArrayList);
                }
                localArrayList.add(localaUo);
              }

            }
            catch (EOFException localEOFException)
            {
              if (localDataInputStream != null) {
                try {
                  localDataInputStream.close();
                } catch (IOException localIOException2) {
                  K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException2);
                }
              }

              if (localFileInputStream == null) break label394; 
            }
            try { localFileInputStream.close();
            } catch (IOException localIOException3) {
              K.fatal("Impossible de fermer le descripteur ouvert sur un fichier !", localIOException3);
            }
          }
          finally
          {
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
        catch (FileNotFoundException localFileNotFoundException)
        {
          K.error(localFileNotFoundException.getMessage());
        } catch (IOException localIOException1) {
          K.error(localIOException1.getMessage());
        }
      }
    }
  }

  public String toString()
  {
    return "BinaryStorage working under " + this.czF;
  }
}