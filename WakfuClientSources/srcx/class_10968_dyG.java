import java.util.ArrayList;
import java.util.List;

class dyG
{
  private final dPx lFk = new dPx();

  private dyG() {
    for (byte b = 0; b < 2; b = (byte)(b + 1))
      this.lFk.c(b, new ArrayList());
  }

  List fE(byte paramByte) {
    return (List)this.lFk.bf(paramByte);
  }

  void c(Su paramSu, byte paramByte) {
    ((List)this.lFk.bf(paramByte)).add(paramSu);
  }

  void d(Su paramSu, byte paramByte) {
    ((List)this.lFk.bf(paramByte)).add(0, paramSu);
  }
}