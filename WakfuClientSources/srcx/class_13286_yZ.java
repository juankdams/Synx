import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public final class yZ
  implements cvW
{
  private static final Logger K = Logger.getLogger(yZ.class);

  private static final yZ btj = new yZ();

  private static final Pattern btk = Pattern.compile("(.*)\\.log");
  private static BufferedImage btl;

  public static yZ HB()
  {
    return btj;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16440:
      String str1 = "";
      try {
        str1 = ay.bd().getString("bugReportPath");
      } catch (bdh localbdh) {
        str1 = "./report/";
      }

      File localFile1 = new File(str1);
      if (!localFile1.exists()) {
        localFile1.mkdirs();
      }

      Date localDate = new Date();
      String str2 = "" + (localDate.getYear() + 1900) + (localDate.getMonth() < 9 ? "0" + localDate.getMonth() + 1 : Integer.valueOf(localDate.getMonth() + 1)) + (localDate.getDate() < 10 ? "0" + localDate.getDate() : Integer.valueOf(localDate.getDate())) + "_" + (localDate.getHours() < 10 ? "0" + localDate.getHours() : Integer.valueOf(localDate.getHours())) + (localDate.getMinutes() < 10 ? "0" + localDate.getMinutes() : Integer.valueOf(localDate.getMinutes())) + (localDate.getSeconds() < 10 ? "0" + localDate.getSeconds() : Integer.valueOf(localDate.getSeconds()));

      str2 = str2 + ".zip";

      File localFile2 = new File(localFile1, str2);
      if (localFile2.exists()) {
        localFile2.delete();
      }

      if (r(localFile2)) {
        String str3 = null;
        try {
          str3 = localFile2.getCanonicalPath();
        } catch (IOException localIOException) {
          str3 = localFile2.getAbsolutePath();
        }
        str3 = str3.replace("\\", "\\\\");

        String str4 = bU.fH().getString("link.support");
        String str5 = bU.fH().getString("bug.report.message", new Object[] { "<b>" + localFile2.getName() + "</b>", "<b>" + str3 + "</b>", "<b>" + str4 + "</b>" });

        cKX localcKX = cBQ.cxL().a(str5, Cn.et(0), 10265L, 102, 1);

        localcKX.a(new hj(this, str4));
      }
      else
      {
        cBQ.cxL().a(bU.fH().getString("bug.report.message.error"), Cn.et(1), 515L, 102, 1);
      }

      return false;
    }

    return true;
  }

  private boolean r(File paramFile)
  {
    try {
      ZipOutputStream localZipOutputStream = new ZipOutputStream(new FileOutputStream(paramFile));
      DataOutputStream localDataOutputStream = new DataOutputStream(localZipOutputStream);

      localZipOutputStream.putNextEntry(new ZipEntry("account.txt"));
      a(localDataOutputStream);
      localDataOutputStream.flush();
      localZipOutputStream.closeEntry();

      localZipOutputStream.putNextEntry(new ZipEntry("system.txt"));
      c(localDataOutputStream);
      localDataOutputStream.flush();
      localZipOutputStream.closeEntry();

      a(localZipOutputStream, localDataOutputStream);

      if (btl != null) {
        localZipOutputStream.putNextEntry(new ZipEntry("screenshot.jpg"));
        b(localDataOutputStream);
        localDataOutputStream.flush();
        localZipOutputStream.closeEntry();
      }

      localDataOutputStream.close();
      localZipOutputStream.close();
    }
    catch (Exception localException) {
      K.error("Erreur à la génération de l'archive d'information de bug");
      return false;
    }
    return true;
  }

  private void a(DataOutputStream paramDataOutputStream) {
    String str1 = "";
    long l1 = 0L;
    String str2 = "";

    byv localbyv = WakfuClientInstance.awy().awz();
    if (localbyv != null) {
      dHb localdHb = localbyv.bFP();
      if (localdHb != null) {
        str1 = localdHb.getFieldValue("realName").toString();
      }
      aps localaps = localbyv.bFQ();
      if (localaps != null) {
        l1 = localaps.Ea();
        str2 = localaps.cNV();
      }
    }

    long l2 = 0L;
    String str3 = "";
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;

    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      l2 = localbyz.getId();
      str3 = localbyz.cQF();
      i = localbyz.fa();
      j = localbyz.fb();
      k = localbyz.fc();
      m = localbyz.Lk();
    }

    aIH localaIH = WakfuClientInstance.awy().awB();

    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append("==========================\n");
    localStringBuilder.append("= Informations de compte =\n");
    localStringBuilder.append("==========================\n");
    localStringBuilder.append("\n");

    localStringBuilder.append("Compte Ankama Games : \n");
    localStringBuilder.append("\tCompte : ").append(l1).append("\n");
    localStringBuilder.append("\tNom de compte : ").append(str2).append("\n");

    localStringBuilder.append("\n");
    localStringBuilder.append("Compte Wakfu : \n");
    localStringBuilder.append("\tServeur : ").append(str1).append("\n");
    localStringBuilder.append("\tPersonnage : ").append(l2).append("\n");
    localStringBuilder.append("\tNom du personnage : ").append(str3).append("\n");
    localStringBuilder.append("\tCoordonnées : ").append("(" + i + "," + j + "," + k + ")").append(" @" + m).append("\n");

    localStringBuilder.append("\n");
    localStringBuilder.append("Client : \n");
    localStringBuilder.append("\tVersion : ").append(aUk.eUY).append("\n");
    localStringBuilder.append("\tResolution : ").append(WakfuClientInstance.awy().aww().cHF()).append("\n");

    paramDataOutputStream.writeBytes(localStringBuilder.toString());
  }

  private void b(DataOutputStream paramDataOutputStream) {
    ImageIO.write(btl, "jpeg", paramDataOutputStream);
    btl = null;
  }

  private void a(ZipOutputStream paramZipOutputStream, DataOutputStream paramDataOutputStream) {
    File localFile1 = HC();
    if ((!localFile1.exists()) || (!localFile1.isDirectory())) {
      paramZipOutputStream.putNextEntry(new ZipEntry("logs/"));
      paramZipOutputStream.closeEntry();
      return;
    }

    File[] arrayOfFile1 = localFile1.listFiles(new hi(this));

    for (File localFile2 : arrayOfFile1) {
      paramZipOutputStream.putNextEntry(new ZipEntry("logs/" + localFile2.getName()));
      a(localFile2, paramDataOutputStream);
      paramDataOutputStream.flush();
      paramZipOutputStream.closeEntry();
    }
  }

  private File HC()
  {
    String str = WakfuClient.ltB.cYd();
    if (dzp.qF(str))
      return new File("./logs");
    return new File(str, "logs");
  }

  private void a(File paramFile, DataOutputStream paramDataOutputStream) {
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    byte[] arrayOfByte = new byte[1024];
    int i;
    while ((i = localFileInputStream.read(arrayOfByte)) > 0) {
      paramDataOutputStream.write(arrayOfByte, 0, i);
    }
    localFileInputStream.close();
  }

  private void c(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeBytes(HD());
  }

  private String HD()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("=========================\n");
    localStringBuilder.append("= Configuration systeme =\n");
    localStringBuilder.append("=========================\n");
    localStringBuilder.append("\n");

    localStringBuilder.append("[Carte graphique] : \n\n");
    try {
      bAU localbAU = WakfuClientInstance.awy().rs();
      localObject1 = localbAU.bJF();
      for (localObject2 = ((HashMap)localObject1).entrySet().iterator(); ((Iterator)localObject2).hasNext(); ) { Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append("\t").append((String)localEntry.getKey()).append(" = ").append((String)localEntry.getValue()).append("\n"); }
    }
    catch (Exception localException) {
      localStringBuilder.append("\tImpossible d'envoyer la config openGL : GL non récupérable\n");
    }

    localStringBuilder.append("\n");

    localStringBuilder.append("[GL DUMP] : \n\n");
    GL localGL = WakfuClientInstance.awy().rs().bJA();
    localStringBuilder.append(aWE.h(localGL)).append("\n");

    localStringBuilder.append("\n");

    localStringBuilder.append("[Système d'exploitation] : \n\n");
    localStringBuilder.append("\tArchitecture : ").append(System.getProperty("os.arch")).append("\n");
    localStringBuilder.append("\tNom : ").append(System.getProperty("os.name")).append("\n");
    localStringBuilder.append("\tVersion : ").append(System.getProperty("os.version")).append("\n");
    localStringBuilder.append("\tPatch Level : ").append(System.getProperty("sun.os.patch.level")).append("\n");

    localStringBuilder.append("\n");

    Object localObject1 = ManagementFactory.getMemoryMXBean();
    localStringBuilder.append("[Mémoire Système]\n\n");
    localStringBuilder.append("\tTotal : ").append(Runtime.getRuntime().totalMemory()).append("\n");
    localStringBuilder.append("\tMax : ").append(Runtime.getRuntime().maxMemory()).append("\n");
    localStringBuilder.append("\tFree : ").append(Runtime.getRuntime().freeMemory()).append("\n");

    localStringBuilder.append("\n");

    localStringBuilder.append("[Java Virtual Machine]\n\n");
    localStringBuilder.append("\tConstructeur : ").append(System.getProperty("java.vm.vendor")).append("\n");
    localStringBuilder.append("\tNom : ").append(System.getProperty("java.vm.name")).append("\n");
    localStringBuilder.append("\tVersion : ").append(System.getProperty("java.vm.version")).append("\n");

    localStringBuilder.append("\n");

    Object localObject2 = ManagementFactory.getRuntimeMXBean();
    long l1 = ((RuntimeMXBean)localObject2).getUptime();
    if (l1 == 0L) {
      l1 = 1L;
    }
    localStringBuilder.append("[Java Runtime]\n\n");
    localStringBuilder.append("\tNom : ").append(System.getProperty("java.runtime.name")).append("\n");
    localStringBuilder.append("\tVersion : ").append(System.getProperty("java.runtime.version")).append("\n");

    localStringBuilder.append("\n");

    ThreadMXBean localThreadMXBean = ManagementFactory.getThreadMXBean();
    long[] arrayOfLong1 = localThreadMXBean.getAllThreadIds();
    long l2 = 0L;
    long l3 = 0L;

    localStringBuilder.append("[Runtime Threads]\n\n");

    for (long l4 : arrayOfLong1) {
      ThreadInfo localThreadInfo = localThreadMXBean.getThreadInfo(l4);
      if (localThreadInfo != null)
      {
        long l5 = localThreadMXBean.isThreadCpuTimeSupported() ? localThreadMXBean.getThreadUserTime(l4) : 0L;
        long l6 = localThreadMXBean.isThreadCpuTimeSupported() ? localThreadMXBean.getThreadCpuTime(l4) : -1L;
        l2 += l5;
        l3 += l3;

        localStringBuilder.append("\t[[Thread ").append(l4).append("]]\n");
        localStringBuilder.append("\t\tNom : ").append(localThreadInfo.getThreadName()).append("\n");
        localStringBuilder.append("\t\tUser Time : ").append(l5).append(" (").append(l5 / (l1 * 10000L)).append("%)\n");
        localStringBuilder.append("\t\tCPU : ").append(l6).append(" (").append(l6 / (l1 * 10000L)).append("%)\n");
      }
    }
    localStringBuilder.append("[Thread Total]\n");
    localStringBuilder.append("\tUser Time : ").append(l2).append(" (").append(l2 / (l1 * 10000L)).append("%)\n");
    localStringBuilder.append("\tCPU : ").append(l3).append(" (").append(l3 / (l1 * 10000L)).append("%)\n");

    localStringBuilder.append("\n");

    return localStringBuilder.toString();
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public static void HE()
  {
    try {
      Rectangle localRectangle = WakfuClientInstance.awy().aww().cHA();
      Robot localRobot = new Robot();
      btl = localRobot.createScreenCapture(localRectangle);
    } catch (AWTException localAWTException) {
      btl = null;
    }
  }
}