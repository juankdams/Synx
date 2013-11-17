import com.sun.opengl.util.BufferUtil;
import com.sun.opengl.util.j2d.TextureRenderer;
import com.sun.opengl.util.texture.Texture;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

class cCK
{
  int ivs = 0;
  FloatBuffer ivt;
  FloatBuffer ivu;
  boolean ivv;
  int ivw;
  int ivx;

  cCK(cLb paramcLb)
  {
    GL localGL = GLU.getCurrentGL();
    this.ivu = BufferUtil.newFloatBuffer(1200);
    this.ivt = BufferUtil.newFloatBuffer(800);

    this.ivv = ((paramcLb.getUseVertexArrays()) && (cLb.a(paramcLb, localGL)));

    if (this.ivv)
      try {
        int[] arrayOfInt = new int[2];
        localGL.glGenBuffers(2, IntBuffer.wrap(arrayOfInt));

        this.ivw = arrayOfInt[0];
        this.ivx = arrayOfInt[1];

        localGL.glBindBuffer(34962, this.ivw);

        localGL.glBufferData(34962, 4800, null, 35040);

        localGL.glBindBuffer(34962, this.ivx);

        localGL.glBufferData(34962, 3200, null, 35040);
      }
      catch (Exception localException) {
        cLb.a(paramcLb, false);
        this.ivv = false;
      }
  }

  public void glTexCoord2f(float paramFloat1, float paramFloat2)
  {
    this.ivt.put(paramFloat1);
    this.ivt.put(paramFloat2);
  }

  public void glVertex3f(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.ivu.put(paramFloat1);
    this.ivu.put(paramFloat2);
    this.ivu.put(paramFloat3);

    this.ivs += 1;

    if (this.ivs >= 400)
      cyU();
  }

  private void cyU()
  {
    if (cLb.w(this.dXC))
      cyV();
    else
      cyW();
  }

  private void cyV()
  {
    if (this.ivs > 0) {
      GL localGL = GLU.getCurrentGL();

      TextureRenderer localTextureRenderer = cLb.u(this.dXC);
      Texture localTexture = localTextureRenderer.getTexture();

      this.ivu.rewind();
      this.ivt.rewind();

      localGL.glEnableClientState(32884);

      if (this.ivv) {
        localGL.glBindBuffer(34962, this.ivw);

        localGL.glBufferSubData(34962, 0, this.ivs * 12, this.ivu);

        localGL.glVertexPointer(3, 5126, 0, 0L);
      } else {
        localGL.glVertexPointer(3, 5126, 0, this.ivu);
      }

      localGL.glEnableClientState(32888);

      if (this.ivv) {
        localGL.glBindBuffer(34962, this.ivx);

        localGL.glBufferSubData(34962, 0, this.ivs * 8, this.ivt);

        localGL.glTexCoordPointer(2, 5126, 0, 0L);
      } else {
        localGL.glTexCoordPointer(2, 5126, 0, this.ivt);
      }

      localGL.glDrawArrays(7, 0, this.ivs);

      this.ivu.rewind();
      this.ivt.rewind();
      this.ivs = 0;
    }
  }

  private void cyW() {
    if (this.ivs > 0) {
      TextureRenderer localTextureRenderer = cLb.u(this.dXC);
      Texture localTexture = localTextureRenderer.getTexture();

      GL localGL = GLU.getCurrentGL();
      localGL.glBegin(7);
      try
      {
        int i = this.ivs / 4;
        this.ivu.rewind();
        this.ivt.rewind();

        for (int j = 0; j < i; j++) {
          localGL.glTexCoord2f(this.ivt.get(), this.ivt.get());
          localGL.glVertex3f(this.ivu.get(), this.ivu.get(), this.ivu.get());

          localGL.glTexCoord2f(this.ivt.get(), this.ivt.get());
          localGL.glVertex3f(this.ivu.get(), this.ivu.get(), this.ivu.get());

          localGL.glTexCoord2f(this.ivt.get(), this.ivt.get());
          localGL.glVertex3f(this.ivu.get(), this.ivu.get(), this.ivu.get());

          localGL.glTexCoord2f(this.ivt.get(), this.ivt.get());
          localGL.glVertex3f(this.ivu.get(), this.ivu.get(), this.ivu.get());
        }
      }
      catch (Exception localException) {
        localException.printStackTrace();
      } finally {
        localGL.glEnd();
        this.ivu.rewind();
        this.ivt.rewind();
        this.ivs = 0;
      }
    }
  }
}