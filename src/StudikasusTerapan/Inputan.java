package simpleelectrocounter; 

import java.util.Scanner; 

public class Inputan { 
    int pilihan; 
    int UserMemilih;
    double Voltage, Current, Power;
    void Inputan (){ 
        Scanner Masuk = new Scanner (System.in);
        do{
        System.out.print("Silakan Masukkan Pilihan Anda : ");
        UserMemilih = Masuk.nextInt();
        if(UserMemilih == 1){
            System.out.print("Masukkan Besar Tegangan : ");
            Voltage = Masuk.nextDouble();
            System.out.print("Masukkan Kuat Arus : ");
            Current = Masuk.nextDouble();
        }else if (UserMemilih == 2){
            System.out.print("Masukkan Kuat Arus : ");
            Current = Masuk.nextDouble();
            System.out.print("Masukkan Daya : ");
            Power = Masuk.nextDouble();
        }else if (UserMemilih == 3){
            System.out.print("Masukkan Besar Tegangan :");
            Voltage = Masuk.nextDouble();
            System.out.print("Masukkan Daya : ");
            Power = Masuk.nextDouble();
        }else
            System.out.println("Pilihan Yang Anda Masukkan Tidak Valid");
            System.out.println("Program akan terus berulang hingga pilihan yang valid dimasukkan");
        }
        while(UserMemilih>3);
}
        
        
    int PILIHAN(){ 
        return UserMemilih;
    }
    double VOLT(){
        return Voltage;
    }
    double WATTAGE(){
        return Power; 
    }
    double AMPERE(){
        return Current;
    }
    double VOLTCOUNT(){
        return (Power/Current);
    }
    double AMPCOUNT(){
        return (Power/Voltage);
    }
    double WATTCOUNT(){
        return (Voltage * Current);
    }
    void FinalCount(){ 
        if(PILIHAN()==1){
                System.out.println("Rumus Pokok : Daya (Watt) = Tegangan (Volt) x Kuat Arus (Ampere)");
                System.out.println(WATTCOUNT() + " (Daya) = " + Voltage + " (Besar Tegangan) x " + Current+" (Kuat Arus)");
                System.out.println("---------------------------------------------------------");
                System.out.println(Voltage +" x " +Current +" = "+WATTCOUNT());
                System.out.println("Sehingga terdapat Daya Sebesar "+WATTCOUNT()+" Watt");
        }else if (PILIHAN()==2){
                System.out.println("Rumus Pokok : Daya (Watt) = Tegangan (Volt) x Kuat Arus (Ampere)");
                System.out.println(VOLTCOUNT() + " (Besar Tegangan) = " + Power + " (Daya) : " + Current+" (Kuat Arus");
                System.out.println("---------------------------------------------------------");
                System.out.println(Power +" : " +Current +" = "+VOLTCOUNT());
                System.out.println("Sehingga terdapat Tegangan Sebesar "+VOLTCOUNT()+" Volt");
        }else if (PILIHAN()==3){
                System.out.println("Rumus Pokok : Daya (Watt) = Tegangan (Volt) x Kuat Arus (Ampere)");
                System.out.println(AMPCOUNT() + " (Kuat Arus) = " + Power + " (Daya) : " + Voltage+" (Besar Tegangan)");
                System.out.println("---------------------------------------------------------");
                System.out.println(Power +" : " +Voltage +" = "+VOLTCOUNT());
                System.out.println("Sehingga terdapat Kuat Arus Sebesar "+AMPCOUNT()+" Ampere");
        }
        }
    }
