class aNZ
{
  final int order;
  final int dvW;
  final int eui;
  final int euj;
  final int euk;
  final int eul;
  final int[] eum = new int[16];

  aNZ(cf paramcf) {
    this.order = paramcf.read(8);
    this.dvW = paramcf.read(16);
    this.eui = paramcf.read(16);
    this.euj = paramcf.read(6);
    this.euk = paramcf.read(8);
    this.eul = (paramcf.read(4) + 1);
  }
}