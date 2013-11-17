package com.ankamagames.framework.graphics.engine;

import bJv;

public final class VertexBufferPCT$ObjectFactory extends bJv
{
  public VertexBufferPCT$ObjectFactory()
  {
    super(VertexBufferPCT.class);
  }

  public VertexBufferPCT cOV()
  {
    return new VertexBufferPCT(null);
  }

  public VertexBufferPCT zM(int paramInt) {
    VertexBufferPCT localVertexBufferPCT = (VertexBufferPCT)bQx();
    VertexBufferPCT.d(localVertexBufferPCT, paramInt);
    return localVertexBufferPCT;
  }

  public VertexBufferPCT zN(int paramInt) {
    VertexBufferPCT localVertexBufferPCT = (VertexBufferPCT)bQy();
    VertexBufferPCT.d(localVertexBufferPCT, paramInt);
    localVertexBufferPCT.rewind();
    return localVertexBufferPCT;
  }
}