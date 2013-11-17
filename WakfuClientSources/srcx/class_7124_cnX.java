import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cnX extends amW
  implements cjq
{
  private static final int hVq = 4;
  private static final int WORD = 16;
  private static final int bt = 8192;
  private static final int bs = 255;
  private File cGG;
  private File hVr;
  private String algorithm;
  private String bu;
  private String hVs;
  private String Ru;
  private Map hVt;
  private Map hVu;
  private String hVv;
  private boolean hVw;
  private String hVx;
  private bJr hVy;
  private Hashtable hVz;
  private MessageDigest bv;
  private boolean hVA;
  private int bw;
  private MessageFormat hVB;

  public cnX()
  {
    this.cGG = null;

    this.algorithm = "MD5";

    this.bu = null;

    this.hVt = new HashMap();

    this.hVu = new HashMap();

    this.hVy = null;

    this.hVz = new Hashtable();

    this.bw = 8192;

    this.hVB = cFR.cBi().cBj();
  }

  public void C(File paramFile)
  {
    this.cGG = paramFile;
  }

  public void K(File paramFile)
  {
    this.hVr = paramFile;
  }

  public void setAlgorithm(String paramString)
  {
    this.algorithm = paramString;
  }

  public void j(String paramString)
  {
    this.bu = paramString;
  }

  public void lz(String paramString)
  {
    this.hVs = paramString;
  }

  public void w(String paramString)
  {
    this.Ru = paramString;
  }

  public void lA(String paramString)
  {
    this.hVv = paramString;
  }

  public void lB(String paramString)
  {
    this.hVx = paramString;
  }

  public void ho(boolean paramBoolean)
  {
    this.hVw = paramBoolean;
  }

  public void vX(int paramInt)
  {
    this.bw = paramInt;
  }

  public void a(cFR paramcFR)
  {
    this.hVB = paramcFR.cBj();
  }

  public void setPattern(String paramString)
  {
    this.hVB = new MessageFormat(paramString);
  }

  public void b(bQM parambQM)
  {
    b(parambQM);
  }

  public void b(Ae paramAe)
  {
    if (paramAe == null) {
      return;
    }
    this.hVy = (this.hVy == null ? new bJr() : this.hVy);
    this.hVy.b(paramAe);
  }

  public void execute()
  {
    this.hVA = false;
    boolean bool = coh();
    if (this.hVx != null)
      Ga().p(this.hVx, bool ? Boolean.TRUE.toString() : Boolean.FALSE.toString());
  }

  public boolean gh()
  {
    this.hVA = true;
    return coh();
  }

  private boolean coh()
  {
    String str = this.hVs;

    if ((this.cGG == null) && ((this.hVy == null) || (this.hVy.size() == 0))) {
      throw new cJ("Specify at least one source - a file or a resource collection.");
    }

    if ((this.hVy != null) && (!this.hVy.Jm())) {
      throw new cJ("Can only calculate checksums for file-based resources.");
    }
    if ((this.cGG != null) && (this.cGG.exists()) && (this.cGG.isDirectory())) {
      throw new cJ("Checksum cannot be generated for directories");
    }
    if ((this.cGG != null) && (this.hVv != null)) {
      throw new cJ("File and Totalproperty cannot co-exist.");
    }
    if ((this.Ru != null) && (this.hVs != null)) {
      throw new cJ("Property and FileExt cannot co-exist.");
    }
    if (this.Ru != null) {
      if (this.hVw) {
        throw new cJ("ForceOverwrite cannot be used when Property is specified");
      }

      int i = 0;
      if (this.hVy != null) {
        i += this.hVy.size();
      }
      if (this.cGG != null) {
        i++;
      }
      if (i > 1) {
        throw new cJ("Multiple files cannot be used when Property is specified");
      }
    }

    if (this.hVx != null) {
      this.hVA = true;
    }
    if ((this.hVx != null) && (this.hVw)) {
      throw new cJ("VerifyProperty and ForceOverwrite cannot co-exist.");
    }
    if ((this.hVA) && (this.hVw)) {
      throw new cJ("ForceOverwrite cannot be used when conditions are being used.");
    }

    this.bv = null;
    if (this.bu != null)
      try {
        this.bv = MessageDigest.getInstance(this.algorithm, this.bu);
      } catch (NoSuchAlgorithmException localNoSuchAlgorithmException1) {
        throw new cJ(localNoSuchAlgorithmException1, gu());
      } catch (NoSuchProviderException localNoSuchProviderException) {
        throw new cJ(localNoSuchProviderException, gu());
      }
    else {
      try {
        this.bv = MessageDigest.getInstance(this.algorithm);
      } catch (NoSuchAlgorithmException localNoSuchAlgorithmException2) {
        throw new cJ(localNoSuchAlgorithmException2, gu());
      }
    }
    if (this.bv == null) {
      throw new cJ("Unable to create Message Digest", gu());
    }
    if (this.hVs == null)
      this.hVs = ("." + this.algorithm);
    else if (this.hVs.trim().length() == 0)
      throw new cJ("File extension when specified must not be an empty string");
    try
    {
      if (this.hVy != null) {
        for (bFe localbFe : this.hVy) {
          File localFile = ((dmo)localbFe.G(dmo.class)).getFile();

          if ((this.hVv != null) || (this.hVr != null))
          {
            this.hVu.put(localFile, localbFe.getName().replace(File.separatorChar, '/'));
          }
          L(localFile);
        }
      }
      if (this.cGG != null) {
        if ((this.hVv != null) || (this.hVr != null)) {
          this.hVu.put(this.cGG, this.cGG.getName().replace(File.separatorChar, '/'));
        }

        L(this.cGG);
      }
      return coi();
    } finally {
      this.hVs = str;
      this.hVz.clear();
    }
  }

  private void L(File paramFile)
  {
    Object localObject;
    if (paramFile.exists()) {
      if (this.Ru == null) {
        localObject = M(paramFile);
        if ((this.hVw) || (this.hVA) || (paramFile.lastModified() > ((File)localObject).lastModified()))
        {
          this.hVz.put(paramFile, localObject);
        } else {
          d(paramFile + " omitted as " + localObject + " is up to date.", 3);

          if (this.hVv != null)
          {
            String str = N((File)localObject);
            byte[] arrayOfByte = h(str.toCharArray());
            this.hVt.put(paramFile, arrayOfByte);
          }
        }
      } else {
        this.hVz.put(paramFile, this.Ru);
      }
    } else {
      localObject = "Could not find file " + paramFile.getAbsolutePath() + " to generate checksum for.";

      log((String)localObject);
      throw new cJ((String)localObject, gu());
    }
  }

  private File M(File paramFile)
  {
    File localFile;
    if (this.hVr != null)
    {
      localObject = O(paramFile);
      localFile = new File(this.hVr, (String)localObject).getParentFile();

      localFile.mkdirs();
    }
    else
    {
      localFile = paramFile.getParentFile();
    }
    Object localObject = new File(localFile, paramFile.getName() + this.hVs);
    return localObject;
  }

  private boolean coi()
  {
    boolean bool = true;
    FileInputStream localFileInputStream = null;
    FileOutputStream localFileOutputStream = null;
    byte[] arrayOfByte1 = new byte[this.bw];
    try {
      for (Object localObject1 = this.hVz.entrySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
        this.bv.reset();
        File localFile = (File)((Map.Entry)localObject2).getKey();
        if (!this.hVA) {
          d("Calculating " + this.algorithm + " checksum for " + localFile, 3);
        }
        localFileInputStream = new FileInputStream(localFile);
        DigestInputStream localDigestInputStream = new DigestInputStream(localFileInputStream, this.bv);

        while (localDigestInputStream.read(arrayOfByte1, 0, this.bw) != -1);
        localDigestInputStream.close();
        localFileInputStream.close();
        localFileInputStream = null;
        arrayOfByte2 = this.bv.digest();
        if (this.hVv != null) {
          this.hVt.put(localFile, arrayOfByte2);
        }
        localObject3 = au(arrayOfByte2);

        localObject4 = ((Map.Entry)localObject2).getValue();
        Object localObject5;
        if ((localObject4 instanceof String)) {
          localObject5 = (String)localObject4;
          if (this.hVA) {
            bool = (bool) && (((String)localObject3).equals(this.Ru));
          }
          else
            Ga().p((String)localObject5, (String)localObject3);
        }
        else if ((localObject4 instanceof File)) {
          if (this.hVA) {
            localObject5 = (File)localObject4;
            if (((File)localObject5).exists())
              try {
                String str = N((File)localObject5);

                bool = (bool) && (((String)localObject3).equals(str));
              }
              catch (cJ localcJ)
              {
                bool = false;
              }
            else
              bool = false;
          }
          else {
            localObject5 = (File)localObject4;
            localFileOutputStream = new FileOutputStream((File)localObject5);
            localFileOutputStream.write(this.hVB.format(new Object[] { localObject3, localFile.getName(), wh.i(((File)localObject5).getParentFile(), localFile), wh.i(Ga().PE(), localFile), localFile.getAbsolutePath() }).getBytes());

            localFileOutputStream.write(bof.LINE_SEP.getBytes());
            localFileOutputStream.close();
            localFileOutputStream = null;
          }
        }
      }
      Object localObject2;
      byte[] arrayOfByte2;
      Object localObject3;
      Object localObject4;
      if (this.hVv != null)
      {
        localObject1 = (File[])this.hVt.keySet().toArray(new File[this.hVt.size()]);

        Arrays.sort((Object[])localObject1, new cgb(this));

        this.bv.reset();
        for (arrayOfByte2 : localObject1)
        {
          localObject3 = (byte[])this.hVt.get(arrayOfByte2);
          this.bv.update((byte[])localObject3);

          localObject4 = O(arrayOfByte2);
          this.bv.update(((String)localObject4).getBytes());
        }
        localObject2 = au(this.bv.digest());
        Ga().p(this.hVv, (String)localObject2);
      }
    } catch (Exception localException) {
      throw new cJ(localException, gu());
    } finally {
      wh.c(localFileInputStream);
      wh.b(localFileOutputStream);
    }
    return bool;
  }

  private String au(byte[] paramArrayOfByte) {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      String str = Integer.toHexString(0xFF & paramArrayOfByte[i]);
      if (str.length() < 2) {
        localStringBuffer.append("0");
      }
      localStringBuffer.append(str);
    }
    return localStringBuffer.toString();
  }

  public static byte[] h(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;

    if ((i & 0x1) != 0) {
      throw new cJ("odd number of characters.");
    }

    byte[] arrayOfByte = new byte[i >> 1];

    int j = 0; for (int k = 0; k < i; j++) {
      int m = Character.digit(paramArrayOfChar[(k++)], 16) << 4;
      m |= Character.digit(paramArrayOfChar[(k++)], 16);
      arrayOfByte[j] = ((byte)(m & 0xFF));
    }

    return arrayOfByte;
  }

  private String N(File paramFile)
  {
    BufferedReader localBufferedReader = null;
    try {
      localBufferedReader = new BufferedReader(new FileReader(paramFile));
      Object[] arrayOfObject = this.hVB.parse(localBufferedReader.readLine());
      if ((arrayOfObject == null) || (arrayOfObject.length == 0) || (arrayOfObject[0] == null)) {
        throw new cJ("failed to find a checksum");
      }
      return (String)arrayOfObject[0];
    } catch (IOException localIOException) {
      throw new cJ("Couldn't read checksum file " + paramFile, localIOException);
    } catch (ParseException localParseException) {
      throw new cJ("Couldn't read checksum file " + paramFile, localParseException);
    } finally {
      wh.e(localBufferedReader);
    }
  }

  private String O(File paramFile)
  {
    String str = (String)this.hVu.get(paramFile);
    if (str == null)
    {
      throw new cJ("Internal error: relativeFilePaths could not match file " + paramFile + "\n" + "please file a bug report on this");
    }

    return str;
  }
}