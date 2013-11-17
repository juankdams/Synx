public enum bCo
{
  private boolean bY;
  private boolean aKX;

  private bCo(boolean arg3, boolean arg4)
  {
    boolean bool1;
    this.bY = bool1;
    boolean bool2;
    this.aKX = bool2;
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public boolean isVertical() {
    return this.aKX;
  }

  private static bCo b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (paramBoolean1) {
      if (paramBoolean3)
        return gwB;
      if (paramBoolean4) {
        return gwC;
      }
      return gwA;
    }

    if (paramBoolean2) {
      if (paramBoolean3)
        return gwE;
      if (paramBoolean4) {
        return gwF;
      }
      return gwD;
    }

    if (paramBoolean3) {
      return gwG;
    }

    if (paramBoolean4) {
      return gwH;
    }

    return gwz;
  }

  public static bCo a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dRq paramdRq) {
    return b(F(0, 0, paramInt2), G(paramdRq.getHeight(), paramInt2, paramInt4), I(paramdRq.getWidth(), paramInt1, paramInt3), H(0, 0, paramInt1));
  }

  public static bCo a(int paramInt1, int paramInt2, bpn parambpn, dRq paramdRq)
  {
    return b(F(0, 0, paramInt2), G(paramdRq.getHeight(), paramInt2, parambpn.getHeight()), I(paramdRq.getWidth(), paramInt1, parambpn.getWidth()), H(0, 0, paramInt1));
  }

  public static bCo a(int paramInt1, int paramInt2, bpn parambpn1, bpn parambpn2)
  {
    return c(paramInt1, paramInt2, parambpn1.getWidth(), parambpn1.getHeight(), parambpn2.getX(), parambpn2.getY(), parambpn2.getWidth(), parambpn2.getHeight());
  }

  public static bCo c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return b((F(paramInt6, paramInt8, paramInt2)) && (p(paramInt1, paramInt3, paramInt5, paramInt7)), (G(paramInt6, paramInt2, paramInt4)) && (p(paramInt1, paramInt3, paramInt5, paramInt7)), (I(paramInt5, paramInt1, paramInt3)) && (q(paramInt2, paramInt4, paramInt6, paramInt8)), (H(paramInt5, paramInt7, paramInt1)) && (q(paramInt2, paramInt4, paramInt6, paramInt8)));
  }

  public int a(int paramInt, bpn parambpn)
  {
    switch (arz.dAc[ordinal()]) {
    case 5:
    case 6:
    case 7:
      return 0;
    case 1:
    case 2:
    case 3:
      return parambpn.getContainer().getWidth() - parambpn.getWidth();
    case 4:
    }return paramInt;
  }

  public int b(int paramInt, bpn parambpn)
  {
    switch (arz.dAc[ordinal()]) {
    case 1:
    case 6:
    case 8:
      return 0;
    case 3:
    case 4:
    case 5:
      return parambpn.getContainer().getHeight() - parambpn.getHeight();
    case 2:
    case 7: } return paramInt;
  }

  public int a(int paramInt, bpn parambpn1, bpn parambpn2)
  {
    switch (arz.dAc[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return parambpn1.getX() - parambpn2.getWidth();
    case 5:
    case 6:
    case 7:
      return parambpn1.getX() + parambpn1.getWidth();
    case 4:
    }return paramInt;
  }

  public int b(int paramInt, bpn parambpn1, bpn parambpn2)
  {
    switch (arz.dAc[ordinal()]) {
    case 3:
    case 4:
    case 5:
      return parambpn1.getY() - parambpn2.getHeight();
    case 1:
    case 6:
    case 8:
      return parambpn1.getY() + parambpn1.getHeight();
    case 2:
    case 7: } return paramInt;
  }

  private static boolean F(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.abs(paramInt1 + paramInt2 - paramInt3) < 20;
  }

  private static boolean G(int paramInt1, int paramInt2, int paramInt3) {
    return Math.abs(paramInt2 + paramInt3 - paramInt1) < 20;
  }

  private static boolean H(int paramInt1, int paramInt2, int paramInt3) {
    return Math.abs(paramInt1 + paramInt2 - paramInt3) < 20;
  }

  private static boolean I(int paramInt1, int paramInt2, int paramInt3) {
    return Math.abs(paramInt2 + paramInt3 - paramInt1) < 20;
  }

  private static boolean p(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramInt1 <= paramInt3) && (paramInt1 + paramInt2 > paramInt3)) || ((paramInt3 <= paramInt1) && (paramInt3 + paramInt4 > paramInt1));
  }

  private static boolean q(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return ((paramInt1 <= paramInt3) && (paramInt1 + paramInt2 > paramInt3)) || ((paramInt3 <= paramInt1) && (paramInt3 + paramInt4 > paramInt1));
  }
}