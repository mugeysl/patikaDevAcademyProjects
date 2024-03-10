import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ay bilgisi giriniz: ");
        ay = scan.nextInt();
        System.out.print("Gün bilgisi giriniz: ");
        gun = scan.nextInt();

        if (1 <= ay && ay <= 12) {
            if (ay == 1) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 2) {
                if (1 <= gun && gun <= 28) {
                    if (gun <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 3) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 4) {
                if (1 <= gun && gun <= 30) {
                    if (gun <= 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 5) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 6) {
                if (1 <= gun && gun <= 30) {
                    if (gun <= 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 7) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 8) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 9) {
                if (1 <= gun && gun <= 30) {
                    if (gun <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 10) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 11) {
                if (1 <= gun && gun <= 30) {
                    if (gun <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else if (ay == 12) {
                if (1 <= gun && gun <= 31) {
                    if (gun <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
        } else {
            System.out.println("Hatali giris yaptiniz!!!");
        }

        if (isError == true) {
            System.out.println("Geçerli bir gün giriniz..");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}