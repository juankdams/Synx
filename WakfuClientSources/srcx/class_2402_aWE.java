import com.sun.opengl.util.BufferUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class aWE
{
  protected static final Logger K = Logger.getLogger(aWE.class);

  private static final aWE fbK = new aWE();
  private ckm fbL;

  public static aWE bmm()
  {
    return fbK;
  }

  public void f(GL paramGL) {
    this.fbL = new ckm(this, paramGL.glGetString(7938));
  }

  public ckm bmn() {
    return this.fbL;
  }

  public boolean cc(int paramInt1, int paramInt2) {
    if (this.fbL == null) {
      K.error("Il faut appeler la fonction readVersion(GL)");
    }
    return this.fbL.a(new ckm(this, paramInt1, paramInt2, 0)) < 0;
  }

  public static void a(GL paramGL, HashMap paramHashMap) {
    paramHashMap.put("Renderer", paramGL.glGetString(7937));
    paramHashMap.put("Vendor", paramGL.glGetString(7936));
    paramHashMap.put("Version", paramGL.glGetString(7938));
    paramHashMap.put("Extensions", paramGL.glGetString(7939));
  }

  public static void g(GL paramGL)
  {
    K.info("------- GL dump ---------");

    IntBuffer localIntBuffer = BufferUtil.newIntBuffer(4);
    localIntBuffer.rewind();

    boolean bool1 = paramGL.glIsEnabled(2929);
    boolean bool2 = paramGL.glIsEnabled(3089);
    boolean bool3 = paramGL.glIsEnabled(3008);
    boolean bool4 = paramGL.glIsEnabled(2960);
    boolean bool5 = paramGL.glIsEnabled(2884);

    K.info("GL_RENDERER : " + paramGL.glGetString(7937));
    K.info("GL_VENDOR : " + paramGL.glGetString(7936));
    K.info("GL_VERSION : " + paramGL.glGetString(7938));

    K.info("GL_DEPTH_TEST = " + bool1);
    K.info("GL_SCISSOR_TEST = " + bool2);
    K.info("GL_ALPHA_TEST = " + bool3);
    paramGL.glGetIntegerv(3415, localIntBuffer);
    K.info("GL_STENCIL_TEST = " + bool4 + ";  Stencil depth = " + localIntBuffer.get(0) + " bits");
    K.info("GL_CULL_FACE = " + bool5);

    paramGL.glGetIntegerv(2978, localIntBuffer);
    K.info("GL_VIEWPORT = [" + localIntBuffer.get(0) + ";" + localIntBuffer.get(1) + "] - [" + localIntBuffer.get(2) + ";" + localIntBuffer.get(3) + "]");

    paramGL.glGetIntegerv(3088, localIntBuffer);
    K.info("GL_SCISSOR_BOX = [" + localIntBuffer.get(0) + ";" + localIntBuffer.get(1) + "] - [" + localIntBuffer.get(2) + ";" + localIntBuffer.get(3) + "]");
    paramGL.glGetIntegerv(33001, localIntBuffer);
    K.info("GL_MAX_ELEMENTS_INDICES = " + localIntBuffer.get(0));
    paramGL.glGetIntegerv(33000, localIntBuffer);
    K.info("GL_MAX_ELEMENTS_VERTICES = " + localIntBuffer.get(0));
  }

  public static String h(GL paramGL) {
    StringBuilder localStringBuilder = new StringBuilder();

    IntBuffer localIntBuffer = BufferUtil.newIntBuffer(4);
    localIntBuffer.rewind();

    boolean bool1 = paramGL.glIsEnabled(2929);
    boolean bool2 = paramGL.glIsEnabled(3089);
    boolean bool3 = paramGL.glIsEnabled(3008);
    boolean bool4 = paramGL.glIsEnabled(2960);
    boolean bool5 = paramGL.glIsEnabled(2884);

    localStringBuilder.append("\tGL_RENDERER : " + paramGL.glGetString(7937));
    localStringBuilder.append("\n\tGL_VENDOR : " + paramGL.glGetString(7936));
    localStringBuilder.append("\n\tGL_VERSION : " + paramGL.glGetString(7938));

    localStringBuilder.append("\n\tGL_DEPTH_TEST = " + bool1);
    localStringBuilder.append("\n\tGL_SCISSOR_TEST = " + bool2);
    localStringBuilder.append("\n\tGL_ALPHA_TEST = " + bool3);

    paramGL.glGetIntegerv(3415, localIntBuffer);
    localStringBuilder.append("\n\tGL_STENCIL_TEST = " + bool4 + "  " + localIntBuffer.get(0) + "bits");
    localStringBuilder.append("\n\tGL_CULL_FACE = " + bool5);

    paramGL.glGetIntegerv(2978, localIntBuffer);
    localStringBuilder.append("\n\tGL_VIEWPORT = [" + localIntBuffer.get(0) + ";" + localIntBuffer.get(1) + "] - [" + localIntBuffer.get(2) + ";" + localIntBuffer.get(3) + "]");

    paramGL.glGetIntegerv(3088, localIntBuffer);
    localStringBuilder.append("\n\tGL_SCISSOR_BOX = [" + localIntBuffer.get(0) + ";" + localIntBuffer.get(1) + "] - [" + localIntBuffer.get(2) + ";" + localIntBuffer.get(3) + "]");

    return localStringBuilder.toString();
  }

  public static String a(FloatBuffer paramFloatBuffer)
  {
    String str = "\n";
    for (int i = 0; i < 4; i++) {
      str = str + "\t";
      for (int j = 0; j < 4; j++)
        str = str + "[" + paramFloatBuffer.get(i * 4 + j) + "] ";
      str = str + "\n";
    }
    return str;
  }

  public static void bmo()
  {
    try
    {
      File localFile = new File("GLFlags.txt");
      if (!localFile.exists()) {
        K.error("cannot open file " + localFile.getName());
        return;
      }

      BufferedReader localBufferedReader = new BufferedReader(new FileReader(localFile));
      BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter("GLFlags2.txt"));
      String str;
      while ((str = localBufferedReader.readLine()) != null) {
        localBufferedWriter.write("m_flags.add( new GLFlagDesc( " + str + ", \"" + str + "\" ) );\n");
      }

      localBufferedWriter.close();
      localBufferedReader.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {
      K.error("Exception", localFileNotFoundException);
    }
    catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
  }
}