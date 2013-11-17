package com.ankamagames.framework.graphics.engine.opengl;

import ayc;
import bSr;
import brZ;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import dHL;
import dbP;
import dsZ;
import javax.media.opengl.GL;

public class GLGeometrySprite extends GeometrySprite
{
  public static final GLGeometrySprite.ObjectFactory ieZ = new GLGeometrySprite.ObjectFactory();

  public void a(bSr parambSr)
  {
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError();
    dbP.cNw().c(this);

    dsZ localdsZ = dsZ.cZe();
    localdsZ.a(this.krq, this.krr);
    localdsZ.x(parambSr);

    ayc localayc = (ayc)parambSr;
    localayc.dNI.qH(13);

    GL localGL = (GL)localayc.bZk();

    localGL.glVertexPointer(2, 5126, 0, this.aVY.bSP());
    localGL.glColorPointer(4, 5126, 0, this.aVY.bSQ());
    localGL.glTexCoordPointer(2, 5126, 0, this.aVY.bSR());
    localGL.glDrawArrays(7, 0, 4);
  }
}