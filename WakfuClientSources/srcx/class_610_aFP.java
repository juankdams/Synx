import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class aFP extends cDv
{
  protected static Logger K = Logger.getLogger(aFP.class);
  private static final int ecH = 1024;
  private static final int ecI = 1024;
  private static final int ecJ = 2;
  private static final int ecK = 200;
  private ByteBuffer[] ecL = new ByteBuffer[2];
  private int[] ecM = new int[2];

  public void initialize()
  {
    super.initialize();

    for (int i = 0; i < 2; i++) {
      this.ecL[i] = ByteBuffer.allocate(4194304);
      for (int j = 0; j < 1048576; j++) {
        this.ecL[i].putInt(Math.round(bCO.bLk() * 5.368709E+008F));
      }
      this.ecL[i].rewind();
    }

    this.dzZ.glEnable(3553);
    this.dzZ.glGenTextures(2, this.ecM, 0);
  }

  public void a(ccT paramccT)
  {
    long l1 = System.nanoTime();
    for (int i = 0; i < 200; i++) {
      int j = i % 2;
      this.dzZ.glBindTexture(3553, this.ecM[j]);
      this.dzZ.glPixelStorei(3317, 1);
      a(this.dzZ, 32993, this.ecL[j]);
    }
    long l2 = System.nanoTime() - l1;

    l1 = System.nanoTime();
    for (int k = 0; k < 200; k++) {
      int m = k % 2;
      this.dzZ.glBindTexture(3553, this.ecM[m]);
      this.dzZ.glPixelStorei(3317, 1);
      a(this.dzZ, 6408, this.ecL[m]);
    }
    long l3 = System.nanoTime() - l1;

    long l4 = 800L;

    if (l2 < l3)
      paramccT.uH(32993);
    else {
      paramccT.uH(6408);
    }
    paramccT.G(800.0D / (l2 / 1000000000.0D));
    paramccT.F(800.0D / (l3 / 1000000000.0D));
  }

  public void cleanUp()
  {
    this.dzZ.glDeleteTextures(2, this.ecM, 0);
    for (int i = 0; i < 2; i++) {
      this.ecL[i] = null;
    }

    super.cleanUp();
  }

  private void a(GL paramGL, int paramInt, ByteBuffer paramByteBuffer) {
    paramGL.glTexImage2D(3553, 0, 32856, 1024, 1024, 0, paramInt, 5121, paramByteBuffer);
  }

  public String getName()
  {
    return "GL bandwidth and texture format";
  }
}