import java.lang.reflect.Proxy;
import java.text.MessageFormat;

public class dna
{
  private static final String lms = "Failed to load the native library.\n\nThe error was \"{0}\".\n\nThe required native libraries are named \"{1}\" and \"{2}\".\n\nIn the text below <libvlc-path> represents the name of the directory containing \"{1}\" and \"{2}\"...\n\nThere are a number of different ways to specify where to find the native libraries:\n 1. Include NativeLibrary.addSearchPath(\"{3}\", \"<libvlc-path>\"); at the start of your application code.\n 2. Include System.setProperty(\"jna.library.path\", \"<libvlc-path>\"); at the start of your application code.\n 3. Specify -Djna.library.path=<libvlc-path> on the command-line when starting your application.\n 4. Add <libvlc-path> to the system search path (and reboot).\n\nIf this still does not work, then it may be necessary to explicitly add the native library directory to the operating\nsystem configuration - e.g. on Linux this might mean setting the LD_LIBRARY_PATH environment variable, or adding\nconfiguration to the \"/etc/ld.so.conf\" file or the \"/etc/ld.so.conf.d\" directory. Of these options, setting\nLD_LIBRARY_PATH is the only one that would not require root privileges.\n\nFinally, it is not possible to mix CPU architectures - it is not possible for a 64-bit Java Virtual Machine to load\n32-bit native libraries.\n\nMore information may be available in the log, specify -Dvlcj.log=DEBUG on the command-line when starting your application.\n";
  private boolean lmt;
  private boolean lmu;
  private zA lmv;
  private aLY lmw;

  public static dna cUy()
  {
    return new dna();
  }

  public dna cUz()
  {
    this.lmt = true;
    return this;
  }

  public dna cUA()
  {
    this.lmu = true;
    return this;
  }

  public dna pD(String paramString)
  {
    this.lmv = new zA(paramString);
    return this;
  }

  public dna a(aLY paramaLY)
  {
    this.lmw = paramaLY;
    return this;
  }

  public djj cUB()
  {
    if (this.lmw != null)
      this.lmw.bdq();
    String str;
    try
    {
      djj localdjj = this.lmt ? djj.lgf : djj.lge;

      if (this.lmu) {
        localdjj = (djj)Proxy.newProxyInstance(djj.class.getClassLoader(), new Class[] { djj.class }, new dJs(localdjj));
      }
      str = localdjj.cSg();
      aHA.info("vlc: {}, changeset {}", new Object[] { str, djj.lge.cSi() });
      aHA.info("libvlc: {}", new Object[] { bl(localdjj) });
      if (this.lmv != null) {
        zA localzA;
        try {
          localzA = new zA(str);
        }
        catch (Exception localException) {
          aHA.error("Unable to parse native library version {} because of {}", new Object[] { str, localException });
          localzA = null;
        }
        if (localzA != null) {
          if (!localzA.a(this.lmv)) {
            aHA.e("This version of vlcj requires version {} or later of libvlc, found too old version {}", new Object[] { this.lmv, localzA });
            throw new RuntimeException("This version of vlcj requires version " + this.lmv + " or later of libvlc, found too old version " + localzA + ".");
          }
        }
        else {
          aHA.e("Unable to check the native library version '{}'", new Object[] { str });
          throw new RuntimeException("Unable to check the native library version " + str);
        }
      }
      return localdjj;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
      aHA.error("Failed to load native library", new Object[0]);
      str = MessageFormat.format("Failed to load the native library.\n\nThe error was \"{0}\".\n\nThe required native libraries are named \"{1}\" and \"{2}\".\n\nIn the text below <libvlc-path> represents the name of the directory containing \"{1}\" and \"{2}\"...\n\nThere are a number of different ways to specify where to find the native libraries:\n 1. Include NativeLibrary.addSearchPath(\"{3}\", \"<libvlc-path>\"); at the start of your application code.\n 2. Include System.setProperty(\"jna.library.path\", \"<libvlc-path>\"); at the start of your application code.\n 3. Specify -Djna.library.path=<libvlc-path> on the command-line when starting your application.\n 4. Add <libvlc-path> to the system search path (and reboot).\n\nIf this still does not work, then it may be necessary to explicitly add the native library directory to the operating\nsystem configuration - e.g. on Linux this might mean setting the LD_LIBRARY_PATH environment variable, or adding\nconfiguration to the \"/etc/ld.so.conf\" file or the \"/etc/ld.so.conf.d\" directory. Of these options, setting\nLD_LIBRARY_PATH is the only one that would not require root privileges.\n\nFinally, it is not possible to mix CPU architectures - it is not possible for a 64-bit Java Virtual Machine to load\n32-bit native libraries.\n\nMore information may be available in the log, specify -Dvlcj.log=DEBUG on the command-line when starting your application.\n", new Object[] { localUnsatisfiedLinkError.getMessage(), cha.ciT(), cha.ciU(), cha.ciS() });
    }throw new RuntimeException(str);
  }

  private static String bl(Object paramObject)
  {
    String str = paramObject.toString();
    int i = str.indexOf('<');
    if (i != -1) {
      i++;
      int j = str.indexOf('@', i);
      if (j != -1) {
        str = str.substring(i, j);
        return str;
      }
    }
    return str;
  }
}